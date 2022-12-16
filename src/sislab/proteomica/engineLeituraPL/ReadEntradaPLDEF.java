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


    public class ReadEntradaPLDEF
{
        
public static Cell d1;
public static Cell d2; 
public static Cell d3; 
public static Cell d4; 
public static Cell d5; 
public static Cell d6; 
public static Cell d7;
public static Cell d8; 
public static Cell d9;
public static Cell d10;
public static Cell d11;
public static Cell d12;

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

public static Cell f1;
public static Cell f2; 
public static Cell f3; 
public static Cell f4; 
public static Cell f5; 
public static Cell f6; 
public static Cell f7 ;
public static Cell f8; 
public static Cell f9;
public static Cell f10;
public static Cell f11;
public static Cell f12;  

    	public void  ReadEntradaPLDEF (String fileimputDEF)
	{
            
            
            
            
		try
		{
                    FileInputStream file = new FileInputStream(new File(fileimputDEF));
//			FileInputStream file = new FileInputStream(new File("images/2A.xlsx"));
                        XSSFWorkbook workbook = new XSSFWorkbook(file);
                        XSSFSheet sheet  = workbook.getSheetAt(0);
                 int linhaD = 21;
                 int linhaE = 22;
                 int linhaF = 23;
                 
                 
                Row rowD = sheet.getRow(linhaD);
                d1 = rowD.getCell(2);
                d2 = rowD.getCell(3);
                d3 = rowD.getCell(4);
                d4 = rowD.getCell(5);
                d5 = rowD.getCell(6);
                d6 = rowD.getCell(7);
                d7 = rowD.getCell(8);
                d8 = rowD.getCell(9);
                d9 = rowD.getCell(10);
                d10 = rowD.getCell(11);
                d11 = rowD.getCell(12);
                d12 = rowD.getCell(13);
                
              
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

