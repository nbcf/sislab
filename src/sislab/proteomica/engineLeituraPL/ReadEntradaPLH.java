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
import static sislab.proteomica.engineLeituraPL.RealEntradaPLGH.h1;
import static sislab.proteomica.engineLeituraPL.RealEntradaPLGH.h10;
import static sislab.proteomica.engineLeituraPL.RealEntradaPLGH.h11;
import static sislab.proteomica.engineLeituraPL.RealEntradaPLGH.h12;
import static sislab.proteomica.engineLeituraPL.RealEntradaPLGH.h2;
import static sislab.proteomica.engineLeituraPL.RealEntradaPLGH.h3;
import static sislab.proteomica.engineLeituraPL.RealEntradaPLGH.h4;
import static sislab.proteomica.engineLeituraPL.RealEntradaPLGH.h5;
import static sislab.proteomica.engineLeituraPL.RealEntradaPLGH.h6;
import static sislab.proteomica.engineLeituraPL.RealEntradaPLGH.h7;
import static sislab.proteomica.engineLeituraPL.RealEntradaPLGH.h8;
import static sislab.proteomica.engineLeituraPL.RealEntradaPLGH.h9;

/**
 *
 * @author nil_b
 */
public class ReadEntradaPLH {
    
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

	public void  LerEntradaTriplicataH (String fileimputH)
	{

		try
		{
                FileInputStream file = new FileInputStream(new File(fileimputH));
                XSSFWorkbook workbook = new XSSFWorkbook(file);
                XSSFSheet sheet  = workbook.getSheetAt(0);
		 int linhaH = 18;

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