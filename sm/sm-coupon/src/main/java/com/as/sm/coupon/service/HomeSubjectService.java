package com.as.sm.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.as.sm.common.utils.PageUtils;
import com.as.sm.coupon.entity.HomeSubjectEntity;

import java.util.Map;

/**
 * 首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】
 *
 * @author asens
 * @email sunlightcs@gmail.com
 * @date 2023-05-17 17:29:14
 */
public interface HomeSubjectService extends IService<HomeSubjectEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

