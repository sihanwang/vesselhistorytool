package com.thomsonreuters.ce.vtclient.exportglobaldata;

import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.axis2.addressing.EndpointReference;
import org.apache.axis2.client.Options;
import org.apache.axis2.client.ServiceClient;
import org.apache.axis2.transport.http.HTTPConstants;
import org.apache.axis2.transport.http.HttpTransportProperties;

import com.thomsonreuters.ce.vtclient.exportglobaldata.GlobalSatExportServiceStub.GlobalSatExportShipInfo;


public class WSClient {
    
    private static EndpointReference targetEPR = new EndpointReference("http://webservice.vesseltracker.com:80/webservices/GlobalSatExport");

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	exportGlobalSatData();

    }

    public static void exportGlobalSatData()
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


	    GlobalSatExportServiceStub stub=new GlobalSatExportServiceStub();

	    ServiceClient client=stub._getServiceClient();
	    client.setOptions(options);

	    //////////////////////////////////////
	    //GetDataByRegion

	    GlobalSatExportServiceStub.ExportGlobalSatData req=new GlobalSatExportServiceStub.ExportGlobalSatData();

	    req.setArg0("gcdsmith");
	    req.setArg1("welcome");
	    req.setArg2(strToCalender("2013-09-10 03:20:00"));
	    

	    GlobalSatExportServiceStub.ExportGlobalSatDataE reqE=new GlobalSatExportServiceStub.ExportGlobalSatDataE();
	    reqE.setExportGlobalSatData(req);

	    GlobalSatExportServiceStub.ExportGlobalSatDataResponseE resE=stub.exportGlobalSatData(reqE);

	    GlobalSatExportServiceStub.ExportGlobalSatDataResponse res=resE.getExportGlobalSatDataResponse();

	    GlobalSatExportServiceStub.GlobalSatExportValue gsev=res.get_return();
	    
	    GlobalSatExportShipInfo[] gsesi=gsev.getVessel();
	    SimpleDateFormat sf=new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
	    

	    for (GlobalSatExportShipInfo thisGSESI : gsesi)
	    {
		if (thisGSESI.localSImo<=0)
		{
		     
		    System.out.println("IMO:"+thisGSESI.localSImo +" Ship ID:"+thisGSESI.localShipId +" MMSI:"+thisGSESI.localSMmsi + " Name:"+thisGSESI.localSName+ " timestamp:"+ sf.format(thisGSESI.localPTime.getTime()) + " lat:"+thisGSESI.localPLat+ " long:"+thisGSESI.localPLong);
		}
		
	    }
	    
	    System.out.println("Done");

	} catch (Exception e) {
	    // TODO Auto-generated catch block
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
