package com.thomsonreuters.ce.vessel.location.split;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.BufferedInputStream;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;  

import au.com.bytecode.opencsv.CSVParser;

public class HistoryFileSpliter {

    private static String sourcefolder="D:\\mywork\\development\\VTdata_analysis\\20150130\\Ventspils\\raw";
    private static String destfolder="D:\\mywork\\development\\VTdata_analysis\\20150130\\Ventspils\\split"
    	+ "";

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	
	CSVParser CSVP=new CSVParser(',','"','\\',false,false);
	File SFolder= new File(sourcefolder);
	File[] FileList = SFolder.listFiles();

	try {
	    for (File HistoryFile : FileList)
	    {

		
		String FileName=HistoryFile.getName();
		String targetfolder=destfolder+"\\"+FileName;
		
		File targetfile=new File(targetfolder);
		
		if (!targetfile.exists())
		{
		    targetfile.mkdirs();
		}
		
		
		//file name should look like vesselhistory@20110101-20120101.zip
		int email_pos=FileName.indexOf("@");
		String LastPart=FileName.substring(email_pos+1);

		ZipFile ZippedFile = new ZipFile(HistoryFile);
		Enumeration ZippedFiles = ZippedFile.entries();

		while(ZippedFiles.hasMoreElements())
		{
		    ZipEntry entry = (ZipEntry) ZippedFiles.nextElement();
		    if (entry.getName().equals("export.csv"))
		    {			
			
			InputStream IS = ZippedFile.getInputStream(entry);
			BufferedReader BR= new BufferedReader(new InputStreamReader(IS));
			
			String header=BR.readLine();
			String NextLine=BR.readLine();
			String CurrentIMO="";
			
			BufferedWriter BW=new BufferedWriter(new FileWriter(new File(targetfolder,"export.csv")));
			BW.write(header);
			
			int NumOfIMO=0;
			String strIMO="";
			
			while(NextLine!=null)
			{
			    String RowData[];
			    
			    try {
				
				RowData = CSVP.parseLine(NextLine);
			    } catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("Error in parsing:"+ NextLine+" exception:"+e.getMessage());
				NextLine=BR.readLine();
				continue;
			    }
			    
			    String tempIMO=RowData[2];
			    			    
			    if (CurrentIMO.equals(""))
			    {
				//the first row
				CurrentIMO=tempIMO;
				NumOfIMO=1;;
				strIMO=CurrentIMO;
				
			    }
			    

			    if (tempIMO.equals(CurrentIMO))
			    {
				BW.newLine();
				BW.write(NextLine);
				
			    }
			    else if ((!tempIMO.equals(CurrentIMO)) && NumOfIMO < 1)
			    {
				NumOfIMO++;
				CurrentIMO=tempIMO;
				strIMO=strIMO+"_"+CurrentIMO;
				
				BW.newLine();
				BW.write(NextLine);
			    }
			    else
			    {
				BW.flush();
				BW.close();

				//zip
				File tempFile=new File(targetfolder,"export.csv");

				String VesselHistoryFileName="vesselhistory_"+strIMO+"@"+LastPart;
				
				File zipfile=new File(targetfolder,VesselHistoryFileName);
				
				if(zipfile.exists())
				{
				    zipfile.delete();
				}
				
				
				ZipOutputStream zos=new ZipOutputStream(new FileOutputStream(zipfile));  
				ZipEntry ze=new ZipEntry("export.csv");  
				ze.setSize(tempFile.length());
				zos.putNextEntry(ze);  


				InputStream tempIS=new BufferedInputStream(new FileInputStream(tempFile));  
				byte[] buffer = new byte[1048576];

				while (true) {
				    int ins = tempIS.read(buffer);
				    if (ins == -1) {
					break;
				    } else {
					zos.write(buffer, 0, ins);
				    }
				}
				
				zos.flush();
				zos.close();
				
				tempIS.close();
				tempFile.delete();
				
				tempFile=new File(targetfolder,"export.csv");
				tempFile.createNewFile();
				
				BW=new BufferedWriter(new FileWriter(tempFile));
				BW.write(header);
				
				BW.newLine();
				BW.write(NextLine);
				
				CurrentIMO=tempIMO;
				NumOfIMO=1;
				strIMO=CurrentIMO;
			    }
			    
			    NextLine=BR.readLine();
			    
			}
			
			BW.flush();
			BW.close();

			//zip
			File tempFile=new File(targetfolder,"export.csv");

			String VesselHistoryFileName="vesselhistory_"+strIMO+"@"+LastPart;
			
			File zipfile=new File(targetfolder,VesselHistoryFileName);
			
			if(zipfile.exists())
			{
			    zipfile.delete();
			}
			
			
			ZipOutputStream zos=new ZipOutputStream(new FileOutputStream(zipfile));  
			ZipEntry ze=new ZipEntry("export.csv");  
			ze.setSize(tempFile.length());
			zos.putNextEntry(ze);  


			InputStream tempIS=new BufferedInputStream(new FileInputStream(tempFile));  
			byte[] buffer = new byte[1048576];

			while (true) {
			    int ins = tempIS.read(buffer);
			    if (ins == -1) {
				break;
			    } else {
				zos.write(buffer, 0, ins);
			    }
			}
			
			zos.flush();
			zos.close();
			
			tempIS.close();
			tempFile.delete();

			BR.close();
			IS.close();
		    }					
		}				

		ZippedFile.close();	
		
		System.out.println("Done!");
		

	    }
	} catch (FileNotFoundException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	} catch (ZipException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	} catch (IOException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}


    }

}
