package com.example.hospital.domain;
import jakarta.persistence.*; import java.time.*; import java.util.*;
@Entity public class Appointment extends BaseEntity{
  @ManyToOne @JoinColumn(name="patient_id") private Patient patient;
  @ManyToOne @JoinColumn(name="doctor_id") private Doctor doctor;
  private LocalDateTime time; private String reason; private String status;
  @OneToMany(mappedBy="appointment", cascade=CascadeType.ALL) private List<Prescription> prescriptions=new ArrayList<>();
  @OneToOne(mappedBy="appointment", cascade=CascadeType.ALL) private Invoice invoice;
  public Patient getPatient(){return patient;} public void setPatient(Patient p){this.patient=p;}
  public Doctor getDoctor(){return doctor;} public void setDoctor(Doctor d){this.doctor=d;}
  public LocalDateTime getTime(){return time;} public void setTime(LocalDateTime t){this.time=t;}
  public String getReason(){return reason;} public void setReason(String r){this.reason=r;}
  public String getStatus(){return status;} public void setStatus(String s){this.status=s;}
}
