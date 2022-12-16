/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sislab.proteomica.view;

import java.awt.AWTEvent;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.beans.Beans;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.RollbackException;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.KeyStroke;
import sislab.proteomica.EditsView.LocalizacaoEditView;
import sislab.proteomica.engine.Container;

/**
 *
 * @author NILDO
 */
public class LocalizacaoView extends JPanel {
      private static JFrame frameLocalizacãoView;
Container cont = new Container();
    public LocalizacaoView() {
        initComponents();
        iniKeyActions();
        if (!Beans.isDesignTime()) {
            entityManager.getTransaction().begin();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("fenyx?zeroDateTimeBehavior=convertToNullPU").createEntityManager();
        query = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT c FROM CadLocalizacao c WHERE c.idLab="+cont.getCadLaboratorio().getIdLab().toString());
        list = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(query.getResultList());
        masterScrollPane = new javax.swing.JScrollPane();
        masterTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        newButton = new javax.swing.JButton();
        refreshButton = new javax.swing.JButton();
        jbt_editar = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        FormListener formListener = new FormListener();

        masterScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        masterTable.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        masterTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        masterTable.setRowHeight(18);
        masterTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        masterTable.getTableHeader().setResizingAllowed(false);
        masterTable.getTableHeader().setReorderingAllowed(false);

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, list, masterTable);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${idLocalizacao}"));
        columnBinding.setColumnName("ID");
        columnBinding.setColumnClass(Integer.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${laboratorio}"));
        columnBinding.setColumnName("LABORATORIO");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${local}"));
        columnBinding.setColumnName("LOCALIZAÇÃO");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${sala}"));
        columnBinding.setColumnName("SALA");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${tel}"));
        columnBinding.setColumnName("TEL");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${ramal}"));
        columnBinding.setColumnName("RAMAL");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${idLab}"));
        columnBinding.setColumnName("Id Lab");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        masterScrollPane.setViewportView(masterTable);
        if (masterTable.getColumnModel().getColumnCount() > 0) {
            masterTable.getColumnModel().getColumn(0).setResizable(false);
            masterTable.getColumnModel().getColumn(1).setResizable(false);
            masterTable.getColumnModel().getColumn(1).setPreferredWidth(250);
            masterTable.getColumnModel().getColumn(2).setResizable(false);
            masterTable.getColumnModel().getColumn(2).setPreferredWidth(250);
            masterTable.getColumnModel().getColumn(3).setResizable(false);
            masterTable.getColumnModel().getColumn(3).setPreferredWidth(100);
            masterTable.getColumnModel().getColumn(4).setResizable(false);
            masterTable.getColumnModel().getColumn(4).setPreferredWidth(100);
            masterTable.getColumnModel().getColumn(5).setResizable(false);
            masterTable.getColumnModel().getColumn(5).setPreferredWidth(100);
            masterTable.getColumnModel().getColumn(6).setResizable(false);
        }

        jPanel1.setLayout(new java.awt.GridBagLayout());

        jToolBar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);

        newButton.setBackground(new java.awt.Color(51, 51, 51));
        newButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        newButton.setForeground(new java.awt.Color(255, 255, 255));
        newButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sislab/images/adicionar.png"))); // NOI18N
        newButton.setText("Novo - F1");
        newButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        newButton.setMaximumSize(new java.awt.Dimension(100, 50));
        newButton.setMinimumSize(new java.awt.Dimension(100, 50));
        newButton.setPreferredSize(new java.awt.Dimension(100, 50));
        newButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement == null}"), newButton, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        newButton.addActionListener(formListener);
        jToolBar1.add(newButton);

        refreshButton.setBackground(new java.awt.Color(51, 51, 51));
        refreshButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        refreshButton.setForeground(new java.awt.Color(255, 255, 255));
        refreshButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sislab/images/atualizar.png"))); // NOI18N
        refreshButton.setText("Atualizar - F2");
        refreshButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        refreshButton.setMaximumSize(new java.awt.Dimension(100, 50));
        refreshButton.setMinimumSize(new java.awt.Dimension(100, 50));
        refreshButton.setPreferredSize(new java.awt.Dimension(100, 50));
        refreshButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        refreshButton.addActionListener(formListener);
        jToolBar1.add(refreshButton);

