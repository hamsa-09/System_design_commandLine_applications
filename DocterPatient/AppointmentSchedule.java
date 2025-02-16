package DocterPatient;

public class AppointmentSchedule {
    private int appointId;
    private String DoctorName;
    private String appointDate;
    public AppointmentSchedule(int appointId, String DoctorName, String appointDate) {
        this.appointId=appointId;
        this.DoctorName=DoctorName;
        this.appointDate=appointDate;
    }

}
