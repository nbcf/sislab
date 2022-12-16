package sislab.proteomica.engine;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelDemo 
{
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



	public void  LerEntradaTriplicataABC (String fileimput)
	{
            
            
            
            
		try
		{
                    FileInputStream file = new FileInputStream(new File(fileimput));
//			FileInputStream file = new FileInputStream(new File("images/2A.xlsx"));
                        XSSFWorkbook workbook = new XSSFWorkbook(file);
                        XSSFSheet sheet  = workbook.getSheetAt(0);
		 int linhaA = 18;
                 int linhaB = 19;
                 int linhaC = 20;

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
//
//                Cell CC = a2; // obter valor da celula G
//               // Cell nome = row.getCell(3); // obter valor da celula K
//                System.out.println(CC);

		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
      
}
