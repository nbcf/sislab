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
public class ReadEntradaTampaoPLA {
    
public static Cell at1;
public static Cell at2; 
public static Cell at3; 
public static Cell at4; 
public static Cell at5; 
public static Cell at6; 
public static Cell at7 ;
public static Cell at8; 
public static Cell at9;
public static Cell at10;
public static Cell at11;
public static Cell at12;

	public void  LerEntradaTriplicataA (String fileimputA)
	{

		try
		{
                FileInputStream file = new FileInputStream(new File(fileimputA));
                XSSFWorkbook workbook = new XSSFWorkbook(file);
                XSSFSheet sheet  = workbook.getSheetAt(0);
		 int linhaA = 18;

                Row rowA = sheet.getRow(linhaA);
                at1 = rowA.getCell(2);
                at2 = rowA.getCell(3);
                at3 = rowA.getCell(4);
                at4 = rowA.getCell(5);
                at5 = rowA.getCell(6);
                at6 = rowA.getCell(7);
                at7 = rowA.getCell(8);
                at8 = rowA.getCell(9);
                at9 = rowA.getCell(10);
                at10 = rowA.getCell(11);
                at11 = rowA.getCell(12);
                at12 = rowA.getCell(13);
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
      
}