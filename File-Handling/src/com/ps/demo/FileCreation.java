package com.ps.demo;
import java.io.File;
import java.io.IOException;

public class FileCreation {

	public static void main(String[] args) {
		
		String file_name="vik.text";
		
		File f=new File(file_name);
		
		try {
			boolean res=f.createNewFile();
			if(res) {
				System.out.println("file created");
			}
			else {
				System.out.println("failed");
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}

	}

}
