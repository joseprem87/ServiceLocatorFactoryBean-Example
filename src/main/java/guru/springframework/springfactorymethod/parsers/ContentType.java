package guru.springframework.springfactorymethod.parsers;

public enum ContentType {

	JSON(TypeConstants.JSON_PARSER) {
		@Override
		public String fileName() {
			return "avengers.json";
		}
	},

	CSV(TypeConstants.CSV_PARSER) {
		@Override
		public String fileName() {
			return "avengers.csv";
		}
	},

	XML(TypeConstants.XML_PARSER) {
		@Override
		public String fileName() {
			return "avengers.xml";
		}
	};

	private final String parserName;

	ContentType(String parserName) {
		this.parserName = parserName;
	}

	public abstract String fileName();

	@Override
	public String toString() {
		return parserName;
	}

}
