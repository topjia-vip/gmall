package com.topjia.gmall.oms.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.topjia.gmall.oms.entity.CartItem;
import com.topjia.gmall.oms.mapper.CartItemMapper;
import com.topjia.gmall.oms.service.CartItemService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 购物车表 服务实现类
 * </p>
 *
 * @author wjh
 * @since 2019-11-24
 */
@Service
public class CartItemServiceImpl extends ServiceImpl<CartItemMapper, CartItem> implements CartItemService {

}
