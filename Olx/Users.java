
import java.util.List;

public abstract class Users {
    //user attributes
    private Integer userId;
    private String email;
    private String password;
    public Users(Integer userId,String email,String password){
        this.userId=userId;
        this.email=email;
        this.password=password;
    }
    public Users(){};
    public abstract boolean authentication(List<? extends Users> userList,String email,String password);
    //getter
    public Integer getUserId(){
        return userId;
    }
    public String getEmail(){
        return email;
    }
    public String getPassword(){
        return password;
    }


}
