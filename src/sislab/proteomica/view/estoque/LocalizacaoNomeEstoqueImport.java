/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sislab.proteomica.view.estoque;

import java.awt.EventQueue;
import java.beans.Beans;
import javax.swing.JFrame;
import javax.swing.JPanel;
import sislab.proteomica.engine.Container;

/**
 *
 * @author NILDO
 */
public class LocalizacaoNomeEstoqueImport extends JPanel {
     private static JFrame frameLocalizacaoNomeEstoqueImport;
      Container cont = new Container();
    public LocalizacaoNomeEstoqueImport() {
        initComponents();
        if (!Beans.isDesignTime()) {
            entityManager.getTransaction().begin();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("fenyx?zeroDateTimeBehavior=convertToNullPU").createEntityManager();
        query = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT c FROM CadLocalizacao c WHERE c.idLab ="+cont.getCadLaboratorio().getIdLab().toString());
        list = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(query.getResultList());
        jButton4 = new javax.swing.JButton();
        masterScrollPane = new javax.swing.JScrollPane();
        masterTable = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        FormListener formListener = new FormListener();

        jButton4.setText("jButton4");

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
        columnBinding.setColumnName("ID LAB");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${laboratorio}"));
        columnBinding.setColumnName("Laboratorio");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        masterTable.addMouseListener(formListener);
        masterScrollPane.setViewportView(masterTable);
        if (masterTable.getColumnModel().getColumnCount() > 0) {
            masterTable.getColumnModel().getColumn(0).setResizable(false);
            masterTable.getColumnModel().getColumn(0).setPreferredWidth(60);
            masterTable.getColumnModel().getColumn(1).setResizable(false);
            masterTable.getColumnModel().getColumn(1).setPreferredWidth(400);
            masterTable.getColumnModel().getColumn(2).setResizable(false);
            masterTable.getColumnModel().getColumn(2).setPreferredWidth(123);
            masterTable.getColumnModel().getColumn(3).setResizable(false);
            masterTable.getColumnModel().getColumn(4).setResizable(false);
            masterTable.getColumnModel().getColumn(5).setResizable(false);
            masterTable.getColumnModel().getColumn(6).setResizable(false);
        }

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton3.setText("Importar");
        jButton3.addActionListener(formListener);

        jButton5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton5.setText("Atualizar");
        jButton5.addActionListener(formListener);

        jButton6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton6.setText("Cancelar");
        jButton6.addActionListener(formListener);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(282, Short.MAX_VALUE)
                .addComponent(jButton6)
                .addGap(18, 18, 18)
                .addComponent(jButton5)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addContainerGap())
            .addComponent(masterScrollPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(masterScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton5)
                    .addComponent(jButton6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bindingGroup.bind();
    }

    // Code for dispatching events from components to event handlers.

    private class FormListener implements java.awt.event.ActionListener, java.awt.event.MouseListener {
        FormListener() {}
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            if (evt.getSource() == jButton3) {
                LocalizacaoNomeEstoqueImport.this.jButton3ActionPerformed(evt);
            }
            else if (evt.getSource() == jButton5) {
                LocalizacaoNomeEstoqueImport.this.jButton5ActionPerformed(evt);
            }
            else if (evt.getSource() == jButton6) {
                LocalizacaoNomeEstoqueImport.this.jButton6ActionPerformed(evt);
            }
        }

        public void mouseClicked(java.awt.event.MouseEvent evt) {
            if (evt.getSource() == masterTable) {
                LocalizacaoNomeEstoqueImport.this.masterTableMouseClicked(evt);
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

    
    private void masterTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_masterTableMouseClicked
    NomeEstoqueView.nest.setJtf_idLocalizacao((Integer)masterTable.getValueAt(masterTable.getSelectedRow(), 0));
    NomeEstoqueView.nest.setJtf_localizacao((String)masterTable.getValueAt(masterTable.getSelectedRow(), 1));
    NomeEstoqueView.nest.setJtf_sala((String)masterTable.getValueAt(masterTable.getSelectedRow(), 2));
    NomeEstoqueView.nest.setJtf_laboratorio((String)masterTable.getValueAt(masterTable.getSelectedRow(), 6));
    NomeEstoqueView.nest.setJtf_idLab((String)masterTable.getValueAt(masterTable.getSelectedRow(), 5));

    frameLocalizacaoNomeEstoqueImport.dispose();   
    }//GEN-LAST:event_masterTableMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
NomeEstoqueView.nest.setJtf_idLocalizacao((Integer)masterTable.getValueAt(masterTable.getSelectedRow(), 0));
    NomeEstoqueView.nest.setJtf_localizacao((String)masterTable.getValueAt(masterTable.getSelectedRow(), 1));
    NomeEstoqueView.nest.setJtf_sala((String)masterTable.getValueAt(masterTable.getSelectedRow(), 2));
    NomeEstoqueView.nest.setJtf_laboratorio((String)masterTable.getValueAt(masterTable.getSelectedRow(), 6));
    NomeEstoqueView.nest.setJtf_idLab((String)masterTable.getValueAt(masterTable.getSelectedRow(), 5));
    frameLocalizacaoNomeEstoqueImport.dispose();   
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
frameLocalizacaoNomeEstoqueImport.dispose();  
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        entityManager.getTransaction().rollback();
        entityManager.getTransaction().begin();
        java.util.Collection data = query.getResultList();
        for (Object entity : data) {
            entityManager.refresh(entity);
        }
        list.clear();
        list.addAll(data);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private java.util.List<sislab.proteomica.beans.CadLocalizacao> list;
    private javax.swing.JScrollPane masterScrollPane;
    private javax.swing.JTable masterTable;
    private javax.persistence.Query query;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                 if(frameLocalizacaoNomeEstoqueImport == null)
                   frameLocalizacaoNomeEstoqueImport = new JFrame();
                frameLocalizacaoNomeEstoqueImport.setContentPane(new LocalizacaoNomeEstoqueImport());
                frameLocalizacaoNomeEstoqueImport.setSize(583, 360);
                frameLocalizacaoNomeEstoqueImport.setResizable(false);
                frameLocalizacaoNomeEstoqueImport.setLocationRelativeTo(null);
                frameLocalizacaoNomeEstoqueImport.pack();
                frameLocalizacaoNomeEstoqueImport.setVisible(true);
                frameLocalizacaoNomeEstoqueImport.setTitle(args[0]);
            }
        });
    }
    
}
