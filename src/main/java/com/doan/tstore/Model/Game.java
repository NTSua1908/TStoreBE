package com.doan.tstore.Model;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
// import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name = "game")
// @JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Game {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  @Column(length = 40)
  private String name;

  @OneToMany(mappedBy = "game")
  @JsonManagedReference
  private List<Image> images = new ArrayList<Image>();

  private String thumbnailHorizontal;
  private String thumbnailVertical;
  private String trailer;
  private String banner;
  private double price;
  private int quantity;
  private double discount;
  private String developer;
  private String publisher;

  @ManyToOne
  @JoinColumn(name = "providerId", nullable = false, referencedColumnName = "id")
  @JsonManagedReference
  private Provider provider;

  private Date releaseDate;

  @ManyToMany
  @JoinTable(name = "game_types", 
              joinColumns = @JoinColumn(name = "game_id"),
              inverseJoinColumns = @JoinColumn(name = "type_id"))
  @JsonManagedReference
  private List<GameType> types = new ArrayList<GameType>();

  private Date expirationDate;

  @Column(length = 5)
  private String positiveReview;

  @Column(length = 5)
  private String negativeReview;

  @Column(length = 5)
  private String overallReview;

  @Lob
  @Column(columnDefinition = "TEXT")
  private String description;

  @Lob
  @Column(columnDefinition = "TEXT")
  private String content;

  @OneToMany(mappedBy = "game")
  @JsonBackReference
  private List<Cart> lstCart;

  @OneToMany(mappedBy = "game")
  @JsonBackReference
  private List<BillDetail> lstBillDetails;

  @ManyToOne
  @JoinColumn(name = "flatformId", nullable = false, referencedColumnName = "id")
  @JsonManagedReference
  private Flatform flatform;

  @OneToMany(mappedBy = "game")
  // @JsonBackReference
  @JsonIgnore
  private List<History> history;

  public Game() {
  }

  public Game(long id, String name, List<Image> images, String thumbnailHorizontal, String thumbnailVertical, String trailer, String banner, double price, int quantity, double discount, String developer, String publisher, Provider provider, Date releaseDate, Flatform flatform, List<GameType> types, Date expirationDate, String positiveReview, String negativeReview, String overallReview, String description, String content, List<Cart> lstCart, List<BillDetail> lstBillDetails) {
    this.id = id;
    this.name = name;
    this.images = images;
    this.thumbnailHorizontal = thumbnailHorizontal;
    this.thumbnailVertical = thumbnailVertical;
    this.trailer = trailer;
    this.banner = banner;
    this.price = price;
    this.quantity = quantity;
    this.discount = discount;
    this.developer = developer;
    this.publisher = publisher;
    this.provider = provider;
    this.releaseDate = releaseDate;
    this.flatform = flatform;
    this.types = types;
    this.expirationDate = expirationDate;
    this.positiveReview = positiveReview;
    this.negativeReview = negativeReview;
    this.overallReview = overallReview;
    this.description = description;
    this.content = content;
    this.lstCart = lstCart;
    this.lstBillDetails = lstBillDetails;
  }

  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<Image> getImages() {
    return this.images;
  }

  public void setImages(List<Image> images) {
    this.images = images;
  }

  public String getThumbnailHorizontal() {
    return this.thumbnailHorizontal;
  }

  public void setThumbnailHorizontal(String thumbnailHorizontal) {
    this.thumbnailHorizontal = thumbnailHorizontal;
  }

  public String getThumbnailVertical() {
    return this.thumbnailVertical;
  }

  public void setThumbnailVertical(String thumbnailVertical) {
    this.thumbnailVertical = thumbnailVertical;
  }

  public String getTrailer() {
    return this.trailer;
  }

  public void setTrailer(String trailer) {
    this.trailer = trailer;
  }

  public String getBanner() {
    return this.banner;
  }

  public void setBanner(String banner) {
    this.banner = banner;
  }

  public double getPrice() {
    return this.price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public int getQuantity() {
    return this.quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  public double getDiscount() {
    return this.discount;
  }

  public void setDiscount(double discount) {
    this.discount = discount;
  }

  public String getDeveloper() {
    return this.developer;
  }

  public void setDeveloper(String developer) {
    this.developer = developer;
  }

  public String getPublisher() {
    return this.publisher;
  }

  public void setPublisher(String publisher) {
    this.publisher = publisher;
  }

  public Provider getProvider() {
    return this.provider;
  }

  public void setProvider(Provider provider) {
    this.provider = provider;
  }

  public Date getReleaseDate() {
    return this.releaseDate;
  }

  public void setReleaseDate(Date releaseDate) {
    this.releaseDate = releaseDate;
  }

  public Flatform getFlatform() {
    return this.flatform;
  }

  public void setFlatform(Flatform flatform) {
    this.flatform = flatform;
  }
  

  public List<GameType> getTypes() {
    return this.types;
  }

  public void setTypes(List<GameType> types) {
    this.types = types;
  }

  public Date getExpirationDate() {
    return this.expirationDate;
  }

  public void setExpirationDate(Date expirationDate) {
    this.expirationDate = expirationDate;
  }

  public String getPositiveReview() {
    return this.positiveReview;
  }

  public void setPositiveReview(String positiveReview) {
    this.positiveReview = positiveReview;
  }

  public String getNegativeReview() {
    return this.negativeReview;
  }

  public void setNegativeReview(String negativeReview) {
    this.negativeReview = negativeReview;
  }

  public String getOverallReview() {
    return this.overallReview;
  }

  public void setOverallReview(String overallReview) {
    this.overallReview = overallReview;
  }

  public String getDescription() {
    return this.description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getContent() {
    return this.content;
  }

  public void setContent(String content) {
    this.content = content;
  }


  public List<Cart> getLstCart() {
    return this.lstCart;
  }

  public void setLstCart(List<Cart> lstCart) {
    this.lstCart = lstCart;
  }


  public List<BillDetail> getLstBillDetails() {
    return this.lstBillDetails;
  }

  public void setLstBillDetails(List<BillDetail> lstBillDetails) {
    this.lstBillDetails = lstBillDetails;
  }
  

  public List<History> getHistory() {
    return this.history;
  }

  public void setHistory(List<History> history) {
    this.history = history;
  }

  

}
