package com.great.database;

import com.great.pojo.OrderView;
import com.great.pojo.TbOrders;

import java.util.List;

public interface TbOrdersDAO {
    public int Get_count_num();

    public TbOrders queryOrderByID(String order_id);

    public List<TbOrders> GetAllOrders();

    public int GetCount();

    public List<OrderView> queryALLOrders(int limit, int offset);

}