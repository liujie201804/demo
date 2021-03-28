package com.example.demo;

import cn.hutool.core.collection.CollectionUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.config.SnowflakeConfig;
import com.example.demo.mybatisPlus.model.entity.User;
import com.example.demo.mybatisPlus.service.IUserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

/**
 * @description: 用户表测试
 * @author: liujie
 * @title: UserTest
 * @date: 2021/3/27 16:58
 */
@SpringBootTest
public class UserTest {

    @Autowired
    private IUserService userService;

    @Autowired
    SnowflakeConfig snowflakeConfig;

    @Test
    void getUser() {
        List<User> list = userService.list();
        if (CollectionUtil.isNotEmpty(list)) {
            list.forEach(e -> {
                System.out.println("iuuuhhhhhhhhhhhhhh" + e);
            });
        }
    }

    @Test
    void insertUser() {
        for (int i = 0; i < 100; i++) {
            long snowflakeId = snowflakeConfig.snowflakeId();
            User user = new User();
            user.setAuthor("author——" + snowflakeId);
            long snowflakeId1 = snowflakeConfig.snowflakeId();
            user.setTitle(snowflakeId1 + "----title");
            userService.saveOrUpdate(user);
        }
    }

    @Test
    void updateUser() {
        User byId = userService.getById(4L);
        byId.setAuthor("dddddd");
        userService.saveOrUpdate(byId);
    }

    //批量更新
    @Test
    void batchUpdateUser() {
        List<User> list = userService.list(new QueryWrapper<>());
        ArrayList<User> objects = new ArrayList<>();
        for (User user : list) {
            User user1 = new User();
            user1.setId(user.getId());
            user.setTitle("uuuuuuuuuuu");
            objects.add(user1);
        }
        userService.saveOrUpdateBatch(list);
    }

    @Test
    void deleteUser() {
        userService.removeById(3L);
    }

    //批量删除
    @Test
    void batchDeleteUser() {
        List<User> list = userService.list();
        List<Long> collect = list.stream().map(User::getId).collect(Collectors.toList());
        userService.removeByIds(collect);
    }

    @Test
    public void testSelectByMap() {
        HashMap<String, Object> map = new HashMap<>();
        map.put("name", "Helen");
        map.put("age", 18);
        List<User> users = userService.listByMap(map);
        users.forEach(System.out::println);
    }

    //分页查询
    @Test
    void listPage() {
        Page<User> page = new Page<>(1, 100);
        QueryWrapper<User> userQueryWrapper = new QueryWrapper<>();
        userService.page(page, null);
        page.getRecords().forEach(System.out::println);
        System.out.println(page.getCurrent());
        System.out.println(page.getPages());
        System.out.println(page.getSize());
        System.out.println(page.getTotal());
        System.out.println(page.hasNext());
        System.out.println(page.hasPrevious());
    }

    //查询需要的列  方法1
    @Test
    void list1() {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.select("id", "author")
                .like("author", "17");
        userService.list(queryWrapper)
                .forEach(System.out::println);
    }

    //查询需要的列 方法2
    @Test
    void list2() {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.select(User.class, info -> !info.getColumn().equals("id")
                && !info.getColumn().equals("author"));
        List<User> users = userService.list(queryWrapper);
        users.forEach(System.out::println);
    }

}
