package DocterPatient;

public class AppointmentSchedule {
    private int appointId;
    private String doctorName;
    private String patientName;
    private String appointDate;
    public AppointmentSchedule(int appointId, String doctorName, String patientName,String appointDate) {
        this.appointId=appointId;
        this.doctorName=doctorName;
        this.patientName=patientName;
        this.appointDate=appointDate;
    }
    public int getAppointId() {
        return appointId;
    }
    public void setAppointId(int appointId) {
        this.appointId = appointId;
    }
    public String getDoctorName() {
        return doctorName;
    }
   


}
