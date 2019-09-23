package guru.springframework.springfactorymethod.parsers;

import org.springframework.stereotype.Component;

@Component(TypeConstants.JSON_PARSER)
public class JSONParser implements Parser {
	@Override
	public String parse(String payload) {
		// TODO Auto-generated method stub
		return "Am JSON parser from " + payload;
	}

}
