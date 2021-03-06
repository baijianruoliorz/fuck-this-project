package com.wizz.gift.service.impl;

import com.wizz.gift.entity.Category;
import com.wizz.gift.mapper.CategoryMapper;
import com.wizz.gift.service.CategoryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author liqiqiorz
 * @since 2020-11-15
 */
@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements CategoryService {

}
