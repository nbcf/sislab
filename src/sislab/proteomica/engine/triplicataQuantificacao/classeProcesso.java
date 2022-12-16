package sislab.proteomica.engine.triplicataQuantificacao;  
  
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Observable;   
import java.util.Observer;   
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
//import org.apache.commons.mail.EmailException;
//import org.apache.commons.net.ftp.FTPClient;
//import org.apache.commons.net.ftp.FTPReply;
  
/**  
 * @author smota  
 */  
public class classeProcesso   
    extends Observable   
    implements Runnable {   
  
    /**  
     * Construtor que recebe um objeto que irá observa-lo  
     * @param observador Objeto que irá acompanhar as mudanças deste objeto  
     */  
    public classeProcesso(Observer observador) {   
        //Adiciona o objeto observador a lista de observadores   
        addObserver(observador);   
        //...outras inicializações   
    }   
       
    /**  
     * Ponto de entrada da Thread.  
     * @see java.lang.Runnable#run()  
     */  
    public void run() {
        
        
          }
//coloca aki dentro o seu metodo ou chamada do metodo;
//         
//       
//            int i;   
//         for(i=0; i<= classeGUI.TAM_PROCESSO; i++) {   
//             //Notifica o processamento a cada 10 iterações   
//             if((i % 10 == 0)) {   
//                 notifyObservers(new Integer(i));   
//                 setChanged();  
//       
//             }   
//         }   
//            
//         //Notifica fim do processo   
//         setChanged();    
//         setChanged();
//     
    }   
  
  
