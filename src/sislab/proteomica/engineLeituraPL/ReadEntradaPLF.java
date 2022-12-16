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
public class ReadEntradaPLF {
    
public static Cell f1;
public static Cell f2; 
public static Cell f3; 
public static Cell f4; 
public static Cell f5; 
public static Cell f6; 
public static Cell f7;
public static Cell f8; 
public static Cell f9;
public static Cell f10;
public static Cell f11;
public static Cell f12;

	public void  LerEntradaTriplicataF(String fileimputF)
	{
		try
		{
                FileInputStream fileF = new FileInputStream(new File(fileimputF));
                XSSFWorkbook workbook = new XSSFWorkbook(fileF);
                XSSFSheet sheet  = workbook.getSheetAt(0);
		int linhaF = 18;

                Row rowF = sheet.getRow(linhaF);
                f1 = rowF.getCell(2);
                f2 = rowF.getCell(3);
                f3 = rowF.getCell(4);
                f4 = rowF.getCell(5);
                f5 = rowF.getCell(6);
                f6 = rowF.getCell(7);
                f7 = rowF.getCell(8);
                f8 = rowF.getCell(9);
                f9 = rowF.getCell(10);
                f10 = rowF.getCell(11);
                f11 = rowF.getCell(12);
                f12 = rowF.getCell(13);
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
      
}