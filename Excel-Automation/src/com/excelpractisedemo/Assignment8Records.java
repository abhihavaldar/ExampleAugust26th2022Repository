package com.excelpractisedemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Assignment8Records {
	static String info[][] = new String[16][6];
	public static void main(String[] args) {
		readContent();
		writeContent();

	}
	private static void readContent()
	{
		FileInputStream fin=null;
		Workbook wb=null;
		Sheet sh=null;
		Row row=null;
		Cell cell=null;
		try
		{
			fin=new FileInputStream("D:\\Data.xlsx");
			wb=new XSSFWorkbook(fin);
			sh=wb.getSheet("Datas");
			int rc=sh.getPhysicalNumberOfRows();
			for(int r=0;r<rc;r++)
			{
				row=sh.getRow(r);
				int cc=row.getPhysicalNumberOfCells();
				for(int c=0;c<cc;c++)
				{
					
					cell=row.getCell(c);
					String data=cell.getStringCellValue();
					info[r][c]=data;	
					
				}
				System.out.println();
			}
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fin.close();
				wb.close();
			}catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
	}


	private static void writeContent()
	{
		FileOutputStream fout=null;
		Workbook wb=null;
		Sheet sh=null;
		Row row=null;
		Cell cell=null;
		try
		{
			wb=new XSSFWorkbook();
			sh=wb.createSheet("Copied Datas");
			for(int i=0;i<info.length;i++)
			{
				row=sh.createRow(i);
				for(int j=0;j<info[i].length;j++)
				{
					cell=row.createCell(j);
					cell.setCellValue(info[i][j]);
				}
			}
			fout=new FileOutputStream("D:\\Datanew.xlsx");
			wb.write(fout);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fout.close();
				wb.close();
			}catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
	}
}
