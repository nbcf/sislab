/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sislab.proteomica.engine;

/**
 *
 * @author nil_b
 */
public class Rules {
   public static Long a1l;
   public static Long a2l;
   public static Long b1l;
   public static Long b2l;
   public static Long mult_b2xa1;
   public static Long div_mult_b2xa1_a1;
   public static Long resultado_final;
    
    
    public Long RulesDireta(String a1, String a2, String b1, String b2, String flag){

    a1l = Long.parseLong(a1);
    a2l = Long.parseLong(a2);
    b1l = Long.parseLong(b1);
    b2l = Long.parseLong(b2);
    
        if(flag.equals("d")){  
            mult_b2xa1 = b1l*a2l;
            b2l = mult_b2xa1/a1l;
          resultado_final = b2l;
        }else  if(flag.equals("i")){
            mult_b2xa1 = b2l*a2l;
            resultado_final = mult_b2xa1/b1l; 
        }
           return resultado_final;
     }

}
