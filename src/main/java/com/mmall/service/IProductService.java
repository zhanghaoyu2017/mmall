package com.mmall.service;

import com.mmall.common.ServerResponse;
import com.mmall.pojo.Product;

/**
 * @InterfaceName IProductService
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/3/6-22:51
 * @Version 1.0
 **/
public interface IProductService {
    ServerResponse saveOrUpdateProduct(Product product);
    ServerResponse<String> setSaleStatus(Integer productId,Integer status);
}