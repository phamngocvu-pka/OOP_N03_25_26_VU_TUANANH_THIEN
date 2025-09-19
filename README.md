OOP_Project
Dự án OOP - Quản Lý Bệnh Viện

1. Members (Thành viên dự án)

Phạm Ngọc Vũ 23010192

Nguyễn Hoàng Thiên 23010139

Phạm Tuấn Anh 

2. Yêu cầu chính

Quản lý thông tin bệnh nhân

Quản lý bác sĩ & nhân viên y tế

Quản lý phòng ban & cơ sở vật chất

Quản lý lịch hẹn và khám chữa bệnh

Quản lý thanh toán viện phí

3. Mô tả cụ thể
+ Giới thiệu

Dự án này được xây dựng trong khuôn khổ môn học Lập trình Hướng đối tượng (OOP).
Mục tiêu là áp dụng các nguyên lý OOP (kế thừa, đóng gói, đa hình, trừu tượng) để xây dựng một hệ thống quản lý bệnh viện có khả năng quản lý thông tin bệnh nhân, bác sĩ, phòng ban, lịch khám và hóa đơn viện phí.

+ Mục tiêu

Rèn luyện kỹ năng thiết kế và lập trình theo hướng đối tượng bằng Java.

Mô phỏng hoạt động cơ bản của bệnh viện.

Xây dựng chương trình có tính mở rộng, dễ bảo trì và nâng cấp.

Ứng dụng các mô hình UML (Use Case, Class Diagram, Sequence Diagram) vào phân tích và thiết kế hệ thống.

+ Công nghệ sử dụng

Ngôn ngữ: Java

IDE: IntelliJ IDEA / NetBeans / Eclipse

Quản lý mã nguồn: GitHub

Mô hình thiết kế: UML

+ Chức năng chính

Quản lý bệnh nhân

Thêm, sửa, xóa, tìm kiếm thông tin bệnh nhân.

Lưu trữ thông tin hồ sơ bệnh án.

Quản lý bác sĩ & nhân viên

Quản lý danh sách bác sĩ, y tá, nhân viên.

Phân công lịch làm việc.

Quản lý phòng ban & cơ sở vật chất

Quản lý khoa phòng, giường bệnh, phòng khám.

Theo dõi tình trạng sử dụng.

Quản lý lịch hẹn & khám chữa bệnh

Đặt lịch hẹn cho bệnh nhân.

Ghi nhận chẩn đoán và toa thuốc.

Quản lý thanh toán

Quản lý hóa đơn viện phí.

Thống kê và báo cáo chi phí.

4. Objects (Đối tượng) – Quản lý Bệnh viện
4.1. Person (Người)
4.1.1. Attribute (Thuộc tính)

String id (mã thành viên)

String name (họ và tên)

String gender (giới tính)

Date dob (ngày sinh)

String address (địa chỉ)

String phone (số điện thoại)

String email (email) — (thêm để liên hệ)

Role role (vai trò: Bệnh nhân, Bác sĩ, Nhân viên y tế,...)

4.1.2. Methods (Phương thức)

Person() (constructor)

set(), get() cho từng thuộc tính

displayInfo() — hiển thị thông tin cá nhân

4.2. Patient (Bệnh nhân) — kế thừa Person
4.2.1. Attribute (Thuộc tính)

String patientId (mã bệnh nhân)

String medicalRecord (hồ sơ bệnh án)

List<Appointment> appointments (danh sách lịch khám)

List<Bill> bills (danh sách hóa đơn)

4.2.2. Methods (Phương thức)

Patient()

addAppointment(Appointment)

addBill(Bill)

getMedicalHistory()

displayPatientInfo()

4.3. Doctor (Bác sĩ) — kế thừa Person
4.3.1. Attribute (Thuộc tính)

String doctorId (mã bác sĩ)

String specialty (chuyên khoa)

List<Appointment> schedule (lịch làm việc)

String qualification (trình độ chuyên môn)

4.3.2. Methods (Phương thức)

Doctor()

addAppointment(Appointment)

getSchedule()

displayDoctorInfo()

4.4. Department (Phòng ban)
4.4.1. Attribute (Thuộc tính)

String departmentId (mã phòng ban)

String name (tên phòng ban)

List<Room> rooms (danh sách phòng)

List<Person> staff (danh sách nhân viên: bác sĩ, y tá,...)

4.4.2. Methods (Phương thức)

Department()

addRoom(Room)

addStaff(Person)

removeStaff(Person)

displayDepartmentInfo()

4.5. Room (Phòng khám, giường bệnh)
4.5.1. Attribute (Thuộc tính)

String roomId (mã phòng)

String type (loại phòng: phòng khám, giường bệnh,...)

int capacity (sức chứa)

List<Patient> currentPatients (bệnh nhân đang nằm)

4.5.2. Methods (Phương thức)

Room()

addPatient(Patient)

removePatient(Patient)

displayRoomStatus()

4.6. Appointment (Lịch hẹn khám)
4.6.1. Attribute (Thuộc tính)

String appointmentId (mã lịch hẹn)

Patient patient

Doctor doctor

Date appointmentDate

String status (trạng thái: chờ, hoàn thành, hủy)

String diagnosis (chẩn đoán)

String prescription (toa thuốc)

4.6.2. Methods (Phương thức)

Appointment()

setDiagnosis(String)

setPrescription(String)

updateStatus(String)

displayAppointmentInfo()

4.7. Bill (Hóa đơn viện phí)
4.7.1. Attribute (Thuộc tính)

String billId (mã hóa đơn)

Patient patient

Date billDate

float amount (số tiền)

String description (mô tả chi phí)

boolean isPaid (trạng thái thanh toán)

4.7.2. Methods (Phương thức)

Bill()

markAsPaid()

displayBillInfo()

4.8. HospitalManagement (Quản lý bệnh viện)
4.8.1. Attribute (Thuộc tính)

List<Patient> patients

List<Doctor> doctors

List<Department> departments

List<Appointment> appointments

List<Bill> bills

4.8.2. Methods (Phương thức)

addPatient(Patient)

addDoctor(Doctor)

addDepartment(Department)

scheduleAppointment(Appointment)

generateBill(Bill)

getPatientById(String)

getDoctorById(String)

getAppointmentsByDate(Date)

getBillsByPatient(Patient)

displayHospitalSummary()