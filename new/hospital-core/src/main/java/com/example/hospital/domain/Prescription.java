package com.example.hospital.domain;
import jakarta.persistence.*; import jakarta.validation.constraints.*;
@Entity public class Prescription extends BaseEntity{
  @ManyToOne @JoinColumn(name="appointment_id") private Appointment appointment;
  @NotBlank private String medicineName; private String dosage; private Integer days;
  public Appointment getAppointment(){return appointment;} public void setAppointment(Appointment a){this.appointment=a;}
  public String getMedicineName(){return medicineName;} public void setMedicineName(String s){this.medicineName=s;}
  public String getDosage(){return dosage;} public void setDosage(String s){this.dosage=s;}
  public Integer getDays(){return days;} public void setDays(Integer d){this.days=d;}
}