        jbt_editar.setBackground(new java.awt.Color(51, 51, 51));
        jbt_editar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbt_editar.setForeground(new java.awt.Color(255, 255, 255));
        jbt_editar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sislab/images/editar.png"))); // NOI18N
        jbt_editar.setText("Editar - F4");
        jbt_editar.setFocusable(false);
        jbt_editar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbt_editar.setMaximumSize(new java.awt.Dimension(100, 50));
        jbt_editar.setMinimumSize(new java.awt.Dimension(100, 50));
        jbt_editar.setPreferredSize(new java.awt.Dimension(100, 50));
        jbt_editar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), jbt_editar, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        jbt_editar.addActionListener(formListener);
        jToolBar1.add(jbt_editar);

        deleteButton.setBackground(new java.awt.Color(51, 51, 51));
        deleteButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        deleteButton.setForeground(new java.awt.Color(255, 255, 255));
        deleteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sislab/images/excluir_lixeira_verde.png"))); // NOI18N
        deleteButton.setText("Excluir - F5");
        deleteButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        deleteButton.setMaximumSize(new java.awt.Dimension(100, 50));
        deleteButton.setMinimumSize(new java.awt.Dimension(100, 50));
        deleteButton.setPreferredSize(new java.awt.Dimension(100, 50));
        deleteButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), deleteButton, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        deleteButton.addActionListener(formListener);
        jToolBar1.add(deleteButton);

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jToolBar1.add(jPanel2);

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sislab/images/sair.png"))); // NOI18N
        jButton1.setText("Sair - Esc");
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setMaximumSize(new java.awt.Dimension(100, 50));
        jButton1.setMinimumSize(new java.awt.Dimension(100, 50));
        jButton1.setPreferredSize(new java.awt.Dimension(100, 50));
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement == null}"), jButton1, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        jButton1.addActionListener(formListener);
        jToolBar1.add(jButton1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHEAST;
        gridBagConstraints.weightx = 1.0;
        jPanel1.add(jToolBar1, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 878, Short.MAX_VALUE)
            .addComponent(masterScrollPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(masterScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE))
        );

        bindingGroup.bind();
    }

    // Code for dispatching events from components to event handlers.

    private class FormListener implements java.awt.event.ActionListener {
        FormListener() {}
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            if (evt.getSource() == newButton) {
                LocalizacaoView.this.newButtonActionPerformed(evt);
            }
            else if (evt.getSource() == refreshButton) {
                LocalizacaoView.this.refreshButtonActionPerformed(evt);
            }
            else if (evt.getSource() == jbt_editar) {
                LocalizacaoView.this.jbt_editarActionPerformed(evt);
            }
            else if (evt.getSource() == deleteButton) {
                LocalizacaoView.this.deleteButtonActionPerformed(evt);
            }
            else if (evt.getSource() == jButton1) {
                LocalizacaoView.this.jButton1ActionPerformed(evt);
            }
        }
    }// </editor-fold>//GEN-END:initComponents

    
    @SuppressWarnings("unchecked")
    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        entityManager.getTransaction().rollback();
        entityManager.getTransaction().begin();
        java.util.Collection data = query.getResultList();
        for (Object entity : data) {
            entityManager.refresh(entity);
        }
        list.clear();
        list.addAll(data);
    }//GEN-LAST:event_refreshButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
      excluir();
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void newButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newButtonActionPerformed
novo();
    }//GEN-LAST:event_newButtonActionPerformed
    
    private void jbt_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_editarActionPerformed
      editar();
    }//GEN-LAST:event_jbt_editarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
