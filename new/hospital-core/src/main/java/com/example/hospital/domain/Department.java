package com.example.hospital.domain;
import jakarta.persistence.*; import jakarta.validation.constraints.*; import java.util.*;
@Entity public class Department extends BaseEntity{
  @NotBlank private String name;
  @OneToMany(mappedBy="department") private List<Doctor> doctors = new ArrayList<>();
  public String getName(){return name;} public void setName(String n){this.name=n;}
}
