package com.examples.v2.service;

import com.examples.v2.domain.Category;
import org.springframework.data.domain.Page;

import java.util.List;

/**
 * Created by fuwb on 16/8/10.
 */
public interface CategoryService {
    public void updateCategory(Integer id, String createByUser);

    Category save(Category entity);

    void delete(List<Category> categoryList);

    Page<Category> search(Category category, int pageNo, int pageSize, String sortName);

    Page<Category> findAll(int id, int pageNo, int pageSize);
}
