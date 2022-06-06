package bhushan_demo;

import java.io.FileInputStream;

import java.io.IOException;


import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Xl_datafetching
{
public static void main(String[] args) throws IOException 
{
	String path = ("C:\\Users\\admin\\Documents\\velocity.xlsx");
	FileInputStream file =new FileInputStream(path);
	String s= WorkbookFactory.create(file).getSheet("velocity").getRow(1).getCell(1).getStringCellValue();
	 System.out.println(s); 
}
}
