package com.athome.springbootwithmybatis.entity;

import lombok.Data;

/**
 * @Author:Zhaopo
 * @Date: 2021/2/20 16:02
 * @Description:
 */
@Data
public class Movie {
    private Integer ID;
    private String Title;
    private String ReleaseDate;
    private String Genre;
    private String Price;
}
