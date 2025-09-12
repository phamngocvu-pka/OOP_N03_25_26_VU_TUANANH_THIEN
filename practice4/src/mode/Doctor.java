public class doctor {
    public String name;
    public int age;
    public String specialization;
    public String contactInfo;
    
    public Doctor(String name, int age, String specialization, String contactInfo) {
        this.name = name;
        this.age = age;
        this.specialization = specialization;
        this.contactInfo = contactInfo;
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
}