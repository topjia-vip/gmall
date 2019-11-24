package com.topjia.gmall.pms.service.impl;

import com.topjia.gmall.pms.entity.Product;
import com.topjia.gmall.pms.mapper.ProductMapper;
import com.topjia.gmall.pms.service.ProductService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品信息 服务实现类
 * </p>
 *
 * @author wjh
 * @since 2019-11-24
 */
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements ProductService {

}
