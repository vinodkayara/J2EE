package com.ps.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FIS {
	 public static void main (String args[]) {		
		 File f=new File("demo.text");
	 
		  try{
			 
			  FileInputStream fis=new FileInputStream(f);
			  int data;
			  while((data=fis.read())!=-1) {
				  System.out.print((char)data);
			  }

		  }catch(IOException e) {
			  e.printStackTrace();
}
}
}