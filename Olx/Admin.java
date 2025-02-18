import java.util.List;

public class Admin extends Users {
    //admin attributes;
    private String adminName;
    public Admin(Integer userId,String adminName,String email,String password){
        super(userId,email,password);
        this.adminName=adminName;
    }

    public String getName(){
        return adminName;
    }
    public boolean authentication(List<? extends Users> userlist,String email,String password){
        for(Users user:userlist){
            if(user.getEmail().equalsIgnoreCase(email) && user.getPassword().equals(password)){
                return true;
            }
        }
        return false;
    }
}