fecharJanela();
    }//GEN-LAST:event_jButton1ActionPerformed
 

   public void fecharJanela()
   {
     int opcao;
        Object[] botoes = {" SIM "," NÃO "};
        opcao = JOptionPane.showOptionDialog(null, "Deseja Fechar o Cadastro de Locais do Laboratório ?", "PERGUNTA DO SISTEMA", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,null,botoes,botoes[0]);
        if (opcao ==  JOptionPane.YES_OPTION) {

                frameLocalizacãoView.dispose();       
        }

   
   }

    public void salvar()
    {

           try {
            entityManager.getTransaction().commit();
            entityManager.getTransaction().begin();
        } catch (RollbackException rex) {
            rex.printStackTrace();
            entityManager.getTransaction().begin();
            List<sislab.proteomica.beans.CadLocalizacao> merged = new ArrayList<sislab.proteomica.beans.CadLocalizacao>(list.size());
            for (sislab.proteomica.beans.CadLocalizacao c : list) {
                merged.add(entityManager.merge(c));
            }
            list.clear();
            list.addAll(merged);
        
            
        }
              atualizar();
              deleteButton.setEnabled(false);
              newButton.setEnabled(true);

  
    }

    public void salvarExclusao()
    {
       try {
            entityManager.getTransaction().commit();
            entityManager.getTransaction().begin();
        } catch (RollbackException rex) {
            rex.printStackTrace();
            entityManager.getTransaction().begin();
            List<sislab.proteomica.beans.CadLocalizacao> merged = new ArrayList<sislab.proteomica.beans.CadLocalizacao>(list.size());
            for (sislab.proteomica.beans.CadLocalizacao c : list) {
                merged.add(entityManager.merge(c));
            }
            list.clear();
            list.addAll(merged);
        }
    }
 
    public void excluir()
    {
         int opcao;
        Object[] botoes = {" SIM "," NÃO "};
        opcao = JOptionPane.showOptionDialog(null, "Confirma exclusão do registro: "+masterTable.getValueAt(masterTable.getSelectedRow(), 1), "PERGUNTA DO SISTEMA", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,null,botoes,botoes[0]);
        if (opcao ==  JOptionPane.YES_OPTION) {
          int[] selected = masterTable.getSelectedRows();
        List<sislab.proteomica.beans.CadLocalizacao> toRemove = new ArrayList<sislab.proteomica.beans.CadLocalizacao>(selected.length);
        for (int idx = 0; idx < selected.length; idx++) {
            sislab.proteomica.beans.CadLocalizacao c = list.get(masterTable.convertRowIndexToModel(selected[idx]));
            toRemove.add(c);
            entityManager.remove(c);
        }
        list.removeAll(toRemove);
        
          try {
            entityManager.getTransaction().commit();
            entityManager.getTransaction().begin();
        } catch (RollbackException rex) {
            rex.printStackTrace();
            entityManager.getTransaction().begin();
            List<sislab.proteomica.beans.CadLocalizacao> merged = new ArrayList<sislab.proteomica.beans.CadLocalizacao>(list.size());
            for (sislab.proteomica.beans.CadLocalizacao c : list) {
                merged.add(entityManager.merge(c));
            }
            list.clear();
            list.addAll(merged);
        }

        atualizar();
        }

        atualizar();
    }
        
        
    public void novo()
    {
        Date d = new Date();
        sislab.proteomica.beans.CadLocalizacao c = new sislab.proteomica.beans.CadLocalizacao();
        entityManager.persist(c);
        c.setIdLab(cont.getCadLaboratorio().getIdLab().toString());
        c.setLaboratorio(cont.getCadLaboratorio().getLaboratorio());
        list.add(c);
        int row = list.size() - 1;
        masterTable.setRowSelectionInterval(row, row);
        masterTable.scrollRectToVisible(masterTable.getCellRect(row, 0, true));
        LocalizacaoEditView lce = new LocalizacaoEditView(null, true);
        lce.setRegistroAtualLocalizacao(c);
        lce.setVisible(true);
        
        if(lce.isConfirmaLocalizacaoEditView()){
            salvar();
        
       int opcao;
        Object[] botoes = {" SIM "," NÃO "};
        opcao = JOptionPane.showOptionDialog(null, "Deseja realizar um novo cadastro ?", "PERGUNTA DO SISTEMA", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,null,botoes,botoes[0]);
        if (opcao ==  JOptionPane.YES_OPTION) {
                
            novo();
            }
        else {
        
        refreshButton.doClick();
        }
        }
        else
        {
        refreshButton.doClick();
        }

    }


    public void atualizar()
    {
         entityManager.getTransaction().rollback();
        entityManager.getTransaction().begin();
        java.util.Collection data = query.getResultList();
        for (Object entity : data) {
            entityManager.refresh(entity);
        }
        list.clear();
        list.addAll(data);

  

    }
    public void editar()
    {

        LocalizacaoEditView lce = new LocalizacaoEditView(null, true);
        lce.setRegistroAtualLocalizacao(list.get(masterTable.getSelectedRow()));
        lce.setVisible(true);
        if(lce.isConfirmaLocalizacaoEditView()){
        salvar();
        //saveButton.doClick();
        }else{
       refreshButton.doClick();
        }
    }


 

   private void hotKeyF1()
    {
            frameLocalizacãoView.getRootPane().registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
            newButton.doClick();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_F1, 0),
                JComponent.WHEN_IN_FOCUSED_WINDOW);
    }
      private void hotKeyF2()
    {
            frameLocalizacãoView.getRootPane().registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
             
            refreshButton.doClick();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_F2, 0),JComponent.WHEN_IN_FOCUSED_WINDOW);
    }
       private void hotKeyF3()
    {
            frameLocalizacãoView.getRootPane().registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
              salvar();
            //saveButton.doClick();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_F3, 0),
                JComponent.WHEN_IN_FOCUSED_WINDOW);
    }
        private void hotKeyF4()
    {
            frameLocalizacãoView.getRootPane().registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
            jbt_editar.doClick();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_F4, 0),
                JComponent.WHEN_IN_FOCUSED_WINDOW);
    }

    

      private void hotKeyEsc()
    {
            frameLocalizacãoView.getRootPane().registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
               int opcao;
        Object[] botoes = {" SIM "," NÃO "};
        opcao = JOptionPane.showOptionDialog(null, "Deseja Fechar o Cadastro de Locais do Laboratório ?", "PERGUNTA DO SISTEMA", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,null,botoes,botoes[0]);
        if (opcao ==  JOptionPane.YES_OPTION) {
    
                frameLocalizacãoView.dispose();
                
        }
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0),
                JComponent.WHEN_IN_FOCUSED_WINDOW);
    }

           private void iniKeyActions()
           {
           hotKeyF1();
           hotKeyF2();
           hotKeyF3();
           hotKeyF4();
     
           hotKeyEsc();
           iniKeyActionsSetas();
           }

     private void iniKeyActionsSetas()
    {

              EventQueue queue = new EventQueue()
		{
			protected void dispatchEvent(AWTEvent event)
			{
				super.dispatchEvent(event);


					String a[];
					String tecla[];

					if (!event.paramString().equals("")) {
						if  (event.paramString().substring(0, 5).equals("KEY_P")) {
							a = event.paramString().split(",");
							tecla = a[1].split("=");
                                                       System.out.println(tecla[1]);
							switch (Integer.parseInt(tecla[1])) {
                                                      case 9: //TAB

								break;
                                                            case 10: //ENTER

								break;
                                                       case 27: //ESC

								break;
                                                       case 33: //PGUP

                                                                break;
                                                       case 34: //PGDN

                                                                break;
                                                       case 35: //END

                                                                break;
                                                       case 36: //HOME

                                                                break;
                                                       case 37: //SETA-ESQUERDA

                                                                break;
                                                       case 38: //SETA-ACIMA
                                                       masterTable.requestFocusInWindow();
                                                                break;
                                                       case 39: //SETA-DIREITA

                                                                break;
                                                       case 40: //PARA BAIXO
                                                       masterTable.requestFocusInWindow();
                                                                break;
                                                       case 49: // 1

                                                           	break;
                                                       case 50: // 2

                                                           	break;
                                                       case 51: // 3

                                                           	break;
                                                       case 52: // 4

                                                           	break;
                                                       case 53: // 5

                                                           	break;
                                                       case 54: // 6

                                                           	break;
                                                       case 55: // 7

                                                           	break;
                                                       case 56: // 8

                                                           	break;
                                                       case 57: // 9

								break;
							case 112: //F1

								break;
							case 113: //F2

								break;
							case 114: //F3

								break;
							case 115: //F4

								break;
							case 116: //F5

								break;
							case 117: //F6
//
								break;
							case 118: //F7
//
								break;
							case 119: //F8
//
								break;
							case 120: //F9

								break;
							case 121: //F10
//
								break;
							case 122: //F11
//
								break;
							case 123: //F12
//
								break;

							case 127: //DEL
                                                    //    deleteButton.doClick();
								break;
							default:
                                                        	break;
							}
						}
					}
			}
		};
		Toolkit.getDefaultToolkit().getSystemEventQueue().push(queue);
     }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deleteButton;
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JButton jbt_editar;
    private java.util.List<sislab.proteomica.beans.CadLocalizacao> list;
    private javax.swing.JScrollPane masterScrollPane;
    private javax.swing.JTable masterTable;
    private javax.swing.JButton newButton;
    private javax.persistence.Query query;
    private javax.swing.JButton refreshButton;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                      if(frameLocalizacãoView == null)
                frameLocalizacãoView = new JFrame();
                frameLocalizacãoView.setContentPane(new LocalizacaoView());
                frameLocalizacãoView.setSize(878, 600);//[644, 578][][878, 600]
                frameLocalizacãoView.setResizable(false);
                frameLocalizacãoView.setLocationRelativeTo(null);
                frameLocalizacãoView.pack();
                frameLocalizacãoView.setVisible(true);
                frameLocalizacãoView.setTitle(args[0]); 

            }
        });
    }
    
}
