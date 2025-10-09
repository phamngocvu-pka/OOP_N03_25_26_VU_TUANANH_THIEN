package com.example.hospital.domain;
import jakarta.persistence.*; import jakarta.validation.constraints.*; import java.util.*;
@Entity public class Doctor extends BaseEntity{
  @NotBlank private String fullName; @Email private String email; private String phone;
  @ManyToOne @JoinColumn(name="department_id") private Department department;
  @OneToMany(mappedBy="doctor") private List<Appointment> appointments=new ArrayList<>();
  public String getFullName(){return fullName;} public void setFullName(String s){this.fullName=s;}
  public String getEmail(){return email;} public void setEmail(String s){this.email=s;}
  public String getPhone(){return phone;} public void setPhone(String s){this.phone=s;}
  public Department getDepartment(){return department;} public void setDepartment(Department d){this.department=d;}
}
