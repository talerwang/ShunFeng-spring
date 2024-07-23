package com.great.pojo;


public class TbOrders {

  private long ordersId;
  private long userId;
  private long sengAddressId;
  private long reciverAddressId;
  private String orderDate;
  private String orderStatus;
  private double orderPrice;


  public long getOrdersId() {
    return ordersId;
  }

  public void setOrdersId(long ordersId) {
    this.ordersId = ordersId;
  }


  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }


  public long getSengAddressId() {
    return sengAddressId;
  }

  public void setSengAddressId(long sengAddressId) {
    this.sengAddressId = sengAddressId;
  }


  public long getReciverAddressId() {
    return reciverAddressId;
  }

  public void setReciverAddressId(long reciverAddressId) {
    this.reciverAddressId = reciverAddressId;
  }


  public String getOrderDate() {
    return orderDate;
  }

  public void setOrderDate(String orderDate) {
    this.orderDate = orderDate;
  }


  public String getOrderStatus() {
    return orderStatus;
  }

  public void setOrderStatus(String orderStatus) {
    this.orderStatus = orderStatus;
  }


  public double getOrderPrice() {
    return orderPrice;
  }

  public void setOrderPrice(double orderPrice) {
    this.orderPrice = orderPrice;
  }

}
