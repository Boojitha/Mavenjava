package beta;

import org.apache.logging.log4j.*;
import org.testng.annotations.Test;

public class Log1 {
	
	private static Logger log = LogManager.getLogger(Log1.class.getName());
	
	
	@Test
	
		void log4jmethod()
		{
		log.debug("Iam debugging");
		log.fatal("This is fatal");
		log.error("object is not present");
		log.info("object is not present");
		}
	
}
