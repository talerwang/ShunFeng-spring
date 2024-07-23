package com.great.pojo;


public class TbPackages {

  private long packageId;
  private long orderId;
  private String packageType;
  private double packageWeight;
  private String packageDimen;
  private String shippingDate;
  private String deliveryDate;
  private String packageStatus;


  public long getPackageId() {
    return packageId;
  }

  public void setPackageId(long packageId) {
    this.packageId = packageId;
  }


  public long getOrderId() {
    return orderId;
  }

  public void setOrderId(long orderId) {
    this.orderId = orderId;
  }


  public String getPackageType() {
    return packageType;
  }

  public void setPackageType(String packageType) {
    this.packageType = packageType;
  }


  public double getPackageWeight() {
    return packageWeight;
  }

  public void setPackageWeight(double packageWeight) {
    this.packageWeight = packageWeight;
  }


  public String getPackageDimen() {
    return packageDimen;
  }

  public void setPackageDimen(String packageDimen) {
    this.packageDimen = packageDimen;
  }


  public String getShippingDate() {
    return shippingDate;
  }

  public void setShippingDate(String shippingDate) {
    this.shippingDate = shippingDate;
  }


  public String getDeliveryDate() {
    return deliveryDate;
  }

  public void setDeliveryDate(String deliveryDate) {
    this.deliveryDate = deliveryDate;
  }


  public String getPackageStatus() {
    return packageStatus;
  }

  public void setPackageStatus(String packageStatus) {
    this.packageStatus = packageStatus;
  }

}
