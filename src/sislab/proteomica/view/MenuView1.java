

package sislab.proteomica.view;


import java.awt.AWTException;
import java.awt.CheckboxMenuItem;
import java.awt.Menu;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.SystemTray;
import java.awt.TrayIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import sislab.proteomica.Segurança.CadastroComputadoresView;
import sislab.proteomica.Segurança.NewMasterDetailForm;
import sislab.proteomica.engine.AjustaImagemTela;
import sislab.proteomica.engine.Container;
import sislab.proteomica.engine.DimensionarFrame;
import sislab.proteomica.engine.ParametrosGraficos;
import sislab.proteomica.engine.VisualLook;

import sislab.proteomica.pds.CadastroContatoPDSView;
import sislab.proteomica.pds.CadastroLabPDSView;
import sislab.proteomica.view.estoque.EstoqueView;
import sislab.proteomica.view.estoque.NomeEstoqueView;
import sislab.proteomica.view.estoque.TipoEstoqueView;
import sislab.proteomica.view.lotesNotas.CadastroLotesView;
import sislab.proteomica.view.movimento.CadIncompatView;
import sislab.proteomica.view.movimento.CadastroReagentesView;
import sislab.proteomica.view.movimento.DescarteReagentesView;
import sislab.proteomica.view.movimento.DevolucaoReagentesView;
import sislab.proteomica.view.movimento.EmprestimosView;
import sislab.proteomica.view.movimento.IdentificarReagenteView;
import sislab.proteomica.view.movimento.ListarEstoqueBaixoView;
import sislab.proteomica.view.movimento.ListarReagenteVencimentoView;
import sislab.proteomica.view.movimento.MovimentoReagentesView;
import sislab.proteomica.view.movimento.PainelImpressaoRelatoriosView;

public class MenuView1 extends javax.swing.JFrame {
    
   Container cont = new Container(); 
    ParametrosGraficos carregaParametrosTela = new ParametrosGraficos();
    AjustaImagemTela ajustaTela = new AjustaImagemTela();
    VisualLook look = new VisualLook();
    DimensionarFrame resolucaoAtual = new DimensionarFrame();

    private static JFrame frameMenuView;
    public int stMenu ;
    
    public MenuView1() {
       initComponents();
       resolucaoAtual.setSize();
      // jLabel8.setSize(carregaParametrosTela.setSize().width, carregaParametrosTela.setSize().height);
       carregaParametrosTela.modBegins(this);
       //carregaParametrosTela.menuTray("sislab/images/advanced.png");
       look.lookandfeel(this, "com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
    //   jLabel8.setIcon(ajustaTela.ajustaTela("images/proteinCoverart.jpg",jLabel8));
        
        
         if (!SystemTray.isSupported()) 
        {
       // System.out.println("SystemTray is not supported");
        JOptionPane.showMessageDialog(null, "Componente Icone de bandeja, não é Suportado Nesta Versão, de Sistema Operacional", "Aviso do Sistema", JOptionPane.ERROR_MESSAGE);
       //return;
        }
        final PopupMenu popup = new PopupMenu();
        final SystemTray tray = SystemTray.getSystemTray();
            try 
            {
            InputStream inputStream= ClassLoader.getSystemClassLoader().getResourceAsStream("sislab/images/advanced.png");
            //or getResourceAsStream("/images/Graph.png"); also returns inputstream
            BufferedImage img = ImageIO.read(inputStream);
            final TrayIcon trayIcon = new TrayIcon(img, "Sistema do LPBP", popup);
            // Create a pop-up menu components
            
            MenuItem aboutItem = new MenuItem("Sobre");
            MenuItem opt1 = new MenuItem("Maximizar Tela");
            CheckboxMenuItem cb2 = new CheckboxMenuItem("Set tooltip");
            Menu displayMenu = new Menu("Funções");
            MenuItem errorItem = new MenuItem("Error");
            MenuItem warningItem = new MenuItem("Warning");
            MenuItem infoItem = new MenuItem("Info");
            MenuItem noneItem = new MenuItem("None");
            MenuItem exitItem = new MenuItem("Exit");
            

            //Add components to pop-up menu
            popup.add(aboutItem);
              popup.add(aboutItem).addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                     String args[] = new String[1];
                     args[0] = "Informações de Desenvolvimento e Propiedade";
                    SobreView.main(args);  
                }
            });
//            
            popup.addSeparator();
           popup.add(opt1);
                popup.add(opt1).addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
//                     String args[] = new String[1];
//                     args[0] = "Informações de Desenvolvimento e Propiedade";
//                    SobreView.main(args);  

