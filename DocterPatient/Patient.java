package DocterPatient;

class Patient extends User {
    private String name;
    public Patient(int userId,String name,String email,String password){
        super(userId,email,password);
        this.name=name;
    }
    public boolean authentication(){
        return true;
    }
}
