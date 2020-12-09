package com.example.demo.mybatisPlus.controller;


import com.example.demo.common.bean.Response;
import com.example.demo.mybatisPlus.model.entity.User;
import com.example.demo.mybatisPlus.service.IUserService;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author liuJie
 * @since 2020-12-07
 */
@Api(tags = "用户mybatisPlus")
@RestController
@RequestMapping("/mybatisPlus/user")
public class UserController {

    @Resource
    private IUserService userService;

    @GetMapping("/addUser")
    public Response addTransferCloudConfig() {
        User user = new User();
        user.setName("dwfdsf");
        user.setAge(43);
        user.setEmail("66666666666");

        boolean save = userService.save(user);
        if (!save) {
            return Response.success("新增失败");
        }
        return Response.success("新增成功");
    }
}
