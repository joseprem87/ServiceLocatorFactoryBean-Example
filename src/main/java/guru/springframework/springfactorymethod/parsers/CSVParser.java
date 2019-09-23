package guru.springframework.springfactorymethod.parsers;

import org.springframework.stereotype.Component;

@Component(TypeConstants.CSV_PARSER)
public class CSVParser implements Parser {
	@Override
	public String parse(String payload) {
		// TODO Auto-generated method stub
		return "Am CSV parser from " + payload;
	}

}
