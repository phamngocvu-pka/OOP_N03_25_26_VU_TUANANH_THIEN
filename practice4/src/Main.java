import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Tạo đối tượng Scanner để đọc dữ liệu từ bàn phím
        Scanner scanner = new Scanner(System.in);

        // Nhập thông tin bác sĩ
        System.out.print("Enter doctor's name: ");
        String name = scanner.nextLine();

        System.out.print("Enter doctor's age: ");
        int age = scanner.nextInt();  // Nhập tuổi bác sĩ (sử dụng nextInt)

        scanner.nextLine();  // Xử lý dấu ngắt dòng còn lại sau khi nhập tuổi

        System.out.print("Enter doctor's specialization: ");
        String specialization = scanner.nextLine();

        System.out.print("Enter doctor's contact info (email): ");
        String contactInfo = scanner.nextLine();

        // Tạo đối tượng Doctor với các thông tin đã nhập
        Doctor doctor = new Doctor(name, age, specialization, contactInfo);

        // Hiển thị thông tin bác sĩ
        doctor.displayDoctorInfo();

        // Đóng Scanner để tránh rò rỉ tài nguyên
        scanner.close();
    }
}