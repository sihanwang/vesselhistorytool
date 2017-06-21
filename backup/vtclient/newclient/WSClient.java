package com.thomsonreuters.ce.vtclient.newclient;

import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import com.thomsonreuters.ce.vtclient.history.jdk.AccountLockedException_Exception;
import com.thomsonreuters.ce.vtclient.history.jdk.HistoryOrderInfo;
import com.thomsonreuters.ce.vtclient.history.jdk.HistoryOrderService;
import com.thomsonreuters.ce.vtclient.history.jdk.HistoryOrderServiceService;
import com.thomsonreuters.ce.vtclient.history.jdk.IncorrectPasswordException_Exception;
import com.thomsonreuters.ce.vtclient.history.jdk.InvalidArgumentException_Exception;
import com.thomsonreuters.ce.vtclient.history.jdk.NoPermissionException_Exception;
import com.thomsonreuters.ce.vtclient.history.jdk.UserNotFoundException_Exception;
import com.vesseltracker.webservice.*;

public class WSClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HistoryOrderServiceService HOSS=new HistoryOrderServiceService();
		HistoryOrderService HOS=HOSS.getHistoryOrderServicePort();
		
		
		
		try {
//		    HistoryOrderInfo HOI=HOS.getDataByRegion(
//		        	    "thomsonreutersprod",
//		        	    "9gr39j",
//		        	    -180D,
//		        	    90D,
//		        	    180D,//e
//		        	    -90D,
//		        	    convertToXMLGregorianCalendar("2015-07-09 19:20:00"),
//		        	    convertToXMLGregorianCalendar("2015-07-09 22:00:00"),
//		        	    "jing.wang@thomsonreuters.com"
//		        	    );
		    
		    HistoryOrderInfo HOI=HOS.getDataByImoList("thomsonreutersprod", "9gr39j", "9434228", convertToXMLGregorianCalendar("2015-01-01 00:00:00"),convertToXMLGregorianCalendar("2015-01-01 05:31:00"), "jing.wang@thomsonreuters.com");
		    
		    
		} catch (AccountLockedException_Exception e) {
		    // TODO Auto-generated catch block
		    e.printStackTrace();
		} catch (IncorrectPasswordException_Exception e) {
		    // TODO Auto-generated catch block
		    e.printStackTrace();
		} catch (InvalidArgumentException_Exception e) {
		    // TODO Auto-generated catch block
		    e.printStackTrace();
		} catch (NoPermissionException_Exception e) {
		    // TODO Auto-generated catch block
		    e.printStackTrace();
		} catch (UserNotFoundException_Exception e) {
		    // TODO Auto-generated catch block
		    e.printStackTrace();
		}



		System.out.println();
	    }
	   
	    public static XMLGregorianCalendar convertToXMLGregorianCalendar(String strdate) {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
		ParsePosition pos = new ParsePosition(0); 
		Date date = formatter.parse(strdate, pos);

	        GregorianCalendar cal = new GregorianCalendar();
	        cal.setTime(date);
	        XMLGregorianCalendar gc = null;
	        try {
	            gc = DatatypeFactory.newInstance().newXMLGregorianCalendar(cal);
	        } catch (Exception e) {

	             e.printStackTrace();
	        }
	        return gc;
	    }
	
}
