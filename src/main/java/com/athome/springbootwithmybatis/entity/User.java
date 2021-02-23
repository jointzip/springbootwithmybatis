package com.athome.springbootwithmybatis.entity;

import lombok.Data;
import org.apache.ibatis.type.Alias;

/**
 * @Author:Zhaopo
 * @Date: 2021/1/13 20:56
 * @Description:
 */
@Data
//@Alias("User")
public class User {
    private Integer id;
    private String userName;
    private String passWord;
    private String realName;
}
