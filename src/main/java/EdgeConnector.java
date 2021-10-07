import java.util.StringTokenizer;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class EdgeConnector {
   public static Logger logger = LogManager.getLogger(EdgeConnector.class.getName());

   private int numConnector, endPoint1, endPoint2;
   private String endStyle1, endStyle2;
   private boolean isEP1Field, isEP2Field, isEP1Table, isEP2Table;
      
   public EdgeConnector(String inputString) {
      StringTokenizer st = new StringTokenizer(inputString, EdgeConvertFileParser.DELIM);
      numConnector = Integer.parseInt(st.nextToken());
      endPoint1 = Integer.parseInt(st.nextToken());
      endPoint2 = Integer.parseInt(st.nextToken());
      endStyle1 = st.nextToken();
      endStyle2 = st.nextToken();
      isEP1Field = false;
      isEP2Field = false;
      isEP1Table = false;
      isEP2Table = false;
   }
   
   public int getNumConnector() {
      logger.info("numConnector: " + numConnector);
      return numConnector;
   }
   
   public int getEndPoint1() {
      logger.info("getEndPoint1: " + getEndPoint1());
      return endPoint1;
   }
   
   public int getEndPoint2() {
      logger.info("getEndPoint2: " + getEndPoint2());
      return endPoint2;
   }
   
   public String getEndStyle1() {
      logger.info("getEndStyle1: " + getEndStyle1());
      return endStyle1;
   }
   
   public String getEndStyle2() {
      logger.info("getEndStyle2: " + getEndStyle2());
      return endStyle2;
   }
   public boolean getIsEP1Field() {
      logger.info("getIsEP1Field: " + getIsEP1Field());
      return isEP1Field;
   }
   
   public boolean getIsEP2Field() {
      logger.info("getIsEP2Field: " + getIsEP2Field());
      return isEP2Field;
   }

   public boolean getIsEP1Table() {
      logger.info("getIsEP1Table: " + getIsEP1Table());
      return isEP1Table;
   }

   public boolean getIsEP2Table() {
      logger.info("getIsEP2Table: " + getIsEP2Table());
      return isEP2Table;
   }

   public void setIsEP1Field(boolean value) {
      isEP1Field = value;
      logger.info("Is EP1 Field set? " + value);
   }
   
   public void setIsEP2Field(boolean value) {
      isEP2Field = value;
      logger.info("Is EP2 Field set? " + value);
   }

   public void setIsEP1Table(boolean value) {
      isEP1Table = value;
      logger.info("Is EP1 Table set? " + value);
   }

   public void setIsEP2Table(boolean value) {
      isEP2Table = value;
      logger.info("Is EP2 Table set? " + value);
   }
}
