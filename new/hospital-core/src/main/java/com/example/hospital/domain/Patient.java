package com.example.hospital.domain;
import jakarta.persistence.*; import jakarta.validation.constraints.*; import java.time.*; import java.util.*;
@Entity public class Patient extends BaseEntity{
  @NotBlank private String fullName; @Past private LocalDate dob; private String gender; private String phone; @Email private String email;
  @OneToMany(mappedBy="patient") private List<Appointment> appointments = new ArrayList<>();
  public String getFullName(){return fullName;} public void setFullName(String s){this.fullName=s;}
  public LocalDate getDob(){return dob;} public void setDob(LocalDate d){this.dob=d;}
  public String getGender(){return gender;} public void setGender(String g){this.gender=g;}
  public String getPhone(){return phone;} public void setPhone(String p){this.phone=p;}
  public String getEmail(){return email;} public void setEmail(String e){this.email=e;}
}
