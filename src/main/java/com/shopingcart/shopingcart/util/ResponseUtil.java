package com.shopingcart.shopingcart.util;

import lombok.experimental.UtilityClass;

import java.util.HashMap;
import java.util.Map;

@UtilityClass
public class ResponseUtil {

    public static Map<String,String> getSuccessResponse(){
        Map<String, String> response = new HashMap<>();
        response.put("status","success");
        return response;
    }

    public static Map<String,Object> getSuccessResponse(Object data){
        Map<String, Object> response = new HashMap<>();
        response.put("status","success");
        response.put("data",data);
        return response;
    }

    public static Map<String,Object> getFailureResponse(Object data){
        Map<String, Object> response = new HashMap<>();
        response.put("status","failure");
        response.put("data",data);
        return response;
    }

    public static Map<String,String> getFailureResponse(){
        Map<String, String> response = new HashMap<>();
        response.put("status","failure");
        return response;
    }

    public Map<String,String> getFailureResponse1(){
        Map<String, String> response = new HashMap<>();
        response.put("status","failure");
        return response;
    }

}