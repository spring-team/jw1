package com.jw1;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
class Jw1Controller {

	@GetMapping("/hello/{name}")
	public String person(@PathVariable String name) {
		return "Hello " + name + "!";
	}

	@GetMapping("/")
	public String root() {
		return "Hello, Delta Blues! Add /hello/there to the URL to get a friendly reply.";
	}

}
