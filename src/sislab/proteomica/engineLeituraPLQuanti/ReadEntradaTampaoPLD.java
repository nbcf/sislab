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
public class ReadEntradaTampaoPLD {
    
public static Cell dt1;
public static Cell dt2; 
public static Cell dt3; 
public static Cell dt4; 
public static Cell dt5; 
public static Cell dt6; 
public static Cell dt7 ;
public static Cell dt8; 
public static Cell dt9;
public static Cell dt10;
public static Cell dt11;
public static Cell dt12;

	public void  LerEntradaTriplicataD(String fileimputD)
	{

		try
		{
                FileInputStream file = new FileInputStream(new File(fileimputD));
                XSSFWorkbook workbook = new XSSFWorkbook(file);
                XSSFSheet sheet  = workbook.getSheetAt(0);
		 int linhaD = 21;

                Row rowD = sheet.getRow(linhaD);
                dt1 = rowD.getCell(2);
                dt2 = rowD.getCell(3);
                dt3 = rowD.getCell(4);
                dt4 = rowD.getCell(5);
                dt5 = rowD.getCell(6);
                dt6 = rowD.getCell(7);
                dt7 = rowD.getCell(8);
                dt8 = rowD.getCell(9);
                dt9 = rowD.getCell(10);
                dt10 = rowD.getCell(11);
                dt11 = rowD.getCell(12);
                dt12 = rowD.getCell(13);
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
      
}