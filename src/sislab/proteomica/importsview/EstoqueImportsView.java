/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sislab.proteomica.importsview;

import java.awt.EventQueue;
import java.beans.Beans;
import javax.swing.JFrame;
import javax.swing.JPanel;
import sislab.proteomica.engine.Container;
import sislab.proteomica.view.movimento.CadastroReagentesView;

/**
 *
 * @author NILDO
 */
public class EstoqueImportsView extends JPanel {
    private static JFrame frameEstoqueImportsView;
    Container cont = new Container();
    public EstoqueImportsView() {
        initComponents();
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
        query = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT c FROM CadEstoque c WHERE c.idLab="+cont.getCadLaboratorio().getIdLab().toString());
        list = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(query.getResultList());
        JF_pesquisarEstoque = new javax.swing.JFrame();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jToolBar2 = new javax.swing.JToolBar();
        jButton4 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        cadLocalizacaoQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT c FROM CadLocalizacao c");
        cadLocalizacaoList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : cadLocalizacaoQuery.getResultList();
        converterBusca1 = new sislab.proteomica.engine.ConverterBusca();
        localizacaoEstoqueImportsCellRenderer1 = new sislab.proteomica.importsview.LocalizacaoEstoqueImportsCellRenderer();
        masterScrollPane = new javax.swing.JScrollPane();
        masterTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        refreshButton = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        FormListener formListener = new FormListener();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Localizado Em:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Por:");

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${rowSorter}"), jTextField2, org.jdesktop.beansbinding.BeanProperty.create("text"));
        binding.setConverter(converterBusca1);
        bindingGroup.addBinding(binding);

        jPanel3.setLayout(new java.awt.GridBagLayout());

        jToolBar2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jToolBar2.setFloatable(false);
        jToolBar2.setRollover(true);

        jButton4.setBackground(new java.awt.Color(102, 102, 102));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sislab/images/Clear.png"))); // NOI18N
        jButton4.setText("Pesquisas");
        jButton4.setFocusable(false);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton4.setMaximumSize(new java.awt.Dimension(140, 35));
        jButton4.setMinimumSize(new java.awt.Dimension(140, 35));
        jButton4.setPreferredSize(new java.awt.Dimension(140, 35));
        jButton4.addActionListener(formListener);
        jToolBar2.add(jButton4);

        jPanel4.setBackground(new java.awt.Color(102, 102, 102));
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new java.awt.GridBagLayout());
        jToolBar2.add(jPanel4);

        jButton5.setBackground(new java.awt.Color(102, 102, 102));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sislab/images/cancelar.png"))); // NOI18N
        jButton5.setText("Fechar");
        jButton5.setMaximumSize(new java.awt.Dimension(130, 35));
        jButton5.setMinimumSize(new java.awt.Dimension(130, 35));
        jButton5.setPreferredSize(new java.awt.Dimension(130, 35));
        jButton5.addActionListener(formListener);
        jToolBar2.add(jButton5);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHEAST;
        gridBagConstraints.weightx = 1.0;
        jPanel3.add(jToolBar2, gridBagConstraints);

        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboBox1.setRenderer(localizacaoEstoqueImportsCellRenderer1);

