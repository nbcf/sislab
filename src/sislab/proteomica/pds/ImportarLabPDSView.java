/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sislab.proteomica.pds;

import java.awt.EventQueue;
import java.beans.Beans;
import javax.swing.JFrame;
import javax.swing.JPanel;
import sislab.proteomica.engine.Container;

/**
 *
 * @author NILDO
 */
public class ImportarLabPDSView extends JPanel {
        private static JFrame frameImportarLabPDSView;
        Container cont = new Container();
        
        
    public ImportarLabPDSView() {
        initComponents();
        if (!Beans.isDesignTime()) {
            entityManager.getTransaction().begin();
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("fenyx?zeroDateTimeBehavior=convertToNullPU").createEntityManager();
        query = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT p FROM Pds p WHERE p.idLab ="+cont.getCadLaboratorio().getIdLab().toString());
        list = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(query.getResultList());
        masterScrollPane = new javax.swing.JScrollPane();
        masterTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        refreshButton = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        FormListener formListener = new FormListener();

        masterScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        masterTable.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        masterTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        masterTable.setRowHeight(18);
        masterTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        masterTable.getTableHeader().setResizingAllowed(false);
        masterTable.getTableHeader().setReorderingAllowed(false);

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, list, masterTable);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${idPds}"));
        columnBinding.setColumnName("ID");
        columnBinding.setColumnClass(Integer.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${nomePds}"));
        columnBinding.setColumnName("LABORATÓRIO");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${deptoPds}"));
        columnBinding.setColumnName("DEPARTAMENTO");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${localizacaoPds}"));
        columnBinding.setColumnName("LOCALIZAÇÃO");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${salaPds}"));
        columnBinding.setColumnName("SALA");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${responsavelPds}"));
        columnBinding.setColumnName("RESPONSÁVEL");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${tel1Pds}"));
        columnBinding.setColumnName("TEL");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${idLab}"));
        columnBinding.setColumnName("ID_LAB");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        masterTable.addMouseListener(formListener);
        masterScrollPane.setViewportView(masterTable);
        if (masterTable.getColumnModel().getColumnCount() > 0) {
            masterTable.getColumnModel().getColumn(0).setResizable(false);
            masterTable.getColumnModel().getColumn(1).setResizable(false);
            masterTable.getColumnModel().getColumn(1).setPreferredWidth(180);
            masterTable.getColumnModel().getColumn(2).setResizable(false);
            masterTable.getColumnModel().getColumn(2).setPreferredWidth(100);
            masterTable.getColumnModel().getColumn(3).setResizable(false);
            masterTable.getColumnModel().getColumn(3).setPreferredWidth(100);
            masterTable.getColumnModel().getColumn(4).setResizable(false);
            masterTable.getColumnModel().getColumn(4).setPreferredWidth(100);
            masterTable.getColumnModel().getColumn(5).setResizable(false);
            masterTable.getColumnModel().getColumn(5).setPreferredWidth(150);
            masterTable.getColumnModel().getColumn(6).setResizable(false);
            masterTable.getColumnModel().getColumn(7).setResizable(false);
        }

        jPanel1.setLayout(new java.awt.GridBagLayout());

        jToolBar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);

        refreshButton.setBackground(new java.awt.Color(51, 51, 51));
        refreshButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        refreshButton.setForeground(new java.awt.Color(255, 255, 255));
        refreshButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sislab/images/atualizar.png"))); // NOI18N
        refreshButton.setText("Atualizar");
        refreshButton.setFocusable(false);
        refreshButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        refreshButton.setMaximumSize(new java.awt.Dimension(100, 50));
        refreshButton.setMinimumSize(new java.awt.Dimension(100, 50));
        refreshButton.setPreferredSize(new java.awt.Dimension(100, 50));
        refreshButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        refreshButton.addActionListener(formListener);
        jToolBar1.add(refreshButton);

        jButton2.setBackground(new java.awt.Color(51, 51, 51));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sislab/images/agt22_1.png"))); // NOI18N
        jButton2.setText("Importar - F7");
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setMaximumSize(new java.awt.Dimension(100, 50));
        jButton2.setMinimumSize(new java.awt.Dimension(100, 50));
        jButton2.setPreferredSize(new java.awt.Dimension(100, 50));
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(formListener);
        jToolBar1.add(jButton2);

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jToolBar1.add(jPanel2);

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(masterScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 782, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(masterScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE))
        );

