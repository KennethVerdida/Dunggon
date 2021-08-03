import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class DBHelper { 
    PreparedStatement ps,pss;
    ResultSet rs;
    String query, query1;
    String appointment="";
    PatientShortTreatmentSched sched;
    PatientLongTreatmentSched scheas;
    
    public DBHelper(){}
    
    public DBHelper(String appointment){
        this.appointment = appointment;
    }
    
    public DBHelper(PatientShortTreatmentSched sched, String appointment){
        this.sched = sched;
        this.appointment = appointment;
    }
    
    public DBHelper(PatientLongTreatmentSched sched,String appointment){
        this.scheas = sched;
        this.appointment = appointment;
    }
    
    //@Author: Verdida, Kenneth Mae G.
    //ESTABLISHING CONNECTION
    //------------------------------------------------------------------------------------------------------------------------------------------------------------------  
    public static Connection getConnection(){
        Connection con = null;  
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/dunggon", "root", "");
        } catch (ClassNotFoundException | SQLException ex){
            System.out.println(ex.getMessage());
        }
        return con; 
    }   
    
    
    //@Author: Palma, Julieta 
    //USER REGIESTER METHODS
    //------------------------------------------------------------------------------------------------------------------------------------------------------------------
    
    public boolean signup(UserClass user){
        int value=1;
        query = "INSERT INTO `dunggon_user`(`username`, `pass`) VALUES (?,?)"; 
        try{ 
            ps = getConnection().prepareStatement(query,Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, user.getUsername());
            ps.setString(2, user.getPass());
            
            int affectedRows = ps.executeUpdate();
            if(affectedRows>0){
              rs = ps.getGeneratedKeys();
              rs.next();
              value = rs.getInt(1);
            }

            query = "INSERT INTO `user_info`(`info_ID`, `fname`, `lname`, `email`) VALUES (?,?,?,?)";
            ps = getConnection().prepareStatement(query);
            ps.setInt(1,value);
            ps.setString(2, user.getFname());
            ps.setString(3, user.getLname());
            ps.setString(4, user.getEmail());
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Registered Succesfully!");           
            return true;
            
        }catch(SQLException ex){
            Logger.getLogger(DunggonSignUp.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    
    //@Author: Palma, Julieta 
    //USER - ADMIN LOGIN METHOD
    //-----------------------------------------------------------------------------------------------------------------------------------------------------------------
    
    public int signin(UserClass user){
        query = "SELECT * FROM `dunggon_user` WHERE `username` =? AND `pass` =?";  
        try {
            ps = getConnection().prepareStatement(query);
            ps.setString(1, user.getUsername());
            ps.setString(2, user.getPass());
            rs = ps.executeQuery();
            
            if(user.getUsername().equals("dunggonadmin")&&user.getPass().equals("dunggonadmin123")){;
                return 1;
            }else if(user.getUsername().equals("DUNGGONADMIN")&&user.getPass().equals("DUNGGONADMIN123")){;
                return 1;
            }else if(rs.next()){
                return 2;
            }           
        }catch(SQLException ex) {
            Logger.getLogger(DunggonSignIn.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return 0;
    }
    
    
    //@Author: Verdida, Kenneth Mae
    //USER - ADMIN SHARED METHOD FEATURES
    //-----------------------------------------------------------------------------------------------------------------------------------------------------------------
    
    //USER :  Used to Book a Treatment Session
    //ADMIN :  Used to add a new Patient
    public boolean insertSession(PatientInfoClass patient){        
        int value=1;
            query = "INSERT INTO `patient`(`FirstName`, `MiddleName`, `LastName`, `Age`, `Birthday`, `Gender`, `Occupation`, `Status`, `Address`, `ContactNumber1`, "
                    + "`Email1`, `MentalCondition`, `PrevHospital`, `Guardian`, `ContactNumber2`, `Email2`,`DunggonID`) "
                    + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";         
            try{
                String idname="DNGGN-1";
                ps = getConnection().prepareStatement(query,Statement.RETURN_GENERATED_KEYS);
                ps.setString(1, patient.getFname());
                ps.setString(2, patient.getMname());
                ps.setString(3, patient.getLname());
                ps.setString(4, patient.getAge());
                ps.setString(5, patient.getBday());
                ps.setString(6, patient.getGender());
                ps.setString(7, patient.getOccupation());
                ps.setString(8, patient.getStatus());
                ps.setString(9, patient.getAdd());
                ps.setString(10, patient.getContactNum1());
                ps.setString(11, patient.getEmail1());
                ps.setString(12, patient.getMedicalCon());
                ps.setString(13, patient.getHospital());
                ps.setString(14, patient.getGuardian());
                ps.setString(15, patient.getContactNum2());
                ps.setString(16, patient.getEmail2());
                ps.setString(17, idname);
               
                
                int affectedRows = ps.executeUpdate();
                if(affectedRows>0){
                  rs = ps.getGeneratedKeys();
                  rs.next();
                  value = rs.getInt(1);
                }
                query = "UPDATE `patient` SET `DunggonID`=? WHERE `SessionID`=?";
                ps = getConnection().prepareStatement(query);                
                idname = "DNGGN-" + value; 
                ps.setString(1, idname);
                ps.setInt(2, value);
                ps.executeUpdate();
                
                if(appointment.equals("Short")){
                    query = "INSERT INTO `shorttreatmentsched`(`shortSessionID`, `sched_day`, `sched_time`) VALUES (?,?,?)";
                    ps = getConnection().prepareStatement(query);
                    ps.setInt(1,value);
                    ps.setString(2, sched.getDay());
                    ps.setString(3, sched.getTime());
                    ps.executeUpdate();
                }else if(appointment.equals("Long")){
                    query = "INSERT INTO `longtreatmentsched`(`longSessionID`, `sched_start`, `sched_end`) VALUES (?,?,?)";
                    ps = getConnection().prepareStatement(query);
                    ps.setInt(1,value);
                    ps.setString(2, scheas.getStart());
                    ps.setString(3, scheas.getEnd());
                    ps.executeUpdate();
                }           
                return true;
            }catch(SQLException ex){
                Logger.getLogger(DunggonPatientForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        return false;    
    }
    
    //USER :  Used to delete in the user Review Panel.
    //ADMIN :  Used to delete a patient Record.
    public void deleteRecord(String DunggonID){
        String id = DunggonID;
        if(appointment.equals("Short")){
            query = "DELETE FROM `patient` WHERE `DunggonID`=?";
            try {
                ps = getConnection().prepareStatement(query);
                ps.setString(1, id);
                ps.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(DBHelper.class.getName()).log(Level.SEVERE, null, ex);
            }  
        }else if(appointment.equals("Long")){
             query = "DELETE FROM `patient` WHERE `DunggonID`=?";
            try {
                ps = getConnection().prepareStatement(query);
                ps.setString(1, id);
                ps.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(DBHelper.class.getName()).log(Level.SEVERE, null, ex);
            }   
        }
    }
    
    
    //@Author: Verdida, Kenneth Mae
    //USER BOOKING TREATMENT SESSION ADDITIONAL FEATURES
    //-----------------------------------------------------------------------------------------------------------------------------------------------------------------
    
    //Shows the boooked appointment in the Review Panel.
    public void showRecord(DefaultTableModel table){
        int value=1;
        try{
            if(appointment.equals("Short")){
                query = "select * from patient,shorttreatmentsched where patient.SessionID = shorttreatmentsched.shortSessionID ORDER BY SessionID "
                        + "DESC LIMIT 1 ";
                ps = getConnection().prepareStatement(query); 
                rs = ps.executeQuery();
                table.setRowCount(0);
                
                
                if(rs.next()){
                    value = rs.getInt("SessionID");
                    Object obj[]={(String)rs.getString("DunggonID"),rs.getString("FirstName"),rs.getString("MiddleName"),rs.getString("LastName"),rs.getString("Age"),
                    rs.getString("Birthday") ,rs.getString("Gender"),rs.getString("Status"),rs.getString("Occupation"),rs.getString("ContactNumber1"),
                    rs.getString("Email1"),rs.getString("Address"),rs.getString("MentalCondition"),rs.getString("PrevHospital"),rs.getString("Guardian"),
                    rs.getString("ContactNumber2"),rs.getString("Email2"),rs.getString("sched_day"),rs.getString("sched_time")};
                    table.addRow(obj); 
                }else{
                    JOptionPane.showMessageDialog(null, "No appointment booked");
                    new DunggonCounselMenu().setVisible(true);
                }
            }else if(appointment.equals("Long")){  
                query = "select * from patient,longtreatmentsched where patient.SessionID = longtreatmentsched.longSessionID ORDER BY SessionID "
                        + "DESC LIMIT 1 ";
                ps = DBHelper.getConnection().prepareStatement(query);
                rs = ps.executeQuery();
                table.setRowCount(0);
               
                if(rs.next()){
                    value = rs.getInt("SessionID");
                    Object obj[]={(String)rs.getString("DunggonID"),rs.getString("FirstName"),rs.getString("MiddleName"),rs.getString("LastName"),rs.getString("Age"),
                    rs.getString("Birthday") ,rs.getString("Gender"),rs.getString("Status"),rs.getString("Occupation"),rs.getString("ContactNumber1"),
                    rs.getString("Email1"),rs.getString("Address"),rs.getString("MentalCondition"),rs.getString("PrevHospital"),rs.getString("Guardian"),
                    rs.getString("ContactNumber2"),rs.getString("Email2"),rs.getString("sched_start"),rs.getString("sched_end")};
                    table.addRow(obj); 
                }else{
                    JOptionPane.showMessageDialog(null, "No appointment booked");
                    new DunggonCounselMenu().setVisible(true);
                }
            }
       }catch(SQLException ex){} 
    }
    
    //This methods is used in the User Review Panel to edit information.
    public boolean editRecord(PatientInfoClass patient,String DunggonID){
        String value = DunggonID;
        query = "UPDATE `patient` SET `FirstName`=?,`MiddleName`=?,`LastName`=?,`Age`=?,`Birthday`=?,`Gender`=?,`Occupation`=?,`Status`=?,`Address`=?,"
                + "`ContactNumber1`=?,`Email1`=?,`MentalCondition`=?,`PrevHospital`=?,`Guardian`=?,`ContactNumber2`=?,`Email2`=? WHERE `DunggonID`=?";
            try{ 
                ps = getConnection().prepareStatement(query);
                
                ps.setString(1, patient.getFname());
                ps.setString(2, patient.getMname());
                ps.setString(3, patient.getLname());
                ps.setString(4, patient.getAge());
                ps.setString(5, patient.getBday());
                ps.setString(6, patient.getGender());
                ps.setString(7, patient.getOccupation());
                ps.setString(8, patient.getStatus());
                ps.setString(9, patient.getAdd());
                ps.setString(10, patient.getContactNum1());
                ps.setString(11, patient.getEmail1());
                ps.setString(12, patient.getMedicalCon());
                ps.setString(13, patient.getHospital());
                ps.setString(14, patient.getGuardian());
                ps.setString(15, patient.getContactNum2());
                ps.setString(16, patient.getEmail2());
                ps.setString(17, value); 
                ps.executeUpdate();
                
                int  id = Integer.parseInt(value.replaceAll("[^0-9]+", ""));
                if(appointment.equals("Short")){
                    query = "UPDATE `shorttreatmentsched` SET `sched_day`=?, `sched_time`=? WHERE `shortSessionID`=?";
                    ps = getConnection().prepareStatement(query); 
                    ps.setString(1, sched.getDay());
                    ps.setString(2, sched.getTime());
                    ps.setInt(3,id);
                    ps.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Update Successful");
                }else if(appointment.equals("Long")){
                    query = "UPDATE `longtreatmentsched` SET `sched_start`=?, `sched_end`=? WHERE `longSessionID`=?";
                    ps = getConnection().prepareStatement(query);
                    ps.setString(1, scheas.getStart());
                    ps.setString(2, scheas.getEnd());
                    ps.setInt(3,id);
                    ps.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Update Successful");
                }
                return true;
            }catch(SQLException ex){
                Logger.getLogger(DunggonSignUp.class.getName()).log(Level.SEVERE, null, ex);
            }       
        return false;
    }    
    
    
    //@Author: Verdida, Kenneth Mae
    //USER CHECK APPOINTMENT BOOKED FEATURES
    //------------------------------------------------------------------------------------------------------------------------------------------------------------------      
    
    //Displays the records in the Check-Appointment Panel
    public void showRecords(DefaultTableModel table){
        try{
            if(appointment.equals("Short")){
                query = "select * from patient,shorttreatmentsched where patient.SessionID = shorttreatmentsched.shortSessionID ORDER BY SessionID "
                        + "DESC";
                ps = getConnection().prepareStatement(query); 
                rs = ps.executeQuery();
                table.setRowCount(0);
               
                while(rs.next()){
                    String name = rs.getString("FirstName") + " "  + rs.getString("MiddleName") + " "  + rs.getString("LastName");
                    String schedule = rs.getString("sched_day") + " " + rs.getString("sched_time");
                    Object obj[]={rs.getString("DunggonID"),name,rs.getString("Age"), rs.getString("Birthday") ,rs.getString("Gender"),schedule};
                    table.addRow(obj); 
                }
            }else if(appointment.equals("Long")){
                query = "select * from patient,longtreatmentsched where patient.SessionID = longtreatmentsched.longSessionID ORDER BY SessionID "
                        + "DESC";
                ps = DBHelper.getConnection().prepareStatement(query);
                rs = ps.executeQuery();
                table.setRowCount(0);
               
                while(rs.next()){
                    String name = rs.getString("FirstName") + " "  + rs.getString("MiddleName") + " "  + rs.getString("LastName");
                    String schedule =  rs.getString("sched_start") + " to " + rs.getString("sched_end");
                    Object obj[]={rs.getString("DunggonID"),name,rs.getString("Age"),rs.getString("Birthday") ,rs.getString("Gender"),schedule};
                    table.addRow(obj);
                }
            }else{
                table.setRowCount(0);
            }
       }catch(SQLException ex){}    
    }
    
    //Used by the users to search the patient name and its sechduled time
    public boolean search(String name,String appointment){
        boolean check = false;
        if(appointment.equals("Short-Treatment Session")){
            query = "SELECT FirstName,MiddleName,LastName,sched_day,sched_time FROM patient,shorttreatmentsched WHERE patient.SessionID = shorttreatmentsched.shortSessionID";
            String display = "";
            try {
                ps = getConnection().prepareStatement(query);
                rs = ps.executeQuery();
                
                while(rs.next()){
                    String checkName = rs.getString("FirstName") + " " + rs.getString("MiddleName") + " " + rs.getString("LastName");
                    display = checkName;
                    if(name.toLowerCase().equals(checkName.toLowerCase())){
                        check = true;
                        break;
                    }
                }
               if(check){
                   String schedule =  rs.getString("sched_day") + " " + rs.getString("sched_time");
                   JOptionPane.showMessageDialog(null, "" + display + "\n" + schedule);
               }      
               
            }catch(SQLException ex) {
               Logger.getLogger(DunggonCheckAppointment.class.getName()).log(Level.SEVERE, null, ex);
            }  
        }else if(appointment.equals("Long-Treatment Session")){
            query = "SELECT FirstName,MiddleName,LastName,sched_start,sched_end FROM patient,longtreatmentsched WHERE patient.SessionID = longtreatmentsched.longSessionID";
            String display = "";
            try {
                ps = getConnection().prepareStatement(query);
                rs = ps.executeQuery();
                
                while(rs.next()){
                    String checkName = rs.getString("FirstName") + " " + rs.getString("MiddleName") + " " + rs.getString("LastName");
                    display = checkName;
                    if(name.toLowerCase().equals(checkName.toLowerCase())){
                        check = true;
                        break;
                    }
                }
                if(check){
                    String schedule =  rs.getString("sched_start") + " to " + rs.getString("sched_end");
                    JOptionPane.showMessageDialog(null, "" + display + "\n" + schedule);
                }          
            }catch(SQLException ex){
               Logger.getLogger(DunggonCheckAppointment.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return check;  
    }
    
    
    //@Author: Palma, Julieta 
    //ADMIN ADDITIONAL METHODS  
    //-----------------------------------------------------------------------------------------------------------------------------------------------------------------
    
    //Search Patient 
    public boolean searchPatient(String name,String appointment){
        boolean check = false;
        if(appointment.equals("Short-Treatment Session")){
            query = "SELECT FirstName,MiddleName,LastName,MentalCondition,sched_day,sched_time FROM patient,shorttreatmentsched WHERE patient.SessionID = shorttreatmentsched.shortSessionID";
            String display = "";
            try {
                ps = getConnection().prepareStatement(query);
                rs = ps.executeQuery();
                
                while(rs.next()){
                    String checkName = rs.getString("FirstName") + " " + rs.getString("MiddleName") + " " + rs.getString("LastName");
                    display = checkName;
                    if(name.toLowerCase().equals(checkName.toLowerCase())){
                        check = true;
                        break;
                    }
                }
                if(check){
                    String cond = rs.getString("MentalCondition");
                    String schedule =  rs.getString("sched_day") + " " + rs.getString("sched_time");
                    JOptionPane.showMessageDialog(null, "" + display + "\n" + cond + "\n" + schedule);
                }
            }catch(SQLException ex) {
               Logger.getLogger(DunggonCheckAppointment.class.getName()).log(Level.SEVERE, null, ex);
            }  
        }else if(appointment.equals("Long-Treatment Session")){
            query = "SELECT FirstName,MiddleName,LastName,MentalCondition,sched_start,sched_end FROM patient,longtreatmentsched WHERE patient.SessionID = longtreatmentsched.longSessionID";
            String display = "";
            try {
                ps = getConnection().prepareStatement(query);

                rs = ps.executeQuery();
                while(rs.next()){
                    String checkName = rs.getString("FirstName") + " " + rs.getString("MiddleName") + " " + rs.getString("LastName");
                    display = checkName;
                    if(name.toLowerCase().equals(checkName.toLowerCase())){
                         check = true;
                         break;
                    }
                }
                if(check){
                    String cond = rs.getString("MentalCondition");
                    String schedule =  rs.getString("sched_start") + " to " + rs.getString("sched_end");
                    JOptionPane.showMessageDialog(null, "" + display + "\n" + cond +"\n" + schedule);
                } 
            }catch(SQLException ex){
               Logger.getLogger(DunggonCheckAppointment.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return check;  
    }
       
    //Show Patient Records
    public void showPatientRecords(DefaultTableModel table){
        try{
            if(appointment.equals("Short")){
                query = "select * from patient,shorttreatmentsched where patient.SessionID = shorttreatmentsched.shortSessionID ORDER BY SessionID "
                        + "DESC";
                ps = getConnection().prepareStatement(query); 
                rs = ps.executeQuery();
                table.setRowCount(0);
                
                while(rs.next()){
                    String name = rs.getString("FirstName") + " "  + rs.getString("MiddleName") + " "  + rs.getString("LastName");
                    String cond = rs.getString("MentalCondition");
                    String schedule = rs.getString("sched_day") + " " + rs.getString("sched_time");
                    Object obj[]={rs.getString("DunggonID"),name,rs.getString("Age"),rs.getString("Gender"),rs.getString("ContactNumber1"),cond,rs.getString("PrevHospital"),schedule,rs.getString("Guardian"),rs.getString("ContactNumber2")};
                    table.addRow(obj); 
                }
            }else if(appointment.equals("Long")){
                query = "select * from patient,longtreatmentsched where patient.SessionID = longtreatmentsched.longSessionID ORDER BY SessionID "
                        + "DESC";
                ps = DBHelper.getConnection().prepareStatement(query);
                rs = ps.executeQuery();
                table.setRowCount(0);
               
                while(rs.next()){
                    
                    String name = rs.getString("FirstName") + " "  + rs.getString("MiddleName") + " "  + rs.getString("LastName");
                    String cond = rs.getString("MentalCondition");
                    String schedule =  rs.getString("sched_start") + " to " + rs.getString("sched_end");
                    Object obj[]={rs.getString("DunggonID"),name,rs.getString("Age"),rs.getString("Gender"),rs.getString("ContactNumber1"),cond,rs.getString("PrevHospital"),schedule,rs.getString("Guardian"),rs.getString("ContactNumber2")};
                    table.addRow(obj);
                }
            }else{
                table.setRowCount(0);
            }
       }catch(SQLException ex){}    
    }
    
    //Update Patient Records 
    public boolean editPatientRecord(PatientInfoClass patient,String DunggonID){
        String value = DunggonID;
        query = "UPDATE `patient` SET `Age`=?,`MentalCondition`=?,`Guardian`=?,`ContactNumber2`=? WHERE `DunggonID`=?";
            try{ 
                ps = getConnection().prepareStatement(query);
                
                ps.setString(1, patient.getAge());
                ps.setString(2, patient.getMedicalCon());
                ps.setString(3, patient.getGuardian());
                ps.setString(4, patient.getContactNum2());
                ps.setString(5, value);               
                ps.executeUpdate();
                
                return true;
            }catch(SQLException ex){
                Logger.getLogger(DunggonSignUp.class.getName()).log(Level.SEVERE, null, ex);
            }       
        return false;
    }
  
     
    //@Author: Palma, Julieta
    //USER HELPER METHODS
    //-----------------------------------------------------------------------------------------------------------------------------------------------------------------
    
    public boolean checkUsername(UserClass user){
        boolean checkUser = false;
        query = "SELECT * FROM `dunggon_user` WHERE `username` =?";
           try {
                ps = getConnection().prepareStatement(query);
                ps.setString(1, user.getUsername());
                rs = ps.executeQuery();
                if(rs.next()){
                    checkUser = true;
                }
           }catch(SQLException ex) {
               Logger.getLogger(DunggonSignUp.class.getName()).log(Level.SEVERE, null, ex);
           }
        return checkUser;
    }
   
    public boolean checkEmail(UserClass user){
        boolean checkUser1 = false;
        query = "SELECT * FROM `user_info` WHERE `email` =?";
           try {
                ps = getConnection().prepareStatement(query);
                ps.setString(1, user.getEmail());
                rs = ps.executeQuery();
                if(rs.next()){
                    checkUser1 = true;
                }
           }catch(SQLException ex) {
               Logger.getLogger(DunggonSignUp.class.getName()).log(Level.SEVERE, null, ex);
           }
        return checkUser1;
    }
}  