        org.jdesktop.swingbinding.JComboBoxBinding jComboBoxBinding = org.jdesktop.swingbinding.SwingBindings.createJComboBoxBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, cadLocalizacaoList, jComboBox1);
        bindingGroup.addBinding(jComboBoxBinding);

        jComboBox1.addActionListener(formListener);

        javax.swing.GroupLayout JF_pesquisarEstoqueLayout = new javax.swing.GroupLayout(JF_pesquisarEstoque.getContentPane());
        JF_pesquisarEstoque.getContentPane().setLayout(JF_pesquisarEstoqueLayout);
        JF_pesquisarEstoqueLayout.setHorizontalGroup(
            JF_pesquisarEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
            .addGroup(JF_pesquisarEstoqueLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JF_pesquisarEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(JF_pesquisarEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField2))
                .addContainerGap())
        );
        JF_pesquisarEstoqueLayout.setVerticalGroup(
            JF_pesquisarEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JF_pesquisarEstoqueLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JF_pesquisarEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JF_pesquisarEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        converterBusca1.setTable(masterTable);

        localizacaoEstoqueImportsCellRenderer1.setText("localizacaoEstoqueImportsCellRenderer1");

        masterScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        masterTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        masterTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        masterTable.getTableHeader().setResizingAllowed(false);
        masterTable.getTableHeader().setReorderingAllowed(false);

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, list, masterTable);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${estoque1}"));
        columnBinding.setColumnName("NOME ESTOQUE");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${estoque2}"));
        columnBinding.setColumnName("TIPO ESTOQUE");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${estoquef}"));
        columnBinding.setColumnName("DETALHE");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${sala}"));
        columnBinding.setColumnName("SALA");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${localizacao}"));
        columnBinding.setColumnName("LOCALIZAÇÃO");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${laboratorio}"));
        columnBinding.setColumnName("Laboratorio");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${idLab}"));
        columnBinding.setColumnName("Id Lab");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${idLocal}"));
        columnBinding.setColumnName("Id Local");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${idCadest}"));
        columnBinding.setColumnName("ID");
        columnBinding.setColumnClass(Integer.class);
        columnBinding.setEditable(false);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        masterTable.addMouseListener(formListener);
        masterScrollPane.setViewportView(masterTable);
        if (masterTable.getColumnModel().getColumnCount() > 0) {
            masterTable.getColumnModel().getColumn(0).setResizable(false);
            masterTable.getColumnModel().getColumn(0).setPreferredWidth(310);
            masterTable.getColumnModel().getColumn(1).setResizable(false);
            masterTable.getColumnModel().getColumn(1).setPreferredWidth(155);
            masterTable.getColumnModel().getColumn(2).setResizable(false);
            masterTable.getColumnModel().getColumn(2).setPreferredWidth(150);
            masterTable.getColumnModel().getColumn(3).setResizable(false);
            masterTable.getColumnModel().getColumn(4).setResizable(false);
            masterTable.getColumnModel().getColumn(4).setPreferredWidth(100);
            masterTable.getColumnModel().getColumn(5).setResizable(false);
            masterTable.getColumnModel().getColumn(6).setResizable(false);
            masterTable.getColumnModel().getColumn(7).setResizable(false);
            masterTable.getColumnModel().getColumn(8).setResizable(false);
            masterTable.getColumnModel().getColumn(8).setPreferredWidth(60);
        }

        jPanel1.setLayout(new java.awt.GridBagLayout());

        jToolBar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);

        refreshButton.setBackground(new java.awt.Color(102, 102, 102));
        refreshButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        refreshButton.setForeground(new java.awt.Color(255, 255, 255));
        refreshButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sislab/images/atualizar.png"))); // NOI18N
        refreshButton.setText("Atualizar");
        refreshButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        refreshButton.setMaximumSize(new java.awt.Dimension(100, 50));
        refreshButton.setMinimumSize(new java.awt.Dimension(100, 50));
        refreshButton.setPreferredSize(new java.awt.Dimension(100, 50));
        refreshButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        refreshButton.addActionListener(formListener);
        jToolBar1.add(refreshButton);

        jButton2.setBackground(new java.awt.Color(102, 102, 102));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sislab/images/agt22_1.png"))); // NOI18N
        jButton2.setText("Importar");
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setMaximumSize(new java.awt.Dimension(100, 50));
        jButton2.setMinimumSize(new java.awt.Dimension(100, 50));
        jButton2.setPreferredSize(new java.awt.Dimension(100, 50));
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(formListener);
        jToolBar1.add(jButton2);

        jButton6.setBackground(new java.awt.Color(102, 102, 102));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sislab/images/zoom-3.png"))); // NOI18N
        jButton6.setText("Pesquisar");
        jButton6.setFocusable(false);
        jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton6.setMaximumSize(new java.awt.Dimension(100, 50));
        jButton6.setMinimumSize(new java.awt.Dimension(100, 50));
        jButton6.setPreferredSize(new java.awt.Dimension(100, 50));
        jButton6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton6.addActionListener(formListener);
        jToolBar1.add(jButton6);

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jToolBar1.add(jPanel2);

        jButton1.setBackground(new java.awt.Color(102, 102, 102));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sislab/images/sair.png"))); // NOI18N
        jButton1.setText("Sair");
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setMaximumSize(new java.awt.Dimension(100, 50));
        jButton1.setMinimumSize(new java.awt.Dimension(100, 50));
        jButton1.setPreferredSize(new java.awt.Dimension(100, 50));
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(masterScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 788, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(masterScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE))
        );

        bindingGroup.bind();
    }

    // Code for dispatching events from components to event handlers.

    private class FormListener implements java.awt.event.ActionListener, java.awt.event.MouseListener {
        FormListener() {}
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            if (evt.getSource() == refreshButton) {
                EstoqueImportsView.this.refreshButtonActionPerformed(evt);
            }
            else if (evt.getSource() == jButton2) {
                EstoqueImportsView.this.jButton2ActionPerformed(evt);
            }
            else if (evt.getSource() == jButton1) {
                EstoqueImportsView.this.jButton1ActionPerformed(evt);
            }
            else if (evt.getSource() == jButton4) {
                EstoqueImportsView.this.jButton4ActionPerformed(evt);
            }
            else if (evt.getSource() == jButton6) {
                EstoqueImportsView.this.jButton6ActionPerformed(evt);
            }
            else if (evt.getSource() == jButton5) {
                EstoqueImportsView.this.jButton5ActionPerformed(evt);
            }
            else if (evt.getSource() == jComboBox1) {
                EstoqueImportsView.this.jComboBox1ActionPerformed(evt);
            }
        }

        public void mouseClicked(java.awt.event.MouseEvent evt) {
            if (evt.getSource() == masterTable) {
                EstoqueImportsView.this.masterTableMouseClicked(evt);
            }
        }

        public void mouseEntered(java.awt.event.MouseEvent evt) {
        }

        public void mouseExited(java.awt.event.MouseEvent evt) {
        }

        public void mousePressed(java.awt.event.MouseEvent evt) {
        }

        public void mouseReleased(java.awt.event.MouseEvent evt) {
        }
    }// </editor-fold>//GEN-END:initComponents

    
    @SuppressWarnings("unchecked")
    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed

        query = entityManager.createNamedQuery("CadEstoque.findByIdLab");
                              query.setParameter("idLab", cont.getCadLaboratorio().getIdLab().toString());
                             // query.setParameter("idLocal",fil1);
                              java.util.Collection dadosResposta1 = query.getResultList();
                              list.clear();
                              list.addAll(dadosResposta1);  
        entityManager.getTransaction().rollback();
        entityManager.getTransaction().begin();
        java.util.Collection data = query.getResultList();
        for (Object entity : data) {
            entityManager.refresh(entity);
        }
        list.clear();
        list.addAll(data);
    }//GEN-LAST:event_refreshButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    frameEstoqueImportsView.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void masterTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_masterTableMouseClicked
        CadastroReagentesView.crw.setJtf_IdEstoque((Integer)masterTable.getValueAt(masterTable.getSelectedRow(), 8));
        CadastroReagentesView.crw.setJtf_nomeEstoque((String)masterTable.getValueAt(masterTable.getSelectedRow(), 0));
        CadastroReagentesView.crw.setJtf_tipoEstoque((String)masterTable.getValueAt(masterTable.getSelectedRow(), 1));
        CadastroReagentesView.crw.setJtf_estoqueDetalhe((String)masterTable.getValueAt(masterTable.getSelectedRow(), 2));
        CadastroReagentesView.crw.setJtf_sala((String)masterTable.getValueAt(masterTable.getSelectedRow(), 3));
        CadastroReagentesView.crw.setJtf_localizacaoEstoque((String)masterTable.getValueAt(masterTable.getSelectedRow(), 4));
        CadastroReagentesView.crw.setJtf_lab((String)masterTable.getValueAt(masterTable.getSelectedRow(), 5));
        CadastroReagentesView.crw.setJtf_idLab((String)masterTable.getValueAt(masterTable.getSelectedRow(), 6));
        CadastroReagentesView.crw.setJtf_id_localizacao((String)masterTable.getValueAt(masterTable.getSelectedRow(), 7));
        frameEstoqueImportsView.dispose();
    }//GEN-LAST:event_masterTableMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        frameEstoqueImportsView.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jTextField2.setText("");
        query = entityManager.createNamedQuery("CadEstoque.findByIdLab");
                              query.setParameter("idLab", cont.getCadLaboratorio().getIdLab().toString());
                             // query.setParameter("idLocal",fil1);
                              java.util.Collection dadosResposta1 = query.getResultList();
                              list.clear();
                              list.addAll(dadosResposta1);  
        entityManager.getTransaction().rollback();
        entityManager.getTransaction().begin();
        java.util.Collection data = query.getResultList();
        for (Object entity : data) {
            entityManager.refresh(entity);
        }
        list.clear();
        list.addAll(data);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
    callPesquisar();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
