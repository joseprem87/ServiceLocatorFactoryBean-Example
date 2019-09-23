package guru.springframework.springfactorymethod.avengers.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import guru.springframework.springfactorymethod.avengers.service.AvengersService;
import guru.springframework.springfactorymethod.parsers.TypeConstants;

@RestController
@RequestMapping(value = "/api/avengers", produces = MediaType.APPLICATION_JSON_VALUE)
public class AvengersController {

	private AvengersService service;

	@Autowired
	public AvengersController(AvengersService service) {
		this.service = service;
	}

	@GetMapping("/csv")
	public ResponseEntity<String> getAllFromCsv() {
		return ResponseEntity.ok().body(service.getAll(TypeConstants.CSV_PARSER));
	}

	@GetMapping("/json")
	public ResponseEntity<String> getAllFromJson() {
		return ResponseEntity.ok().body(service.getAll(TypeConstants.JSON_PARSER));
	}

}
