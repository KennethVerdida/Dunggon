/**
 **@author: Palma, Julieta
 **@date: March 3, 2020
 **/

public class UserClass {
    private String fname;
    private String lname;
    private String email;
    private String username;
    private String pass;
 
    public UserClass(String username, String pass){
        this.username = username;
        this.pass = pass;   
    }
    public UserClass(String fname, String lname, String email, String username, String pass){
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.username = username;
        this.pass = pass;     
    }
    public String getFname(){ return fname; }
    public String getLname(){ return lname; }
    public String getEmail(){ return email; }
    public String getUsername(){ return username; }
    public String getPass(){ return pass; }
    
    public void setFname(String fname){ this.fname = fname; }
    public void setLname(String lname){ this.lname = lname; }
    public void setEmail(String email){ this.email = email; }
    public void setUsername(String username){ this.username = username; }
    public void setPass(String pass){ this.pass = pass; } 
}
