package com.example.hospital.domain;
import jakarta.persistence.*; import java.time.*;
@MappedSuperclass
public abstract class BaseEntity {
  @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
  private LocalDateTime createdAt = LocalDateTime.now(); private LocalDateTime updatedAt = LocalDateTime.now();
  @PreUpdate public void preUpdate(){ this.updatedAt = LocalDateTime.now(); }
  public Long getId(){return id;} public LocalDateTime getCreatedAt(){return createdAt;} public LocalDateTime getUpdatedAt(){return updatedAt;}
}
