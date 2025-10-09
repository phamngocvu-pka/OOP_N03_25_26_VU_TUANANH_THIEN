package com.example.hospital.domain;
import jakarta.persistence.*; import jakarta.validation.constraints.*;
@Entity public class Invoice extends BaseEntity{
  @OneToOne @JoinColumn(name="appointment_id") private Appointment appointment;
  @DecimalMin("0.0") private Double amount; private String status;
  public Appointment getAppointment(){return appointment;} public void setAppointment(Appointment a){this.appointment=a;}
  public Double getAmount(){return amount;} public void setAmount(Double v){this.amount=v;}
  public String getStatus(){return status;} public void setStatus(String s){this.status=s;}
}
