package com.athome.springbootwithmybatis.common.design;

import java.util.ArrayList;
import java.util.List;

public class HandlerChain {
    private List<IHandler> handlers = new ArrayList<>();

    public void addHandler(IHandler myHandler){
        this.handlers.add(myHandler);
    }

    public void handle() {
        //循环去处理每个handler
        for (IHandler handler : handlers) {
            //执行对应的handler
//            if(handler.handle()){
//                break;
//            }
            handler.handle();
        }
    }
}
