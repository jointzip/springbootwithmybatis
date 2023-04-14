package com.athome.springbootwithmybatis.common;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Store_Enum {
    ALIYUN_STORE("aliyun_store", "1"),
    SPECIAL_STORE("special_store", "2");

    private String name;
    private String type;

}
