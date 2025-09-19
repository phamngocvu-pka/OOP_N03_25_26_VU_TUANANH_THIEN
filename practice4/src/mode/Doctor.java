package hotpital.model;
import java.time.LocalDate;
public class  Dotor {
    private String name;
    private String fullname;
    private String email;
    private LocalDate dob;
    private String phone;
    private String address;  
    private String specialization;
    private int experience; // in years 
    private String department;


    public Dotor(String name, String fullname, String email, LocalDate dob, String phone, String address, String specialization, int experience, String department){
    super(name, fullname, email, dob, phone, address);
        this.specialization = specialization;
        this.experience = experience;
        this.department = department;
    }
    public String getSpecialization(){
        return this.specialization;
    
    
}
    public int getExperience(){
        return this.experience;
    }
    public String getDepartment(){
        return this.department;
    }
    public void setDepartment(String department){
        this.department = department;
    }   
