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
public class ReadEntradaTampaoPLC {

public static Cell ct1;
public static Cell ct2;
public static Cell ct3;
public static Cell ct4;
public static Cell ct5;
public static Cell ct6;
public static Cell ct7;
public static Cell ct8;
public static Cell ct9;
public static Cell ct10;
public static Cell ct11;
public static Cell ct12;

	public void  LerEntradaTriplicataC (String fileimputC)
	{
		try
		{
                FileInputStream file = new FileInputStream(new File(fileimputC));
                XSSFWorkbook workbook = new XSSFWorkbook(file);
                XSSFSheet sheet  = workbook.getSheetAt(0);

                 int linhaC = 20;
 
                 Row rowC = sheet.getRow(linhaC);
                ct1 = rowC.getCell(2);
                ct2 = rowC.getCell(3);
                ct3 = rowC.getCell(4);
                ct4 = rowC.getCell(5);
                ct5 = rowC.getCell(6);
                ct6 = rowC.getCell(7);
                ct7 = rowC.getCell(8);
                ct8 = rowC.getCell(9);
                ct9 = rowC.getCell(10);
                ct10 = rowC.getCell(11);
                ct11 = rowC.getCell(12);
                ct12 = rowC.getCell(13);

		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
      
}
