package com.doan.tstore.Controller;

import java.util.List;

import com.doan.tstore.Model.History;
import com.doan.tstore.Model.Projection.HistoryProjection;
import com.doan.tstore.Repository.HistoryRepository;

import org.hibernate.mapping.PrimitiveArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class HistoryController {
  
  @Autowired
  private HistoryRepository repository;

  @GetMapping("/history/{id}")
  public List<HistoryProjection> getHistory(@PathVariable long id) {
    return repository.getHistoryByUserId(id);
  }
}
