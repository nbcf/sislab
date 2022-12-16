/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sislab.proteomica.engineLeituraPL;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author nil_b
 */
public class ReadEntradaPLA {
    
public static Cell a1;
public static Cell a2; 
public static Cell a3; 
public static Cell a4; 
public static Cell a5; 
public static Cell a6; 
public static Cell a7 ;
public static Cell a8; 
public static Cell a9;
public static Cell a10;
public static Cell a11;
public static Cell a12;

	public void  LerEntradaTriplicataA (String fileimputA)
	{

		try
		{
                FileInputStream file = new FileInputStream(new File(fileimputA));
                XSSFWorkbook workbook = new XSSFWorkbook(file);
                XSSFSheet sheet  = workbook.getSheetAt(0);
		 int linhaA = 18;

                Row rowA = sheet.getRow(linhaA);
                a1 = rowA.getCell(2);
                a2 = rowA.getCell(3);
                a3 = rowA.getCell(4);
                a4 = rowA.getCell(5);
                a5 = rowA.getCell(6);
                a6 = rowA.getCell(7);
                a7 = rowA.getCell(8);
                a8 = rowA.getCell(9);
                a9 = rowA.getCell(10);
                a10 = rowA.getCell(11);
                a11 = rowA.getCell(12);
                a12 = rowA.getCell(13);
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
      
}