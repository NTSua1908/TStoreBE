package com.doan.tstore.Model.Entity;

import java.sql.Date;
import java.util.List;

import com.doan.tstore.Model.Flatform;
import com.fasterxml.jackson.annotation.JsonFormat;

public class GameEntity {

  private String name;

  private String thumbnailHorizontal;
  private String thumbnailVertical;
  private String trailer;
  private String banner;
  private double price;
  private int quantity;
  private double discount;
  private String developer;
  private String publisher;

  private Long providerId;

  @JsonFormat(pattern="yyyy-MM-dd")
  private Date releaseDate;
  private long flatformId;

  @JsonFormat(pattern="yyyy-MM-dd")
  private Date expirationDate;

  private String positiveReview;

  private String negativeReview;

  private String overallReview;
  private String description;
  private String content;

  private List<Long> type;
  private List<String> images;



  public GameEntity() {
  }

  public GameEntity(String name, String thumbnailHorizontal, String thumbnailVertical, String trailer, String banner,
      double price, int quantity, double discount, String developer, String publisher, Long providerId,
      Date releaseDate, long flatformId, Date expirationDate, String positiveReview, String negativeReview,
      String overallReview, String description, String content, List<Long> type, List<String> images) {
    this.name = name;
    this.thumbnailHorizontal = thumbnailHorizontal;
    this.thumbnailVertical = thumbnailVertical;
    this.trailer = trailer;
    this.banner = banner;
    this.price = price;
    this.quantity = quantity;
    this.discount = discount;
    this.developer = developer;
    this.publisher = publisher;
    this.providerId = providerId;
    this.releaseDate = releaseDate;
    this.flatformId = flatformId;
    this.expirationDate = expirationDate;
    this.positiveReview = positiveReview;
    this.negativeReview = negativeReview;
    this.overallReview = overallReview;
    this.description = description;
    this.content = content;
    this.type = type;
    this.images = images;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
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

  public Long getProviderId() {
    return this.providerId;
  }

  public void setProviderId(Long providerId) {
    this.providerId = providerId;
  }

  public Date getReleaseDate() {
    return this.releaseDate;
  }

  public void setReleaseDate(Date releaseDate) {
    this.releaseDate = releaseDate;
  }

  public long getFlatformId() {
    return this.flatformId;
  }

  public void setFlatformId(long flatformId) {
    this.flatformId = flatformId;
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


  public List<Long> getType() {
    return this.type;
  }

  public void setType(List<Long> type) {
    this.type = type;
  }


  public List<String> getImages() {
    return this.images;
  }

  public void setImages(List<String> images) {
    this.images = images;
  }

}
