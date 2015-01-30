package com.thomsonreuters.ce.vessel.location.split;

import java.io.File;
import java.io.FileInputStream;

public class SizeOrderedFileWrapper implements Comparable {

    private File file;

    public SizeOrderedFileWrapper(File file) {
	this.file = file;
    }

    public int compareTo(Object o) {
	// TODO Auto-generated method stub
	try {
	    if (getFileByte(this.file)>getFileByte(((SizeOrderedFileWrapper)o).file)) {
	        return -1;
	    } else if (getFileByte(this.file)<getFileByte(((SizeOrderedFileWrapper)o).file)) {
	        return 1;
	    } else {
	        return 0;
	    }
	} catch (Exception e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	    return 0;
	}
    }

    public File getFile() {
	return this.file;
    }

    private int getFileByte(File f) throws Exception{

	FileInputStream fis=null;

	try
	{   

	    fis = new FileInputStream(f) ;  
	    return fis.available();   
	}
	finally
	{	    
	    fis.close();

	}
    }
}
