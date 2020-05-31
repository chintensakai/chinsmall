package com.home.chinsmall.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.home.chinsmall.product.dao.CategoryDao;
import com.home.chinsmall.product.entity.CategoryEntity;
import com.home.chinsmall.product.service.CategoryService;
import com.home.common.utils.PageUtils;
import com.home.common.utils.Query;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements
    CategoryService {

  @Autowired
  private CategoryDao categoryDao;

  @Override
  public PageUtils queryPage(Map<String, Object> params) {
    IPage<CategoryEntity> page = this.page(
        new Query<CategoryEntity>().getPage(params),
        new QueryWrapper<CategoryEntity>()
    );

    return new PageUtils(page);
  }

  /***
   * 树形结构返回分类列表
   * @return
   */
  @Override
  public List<CategoryEntity> listWithTree() {
//    1. 查询所有分类
    List<CategoryEntity> categoryEntities = categoryDao.selectList(null);
//    2. 组装成树结构
//    2.1 找到1级分类 - parent_id是0
    List<CategoryEntity> Level1Collect = categoryEntities.stream()
        .filter(categoryEntity -> categoryEntity.getParentCid() == 0)
        .map(menu -> {
          menu.setChildren(getChildren(menu, categoryEntities));
          return menu;
        }).sorted(Comparator.comparingInt(menu -> (menu.getSort() == null ? 0 : menu.getSort())))
        .collect(Collectors.toList());

    return Level1Collect;
  }

  /***
   * 找到子类别
   * @param root
   * @param all
   * @return
   */
  private List<CategoryEntity> getChildren(CategoryEntity root, List<CategoryEntity> all) {

    List<CategoryEntity> collect = all.stream()
        .filter(entity -> entity.getParentCid() == root.getCatId())
        .map(categoryEntity -> {
          categoryEntity.setChildren(getChildren(categoryEntity, all));
          return categoryEntity;
        }).sorted(Comparator.comparingInt(menu -> (menu.getSort() == null ? 0 : menu.getSort())))
        .collect(Collectors.toList());
    return collect;
  }
}