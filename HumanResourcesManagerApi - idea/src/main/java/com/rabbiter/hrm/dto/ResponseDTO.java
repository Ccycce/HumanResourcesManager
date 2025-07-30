package com.rabbiter.hrm.dto;

import com.rabbiter.hrm.enums.BaseEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.apache.poi.ss.formula.functions.T;

@ApiModel(value = "数据传输对象", description = "")
public class ResponseDTO {
    @ApiModelProperty("状态码")
    private int code;

    @ApiModelProperty("响应消息")
    private String message;

    @ApiModelProperty("响应数据")
    private Object data;

    @ApiModelProperty("token")
    private String token;

    public ResponseDTO(int code, String message){
        this.code = code;
        this.message = message;
    }

    public ResponseDTO(int code,String message,Object data){
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public ResponseDTO(BaseEnum<T> e){
        this.code = e.getCode();
        this.message = e.getMessage();
    }

    public ResponseDTO(BaseEnum<T> e, Object data){
        this.code = e.getCode();
        this.message = e.getMessage();
        this.data = data;
    }

    public ResponseDTO(BaseEnum<T> e, Object data, String token){
        this.code = e.getCode();
        this.message = e.getMessage();
        this.data = data;
        this.token = token;
    }

    @Override
    public String toString() {
        return "ResponseDTO{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                ", token='" + token + '\'' +
                '}';
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public ResponseDTO() {
    }

    public ResponseDTO(int code, String message, Object data, String token) {
        this.code = code;
        this.message = message;
        this.data = data;
        this.token = token;
    }
}
