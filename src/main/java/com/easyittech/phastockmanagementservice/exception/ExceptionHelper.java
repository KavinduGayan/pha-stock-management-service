package com.easyittech.phastockmanagementservice.exception;

import com.easyittech.phastockmanagementservice.dto.ErrorDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionHelper {
    private static final Logger LOGGER = LoggerFactory.getLogger(ExceptionHelper.class);
    @ExceptionHandler(value = { StockCannotInsertException.class })
    public ResponseEntity<ErrorDTO> handleInvalidInputException(StockCannotInsertException ex) {
        LOGGER.error("Invalid Input Exception: ",ex.getMessage());
        return new ResponseEntity<>(new ErrorDTO(ex.getMessage(), HttpStatus.BAD_REQUEST), HttpStatus.BAD_REQUEST);
    }
}
