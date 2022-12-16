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
public class ReadEntradaTampaoPLG {
    
  public static Cell gt1;
        public static Cell gt2;
        public static Cell gt3;
        public static Cell gt4;
        public static Cell gt5;
        public static Cell gt6;
        public static Cell gt7;
        public static Cell gt8;
        public static Cell gt9;
        public static Cell gt10;
        public static Cell gt11;
        public static Cell gt12;  

	public void  LerEntradaTriplicataG (String fileimputA)
	{

		try
		{
                FileInputStream file = new FileInputStream(new File(fileimputA));
                XSSFWorkbook workbook = new XSSFWorkbook(file);
                XSSFSheet sheet  = workbook.getSheetAt(0);
		 int linhaG = 18;

                Row rowG = sheet.getRow(linhaG);
                gt1 = rowG.getCell(2);
                gt2 = rowG.getCell(3);
                gt3 = rowG.getCell(4);
                gt4 = rowG.getCell(5);
                gt5 = rowG.getCell(6);
                gt6 = rowG.getCell(7);
                gt7 = rowG.getCell(8);
                gt8 = rowG.getCell(9);
                gt9 = rowG.getCell(10);
                gt10 = rowG.getCell(11);
                gt11 = rowG.getCell(12);
                gt12 = rowG.getCell(13);   
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
      
}