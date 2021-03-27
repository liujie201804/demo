package com.example.demo.mybatisPlus.service.impl;

import com.example.demo.mybatisPlus.model.entity.User;
import com.example.demo.mybatisPlus.mapper.UserMapper;
import com.example.demo.mybatisPlus.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author liuJie
 * @since 2021-03-27
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
