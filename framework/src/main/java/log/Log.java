package log;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;


public class Log {

    private static Logger logger = Logger.getLogger(Log.class.getName());

    public static void initializedLogger(){
        DOMConfigurator.configure("../Frameworksolution/framework/src/log4j.xml");
    }

    public static void startTestCase(String sTestCaseCaseName){
        logger.info("Start test: " + sTestCaseCaseName);
        //Para ver la linea impresa tambien en la consola
        System.out.printf("Start test **** Mostrado en consola ****: ", sTestCaseCaseName);
    }
}