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
public class ReadEntradaPLD {
    
public static Cell d1;
public static Cell d2; 
public static Cell d3; 
public static Cell d4; 
public static Cell d5; 
public static Cell d6; 
public static Cell d7 ;
public static Cell d8; 
public static Cell d9;
public static Cell d10;
public static Cell d11;
public static Cell d12;

	public void  LerEntradaTriplicataD(String fileimputD)
	{

		try
		{
                FileInputStream file = new FileInputStream(new File(fileimputD));
                XSSFWorkbook workbook = new XSSFWorkbook(file);
                XSSFSheet sheet  = workbook.getSheetAt(0);
		 int linhaD = 18;

                Row rowD = sheet.getRow(linhaD);
                d1 = rowD.getCell(2);
                d2 = rowD.getCell(3);
                d3 = rowD.getCell(4);
                d4 = rowD.getCell(5);
                d5 = rowD.getCell(6);
                d6 = rowD.getCell(7);
                d7 = rowD.getCell(8);
                d8 = rowD.getCell(9);
                d9 = rowD.getCell(10);
                d10 = rowD.getCell(11);
                d11 = rowD.getCell(12);
                d12 = rowD.getCell(13);
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
      
}