package com.atomic.theaichemist.exception;

import com.atomic.theaichemist.constant.error.ErrorCodes;
import com.atomic.theaichemist.exception.custom.BusinessException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static com.atomic.theaichemist.constant.error.ErrorCodes.AN_ERROR_OCCURRED;

@RestControllerAdvice
public class ExceptionHandlingCenter {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Map<String, List<String>>> handleValidationErrors(MethodArgumentNotValidException ex) {
        List<String> errors = ex.getBindingResult().getFieldErrors()
                .stream().map(FieldError::getDefaultMessage).collect(Collectors.toList());
        return new ResponseEntity<>(getErrorsMap(errors), new HttpHeaders(), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(BusinessException.class)
    public ResponseEntity<ExceptionResponse> handleBusinessException(BusinessException ex) {
        ExceptionResponse errorCodeResponse = new ExceptionResponse(ex.getCode(), ex.getMessage());
        return new ResponseEntity<>(errorCodeResponse, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ExceptionResponse> handleCommonException(Exception ex) {
        ExceptionResponse errorCodeResponse = new ExceptionResponse(AN_ERROR_OCCURRED, ErrorCodes.ERROR_CODES.get(AN_ERROR_OCCURRED));
        return new ResponseEntity<>(errorCodeResponse, HttpStatus.BAD_REQUEST);
    }

    private Map<String, List<String>> getErrorsMap(List<String> errors) {
        Map<String, List<String>> errorResponse = new HashMap<>();
        errorResponse.put("errors", errors);
        return errorResponse;
    }
}
