package com.doan.tstore.Model;

import java.sql.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "bill")
public class Bill {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  @ManyToOne
  @JoinColumn(name = "gameId", nullable = false, referencedColumnName = "id")
  @JsonManagedReference
  private User user;

  private Date dateCreate;

  @ManyToOne
  @JoinColumn(name = "addressId", nullable = false, referencedColumnName = "id")
  @JsonManagedReference
  private Address address;

  private double ship;
  private double totalPrice;

  @OneToMany(mappedBy = "bill")
  @JsonManagedReference
  private List<BillDetail> lstBillDetails;


  public Bill() {
  }

  public Bill(long id, User user, Date dateCreate, Address address, double ship, double totalPrice) {
    this.id = id;
    this.user = user;
    this.dateCreate = dateCreate;
    this.address = address;
    this.ship = ship;
    this.totalPrice = totalPrice;
  }

  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public User getUser() {
    return this.user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public Date getDateCreate() {
    return this.dateCreate;
  }

  public void setDateCreate(Date dateCreate) {
    this.dateCreate = dateCreate;
  }

  public Address getAddress() {
    return this.address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  public double getShip() {
    return this.ship;
  }

  public void setShip(double ship) {
    this.ship = ship;
  }

  public double getTotalPrice() {
    return this.totalPrice;
  }

  public void setTotalPrice(double totalPrice) {
    this.totalPrice = totalPrice;
  }


  public List<BillDetail> getLstBillDetails() {
    return this.lstBillDetails;
  }

  public void setLstBillDetails(List<BillDetail> lstBillDetails) {
    this.lstBillDetails = lstBillDetails;
  }

}
