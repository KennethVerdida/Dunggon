/**
 **@author: Verdida, Kenneth Mae
 **@date: March 12, 2020
 **/

public class PatientInfoClass{
    private String fname;
    private String mname;
    private String lname;
    private String age;
    private String bday;
    private String gender;
    private String occupation;
    private String status;
    private String add;
    private String contactNum1;
    private String email1;
    private String medicalCon;
    private String hospital;
    private String guardian;
    private String contactNum2;
    private String email2;
    
    public PatientInfoClass(String fname, String mname, String lname, String age, String bday, String gender, String occupation, String status, String add, String contactNum1, String email1, String medicalCon, String hospital, String guardian, String contactNum2, String email2){
        this.fname = fname;
        this.mname = mname;
        this.lname = lname;
        this.age = age;
        this.bday = bday;
        this.gender = gender;
        this.occupation = occupation;
        this.status = status;
        this.add = add;
        this.contactNum1 = contactNum1;
        this.email1 = email1;
        this.medicalCon = medicalCon;
        this.hospital = hospital;
        this.guardian = guardian;
        this.contactNum2 = contactNum2;
        this.email2 = email2;
    }
    
    public PatientInfoClass(String age, String medicalCon,String guardian, String contactNum2){
        this.age = age;
        this.medicalCon = medicalCon;
        this.guardian = guardian;
        this.contactNum2 = contactNum2;
    }

    public String getFname(){ return fname; }
    public String getMname(){ return mname; }
    public String getLname(){ return lname; }
    public String getAge(){ return age; }
    public String getBday(){ return bday; }
    public String getGender(){ return gender; }
    public String getOccupation(){ return occupation; }
    public String getStatus(){ return status; }
    public String getAdd(){ return add; }
    public String getContactNum1(){ return contactNum1; }
    public String getEmail1(){ return email1; }
    public String getMedicalCon(){ return medicalCon; }
    public String getHospital(){ return hospital; }
    public String getGuardian(){ return guardian; }
    public String getContactNum2(){ return contactNum2; }
    public String getEmail2(){ return email2; }
     
    public void setFname(String fname){this.fname = fname;}
    public void setMname(String mname){this.mname = mname;}
    public void setLname(String lname){this.lname = lname;}
    public void setAge(String age){this.age = age;}
    public void setBday(String bday){this.bday = bday;}
    public void setGender(String gender){this.gender = gender;}
    public void setOccupation(String occupation){this.occupation = occupation;}
    public void setStatus(String status){this.status = status;}
    public void setAdd(String add){this.add = add;}
    public void setContactNum1(String contactNum1){this.contactNum1 = contactNum1;}
    public void setEmail1(String email1){this.email1 = email1;}
    public void setMedicalCon(String medicalCon){this.medicalCon = medicalCon;}
    public void setHospital(String hospital){this.hospital = hospital;}
    public void setGuardian(String guardian){this.guardian = guardian;}
    public void setContactNum2(String contactNum2){this.contactNum2 = contactNum2;}
    public void setEmail2(String email2){this.email2 = email2;}
}
