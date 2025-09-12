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
    public int Age(){
        return LocalDate.now().getYear() - this.dob.getYear();
    }
    
}