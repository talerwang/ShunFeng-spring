package com.great.javabean;

import com.great.pojo.OrderView;

import java.util.List;

public class OrderPagenation {
    private int count;
     private  List<OrderView>  orderList;
     public int GetCount(){
         return count;
     }
     public void setCount(int count){
         this.count = count;
     }
     public List<OrderView> getOrderList(){
         return orderList;

     }
     public void setOrderList(List<OrderView> orderList){
         this.orderList = orderList;
     }

}
