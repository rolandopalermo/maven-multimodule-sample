package com.rolandopalermo.common;

import java.util.ArrayList;
import java.util.List;

public class Errors {

	private List<Error> errors;

	public List<Error> getErrors() {
		if (this.errors == null) {
			this.errors = new ArrayList<>();
		}
		return errors;
	}

	public void setErrors(List<Error> errors) {
		this.errors = errors;
	}

	public Errors addError(Error error) {
		getErrors().add(error);
		return this;
	}

}