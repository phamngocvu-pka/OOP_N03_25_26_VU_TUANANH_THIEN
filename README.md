# OOP_Project
Dự án OOP - Quản Lý Bệnh Viện

# 1. Members (Thành viên dự án)
Phạm Ngọc Vũ - 23010192

Nguyễn Hoàng Thiên - 23010139

Phạm Tuấn Anh - 22010227
# 2. Yêu cầu chính
+ Quản lý thông tin bệnh nhân
+ Quản lý bác sĩ & nhân viên y tế
+ Quản lý phòng ban & cơ sở vật chất
+ Quản lý lịch hẹn và khám chữa bệnh
+ Quản lý thanh toán viện phí
# 3. Mô tả cụ thể
- Giới thiệu
+ Dự án này được xây dựng trong khuôn khổ môn học Lập trình Hướng đối tượng (OOP).
+ Mục tiêu là áp dụng các nguyên lý OOP (kế thừa, đóng gói, đa hình, trừu tượng) để xây dựng một hệ thống quản lý bệnh + + + Viện có khả năng quản lý thông tin bệnh nhân, bác sĩ, phòng ban, lịch khám và hóa đơn viện phí.
- Mục tiêu
+ Rèn luyện kỹ năng thiết kế và lập trình theo hướng đối tượng bằng Java.
+ Mô phỏng hoạt động cơ bản của bệnh viện.
+ Xây dựng chương trình có tính mở rộng, dễ bảo trì và nâng cấp.
+ Ứng dụng các mô hình UML (Use Case, Class Diagram, Sequence Diagram) vào phân tích và thiết kế hệ thống.
- Công nghệ sử dụng
+ Ngôn ngữ: Java
+ IDE: IntelliJ IDEA / NetBeans / Eclipse
+ Quản lý mã nguồn: GitHub
+ Mô hình thiết kế: UML
- Chức năng chính
+ Quản lý bệnh nhân
+ Thêm, sửa, xóa, tìm kiếm thông tin bệnh nhân.
+ Lưu trữ thông tin hồ sơ bệnh án.
+ Quản lý bác sĩ & nhân viên
+ Quản lý danh sách bác sĩ, y tá, nhân viên.
+ Phân công lịch làm việc.
+ Quản lý phòng ban & cơ sở vật chất
+ Quản lý khoa phòng, giường bệnh, phòng khám.
+ Theo dõi tình trạng sử dụng.
+ Quản lý lịch hẹn & khám chữa bệnh
+ Đặt lịch hẹn cho bệnh nhân.
+ Ghi nhận chẩn đoán và toa thuốc.
+ Quản lý thanh toán
+ Quản lý hóa đơn viện phí.
+ Thống kê và báo cáo chi phí.

2. Objects (Đối tượng)
2.1. Person (Thành viên)
2.1.1. Attribute (Thuộc tính)

 String id (mã thành viên)
 String name (họ và tên)
 String gender (giới tính)
 Date dob (ngày sinh)
 Date dod (ngày mất, có thể null)
 String address (địa chỉ)
 Person father (bố)
 Person mother (mẹ)
 String phone (số điện thoại)
 Person spouse (quan hệ vợ chồng, có thể null)
2.1.2. Methods (Phương thức)
 Person().
 set(), get() cho từng thuộc tính.
 int getAge().
 setParents().
 setSpouse().
 editMembereditMember().
 removeMember().
 display().
2.2. User (Người dùng)
2.2.1. Attribute (Thuộc tính)
 String username (tài khoản)
 String password (mật khẩu)
 String role (chức vụ)
2.2.2. Methods (Phương thức)
+  User().
+  set(), get() cho từng thuộc tính.
+  login().
+  logout().
+  changePassword().
+  resetPassword().
2.3. Family (Gia đình)
2.3.1. Attribute (Thuộc tính)
+  String id (mã gia đình)
+  String nameFamily (tên của gia đình, lấy tên con trai lớn tuổi nhất hiện tại trong gia đình)
+  List <Person> familyMembers (danh sách thành viên trong gia đình)
2.3.2. Methods (Phương thức)
+ Family().
+ getMember().
+ addMembers().
+ removeMember().
+ display().
+ removeFamily().
2.4. FamilyTree (Cây gia phả)
2.4.1. Attribute (Thuộc tính)
- Person root (thành viên đời thứ nhất - tổ tiên)
- List <Person> members (danh sách thành viên)
2.4.2. Methods (Phương thức)
- FamilyTree().
- addNode().
- display().
2.5. ReceiveManagement (Quản lý thu)
2.5.1. Attribute (Thuộc tính)
+ String id (mã khoản thu)
+ String name (tên khoản thu).
+ float money (số tiền thu).
+ String type (hạng mục thu).
+ String description (mô tả).
+ Date date (ngày thu tiền),
+ List <ReceiveManagement> finishedmembers (danh sách thành viên đóng tiền).
2.5.2. Methods (Phương thức)
+ getName()
+ getMoney()
+ getType()
+ getdescription()
+ getDate()
2.6. ExpenseManagement (Quản lý chi)
2.6.1. Attribute (Thuộc tính)
+ String id (mã khoản chi).
+ String name (tên khoản chi).
+ float money (số tiền chi).
+ String type (hạng mục chi).
+ String description (mô tả).
+ Date date (ngày chi tiền),
2.6.2. Methods (Phương thức)
+ getName()
+ getMoney()
+ getType()
+ getdescription()
+ getDate()
2.7. FinancialManagement (Quản lý tài chính)
2.7.1. Attribute (Thuộc tính)
+ incomes: List<ReceiveManagement>,
+ expenses: List<ExpenseManagement>,

2.7.2. Methods (Phương thức)
 addIncome(receive: ReceiveManagement),
 addExpense(expense: ExpenseManagement),
 getTotalReceive(),
 getTotalExpense(),
 getBalance(),
 getCategoryReport(),
# 4 Sơ đồ khối