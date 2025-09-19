import hotpital.model.Dotor;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập tên: ");
        String name = scanner.nextLine();

        System.out.print("Nhập họ tên đầy đủ: ");
        String fullname = scanner.nextLine();

        System.out.print("Nhập email: ");
        String email = scanner.nextLine();

        System.out.print("Nhập ngày sinh (yyyy-MM-dd): ");
        String dobInput = scanner.nextLine();
        LocalDate dob = LocalDate.parse(dobInput, DateTimeFormatter.ofPattern("yyyy-MM-dd"));

        System.out.print("Nhập số điện thoại: ");
        String phone = scanner.nextLine();

        System.out.print("Nhập địa chỉ: ");
        String address = scanner.nextLine();

        System.out.print("Nhập chuyên môn (specialization): ");
        String specialization = scanner.nextLine();

        System.out.print("Nhập số năm kinh nghiệm: ");
        int experience = scanner.nextInt();
        scanner.nextLine(); // clear buffer

        System.out.print("Nhập khoa (department): ");
        String department = scanner.nextLine();

        // Tạo đối tượng Dotor
        Dotor doctor = new Dotor(name, fullname, email, dob, phone, address, specialization, experience, department);

        // In thông tin bác sĩ
        System.out.println("\n--- Thông tin bác sĩ ---");
        System.out.println("Tên: " + doctor.getName());
        System.out.println("Họ tên: " + doctor.getFullname());
        System.out.println("Email: " + doctor.getEmail());
        System.out.println("Ngày sinh: " + doctor.getDob());
        System.out.println("SĐT: " + doctor.getPhone());
        System.out.println("Địa chỉ: " + doctor.getAddress());
        System.out.println("Chuyên môn: " + doctor.getSpecialization());
        System.out.println("Kinh nghiệm: " + doctor.getExperience() + " năm");
        System.out.println("Khoa: " + doctor.getDepartment());

        scanner.close();
    }
}