JF_pesquisarEstoque.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
    pesquisarJPA();
    }//GEN-LAST:event_jComboBox1ActionPerformed
    
    
       public void callPesquisar()      
    {   
        JF_pesquisarEstoque.setSize(470, 126);//[]
        JF_pesquisarEstoque.setLocationRelativeTo(null);
        JF_pesquisarEstoque.pack();
        JF_pesquisarEstoque.setResizable(false);
        JF_pesquisarEstoque.setVisible(true);
       
    }
       
       
                       public void  pesquisarJPA(){
                             String filtro = String.valueOf(jComboBox1.getSelectedItem());
                             System.out.println("filtro: "+filtro);
                             int tmt = filtro.length();
                             System.out.println(String.valueOf("tmt: "+tmt));
                             String filtrado = filtro.substring((tmt-3), tmt);
                             System.out.println("filtrado: "+filtrado);
                             int tmt1 = filtrado.length();
                             System.out.println(String.valueOf("tmt1: "+tmt1));
                             String fil1 = filtrado.substring(0, (tmt1-1));
                             System.out.println(fil1);
                              query = entityManager.createNamedQuery("CadEstoque.BuscaLocalizacao");
                              query.setParameter("idLab", cont.getCadLaboratorio().getIdLab().toString());
                              query.setParameter("idLocal",fil1);
                              java.util.Collection dadosResposta1 = query.getResultList();
                              list.clear();
                              list.addAll(dadosResposta1);      
                            } 
                       
                
                       


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame JF_pesquisarEstoque;
    private java.util.List<sislab.proteomica.beans.CadLocalizacao> cadLocalizacaoList;
    private javax.persistence.Query cadLocalizacaoQuery;
    private sislab.proteomica.engine.ConverterBusca converterBusca1;
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JToolBar jToolBar2;
    private java.util.List<sislab.proteomica.view.estoque.CadEstoque> list;
    private sislab.proteomica.importsview.LocalizacaoEstoqueImportsCellRenderer localizacaoEstoqueImportsCellRenderer1;
    private javax.swing.JScrollPane masterScrollPane;
    private javax.swing.JTable masterTable;
    private javax.persistence.Query query;
    private javax.swing.JButton refreshButton;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                if(frameEstoqueImportsView == null) 
                frameEstoqueImportsView = new JFrame();
                frameEstoqueImportsView.setContentPane(new EstoqueImportsView());
                frameEstoqueImportsView.setSize(788, 400);//[][][][][788, 400]
                frameEstoqueImportsView.setResizable(false);
                frameEstoqueImportsView.setLocationRelativeTo(null);
                frameEstoqueImportsView.pack();
                frameEstoqueImportsView.setVisible(true);
                frameEstoqueImportsView.setTitle(args[0]);
            }
        });
    }
    
}
