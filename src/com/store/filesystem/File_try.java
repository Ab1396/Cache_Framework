package com.store.filesystem;


import java.util.List;
import java.io.*;
import java.io.IOException;
import java.io.RandomAccessFile;
import com.store.Store;

public class File_try implements Store{
	
	public static void main(String[] args){
	try {
		String filePath = "/Users/vailaya/Desktop/source.txt"; 
		
		System.out.println(new String(readCharsFromFile(filePath, 1, 5)));

		writeData(filePath, "Data", 5);
	
		
		appendData(filePath, "dubeysh");
		
	} catch (IOException e) {
		e.printStackTrace();
	}
}
	private static void appendData(String filePath, String data) throws IOException {
		RandomAccessFile raFile = new RandomAccessFile(filePath, "rw");
		raFile.seek(raFile.length());
		System.out.println("current pointer = "+raFile.getFilePointer());
		raFile.write(data.getBytes());
		raFile.close();
		
	}
	
	private static void writeData(String filePath, String data, int seek) throws IOException {
		RandomAccessFile file = new RandomAccessFile(filePath, "rw");
		file.seek(seek);
		file.write(data.getBytes());
		file.close();
	}

	private static byte[] readCharsFromFile(String filePath, int seek, int chars) throws IOException {
		RandomAccessFile file = new RandomAccessFile(filePath, "r");
		file.seek(seek);
		byte[] bytes = new byte[chars];
		file.read(bytes);
		file.close();
		return bytes;
	} 
	
	@Override
	public boolean openconnection() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean insert(String key, String value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<String> read(List<String> key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean update(String key, String value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(List<String> key) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void closeConnection() {
		// TODO Auto-generated method stub
		
	} 
}
