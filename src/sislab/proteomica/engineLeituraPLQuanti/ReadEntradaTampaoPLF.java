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
public class ReadEntradaTampaoPLF {
    
public static Cell ft1;
public static Cell ft2; 
public static Cell ft3; 
public static Cell ft4; 
public static Cell ft5; 
public static Cell ft6; 
public static Cell ft7;
public static Cell ft8; 
public static Cell ft9;
public static Cell ft10;
public static Cell ft11;
public static Cell ft12;

	public void  LerEntradaTriplicataF(String fileimputF)
	{
		try
		{
                FileInputStream fileF = new FileInputStream(new File(fileimputF));
                XSSFWorkbook workbook = new XSSFWorkbook(fileF);
                XSSFSheet sheet  = workbook.getSheetAt(0);
		int linhaF = 18;

                Row rowF = sheet.getRow(linhaF);
                ft1 = rowF.getCell(2);
                ft2 = rowF.getCell(3);
                ft3 = rowF.getCell(4);
                ft4 = rowF.getCell(5);
                ft5 = rowF.getCell(6);
                ft6 = rowF.getCell(7);
                ft7 = rowF.getCell(8);
                ft8 = rowF.getCell(9);
                ft9 = rowF.getCell(10);
                ft10 = rowF.getCell(11);
                ft11 = rowF.getCell(12);
                ft12 = rowF.getCell(13);
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
      
}