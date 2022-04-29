package website.abyss.flow_density_detection.utils;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Scanner;

@Data
@EqualsAndHashCode(callSuper = false)
public class Result {
    //状态码
    private int code;
    //提示消息
    private String msg;
    //数据
    private Object result;
    //操作成功
    public void setSuccess(String msg, Object result){
        this.code=200;
        this.msg=msg;
        this.result=result;
    }
    //操作失败
    public void setInfo(String msg, Object result){
        this.code=400;
        this.msg=msg;
        this.result=result;
    }
}