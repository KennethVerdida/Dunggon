/**
 **@author: Verdida, Kenneth Mae
 **@date: March 6, 2020
 **/

public class PatientLongTreatmentSched{
    private String start;
    private String end;
   
    public PatientLongTreatmentSched(String start, String end){
        this.start = start;
        this.end = end; 
    }
 
    public String getStart(){ return start; }
    public String getEnd(){ return end; }
    public void setStart(String start){this.start = start;}
    public void setEnd(String end){this.end = end;}
}
