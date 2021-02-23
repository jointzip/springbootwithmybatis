package com.athome.springbootwithmybatis.common.vo;

import lombok.Data;

/**
 * 返回数据
 */
@Data
public class ResponseVo<T> {
	private static final long serialVersionUID = 1L;

	private Integer status;
	private String msg;
	private T data;

	public static ResponseVo fail() {
		ResponseVo responseVo = new ResponseVo();
		responseVo.setStatus(1);
		responseVo.setMsg("服务器错误！！！");
		return responseVo;
	}

	public static ResponseVo fail(String msg) {
		ResponseVo responseVo = new ResponseVo();
		responseVo.setStatus(1);
		responseVo.setMsg(msg);
		return responseVo;
	}

	public static <T> ResponseVo<T> ok(T data) {
		ResponseVo responseVo = new ResponseVo();
		responseVo.setStatus(0);
		responseVo.setData(data);
		return responseVo;
	}

	public static ResponseVo ok() {
		ResponseVo responseVo = new ResponseVo();
		responseVo.setStatus(0);
		responseVo.setMsg("操作成功！");
		return responseVo;
	}

}
