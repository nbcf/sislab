/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sislab.proteomica.engine;

import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author nil_b
 */
public class ComportamentoModoTeda {
    
     public void modoTela(int estadoComportamento, JFrame nomeFrame)
    {
  
       int opcao;
        Object[] botoes = {" MAXIMIZADO "," RETRAIDO "};
        opcao = JOptionPane.showOptionDialog(null, "Escolha Sua Opção", "OPÇÕES DE INICIALIZAÇÃO DA TELA DE MENU", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE,null,botoes,botoes[0]);
        if (opcao ==  JOptionPane.YES_OPTION)
        {
         //    setSize(900, 600);
        nomeFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        estadoComportamento = 1;
        
        }else if (opcao ==  JOptionPane.NO_OPTION)
        {
        // setSize(900, 600);
        nomeFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        nomeFrame.setResizable(false);
         nomeFrame.setLocationRelativeTo(null);
         nomeFrame.pack();
         nomeFrame.setVisible(true);
     
      estadoComportamento = 0;
        }
     
    }
}
