package com.example.demo.response;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import lombok.Data;

@Data
public class ResponseJson<Body> implements Serializable {

    private static final long serialVersionUID = 1L;

    private ResponseStatus status = ResponseStatus.FAILED;
    private Map<String, String> message = new HashMap<>();
    private Body body;
}
