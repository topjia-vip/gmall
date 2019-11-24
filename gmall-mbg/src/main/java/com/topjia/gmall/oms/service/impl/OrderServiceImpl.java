package com.topjia.gmall.oms.service.impl;

import com.topjia.gmall.oms.entity.Order;
import com.topjia.gmall.oms.mapper.OrderMapper;
import com.topjia.gmall.oms.service.OrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单表 服务实现类
 * </p>
 *
 * @author wjh
 * @since 2019-11-24
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService {

}
