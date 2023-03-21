package com.athome.springbootwithmybatis.mapper;

import com.athome.springbootwithmybatis.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @Author:Zhaopo
 * @Date: 2021/1/18 15:24
 * @Description:
 */
@Mapper
public interface UserMapper {

    @Select("select * from user where id = #{id}")
    User selectById(int id);

    User login(@Param("userName") String userName, @Param("passWord")String passWord);
//    User login(User user);

    int register(User user);

    int updateUser(int id);
}
