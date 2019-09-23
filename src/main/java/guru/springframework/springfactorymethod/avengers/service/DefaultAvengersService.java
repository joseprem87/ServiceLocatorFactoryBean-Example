package guru.springframework.springfactorymethod.avengers.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import guru.springframework.springfactorymethod.parsers.ParserFactory;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DefaultAvengersService implements AvengersService {

	private ParserFactory parserFactory;

	@Autowired
	public DefaultAvengersService(ParserFactory parserFactory) {
		this.parserFactory = parserFactory;
	}

	@Override
	public String getAll(String contentType) {
		String fileName = contentType; // contentType.fileName();
		log.info("Fetching list from file {}", fileName);

		return parserFactory.getParser(contentType).parse(fileName);

	}

}
