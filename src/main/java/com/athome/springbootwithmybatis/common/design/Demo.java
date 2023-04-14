package com.athome.springbootwithmybatis.common.design;

/**
 * @author zhaopo
 */
public class Demo {
    public static void main(String[] args) {
        //构造处理链对象
        HandlerChain chain = new HandlerChain();
        //加入调用方
        chain.addHandler(new HandlerA());
        chain.addHandler(new HandlerB());
        //调用处理链的handle方法
        chain.handle();
    }
}
