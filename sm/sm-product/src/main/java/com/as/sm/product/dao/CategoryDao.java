package com.as.sm.product.dao;

import com.as.sm.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author asens
 * @email asensts@163.com
 * @date 2023-05-18 16:58:56
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
