package com.atomic.codebasespringboot.exception.custom;

import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import static com.atomic.codebasespringboot.constant.error.ErrorCodes.ERROR_CODES;

@Data
@ResponseStatus(HttpStatus.BAD_REQUEST)
public class BusinessException extends RuntimeException{
    private String code;
    private String message;

    public BusinessException(String code){
        this.code = code;
        this.message = ERROR_CODES.get(code);
    }
}
