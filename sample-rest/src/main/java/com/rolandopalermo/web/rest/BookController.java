package com.rolandopalermo.web.rest;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rolandopalermo.bo.BookBO;
import com.rolandopalermo.dto.BookDTO;

@RestController
@RequestMapping(value = "/books")
public class BookController {

	@Autowired
	private BookBO bookBO;

	@PostMapping(value = "", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> createBol(@Valid @RequestBody BookDTO bookDTO) {
		return bookBO.saveBook(bookDTO).build();
	}
	
	@GetMapping(value = "{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> findBol(@PathVariable("id") String id) {
		return bookBO.getBookById(new Integer(id)).build();
	}

}