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
public class ReadEntradaPLG {
    
  public static Cell g1;
        public static Cell g2;
        public static Cell g3;
        public static Cell g4;
        public static Cell g5;
        public static Cell g6;
        public static Cell g7;
        public static Cell g8;
        public static Cell g9;
        public static Cell g10;
        public static Cell g11;
        public static Cell g12;  

	public void  LerEntradaTriplicataG (String fileimputA)
	{

		try
		{
                FileInputStream file = new FileInputStream(new File(fileimputA));
                XSSFWorkbook workbook = new XSSFWorkbook(file);
                XSSFSheet sheet  = workbook.getSheetAt(0);
		 int linhaG = 18;

                Row rowG = sheet.getRow(linhaG);
                g1 = rowG.getCell(2);
                g2 = rowG.getCell(3);
                g3 = rowG.getCell(4);
                g4 = rowG.getCell(5);
                g5 = rowG.getCell(6);
                g6 = rowG.getCell(7);
                g7 = rowG.getCell(8);
                g8 = rowG.getCell(9);
                g9 = rowG.getCell(10);
                g10 = rowG.getCell(11);
                g11 = rowG.getCell(12);
                g12 = rowG.getCell(13);   
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
      
}