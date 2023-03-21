package com.athome.springbootwithmybatis.entity;

import lombok.*;

/**
 * @Author:Zhaopo
 * @Date: 2021/1/13 20:56
 * @Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class User {
    private Integer id;
    private String userName;
    private String passWord;
    private String realName;
}
