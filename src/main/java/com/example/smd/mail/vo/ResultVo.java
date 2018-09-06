package com.example.smd.mail.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@Data
@AllArgsConstructor
public class ResultVo<T> {
    private String msg;
    private Status status;
    private T data;


    public static ResultVo success(){
        return new ResultVo("成功返回数据",Status.SUCCESS,null);

    }
    public static ResultVo fail(){
        return new ResultVo("访问失败",Status.FAIL,null  );
    }
    public static ResultVo fail(String msg){
        return new ResultVo(msg,Status.FAIL,null  );
    }
    public static ResultVo success(String msg){
        return new ResultVo(msg,Status.SUCCESS,null);

    }
    public static ResultVo success(Object data){
        return new ResultVo("成功返回数据",Status.SUCCESS,data);
    }
    public static ResultVo success(String msg,Object data){
        return new ResultVo(msg,Status.SUCCESS,data);
    }


    @Getter
    @AllArgsConstructor
    enum Status{
        SUCCESS(1,"访问成功"),
               FAIL (0,"访问失败"),
        ;
        private int code;
        private String msg;

    }

}
