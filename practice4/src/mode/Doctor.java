public class doctor {
    public String name;
    public int age;
    public String specialization;
    public String contactInfo;
    
   public Person(String id, String name, int age, String address) {
    this.id = id;
    this.name = name;
    this.age = age;
    this.address = address;
}
public string getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }
public String getname() {
        return name;
    }
public void setname(String name) {
        this.name = name;
    }
public int getage() {
        return age;
    }
public void setage(int age) {   
        this.age = age;
    }
public String getspecialization() {
        return specialization;
    }
public void setspecialization(String specialization) {
        this.specialization = specialization;
    }
public String getcontactInfo() {
        return contactInfo;
    }
public void setcontactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }
public void displayInfo() {
        System.out.println("Doctor Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Specialization: " + specialization);
        System.out.println("Contact Info: " + contactInfo);
    }
}