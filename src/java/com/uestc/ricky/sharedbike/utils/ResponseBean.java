package com.uestc.ricky.sharedbike.utils;

public class ResponseBean<T> {
    public static int SC_SUCCESS = 200;
    public static int SC_FAILED = 500;
    private int sc;
    private T data;

    public static <K> ResponseBean<K> buildSuccess(K data) {
        return new ResponseBean<K>(SC_SUCCESS, data);
    }

    public ResponseBean() {
    }

    public ResponseBean(int sc, T data) {
        this.sc = sc;
        this.data = data;
    }

    public int getSc() {
        return sc;
    }

    public void setSc(int sc) {
        this.sc = sc;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
