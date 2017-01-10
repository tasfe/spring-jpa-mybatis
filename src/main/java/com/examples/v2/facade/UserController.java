package com.examples.v2.facade;

import com.examples.v2.dao.CategoryRepository;
import com.examples.v2.domain.Category;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by tim on 17/1/9.
 */
@Controller
@Api(value = "/user", description = "用户接口")
@RequestMapping(value = "/api/v2/")
public class UserController {

    @Autowired
    private CategoryRepository categoryRepository;

    /**
     * 返回JSON
     *
     * @return
     */
    @RequestMapping(value = "/user", method = RequestMethod.GET)
    @ResponseBody
    @ApiOperation(value = "查询所有", notes = "查询所有用户信息")
    public Iterable<Category> findAll() {
        Map<String, String> result = new HashMap<String, String>();

        result.put("code", "0");
        result.put("message", "成功");

        Iterable<Category> categorys = categoryRepository.findAll();

        return categorys;
    }

    public CategoryRepository getCategoryRepository() {
        return categoryRepository;
    }

    public void setCategoryRepository(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }
}
