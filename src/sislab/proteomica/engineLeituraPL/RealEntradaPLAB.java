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
public class RealEntradaPLAB  {
    
public static Cell a1;
public static Cell a2; 
public static Cell a3; 
public static Cell a4; 
public static Cell a5; 
public static Cell a6; 
public static Cell a7 ;
public static Cell a8; 
public static Cell a9;
public static Cell a10;
public static Cell a11;
public static Cell a12;

public static Cell b1 ;
public static Cell b2;
public static Cell b3 ;
public static Cell b4 ;
public static Cell b5 ;
public static Cell b6 ;
public static Cell b7;
public static Cell b8 ;
public static Cell b9 ;
public static Cell b10 ;
public static Cell b11 ;
public static Cell b12 ;




	public void  LerEntradaTriplicataAB (String fileimputAB)
	{

		try
		{
                FileInputStream file = new FileInputStream(new File(fileimputAB));
                XSSFWorkbook workbook = new XSSFWorkbook(file);
                XSSFSheet sheet  = workbook.getSheetAt(0);
		 int linhaA = 18;
                 int linhaB = 19;
            

                Row rowA = sheet.getRow(linhaA);
                a1 = rowA.getCell(2);
                a2 = rowA.getCell(3);
                a3 = rowA.getCell(4);
                a4 = rowA.getCell(5);
                a5 = rowA.getCell(6);
                a6 = rowA.getCell(7);
                a7 = rowA.getCell(8);
                a8 = rowA.getCell(9);
                a9 = rowA.getCell(10);
                a10 = rowA.getCell(11);
                a11 = rowA.getCell(12);
                a12 = rowA.getCell(13);
                
                Row rowB = sheet.getRow(linhaB);
                b1 = rowB.getCell(2);
                b2 = rowB.getCell(3);
                b3 = rowB.getCell(4);
                b4 = rowB.getCell(5);
                b5 = rowB.getCell(6);
                b6 = rowB.getCell(7);
                b7 = rowB.getCell(8);
                b8 = rowB.getCell(9);
                b9 = rowB.getCell(10);
                b10 = rowB.getCell(11);
                b11 = rowB.getCell(12);
                b12 = rowB.getCell(13);

		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
      
}