        bindingGroup.bind();
    }

    // Code for dispatching events from components to event handlers.

    private class FormListener implements java.awt.event.ActionListener, java.awt.event.MouseListener {
        FormListener() {}
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            if (evt.getSource() == refreshButton) {
                ImportarLabPDSView.this.refreshButtonActionPerformed(evt);
            }
            else if (evt.getSource() == jButton2) {
                ImportarLabPDSView.this.jButton2ActionPerformed(evt);
            }
        }

        public void mouseClicked(java.awt.event.MouseEvent evt) {
            if (evt.getSource() == masterTable) {
                ImportarLabPDSView.this.masterTableMouseClicked(evt);
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
        entityManager.getTransaction().rollback();
        entityManager.getTransaction().begin();
        java.util.Collection data = query.getResultList();
        for (Object entity : data) {
            entityManager.refresh(entity);
        }
        list.clear();
        list.addAll(data);
    }//GEN-LAST:event_refreshButtonActionPerformed

    private void masterTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_masterTableMouseClicked
 CadastroContatoPDSView.ccpds.setJtf_idpds((Integer)masterTable.getValueAt(masterTable.getSelectedRow(), 0));
 CadastroContatoPDSView.ccpds.setJtf_labpds((String)masterTable.getValueAt(masterTable.getSelectedRow(), 1));
 CadastroContatoPDSView.ccpds.setJtf_deptopds((String)masterTable.getValueAt(masterTable.getSelectedRow(), 2));
 CadastroContatoPDSView.ccpds.setJtf_localpds((String)masterTable.getValueAt(masterTable.getSelectedRow(), 3));
 CadastroContatoPDSView.ccpds.setJtf_responsavelLab((String)masterTable.getValueAt(masterTable.getSelectedRow(), 5));
 CadastroContatoPDSView.ccpds.setJtf_salapds((String)masterTable.getValueAt(masterTable.getSelectedRow(), 4));
 CadastroContatoPDSView.ccpds.setJtf_ramalpds((String)masterTable.getValueAt(masterTable.getSelectedRow(), 6));
  CadastroContatoPDSView.ccpds.setJtf_idLab((String)masterTable.getValueAt(masterTable.getSelectedRow(), 7));
frameImportarLabPDSView.dispose(); 
    }//GEN-LAST:event_masterTableMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
CadastroContatoPDSView.ccpds.setJtf_idpds((Integer)masterTable.getValueAt(masterTable.getSelectedRow(), 0));
 CadastroContatoPDSView.ccpds.setJtf_labpds((String)masterTable.getValueAt(masterTable.getSelectedRow(), 1));
 CadastroContatoPDSView.ccpds.setJtf_deptopds((String)masterTable.getValueAt(masterTable.getSelectedRow(), 2));
 CadastroContatoPDSView.ccpds.setJtf_localpds((String)masterTable.getValueAt(masterTable.getSelectedRow(), 3));
 CadastroContatoPDSView.ccpds.setJtf_responsavelLab((String)masterTable.getValueAt(masterTable.getSelectedRow(), 5));
 CadastroContatoPDSView.ccpds.setJtf_salapds((String)masterTable.getValueAt(masterTable.getSelectedRow(), 4));
 CadastroContatoPDSView.ccpds.setJtf_ramalpds((String)masterTable.getValueAt(masterTable.getSelectedRow(), 6));
  CadastroContatoPDSView.ccpds.setJtf_idLab((String)masterTable.getValueAt(masterTable.getSelectedRow(), 7));
frameImportarLabPDSView.dispose(); 
    }//GEN-LAST:event_jButton2ActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JToolBar jToolBar1;
    private java.util.List<sislab.proteomica.pds.Pds> list;
    private javax.swing.JScrollPane masterScrollPane;
    private javax.swing.JTable masterTable;
    private javax.persistence.Query query;
    private javax.swing.JButton refreshButton;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
    public static void main(String[] args) {

        
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                frameImportarLabPDSView = new JFrame();
                frameImportarLabPDSView.setContentPane(new ImportarLabPDSView());
                frameImportarLabPDSView.setSize(782, 445);//[]
                frameImportarLabPDSView.setResizable(false);
                frameImportarLabPDSView.setLocationRelativeTo(null);
                frameImportarLabPDSView.pack();
                frameImportarLabPDSView.setVisible(true);
                frameImportarLabPDSView.setTitle(args[0]); 
            }
        });
    }
    
}
