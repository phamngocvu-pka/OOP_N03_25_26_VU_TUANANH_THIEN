import java.util.ArrayList;

public class HospitalManager {
    private ArrayList<Patient> patients = new ArrayList<>();
    private ArrayList<Staff> staffList = new ArrayList<>();
    private ArrayList<Department> departments = new ArrayList<>();

    // ---- PATIENT CRUD ----
    public void addPatient(Patient p) { patients.add(p); }
    public void updatePatient(int id, String newName) {
        for (Patient p : patients) {
            if (p.getId() == id) {
                p.setName(newName);
                System.out.println("Updated patient " + id);
                return;
            }
        }
    }
    public void deletePatient(int id) { patients.removeIf(p -> p.getId() == id); }
    public void listPatients() { patients.forEach(System.out::println); }

    // ---- STAFF CRUD ----
    public void addStaff(Staff s) { staffList.add(s); }
    public void updateStaff(int id, String newRole) {
        for (Staff s : staffList) {
            if (s.getId() == id) {
                s.setRole(newRole);
                System.out.println("Updated staff " + id);
                return;
            }
        }
    }
    public void deleteStaff(int id) { staffList.removeIf(s -> s.getId() == id); }
    public void listStaff() { staffList.forEach(System.out::println); }

    // ---- DEPARTMENT CRUD ----
    public void addDepartment(Department d) { departments.add(d); }
    public void updateDepartment(int id, String newName) {
        for (Department d : departments) {
            if (d.getId() == id) {
                d.setName(newName);
                System.out.println("Updated department " + id);
                return;
            }
        }
    }
    public void deleteDepartment(int id) { departments.removeIf(d -> d.getId() == id); }
    public void listDepartments() { departments.forEach(System.out::println); }
}