                carregaParametrosTela.mostraJanela(frameMenuView);
                }
            });
//            
            popup.add(cb2);
            
            popup.addSeparator();
            popup.add(displayMenu);
            
            displayMenu.add(errorItem);
            displayMenu.add(warningItem);
            displayMenu.add(infoItem);
            displayMenu.add(noneItem);
            popup.add(exitItem);
            trayIcon.setPopupMenu(popup);
            
//              popup.add(aboutItem).addActionListener(new ActionListener() {
//                @Override
//                public void actionPerformed(ActionEvent e) {
//                    JOptionPane.showMessageDialog(null, "Teste");
//                }
//            });
//                popup.add(cb2).addActionListener(new ActionListener() {
//                @Override
//                public void actionPerformed(ActionEvent e) {
//                    JOptionPane.showMessageDialog(null, "Teste");
//                }
//            });


           displayMenu.add(exitItem).addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JOptionPane.showMessageDialog(null, "Teste");
                }
            });


            displayMenu.add(errorItem).addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JOptionPane.showMessageDialog(null, "Teste");
                }
            });

             displayMenu.add(warningItem).addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JOptionPane.showMessageDialog(null, "Teste");
                }
            });

              displayMenu.add(infoItem).addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JOptionPane.showMessageDialog(null, "Teste");
                }
            });


               displayMenu.add(noneItem).addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JOptionPane.showMessageDialog(null, "Teste");
                }
            });
      
     try {
            tray.add(trayIcon);
            trayIcon.addActionListener(new ActionListener(){

        public void actionPerformed(ActionEvent evt){

      mostraJanela();
    ///  jLabel8.setIcon(ajustaTela.ajustaTela("images/proteinCoverart.jpg",jLabel8));

        }//end actionPerformed

        });//end addActionListener

        }
     catch (AWTException e)
        {
            System.out.println("TrayIcon could not be added.");
            JOptionPane.showMessageDialog(null, "TrayIcon não pode ser adicionado \nInforme ao Suporter", "Aviso do Sistema", JOptionPane.ERROR_MESSAGE);
       //return;
        }
}catch (IOException e) {}
    


        }
    
    
      private void mostraJanela()
        {  if(this.isVisible()){

        this.setVisible(false);

        }else{

        this.setVisible(true);

        }
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jMenuItem11 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        jButton11 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem20 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenuItem19 = new javax.swing.JMenuItem();
        jMenuItem21 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();

        jMenuItem11.setText("jMenuItem11");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sistema do Laboratório");
        addWindowStateListener(new java.awt.event.WindowStateListener() {
            public void windowStateChanged(java.awt.event.WindowEvent evt) {
                formWindowStateChanged(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jToolBar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);

        jButton11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sislab/images/estoque.png"))); // NOI18N
        jButton11.setText("Estoques");
        jButton11.setFocusable(false);
        jButton11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton11.setMaximumSize(new java.awt.Dimension(100, 73));
        jButton11.setMinimumSize(new java.awt.Dimension(100, 73));
        jButton11.setPreferredSize(new java.awt.Dimension(100, 73));
        jButton11.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton11);

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sislab/images/erleimayer.png"))); // NOI18N
        jButton6.setText("Reagentes");
        jButton6.setFocusable(false);
        jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton6.setMaximumSize(new java.awt.Dimension(100, 73));
        jButton6.setMinimumSize(new java.awt.Dimension(100, 73));
        jButton6.setPreferredSize(new java.awt.Dimension(100, 73));
        jButton6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton6);

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sislab/images/cadastrar_lote.png"))); // NOI18N
        jButton5.setText("Lotes");
        jButton5.setFocusable(false);
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.setMaximumSize(new java.awt.Dimension(100, 73));
        jButton5.setMinimumSize(new java.awt.Dimension(100, 73));
        jButton5.setPreferredSize(new java.awt.Dimension(100, 73));
        jButton5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton5);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sislab/images/search-good_40502.png"))); // NOI18N
        jButton1.setText("Consultar");
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setMaximumSize(new java.awt.Dimension(100, 73));
        jButton1.setMinimumSize(new java.awt.Dimension(100, 73));
        jButton1.setPreferredSize(new java.awt.Dimension(100, 73));
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton1);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sislab/images/calendar_office.png"))); // NOI18N
        jButton3.setText("Vencimentos");
        jButton3.setToolTipText("Agenda de Compromissos");
        jButton3.setFocusable(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setMaximumSize(new java.awt.Dimension(100, 73));
        jButton3.setMinimumSize(new java.awt.Dimension(100, 73));
        jButton3.setPreferredSize(new java.awt.Dimension(100, 73));
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton3);

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sislab/images/emprestar.png"))); // NOI18N
        jButton4.setText("Emprestar");
        jButton4.setFocusable(false);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setMaximumSize(new java.awt.Dimension(100, 73));
        jButton4.setMinimumSize(new java.awt.Dimension(100, 73));
        jButton4.setPreferredSize(new java.awt.Dimension(100, 73));
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButton4);

        jButton10.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sislab/images/receber.png"))); // NOI18N
        jButton10.setText("Devoluções");
        jButton10.setFocusable(false);
        jButton10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton10.setMaximumSize(new java.awt.Dimension(100, 73));
        jButton10.setMinimumSize(new java.awt.Dimension(100, 73));
        jButton10.setPreferredSize(new java.awt.Dimension(100, 73));
        jButton10.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton10);

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sislab/images/PhotoPrint.png"))); // NOI18N
        jButton8.setText("Relatorios");
        jButton8.setFocusable(false);
        jButton8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton8.setMaximumSize(new java.awt.Dimension(100, 73));
        jButton8.setMinimumSize(new java.awt.Dimension(100, 73));
        jButton8.setPreferredSize(new java.awt.Dimension(100, 73));
        jButton8.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton8);

        jButton9.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sislab/images/teste_lab.png"))); // NOI18N
        jButton9.setText("Quantificação");
        jButton9.setFocusable(false);
        jButton9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton9.setMaximumSize(new java.awt.Dimension(100, 73));
        jButton9.setMinimumSize(new java.awt.Dimension(100, 73));
        jButton9.setPreferredSize(new java.awt.Dimension(100, 73));
        jButton9.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton9);

        jButton13.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sislab/images/fullscreendisplay_full_pantallacompleta_1899.png"))); // NOI18N
        jButton13.setText("Alterar Tela");
        jButton13.setFocusable(false);
        jButton13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton13.setMaximumSize(new java.awt.Dimension(100, 73));
        jButton13.setMinimumSize(new java.awt.Dimension(100, 73));
        jButton13.setPreferredSize(new java.awt.Dimension(100, 73));
        jButton13.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton13);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        jPanel1.add(jToolBar1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(jPanel1, gridBagConstraints);

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jLabel1.setText("USUÁRIO:");
        jPanel2.add(jLabel1);

        jLabel2.setText("..........................................");
        jPanel2.add(jLabel2);

        jLabel3.setText("LOGIN:");
        jPanel2.add(jLabel3);

        jLabel4.setText(".................................");
        jPanel2.add(jLabel4);

        jLabel5.setText("CARGO:");
        jPanel2.add(jLabel5);

        jLabel6.setText("..........................");
        jPanel2.add(jLabel6);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        getContentPane().add(jPanel2, gridBagConstraints);

        jLayeredPane1.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1204, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 579, Short.MAX_VALUE)
        );

        jLayeredPane1.setLayer(jDesktopPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHEAST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 2.0;
        getContentPane().add(jLayeredPane1, gridBagConstraints);

        jMenu1.setText("Cadastros Básicos");

        jMenuItem6.setText("1ª Etapa - Nome do Estoque");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem6);

        jMenuItem1.setText("2ª Etapa - Tipo de Estoque");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem3.setText("3ª Etapa - Detalhe do Estoque");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem2.setText("Incompatibilidades dos Reagentes");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem4.setText("Fabricantes");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem5.setText("Fornecedores");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuItem9.setText("Reagentes/Materiais");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem9);

        jMenuItem20.setText("Configurações e Autorizações");
        jMenuItem20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem20ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem20);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Notas de Compras");
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        jMenuItem13.setText("Cad. Estoque");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem13);

        jMenuItem10.setText("Gerar Estoque");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem10);

        jMenuItem17.setText("Vencidos");
        jMenuItem17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem17ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem17);

        jMenuBar1.add(jMenu2);

        jMenu4.setText("Central de Empréstimos");

        jMenuItem12.setText("Cadastro de Laboratórios");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem12);

        jMenuItem15.setText("Cadastro de Solicitantes");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem15);

        jMenuItem16.setText("Emprestar/Receber");
        jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem16ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem16);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Uso Reagentes");

        jMenuItem18.setText("Disponibilizar Reagente");
        jMenuItem18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem18ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem18);

        jMenuItem19.setText("Estoque Baixo");
        jMenuItem19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem19ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem19);

        jMenuItem21.setText("Vencimentos");
        jMenuItem21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem21ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem21);

        jMenuBar1.add(jMenu5);

        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu3ActionPerformed(evt);
            }
        });

        jMenuItem7.setText("Simulador de Consórcio");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem7);

        jMenuItem8.setText("Enviar Emails");
        jMenu3.add(jMenuItem8);

        jMenuItem14.setText("Baixa de Contratos");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem14);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
    String args[] = new String[1];
    args[0] = "Cadastro de Estoques";
    EstoqueView.main(args); 
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
    String args[] = new String[1];
    args[0] = "Cadastro Tipo de Estoques";
    TipoEstoqueView.main(args);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
   //  carregaParametrosTela.modBegins(this);
    }//GEN-LAST:event_jButton13ActionPerformed

        private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        String[] str = {"Fechar SisLPBP","Minimizar Sislab no Tray" };
    int result = JOptionPane.showOptionDialog(this, " O que deseja fazer ?", "Pergunta do Sistema",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE, null,str, str[1]);
    if(result == 0)
        {
        this.dispose();

        System.exit(0);
        }
    else{this.setVisible(false);
   }
        }//GEN-LAST:event_formWindowClosing

        private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
    String args[] = new String[1];
    args[0] = "Cadastros de Fabricantes";
    FabricanteView.main(args);  
        }//GEN-LAST:event_jMenuItem4ActionPerformed

        private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        String args[] = new String[1];
        args[0] = "Cadastro de Fornecedores";
        FornecedorView.main(args); 
        }//GEN-LAST:event_jMenuItem5ActionPerformed

        private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
    CadNomeEstoque cne = new CadNomeEstoque();
    jDesktopPane1.add(cne);
    cne.setVisible(true);
        }//GEN-LAST:event_jMenuItem6ActionPerformed

        private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
         //  new SimuladorVendaContratosView().setVisible(true);
        }//GEN-LAST:event_jMenuItem7ActionPerformed

        private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu3ActionPerformed
           String args[] = new String[1];
             args[0] = "Cadastros de Depositos";
         //    CadastroDepositosView.main(args);
        }//GEN-LAST:event_jMenu3ActionPerformed

        private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
          String args[] = new String[1];
             args[0] = "Cadastros de Depositos";
           //  DesabilitarContratoView.main(args);
        }//GEN-LAST:event_jMenuItem14ActionPerformed

        private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
            // TODO add your handling code here:
        }//GEN-LAST:event_jMenu2ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
         String args[] = new String[1];
    args[0] = "Cadastro de Lotes";
    CadastroLotesView.main(args); 
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
    String args[] = new String[1];
    args[0] = "Gerador de Estoque";
    MovimentoReagentesView.main(args);  
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem17ActionPerformed
    String args[] = new String[1];
    args[0] = "Vistoria Geral do Estoque - Vencimentos e Empréstimos para "+cont.getCadLaboratorio().getMonitorarDiasIntervalo()+" dias";
    VerificaValidadeView.main(args); 
    }//GEN-LAST:event_jMenuItem17ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    String args[] = new String[1];
    args[0] = "Vistoria Geral do Estoque - Vencimentos e Empréstimos para "+cont.getCadLaboratorio().getMonitorarDiasIntervalo()+" dias";
    VerificaValidadeView.main(args); 
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String args[] = new String[1];
       args[0] = "Empréstimos e Devoluções";
        IdentificarReagenteView.main(args); 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
    String args[] = new String[1];
    args[0] = "Cadastro de Laboratórios";
    CadastroLabPDSView.main(args);      
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
   String args[] = new String[1];
    args[0] = "Cadastro de Laboratórios";
        CadastroContatoPDSView.main(args);        
    }//GEN-LAST:event_jMenuItem15ActionPerformed

    private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem16ActionPerformed
  String args[] = new String[1];
    args[0] = "Empréstimos e Devoluções";
    EmprestimosView.main(args);        
    }//GEN-LAST:event_jMenuItem16ActionPerformed

    private void jMenuItem18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem18ActionPerformed
    String args[] = new String[1];
    args[0] = "Descarte de Reagentes";
        DescarteReagentesView.main(args);   
    }//GEN-LAST:event_jMenuItem18ActionPerformed

    private void jMenuItem19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem19ActionPerformed
