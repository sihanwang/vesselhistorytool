package com.thomsonreuters.ce.vessel.vtclient.newclient;

import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import com.vesseltracker.webservice.*;
import com.vesseltracker.webservice.AccountLockedException;
import com.vesseltracker.webservice.IncorrectPasswordException;
import com.vesseltracker.webservice.NoPermissionException;
import com.vesseltracker.webservice.UserNotFoundException;
import com.vesseltracker.web.webservice.*;

public class WSClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HistoryOrderServiceService HOSS=new HistoryOrderServiceService();
		HistoryOrderService HOS=HOSS.getHistoryOrderServicePort();
		
		
		

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
		    
		    try {
				//HistoryOrderInfo HOI=HOS.getDataByImoList("thomsonreutersprod", "9gr39j", "9434228", convertToXMLGregorianCalendar("2015-01-01 00:00:00"),convertToXMLGregorianCalendar("2015-01-01 05:31:00"), "jing.wang@thomsonreuters.com");
				HistoryOrderInfo HOI1=HOS.getDataByShipIdList("thomsonreutersprod", "9gr39j", "1048654", convertToXMLGregorianCalendar("2017-03-27 04:00:00"),convertToXMLGregorianCalendar("2017-06-19 09:00:00"), "jing.wang@thomsonreuters.com");
			
		    
		    
		    } catch (AccountLockedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IncorrectPasswordException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InvalidArgumentException_Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (NoPermissionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (UserNotFoundException e) {
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
