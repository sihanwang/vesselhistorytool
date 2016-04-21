package com.thomsonreuters.ce.vtclient.history;

import java.rmi.RemoteException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.axis2.AxisFault;
import org.apache.axis2.addressing.EndpointReference;
import org.apache.axis2.client.Options;
import org.apache.axis2.client.ServiceClient;
import org.apache.axis2.transport.http.HTTPConstants;
import org.apache.axis2.transport.http.HttpTransportProperties;

//import com.thomsonreuters.dataoven.database.EasyConnection;


public class WSClient {

    private static EndpointReference targetEPR = new EndpointReference("http://webservice.vesseltracker.com:80/webservices/HistoryOrderService");
    
    /*
    private static String SQLtoGetPolygon="select * from " +
"(" +
"select axsmarine_id, name, latitude_north, latitude_south, longitude_east, longitude_west from port where axsmarine_id in (2349,2254,2334,5025,2218,2314,2184,999997,999969,5123,1890,8889,4472,502,633,22214,999970,999991,999971,23027,999972,999973,19794,5164,9006,3247,3157,2725,630,1232,9011,23298) " + 
"union all "+
"select axsmarine_id, name, latitude_north, latitude_south, longitude_east, longitude_west from berth where axsmarine_id in (2349,2254,2334,5025,2218,2314,2184,999997,999969,5123,1890,8889,4472,502,633,22214,999970,999971,23027,999972,999973,19794,5164,9006,3247,3157,2725,630,1232,9011,23298) " +
") " +
"order by axsmarine_id";
*/
    private static String SQLtoGetPolygon="select axsmarine_id, name, latitude_north, latitude_south, longitude_east, longitude_west from berth where axsmarine_id in (16117)";
    
//    select axsmarine_id, name, latitude_north, latitude_south, longitude_east, longitude_west from port where axsmarine_id in (5123)
//    union
//    select axsmarine_id, name, latitude_north, latitude_south, longitude_east, longitude_west from berth where axsmarine_id in (970186)
//    private static String SQLtoGetPolygon="select axsmarine_id, name, latitude_north, latitude_south, longitude_east, longitude_west from port where axsmarine_id in (21325,1725,1585,2966,990041,990042,990043,990044,990045,22689,990046,990047,990048,990011) "+
//	    "union "+
//	    "select axsmarine_id, name, latitude_north, latitude_south, longitude_east, longitude_west from berth where axsmarine_id in (970072,970073,970074,970071,970070,970069,18182,23304,970044,970057,970058,970059,970060,970062,970063,970045,970046,970047,970048,970049,970050,970051,970052,970053,970054,21725,21727,21726,970061,970064,17906,970034,970056,970065,970066,970067,970068,970035,970036,970037,970038,970039,970040,970041,970042,970043)";
//    
    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	//getDataByRegion();
	getDataByImoList();
    }
    
    /*

    public static void getDataByRegion()
    {
	try {
	    Options options = new Options();

	    HttpTransportProperties.ProxyProperties proxyProperties = new HttpTransportProperties.ProxyProperties();
	    proxyProperties.setDomain("");
	    proxyProperties.setUserName("");
	    proxyProperties.setPassWord("");
	    proxyProperties.setProxyName("127.0.0.1"); 
	    proxyProperties.setProxyPort(1235);   

	    options.setProperty(HTTPConstants.PROXY, proxyProperties);
	    options.setTo(targetEPR); 


	    HistoryOrderServiceServiceStub stub=new HistoryOrderServiceServiceStub();

	    ServiceClient client=stub._getServiceClient();
	    client.setOptions(options);


	    EasyConnection.configPool("dbpool.conf");

	    Connection DBConn = new EasyConnection("processing_history");

	    PreparedStatement objPreStatement = DBConn.prepareStatement(SQLtoGetPolygon);
	    ResultSet objResult = objPreStatement.executeQuery();

	    while(objResult.next())
	    {

		int Axsmarine_id=objResult.getInt(1);
		String polygon_Name=objResult.getString(2);
		double latitude_north=objResult.getDouble(3);
		double latitude_south=objResult.getDouble(4);
		double longitude_east=objResult.getDouble(5);
		double longitude_west=objResult.getDouble(6);

		System.out.print("Requesting for Axsmarine_id: "+ Axsmarine_id+" name: "+ polygon_Name+" ...... ");

		//////////////////////////////////////
		//GetDataByRegion

		HistoryOrderServiceServiceStub.GetDataByRegion req=new HistoryOrderServiceServiceStub.GetDataByRegion();

		req.setArg0("thomsonreutersprod");
		req.setArg1("9gr39j"); 
		req.setArg2(longitude_west); //w
		req.setArg3(latitude_north); //n
		req.setArg4(longitude_east); //e
		req.setArg5(latitude_south); //s
		req.setArg6(strToCalender("2014-01-13 00:00:00"));
		req.setArg7(strToCalender("2014-08-16 00:00:00"));
		req.setArg8("jing.wang@thomsonreuters.com");

		HistoryOrderServiceServiceStub.GetDataByRegionE reqE=new HistoryOrderServiceServiceStub.GetDataByRegionE();
		reqE.setGetDataByRegion(req);

		HistoryOrderServiceServiceStub.GetDataByRegionResponseE resE=stub.getDataByRegion(reqE);

		HistoryOrderServiceServiceStub.GetDataByRegionResponse res=resE.getGetDataByRegionResponse();

		HistoryOrderServiceServiceStub.HistoryOrderInfo hoi=res.get_return();

		System.out.println("Done");

	    }
	    objResult.close();


	    DBConn.close();




	    System.out.println();
	} catch (Exception e)
	    {
		e.printStackTrace();
	    }
    }
    */
    
    public static void getDataByImoList()
    {
	    try {
		Options options = new Options();

		HttpTransportProperties.ProxyProperties proxyProperties = new HttpTransportProperties.ProxyProperties();
		proxyProperties.setDomain("");
		proxyProperties.setUserName("");
		proxyProperties.setPassWord("");
		proxyProperties.setProxyName("10.86.33.21"); 
		proxyProperties.setProxyPort(8080);   

		options.setProperty(HTTPConstants.PROXY, proxyProperties);
		options.setTo(targetEPR); 


		HistoryOrderServiceServiceStub stub=new HistoryOrderServiceServiceStub();

		ServiceClient client=stub._getServiceClient();
		client.setOptions(options);

		HistoryOrderServiceServiceStub.GetDataByImoList req1=new HistoryOrderServiceServiceStub.GetDataByImoList();
		req1.setArg0("thomsonreutersprod");
		req1.setArg1("9gr39j");
		//req1.setArg2("9636163,8901822,8740979");
		req1.setArg2("990263");
		req1.setArg3(strToCalender("2015-01-01 00:00:00"));
		req1.setArg4(strToCalender("2015-10-19 05:31:00"));
		req1.setArg5("jing.wang@thomsonreuters.com");

		HistoryOrderServiceServiceStub.GetDataByImoListE reqE1=new HistoryOrderServiceServiceStub.GetDataByImoListE();
		reqE1.setGetDataByImoList(req1);

		HistoryOrderServiceServiceStub.GetDataByImoListResponseE resE1=stub.getDataByImoList(reqE1);

		HistoryOrderServiceServiceStub.GetDataByImoListResponse res1=resE1.getGetDataByImoListResponse();

		HistoryOrderServiceServiceStub.HistoryOrderInfo hoi1=res1.get_return();

		System.out.println();
	    } catch (AxisFault e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	    } catch (RemoteException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	    } catch (AccountLockedExceptionException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	    } catch (UserNotFoundExceptionException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	    } catch (NoPermissionExceptionException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	    } catch (IncorrectPasswordExceptionException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	    } catch (InvalidArgumentExceptionException e)
	    {
		e.printStackTrace();
	    }
    }
    
    public static Calendar strToCalender(String str) { 
	SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
	ParsePosition pos = new ParsePosition(0); 
	Date strtodate = formatter.parse(str, pos);
	Calendar cal= Calendar.getInstance();
	cal.setTime(strtodate);
	System.out.println(cal.getTimeZone().getID());
	return cal;

    } 
}