String args[] = new String[1];
    args[0] = "Descarte de Reagentes";
    ListarEstoqueBaixoView.main(args);
    }//GEN-LAST:event_jMenuItem19ActionPerformed

    private void jMenuItem21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem21ActionPerformed
        String args[] = new String[1];
    args[0] = "Consultar Vencimentos";
        ListarReagenteVencimentoView.main(args);     
    }//GEN-LAST:event_jMenuItem21ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
  String args[] = new String[1];
    args[0] = "Cadastro de Reagentes";
    CadastroReagentesView.main(args); 
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
     String args[] = new String[1];
    args[0] = "Cadastro de Incompatibilidades";
    CadIncompatView.main(args); 
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
    String args[] = new String[1];
    args[0] = "Cadastro de Lotes";
    CadastroLotesView.main(args); 
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        String args[] = new String[1];
    args[0] = "Gerador de Estoque";
        DevolucaoReagentesView.main(args);  
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        String args[] = new String[1];
    args[0] = "Cadastro de Estoques";
    EstoqueView.main(args); 
    }//GEN-LAST:event_jButton11ActionPerformed

    private void formWindowStateChanged(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowStateChanged
    carregaParametrosTela.setSize();
     //  jLabel8.setSize(carregaParametrosTela.setSize().width, carregaParametrosTela.setSize().height);
  
    //    jLabel8.setIcon(carregaParametrosTela.ajustaTela("images/proteinCoverart.jpg",jLabel8));
    }//GEN-LAST:event_formWindowStateChanged

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
  String args[] = new String[1];
    args[0] = "Cadastro de Reagentes";
    CadastroReagentesView.main(args);         
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
       String args[] = new String[1];
    args[0] = "Cadastro de Reagentes";
        PainelImpressaoRelatoriosView.main(args); 
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jMenuItem20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem20ActionPerformed

        String args[] = new String[1];
        args[0] = "Cadastro de Reagentes";
        LoginConfiguracaoView.main(args); 
    }//GEN-LAST:event_jMenuItem20ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
 String args[] = new String[1];
        args[0] = "Cadastro de Reagentes";
        TesteQauntView.main(args); 
    }//GEN-LAST:event_jButton9ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuView1().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem21;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables

}
