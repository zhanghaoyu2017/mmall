package com.mmall.service;

import com.mmall.common.ServerResponse;
import com.mmall.pojo.Category;

import java.util.List;

/**
 * @InterfaceName ICategoryService
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/3/4-22:58
 * @Version 1.0
 **/
public interface ICategoryService {
    ServerResponse addCategory(String categoryName, Integer parentId);
    ServerResponse updateCategoryName(Integer categoryId,String categoryName);
    ServerResponse<List<Category>> getChildrenParalleCategory(Integer category);
    ServerResponse selectCategoryAndChildrenById(Integer categoryId);
}
