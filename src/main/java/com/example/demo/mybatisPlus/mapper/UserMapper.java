package com.example.demo.mybatisPlus.mapper;

import com.example.demo.mybatisPlus.model.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author liuJie
 * @since 2021-03-27
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
