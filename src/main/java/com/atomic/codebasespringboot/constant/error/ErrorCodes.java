package com.atomic.codebasespringboot.constant.error;

import java.util.HashMap;
import java.util.Map;

public class ErrorCodes {

    public static final String AN_ERROR_OCCURRED = "AN_ERROR_OCCURRED";

    public static final Map<String, String> ERROR_CODES = new HashMap<>(){{
        put(AN_ERROR_OCCURRED, "An error occurred.");
    }};
}