package Mavenprojects.Mavenjava;
import org.apache.logging.log4j.*;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Log4jexample1 {
	
	private static Logger log=  null;
	
	@BeforeSuite
	
	void log4jmethod1()
	{
		log = LogManager.getLogger(Log4jexample1.class.getName());
	}
	
	@Test
	
		void log4jmethod()
		{
		log.debug("Iam debugging");
		log.fatal("This is fatal");
		log.error("object is not present");
		log.info("object is not present");
		}
	
}
