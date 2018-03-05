package com.store.filesystem;

import java.util.List;

import com.store.Store;
import java.io.*;

public class Filesystem implements Store
{

	@Override
	public boolean openconnection() 
	{
		// TODO Auto-generated method stub
		return true;
	}
	

	public static void main(String[] args) throws IOException
	{
		System.out.println("File system running");
		
		
		// Creating a new RandomAccessFile - "GEEK"
		RandomAccessFile f1 = new RandomAccessFile("C:\\Users\\vailaya\\Desktop\\file.txt", "rw");
		System.out.print("File Created");
		
		
		
		// Writing to file
        f1.writeUTF("File written");
        System.out.print("File Written\n");
        
     // read() method :
        System.out.println("Use of read() method : " + f1.read());
        
		//try 1:
		/*String fileName = "C:\\Users\\vailaya\\Desktop\\source.txt";
	    File fileObject = new File(fileName);

	    if (!fileObject.exists()) 
	    {
	    	System.out.println(fileName);
	    	initialWrite(fileName);
	    }
	    //readFile(fileName);
	    //readFile(fileName);*/
		
		
		
		/*File f;
		  f=new File("C:\\Users\\vailaya\\Desktop\\myfile.txt");
		  if(!f.exists())
		  {
			  f.createNewFile();
			  System.out.println("New file \"myfile.txt\" has been created to the current directory");
		  }*/
	}

	@Override
	public boolean insert(String key, String value) {
		// TODO Auto-generated method stub
		
		
		
		return true;
	}

	@Override
	public List<String> read(List<String> key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean update(String key, String value) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean remove(List<String> key) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void closeConnection() {
		// TODO Auto-generated method stub
		
	}

}
