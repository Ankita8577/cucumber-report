package com.example.walletapp.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.example.walletapp.exception.WalletException;
import com.example.walletapp.exception.WalletExceptionResponse;

@RestController
@ControllerAdvice
public class CustomResponseEntityExceptionHandler {
	@ExceptionHandler
    public final ResponseEntity<?> handleWalletException(WalletException ex, WebRequest request){
        WalletExceptionResponse response = new WalletExceptionResponse(ex.getMessage());
        return new ResponseEntity<WalletExceptionResponse>(response, HttpStatus.BAD_REQUEST);
    }
}
