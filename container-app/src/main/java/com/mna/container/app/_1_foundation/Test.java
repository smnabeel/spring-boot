package com.mna.container.app._1_foundation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {

	private final Logger log = LoggerFactory.getLogger(this.getClass());
	
	@GetMapping("/hello")
	ResponseEntity<String> hello() {
		try {
			throw new Exception("Testing Exception");
		} catch (Exception e) {
			log.error(e.getMessage(), e);
		}
		log.info("Hi there...");
	    return new ResponseEntity<>("Hello World!", HttpStatus.OK);
	}
}
