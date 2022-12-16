/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sislab.proteomica.engineLeituraPLQuanti;

import sislab.proteomica.engineLeituraPL.*;
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
public class ReadEntradaTampaoPLE {
    
public static Cell et1;
public static Cell et2; 
public static Cell et3; 
public static Cell et4; 
public static Cell et5; 
public static Cell et6; 
public static Cell et7;
public static Cell et8; 
public static Cell et9;
public static Cell et10;
public static Cell et11;
public static Cell et12;

	public void  LerEntradaTriplicataE(String fileimputE)
	{
		try
		{
                FileInputStream fileE = new FileInputStream(new File(fileimputE));
                XSSFWorkbook workbook = new XSSFWorkbook(fileE);
                XSSFSheet sheet  = workbook.getSheetAt(0);
		int linhaE = 23;

                Row rowE = sheet.getRow(linhaE);
                et1 = rowE.getCell(2);
                et2 = rowE.getCell(3);
                et3 = rowE.getCell(4);
                et4 = rowE.getCell(5);
                et5 = rowE.getCell(6);
                et6 = rowE.getCell(7);
                et7 = rowE.getCell(8);
                et8 = rowE.getCell(9);
                et9 = rowE.getCell(10);
                et10 = rowE.getCell(11);
                et11 = rowE.getCell(12);
                et12 = rowE.getCell(13);
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
      
}