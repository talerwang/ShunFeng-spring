package com.great.pojo;


public class OrderView {

  private long orderId;
  private String orderDate;
  private double totalPrice;
  private String userPhone;
  private String sendCity;
  private String sendAddressLine1;
  private String sendAddressLine2;
  private String reciverCity;
  private String reciverAddressLine1;
  private String reciverAddressLine2;
  private String username;


  public long getOrderId() {
    return orderId;
  }

  public void setOrderId(long orderId) {
    this.orderId = orderId;
  }


  public String getOrderDate() {
    return orderDate;
  }

  public void setOrderDate(String orderDate) {
    this.orderDate = orderDate;
  }


  public double getTotalPrice() {
    return totalPrice;
  }

  public void setTotalPrice(double totalPrice) {
    this.totalPrice = totalPrice;
  }


  public String getUserPhone() {
    return userPhone;
  }

  public void setUserPhone(String userPhone) {
    this.userPhone = userPhone;
  }


  public String getSendCity() {
    return sendCity;
  }

  public void setSendCity(String sendCity) {
    this.sendCity = sendCity;
  }


  public String getSendAddressLine1() {
    return sendAddressLine1;
  }

  public void setSendAddressLine1(String sendAddressLine1) {
    this.sendAddressLine1 = sendAddressLine1;
  }


  public String getSendAddressLine2() {
    return sendAddressLine2;
  }

  public void setSendAddressLine2(String sendAddressLine2) {
    this.sendAddressLine2 = sendAddressLine2;
  }


  public String getReciverCity() {
    return reciverCity;
  }

  public void setReciverCity(String reciverCity) {
    this.reciverCity = reciverCity;
  }


  public String getReciverAddressLine1() {
    return reciverAddressLine1;
  }

  public void setReciverAddressLine1(String reciverAddressLine1) {
    this.reciverAddressLine1 = reciverAddressLine1;
  }


  public String getReciverAddressLine2() {
    return reciverAddressLine2;
  }

  public void setReciverAddressLine2(String reciverAddressLine2) {
    this.reciverAddressLine2 = reciverAddressLine2;
  }


  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

}
