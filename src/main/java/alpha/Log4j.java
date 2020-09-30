package alpha;

import org.apache.logging.log4j.*;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Log4j {
	
	private static Logger log=  null;
	
	@BeforeSuite
	
	void log4jmeth()
	{
		log = LogManager.getLogger(Log4j.class.getName());
	}
	
	@Test
	
		void log4jmetho()
		{
		log.debug("Iam debugging");
		log.fatal("This is fatal");
		log.error("object is not present");
		log.info("object is not present");
		}
	
}
