package io.money.springbootmybatis.mapper;

import io.money.springbootmybatis.bean.OrderItem;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author : 成行(lishijie-me)
 * @version : v1.0
 * @createTime : 2024/1/18 20:05
 * @description : 一句话描述该类的功能
 */
@Mapper
public interface OrderItemMapper {
    List<OrderItem> selectOrderAll();

    Integer addOrder(OrderItem order);
}
