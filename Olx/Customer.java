import java.util.List;

class Customer extends Users {
    private String customerName;

    public Customer(Integer userId,String customerName, String email, String password) {
        super(userId, email, password);
        this.customerName = customerName;
    }

    // Getter
    public String getCustomerName() {
        return customerName;
    }

    // Setter
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
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
