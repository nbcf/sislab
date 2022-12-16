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
public class ReadEntradaTampaoPLH {
    
        public static Cell ht1;
        public static Cell ht2; 
        public static Cell ht3; 
        public static Cell ht4; 
        public static Cell ht5; 
        public static Cell ht6; 
        public static Cell ht7 ;
        public static Cell ht8; 
        public static Cell ht9;
        public static Cell ht10;
        public static Cell ht11;
        public static Cell ht12;

	public void  LerEntradaTriplicataH (String fileimputH)
	{

		try
		{
                FileInputStream file = new FileInputStream(new File(fileimputH));
                XSSFWorkbook workbook = new XSSFWorkbook(file);
                XSSFSheet sheet  = workbook.getSheetAt(0);
		 int linhaH = 18;

                    Row rowH = sheet.getRow(linhaH);
                ht1 = rowH.getCell(2);
                ht2 = rowH.getCell(3);
                ht3 = rowH.getCell(4);
                ht4 = rowH.getCell(5);
                ht5 = rowH.getCell(6);
                ht6 = rowH.getCell(7);
                ht7 = rowH.getCell(8);
                ht8 = rowH.getCell(9);
                ht9 = rowH.getCell(10);
                ht10 = rowH.getCell(11);
                ht11 = rowH.getCell(12);
                ht12 = rowH.getCell(13);

		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
      
}