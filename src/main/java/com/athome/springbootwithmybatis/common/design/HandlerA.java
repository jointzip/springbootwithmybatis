package com.athome.springbootwithmybatis.common.design;

public class HandlerA extends IHandler {
    @Override
    public boolean handle() {
        boolean handled = false;
        //何时退出
        System.out.println("执行了HandlerA的方法");
        handled = true;
        return handled;
    }
}
