package zhongqiu.spring_springmvc_mybatis_demo.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import zhongqiu.spring_springmvc_mybatis_demo.po.Orders;
import zhongqiu.spring_springmvc_mybatis_demo.po.OrdersExample;

public interface OrdersMapper {
    int countByExample(OrdersExample example);

    int deleteByExample(OrdersExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Orders record);

    int insertSelective(Orders record);

    List<Orders> selectByExample(OrdersExample example);

    Orders selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Orders record, @Param("example") OrdersExample example);

    int updateByExample(@Param("record") Orders record, @Param("example") OrdersExample example);

    int updateByPrimaryKeySelective(Orders record);

    int updateByPrimaryKey(Orders record);
}