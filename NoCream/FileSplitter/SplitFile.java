package com.Baker.filesplitter;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class SplitFile {

	/**
	  * split the file specified by filename into pieces, each of size
	  * cSize except for the last one, which may be smaller
	  * 
	  * @param filename 	physical name of the file intended to be split.
	  * @param cSize 	selected size each file is to be split into.
	  * @param sf			the actual file to be split. 
	  */
	void split(String filename, long cSize, File sf) throws FileNotFoundException, IOException
		{
		BufferedInputStream in = new BufferedInputStream(new FileInputStream(sf));
		
		// get the file length
		long fileSize = sf.length();
		
		// loop for each full chunk
		int subfile;
		for (subfile = 1; subfile < fileSize / cSize; subfile++)
			{
			BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(filename + "." + subfile));
			
			for (int currentByte = 0; currentByte < cSize; currentByte++)
				{
				out.write(in.read());
				}
	
			out.close();
			}
		
		// loop for the last chunk (which may be smaller than the chunk size)
		if (fileSize != cSize * (subfile - 1))
			{
			
			BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(filename + "." + subfile));
			
			int b;
			while ((b = in.read()) != -1)
				out.write(b);
				
			out.close();			
			}
		
		in.close();
		}
	
	
}
