package logging;

public class LoggerTester {

	public static void main(String[] args) {
		EventLogger logger = new EventLogger("Log.txt");
		logger.log("test");
	}

}
