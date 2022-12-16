//package sislab.proteomica.engine.triplicataQuantificacao;
//
//import java.awt.BorderLayout;   
//import java.awt.Container;   
//import java.awt.event.ActionEvent;   
//import java.awt.event.ActionListener;   
//import java.util.Observable;   
//import java.util.Observer;   
//import javax.swing.JButton;   
//import javax.swing.JFrame;   
//import javax.swing.JLabel;   
//import javax.swing.JProgressBar;   
//import javax.swing.JTextField;   
//  
///**  
// * @author smota  
// */  
//public class classeGUI  extends JFrame      implements Observer {   
//    //Nro de iterações para o loop de simulação do processo   
//    public static int TAM_PROCESSO = 1000000;   
//   
//    
//    
//       
//    //Variaveis da interface   
//    private JProgressBar barradeprogresso;   
//    private JButton botaoOK;   
//    private JTextField texto;   
//    private JLabel label;   
//       
//    //Variavel de controle da thread do processo   
//   // private Thread processo;   
//    private Thread processowf ;   
//    /**  
//     * Executa o processo da aplicação  
//     */  
//    //facha uma chamada deste metodo
//    private void executaProcesso() {   
//        if(processowf==null) { //Instancia a thread SE não existir uma   
////            processo = new Thread(new classeProcesso(this));   
////            processo.start();   
//            processowf = new Thread(new classeProcesso(this));
//            processowf.start();
//        } else {   
//            System.out.println("O processo ainda está em execução");   
//        }      
//    }   
//       
//    /**  
//     * Construtor padrão, instancia e monta objetos da tela   
//     */  
//    protected classeGUI() {   
//////        Container contentPane = getContentPane();   
//////        contentPane.setLayout(new BorderLayout());   
//////           
//////        botaoOK = new JButton("Processar");   
//////           
//////        //Listener do botao   
//////        botaoOK.addActionListener( new ActionListener() {   
////            public void actionPerformed(ActionEvent e) {   
////                executaProcesso();   
////            }              
////        });   
////           
////        texto = new JTextField();      
////           
////        label = new JLabel("Programa Exemplo");   
////        label.setHorizontalAlignment(JTextField.CENTER);   
////           
////        barradeprogresso = new JProgressBar();   
////        barradeprogresso.setMaximum(classeGUI.TAM_PROCESSO);   
////           
////        contentPane.add(label,BorderLayout.NORTH);   
////        contentPane.add(texto,BorderLayout.CENTER);   
////        contentPane.add(botaoOK,BorderLayout.WEST);   
////        contentPane.add(barradeprogresso,BorderLayout.SOUTH); 
////    
////           
////        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
////           
//     //   pack();   
//    }   
// 
//    /**  
//     * Atualiza a tela  
//     * @see java.util.Observer#update(java.util.Observable, java.lang.Object)  
//     * @param o Objeto que sofreu uma atualização  
//     * @param arg Argumento passado pelo objeto para seus observadores  
//     */  
////    public void update(Observable o, Object arg) {   
////        if(arg instanceof Integer) {   
////            //Seta o valor do progresso   
////            barradeprogresso.setValue( ((Integer) arg).intValue());   
////            texto.setText( String.valueOf(((Integer) arg).intValue()));   
////        } else if(arg instanceof Boolean) {   
////            if( ((Boolean) arg).booleanValue() ) {   
////                barradeprogresso.setValue(0);   
////                label.setText("Processo finalizado!");   
////            }   
////        }   
////    }   
//       
//    /**  
//     * Instancia e mostra a tela do usuário  
//     * @param args Parâmetros da linha de execução  
//     */  
//   
//    public static void main(String[] args) {   
//        new classeGUI().show();   
//    }   
//}  
