package com.rolandopalermo.common;

import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class ServiceResponse<U, T extends Errors> {
	
	private final Optional<U> response;
	private final Optional<T> listErrors;

	private ServiceResponse(U response) {
		this.response = Optional.of(response);
		this.listErrors = Optional.empty();
	}

	private ServiceResponse(T listErrors) {
		this.response = Optional.empty();
		this.listErrors = Optional.of(listErrors);
	}

	public static <U, T extends Errors> ServiceResponse<U, T> of(U response, T listErrors) throws RuntimeException {
		if (response != null) {
			return new ServiceResponse<>(response);
		} else if (listErrors != null) {
			return new ServiceResponse<>(listErrors);
		}
		else {
			throw new RuntimeException("Undefined response");
		}
	}

	public ResponseEntity<Object> build() {
		if (response.isPresent()) {
			return buildResponse();
		}
		else {
			return buildError();
		}
	}

	private ResponseEntity<Object> buildResponse() {
		return new ResponseEntity<>(this.response.get(), HttpStatus.OK);
	}

	private ResponseEntity<Object> buildError() {
		T errors = this.listErrors.get();
		try {
			if (!errors.getErrors().isEmpty()) {
				return new ResponseEntity<>(this.listErrors.get(), errors.getErrors().get(0).getStatusCode());
			} else {
				return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
			}
		} catch (IllegalArgumentException e) {
			return new ResponseEntity<>(this.listErrors.get(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
}