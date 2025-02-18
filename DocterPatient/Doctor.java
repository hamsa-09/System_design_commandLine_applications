package DocterPatient;

import java.util.ArrayList;
import java.util.List;

class Doctor extends User{
    private String name;
    private String specialist;
    private List<String> availableDate;
    public Doctor(int userId,String name,String email,String password,String specialist,List<String> availableDate){
        super(userId, email, password);
        this.name=name;
        this.specialist=specialist;
        this.availableDate=new ArrayList<>(availableDate);
    }
    public boolean authentication(){
        return true;
    }
    public int getUserId(){
        return super.getUserId();
    }
    public String getName(){
        return name;
    }
    public String getSpecialist(){
        return specialist;
    }
    public List<String> getDateList(){
        return availableDate;
    }
   
}
