/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sislab.proteomica.engineLeituraPLQuanti;

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
public class ReadEntradaTampaoPLB {

public static Cell bt1 ;
public static Cell bt2;
public static Cell bt3 ;
public static Cell bt4 ;
public static Cell bt5 ;
public static Cell bt6 ;
public static Cell bt7;
public static Cell bt8 ;
public static Cell bt9 ;
public static Cell bt10 ;
public static Cell bt11 ;
public static Cell bt12 ;

	public void  LerEntradaTriplicataB (String fileimputB)
	{

		try
		{
                FileInputStream file = new FileInputStream(new File(fileimputB));
                XSSFWorkbook workbook = new XSSFWorkbook(file);
                XSSFSheet sheet  = workbook.getSheetAt(0);
                int linhaB = 19;

                Row rowB = sheet.getRow(linhaB);
                bt1 = rowB.getCell(2);
                bt2 = rowB.getCell(3);
                bt3 = rowB.getCell(4);
                bt4 = rowB.getCell(5);
                bt5 = rowB.getCell(6);
                bt6 = rowB.getCell(7);
                bt7 = rowB.getCell(8);
                bt8 = rowB.getCell(9);
                bt9 = rowB.getCell(10);
                bt10 = rowB.getCell(11);
                bt11 = rowB.getCell(12);
                bt12 = rowB.getCell(13);

		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
      
}