package com.example.hospital.service;
import org.springframework.data.jpa.repository.JpaRepository; import java.util.*;
public abstract class CrudService<T,ID>{ protected abstract JpaRepository<T,ID> repo();
  public List<T> findAll(){return repo().findAll();} public T findById(ID id){return repo().findById(id).orElseThrow();}
  public T save(T t){return repo().save(t);} public void delete(ID id){ repo().deleteById(id); }
}
