package com.doan.tstore.Model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
// import javax.persistence.JoinColumn;
// import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "address")
public class Address {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  private long userId;

  @Column(length = 40)
  private String name;

  @Column(length = 15)
  private String phone;

  private double lat;
  private double lng;
  private String description;

  @OneToMany(mappedBy = "address")
  @JsonBackReference
  private List<Bill> lstBills;

  public Address() {
  }


  public Address(long id, long userId, String name, String phone, double lat, double lng, String description) {
    this.id = id;
    this.userId = userId;
    this.name = name;
    this.phone = phone;
    this.lat = lat;
    this.lng = lng;
    this.description = description;
  }

  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getUserId() {
    return this.userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPhone() {
    return this.phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public double getLat() {
    return this.lat;
  }

  public void setLat(double lat) {
    this.lat = lat;
  }

  public double getLng() {
    return this.lng;
  }

  public void setLng(double lng) {
    this.lng = lng;
  }

  public String getDescription() {
    return this.description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public List<Bill> getLstBills() {
    return this.lstBills;
  }

  public void setLstBills(List<Bill> lstBills) {
    this.lstBills = lstBills;
  }

}
