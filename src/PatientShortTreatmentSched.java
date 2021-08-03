/**
 **@author: Verdida, Kenneth Mae
 **@date: March 6, 2020
 **/

public class PatientShortTreatmentSched{
    private String day;
    private String time;
   
    public PatientShortTreatmentSched(String day, String time){
        this.day = day;
        this.time = time; 
    }
    
    public String getDay(){ return day; }
    public String getTime(){ return time; }  
    public void setDay(String day){this.day = day;}
    public void setTime(String time){this.time = time;}
}
