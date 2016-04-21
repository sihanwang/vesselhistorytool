package com.thomsonreuters.ce.vtclient.history.jdk;

import javax.xml.datatype.XMLGregorianCalendar;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeFactory;

//import com.thomsonreuters.dataoven.database.EasyConnection;


public class HistoricalDataForRegionClient {
    private static String SQLtoGetPolygon="select axsmarine_id, name, latitude_north, latitude_south, longitude_east, longitude_west from port where axsmarine_id in (5123)";
    
    public static void main(String[] args)
    {

	HistoryOrderServiceService HOSS=new HistoryOrderServiceService();
	HistoryOrderService HOS=HOSS.getHistoryOrderServicePort();
	
	/*

	EasyConnection.configPool("dbpool.conf");

	Connection DBConn = new EasyConnection("processing_history");

	try {
	    PreparedStatement objPreStatement = DBConn.prepareStatement(SQLtoGetPolygon);
	    ResultSet objResult = objPreStatement.executeQuery();

	    while(objResult.next())
	    {

	        int Axsmarine_id=objResult.getInt(1);
	        String polygon_Name=objResult.getString(2);
	        Double latitude_north=objResult.getDouble(3);
	        Double latitude_south=objResult.getDouble(4);
	        Double longitude_east=objResult.getDouble(5);
	        Double longitude_west=objResult.getDouble(6);

	        System.out.print("Requesting for Axsmarine_id: "+ Axsmarine_id+" name: "+ polygon_Name+" ...... ");

	        try {
	            HistoryOrderInfo HOI=HOS.getDataByRegion(
	    	    "thomsonreutersprod",
	    	    "9gr39j",
	    	    longitude_west,
	    	    latitude_north,
	    	    longitude_east,//e
	    	    latitude_south,
	    	    convertToXMLGregorianCalendar("2013-01-01 00:00:00"),
	    	    convertToXMLGregorianCalendar("2014-08-19 00:00:00"),
	    	    "jing.wang@thomsonreuters.com"
	    	    );
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

	        System.out.println("Done");


	    }

	    objResult.close();
	    DBConn.close();	    
	} catch (SQLException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
	*/
	
	try {
	    HistoryOrderInfo HOI=HOS.getDataByRegion(
	        	    "thomsonreutersprod",
	        	    "9gr39j",
	        	    -180D,
	        	    90D,
	        	    180D,//e
	        	    -90D,
	        	    convertToXMLGregorianCalendar("2015-07-09 19:20:00"),
	        	    convertToXMLGregorianCalendar("2015-07-09 22:00:00"),
	        	    "jing.wang@thomsonreuters.com"
	        	    );
	    
	    
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
