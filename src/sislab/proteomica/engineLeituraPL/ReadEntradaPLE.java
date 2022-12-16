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
public class ReadEntradaPLE {
    
public static Cell e1;
public static Cell e2; 
public static Cell e3; 
public static Cell e4; 
public static Cell e5; 
public static Cell e6; 
public static Cell e7;
public static Cell e8; 
public static Cell e9;
public static Cell e10;
public static Cell e11;
public static Cell e12;

	public void  LerEntradaTriplicataE(String fileimputE)
	{
		try
		{
                FileInputStream fileE = new FileInputStream(new File(fileimputE));
                XSSFWorkbook workbook = new XSSFWorkbook(fileE);
                XSSFSheet sheet  = workbook.getSheetAt(0);
		int linhaE = 18;

                Row rowE = sheet.getRow(linhaE);
                e1 = rowE.getCell(2);
                e2 = rowE.getCell(3);
                e3 = rowE.getCell(4);
                e4 = rowE.getCell(5);
                e5 = rowE.getCell(6);
                e6 = rowE.getCell(7);
                e7 = rowE.getCell(8);
                e8 = rowE.getCell(9);
                e9 = rowE.getCell(10);
                e10 = rowE.getCell(11);
                e11 = rowE.getCell(12);
                e12 = rowE.getCell(13);
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
      
}