package com.ps.demo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FOS {
  public static void main (String args[]) {
	  File f=new File("demo.text");
	  try{
		 
		  FileOutputStream fos=new FileOutputStream(f);
		  String txt="Welcome to java stack";
		  byte[] b=txt.getBytes();
		  fos.write(b);
		  fos.close();
		  System.out.println("written successful!");
		  
		  
		  
	  
	  }
	  catch(IOException e){
		  e.printStackTrace();
	  }
	  
	 
 }
}
