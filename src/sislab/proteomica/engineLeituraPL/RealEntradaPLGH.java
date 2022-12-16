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
        public class RealEntradaPLGH  {     
            
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

        public static Cell h1;
        public static Cell h2; 
        public static Cell h3; 
        public static Cell h4; 
        public static Cell h5; 
        public static Cell h6; 
        public static Cell h7 ;
        public static Cell h8; 
        public static Cell h9;
        public static Cell h10;
        public static Cell h11;
        public static Cell h12;

    	public void  ReadEntradaPLGH (String fileimputGH)
	{
		try
		{
                FileInputStream file = new FileInputStream(new File(fileimputGH));
                XSSFWorkbook workbook = new XSSFWorkbook(file);
                XSSFSheet sheet  = workbook.getSheetAt(0);
                int linhaG = 24;
                int linhaH = 25;

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
                
                Row rowH = sheet.getRow(linhaH);
                h1 = rowH.getCell(2);
                h2 = rowH.getCell(3);
                h3 = rowH.getCell(4);
                h4 = rowH.getCell(5);
                h5 = rowH.getCell(6);
                h6 = rowH.getCell(7);
                h7 = rowH.getCell(8);
                h8 = rowH.getCell(9);
                h9 = rowH.getCell(10);
                h10 = rowH.getCell(11);
                h11 = rowH.getCell(12);
                h12 = rowH.getCell(13);

		} 
		catch (Exception e) 
		{
                e.printStackTrace();
		}
	}
}
