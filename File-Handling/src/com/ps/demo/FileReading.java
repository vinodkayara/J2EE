package com.ps.demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;



public class FileReading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f=new File("vin.text");
		try {
			Scanner sc=new Scanner(f);
			
			while(sc.hasNextLine()) {
				String txt=sc.nextLine();
				System.out.println(txt);
			}
			sc.close();
			
			
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
	
		

	}

}
