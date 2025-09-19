public class Staff {
    private int id;
    private String name;
    private String role;
    private String specialization;

    public Staff(int id, String name, String role, String specialization) {
        this.id = id;
        this.name = name;
        this.role = role;
        this.specialization = specialization;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getRole() { return role; }
    public String getSpecialization() { return specialization; }

    public void setName(String name) { this.name = name; }
    public void setRole(String role) { this.role = role; }
    public void setSpecialization(String specialization) { this.specialization = specialization; }

    @Override
    public String toString() {
        return "Staff{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", role='" + role + '\'' +
                ", specialization='" + specialization + '\'' +
                '}';
    }
}
