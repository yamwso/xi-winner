package com.imooc.sell.dao;

import com.imooc.sell.dataobject.OrderMaster;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderMasterRepositoryTest {

    @Autowired
    private OrderMasterRepository repository;

    @Test
    public void findByBuyerOpenId(){
        PageRequest request = new PageRequest(0,2);
        Page<OrderMaster> result = repository.findByBuyerOpenId("110110",request);
        System.out.print(result.getTotalElements());
    }

    @Test
    public void saveTest(){
        OrderMaster orderMaster = new OrderMaster();
        orderMaster.setOrderId("123457");
        orderMaster.setBuyerName("张三");
        orderMaster.setBuyerPhone("1234567892");
        orderMaster.setBuyerAddress("西侯村");
        orderMaster.setBuyerOpenId("23456");
        orderMaster.setOrderAmount(new BigDecimal(12.9));
        OrderMaster result=repository.save(orderMaster);
    }
}