package com.doan.tstore.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import com.doan.tstore.Convertor.ImageConvertor;
import com.doan.tstore.Model.Image;
import com.doan.tstore.Model.Entity.ImageEntity;
import com.doan.tstore.Repository.ImageRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@CrossOrigin("http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class ImageController {
  
  @Autowired
  private ImageRepository repository;
  
  private ImageConvertor convertor;

  @GetMapping("/image")
  public List<Image> getAll() {
    return repository.findAll();
  }
  
  @PostMapping("/image")
  public ImageEntity addImage(@RequestBody ImageEntity entity) {
    convertor = new ImageConvertor();
    Image image = convertor.toImage(entity);
    repository.save(image);
    return entity;
  }
}
