package com.thomsonreuters.ce.vessel.location.split;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

import au.com.bytecode.opencsv.CSVParser;

public class HistoryFileCombiner {

    private static String Source="C:\\mywork\\vtrebuild\\20170810\\split";
    private static String dest="C:\\mywork\\vtrebuild\\20170810\\result";
  

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	
	CSVParser CSVP=new CSVParser(',','"','\\',false,false);

	File SourceFolder=new File(Source);
	File[] allpolygons=SourceFolder.listFiles();

	for (File thispolygon : allpolygons)
	{
	    String FolderName=thispolygon.getName();

	    File SFolder= new File(Source+"\\"+FolderName);
	    File[] FileList = SFolder.listFiles();

	    SizeOrderedFileWrapper[] fileWrappers = new SizeOrderedFileWrapper[FileList.length];
	    for (int i = 0; i < FileList.length; i++) {
		fileWrappers[i] = new SizeOrderedFileWrapper(FileList[i]);
	    }

	    // Sorting
	    Arrays.sort(fileWrappers);

	    try {
		
		File tempfile=new File(Source+"\\"+FolderName,"export.csv");
		if (tempfile.exists())
		{
		    tempfile.delete();
		}
		
		BufferedWriter BW=new BufferedWriter(new FileWriter(new File(Source+"\\"+FolderName,"export.csv")));
		boolean WroteHeader=false;


		for (SizeOrderedFileWrapper SOFW : fileWrappers)
		{

		    File HistoryFile=SOFW.getFile();

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

			    if(!WroteHeader)
			    {
				BW.write(header);
				WroteHeader=true;
			    }

			    String NextLine=BR.readLine();

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
				
				BW.newLine();
				
				for (int i=0 ; i<RowData.length ; i++)
				{
				    BW.write("\"");
				    BW.write(RowData[i]);
				    BW.write("\"");
				    if (i<RowData.length-1)
				    {
					BW.write(",");
				    }
				}
				
				NextLine=BR.readLine();
			    }

			    BR.close();
			}
		    }
		}

		BW.flush();
		BW.close();

		//zip
		File tempFile=new File(Source+"\\"+FolderName,"export.csv");

		File zipfile=new File(dest,FolderName);

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

		System.out.println(FolderName + " is done");

	    }


	    catch (ZipException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	    } catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	    } catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	    }


	} 

    }

}