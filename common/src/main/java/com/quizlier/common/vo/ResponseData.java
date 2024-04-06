package com.quizlier.common.vo;

public class ResponseData<T> extends ServiceResponse {
	private T data;
	
	public ResponseData(String statusCode, String statusMessage) {
		super(statusCode, statusMessage);
	}
	
    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
