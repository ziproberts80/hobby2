
package logr;

import java.util.logging.Logger ;


public class Logr {


    public static void main(String[] args) {
        Logger.getGlobal().info("OPen filename " + "c:\\root\\test.text");
        Logger logger = Logger.getLogger("mytestLogger");
        
        logger.warning("my test of warning");
        logger.fine("my test of fine");
    }
    
}
