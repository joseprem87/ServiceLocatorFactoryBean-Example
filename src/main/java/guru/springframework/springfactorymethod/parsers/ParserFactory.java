package guru.springframework.springfactorymethod.parsers;

//factory interface
public interface ParserFactory {
	Parser getParser(String contentType);

}
