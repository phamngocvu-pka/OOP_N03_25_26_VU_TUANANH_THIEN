package hotpital.model;
import java.time.LocalDate;
public class Person{
    public String name;
    public String fullname;
    public String email;
    public LocalDate dob;
    public String phone;
    public String address;  

    public Person(String name, String fullname, String email, LocalDate dob, String phone, String address){
        this.name = name;
        this.fullname = fullname;
        this.email = email;
        this.dob = dob;
        this.phone = phone;
        this.address = address;
    }
    public int getAge(){
        return LocalDate.now().getYear() - this.dob.getYear();
    }
    public String getName(){
        return this.name;
    }
    public String getFullname(){
        return this.fullname;   
    }
    public String getEmail(){
        return this.email;
    }
    public LocalDate getDob(){
        return this.dob;
    }
    public String getPhone(){
        return this.phone;
    }
    public String getAddress(){
        return this.address;
    }   
}