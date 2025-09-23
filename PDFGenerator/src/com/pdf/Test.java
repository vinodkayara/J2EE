package com.pdf;

import java.io.FileOutputStream;
import java.io.IOException;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Document d=new Document();
		
		try {
			FileOutputStream fos=new FileOutputStream("june.pdf");
			PdfWriter.getInstance(d, fos);
			Font f=new Font(Font.FontFamily.TIMES_ROMAN,30,Font.BOLDITALIC,new BaseColor(0,255,0));
			Paragraph p=new Paragraph("Welcome to Java's IText PDF Genertor",f);
			Image i = Image.getInstance("C:/Users/Asus/Downloads/pexels-robin-stickel-70497.jpg");
			i.scaleAbsolute(200, 100);

			d.open();
			d.add(i);
			d.add(p);
			d.close();
			System.out.println("PDF Generated");
			
			
		} catch (IOException | DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
