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
public class ReadEntradaPLC {

public static Cell c1;
public static Cell c2;
public static Cell c3;
public static Cell c4;
public static Cell c5;
public static Cell c6;
public static Cell c7;
public static Cell c8;
public static Cell c9;
public static Cell c10;
public static Cell c11;
public static Cell c12;

	public void  LerEntradaTriplicataC (String fileimputC)
	{
		try
		{
                FileInputStream file = new FileInputStream(new File(fileimputC));
                XSSFWorkbook workbook = new XSSFWorkbook(file);
                XSSFSheet sheet  = workbook.getSheetAt(0);

                 int linhaC = 20;
 
                 Row rowC = sheet.getRow(linhaC);
                c1 = rowC.getCell(2);
                c2 = rowC.getCell(3);
                c3 = rowC.getCell(4);
                c4 = rowC.getCell(5);
                c5 = rowC.getCell(6);
                c6 = rowC.getCell(7);
                c7 = rowC.getCell(8);
                c8 = rowC.getCell(9);
                c9 = rowC.getCell(10);
                c10 = rowC.getCell(11);
                c11 = rowC.getCell(12);
                c12 = rowC.getCell(13);

		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
      
}
