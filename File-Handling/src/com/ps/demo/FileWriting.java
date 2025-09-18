package com.ps.demo;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriting {

	public static void main(String[] args) {
		try {
			FileWriter fw= new FileWriter("vin.text");
			fw.write("Vinod is bad guy ");
			fw.close();
			System.out.println("File written");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		
	}

}
