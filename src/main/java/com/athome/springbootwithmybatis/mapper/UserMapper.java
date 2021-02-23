package com.athome.springbootwithmybatis.mapper;

import com.athome.springbootwithmybatis.entity.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * @Author:Zhaopo
 * @Date: 2021/1/18 15:24
 * @Description:
 */
@Repository
public interface UserMapper {

    @Select("select * from user where id = #{id}")
    User selectById(int id);

    User login(String userName, String passWord);

    int register(User user);

    int updateUser(int id);
}
