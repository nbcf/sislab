
package br.com.bueno.unlock.engine;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;

/**
 *
 * @author NILDO BUENO CORREIA FILHO  -
 * PORTADOR CPF : 10333054725
 * RG: 2271508-ES
 * ORGÃO EMISSOR : SPTC
 *  - DESENVOLVIMENTO DE SISTEMAS -
 * RUA MIGUEL DIAS JACQUES, N° 168 - TEIXERA LEITE
 * RUA PRINCESA ISABEL, N°31 - NOSSA SENHORA DA PENHA
 * EMAIL: nil_bueno@hotmai.com
 * CACHOEIRO DE ITAPEMIRIN - ES, 12 DE FEVEREIRO DE 2012
 *
 */

public class PIdMb {


    public static String Nil_IdMtB() {
    String idMtB = "";
    try {
      File file = File.createTempFile("hostClient",".vbs");
      file.deleteOnExit();
      FileWriter fw = new java.io.FileWriter(file);

      String vbs = "Set objWMIService = GetObject(\"winmgmts:\\\\.\\root\\cimv2\")\n"
        + "Set colItems = objWMIService.ExecQuery _ \n"
        + "   (\"Select * from Win32_BIOS\") \n"
        + "For Each objItem in colItems \n"
        + "Wscript.Echo objItem.SerialNumber \n"
        + "    exit for  ' do the first cpu only! \n" + "Next \n";

      fw.write(vbs);
      fw.close();
      Process p = Runtime.getRuntime().exec("cscript //NoLogo " + file.getPath());
      BufferedReader input =new BufferedReader(new InputStreamReader(p.getInputStream()));
      String line;
      while ((line = input.readLine()) != null) {
         idMtB += line;
      }
      input.close();
    }
    catch(Exception e){
        e.printStackTrace();
    }
    return idMtB.trim();
  }
    
    

}
