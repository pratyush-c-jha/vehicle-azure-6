package com.vcorp.vehicle.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.vcorp.vehicle.request.dto.ErrorDTO;

@RestControllerAdvice
public class VehicleException {
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorDTO> exceptionHandler(Exception e){
		
		ErrorDTO errorDTO = new ErrorDTO();
		errorDTO.setErrorCode(200);
		errorDTO.setMessage("Error while processing request");
		return new ResponseEntity<>(errorDTO, HttpStatus.BAD_REQUEST);

	}


}
