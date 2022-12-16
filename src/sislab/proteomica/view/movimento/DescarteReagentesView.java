/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sislab.proteomica.view.movimento;

import java.awt.AWTEvent;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.beans.Beans;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.persistence.RollbackException;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.KeyStroke;
import sislab.proteomica.engine.Container;

/**
 *
 * @author NILDO
 */
public class DescarteReagentesView extends JPanel {
      private static JFrame frameDescarteReagentesView;
           Container cont = new Container();
    public DescarteReagentesView() {
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
        query = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT c FROM sislab.proteomica.view.lotesNotas.CadLotes c WHERE c.flagReagenteMat = 'Reagente'"+" AND c.idLaboratorio="+cont.getCadLaboratorio().getIdLab().toString());
        list = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(query.getResultList());
        cadLocalizacaoQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT c FROM CadLocalizacao c WHERE c.idLab="+cont.getCadLaboratorio().getIdLab().toString());
        cadLocalizacaoList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : cadLocalizacaoQuery.getResultList();
        descarteReagenteEstoqueCellRenderer1 = new sislab.proteomica.view.movimento.DescarteReagenteEstoqueCellRenderer();
        JF_ALTERAR_ESTATUS = new javax.swing.JFrame();
        jLabel2 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton5 = new javax.swing.JButton();
        JF_ALTERAR_DISPONIBILIDADE = new javax.swing.JFrame();
        jLabel3 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jButton7 = new javax.swing.JButton();
        masterScrollPane = new javax.swing.JScrollPane();
        masterTable = new javax.swing.JTable();
        detailScrollPane = new javax.swing.JScrollPane();
        detailTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        deleteButton = new javax.swing.JButton();
        refreshButton = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton4 = new javax.swing.JButton();

        FormListener formListener = new FormListener();

        descarteReagenteEstoqueCellRenderer1.setText("descarteReagenteEstoqueCellRenderer1");

        jLabel2.setText("ESTATUS");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "FECHADO", "ABERTO", "ABERTO FINAL" }));

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, detailTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.statusReagenteUnd}"), jComboBox2, org.jdesktop.beansbinding.BeanProperty.create("selectedItem"));
        bindingGroup.addBinding(binding);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sislab/images/button_ok.png"))); // NOI18N
        jButton5.setText("Confirmar Estatus");
        jButton5.addActionListener(formListener);

        javax.swing.GroupLayout JF_ALTERAR_ESTATUSLayout = new javax.swing.GroupLayout(JF_ALTERAR_ESTATUS.getContentPane());
        JF_ALTERAR_ESTATUS.getContentPane().setLayout(JF_ALTERAR_ESTATUSLayout);
        JF_ALTERAR_ESTATUSLayout.setHorizontalGroup(
            JF_ALTERAR_ESTATUSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JF_ALTERAR_ESTATUSLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JF_ALTERAR_ESTATUSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JF_ALTERAR_ESTATUSLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox2, 0, 280, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JF_ALTERAR_ESTATUSLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton5)))
                .addContainerGap())
        );
        JF_ALTERAR_ESTATUSLayout.setVerticalGroup(
            JF_ALTERAR_ESTATUSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JF_ALTERAR_ESTATUSLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JF_ALTERAR_ESTATUSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(jButton5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setText("Disponibilidade:");

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ATIVO", "INDISPONIVEL" }));

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, detailTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.statusReagente}"), jComboBox3, org.jdesktop.beansbinding.BeanProperty.create("selectedItem"));
        bindingGroup.addBinding(binding);

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sislab/images/button_ok.png"))); // NOI18N
        jButton7.setText("Confirmar Alteração de Disponibilidade");
        jButton7.addActionListener(formListener);

        javax.swing.GroupLayout JF_ALTERAR_DISPONIBILIDADELayout = new javax.swing.GroupLayout(JF_ALTERAR_DISPONIBILIDADE.getContentPane());
        JF_ALTERAR_DISPONIBILIDADE.getContentPane().setLayout(JF_ALTERAR_DISPONIBILIDADELayout);
        JF_ALTERAR_DISPONIBILIDADELayout.setHorizontalGroup(
            JF_ALTERAR_DISPONIBILIDADELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JF_ALTERAR_DISPONIBILIDADELayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JF_ALTERAR_DISPONIBILIDADELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JF_ALTERAR_DISPONIBILIDADELayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JF_ALTERAR_DISPONIBILIDADELayout.createSequentialGroup()
                        .addGap(0, 105, Short.MAX_VALUE)
                        .addComponent(jButton7)))
                .addContainerGap())
        );
        JF_ALTERAR_DISPONIBILIDADELayout.setVerticalGroup(
            JF_ALTERAR_DISPONIBILIDADELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JF_ALTERAR_DISPONIBILIDADELayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JF_ALTERAR_DISPONIBILIDADELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addComponent(jButton7)
                .addContainerGap())
        );

        masterScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        masterTable.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        masterTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        masterTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        masterTable.getTableHeader().setReorderingAllowed(false);

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, list, masterTable);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${reagente}"));
        columnBinding.setColumnName("REAGENTE");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${concentracao}"));
        columnBinding.setColumnName("CONC.");
        columnBinding.setColumnClass(Double.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${tipoReagente}"));
        columnBinding.setColumnName("TIPO RG.");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${tipoUnd}"));
        columnBinding.setColumnName("TIPO UND.");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${quantUnd}"));
        columnBinding.setColumnName("UND.");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${numeroNota}"));
        columnBinding.setColumnName("NOTA");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${lote}"));
        columnBinding.setColumnName("LOTE");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${quantCompra}"));
        columnBinding.setColumnName("QUANT.");
        columnBinding.setColumnClass(Integer.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${validadeLote}"));
        columnBinding.setColumnName("VALIDADE");
        columnBinding.setColumnClass(java.util.Date.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${codPlanilha}"));
        columnBinding.setColumnName("COD. COMPRA");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${dataNota}"));
        columnBinding.setColumnName("EMISSÃO");
        columnBinding.setColumnClass(java.util.Date.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${dataCompra}"));
        columnBinding.setColumnName("DATA COMPRA");
        columnBinding.setColumnClass(java.util.Date.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${estf}"));
        columnBinding.setColumnName("Estf");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${est2}"));
        columnBinding.setColumnName("Est2");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${est1}"));
        columnBinding.setColumnName("Est1");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${statusLote}"));
        columnBinding.setColumnName("Status Lote");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${idCadLotes}"));
        columnBinding.setColumnName("Id Cad Lotes");
        columnBinding.setColumnClass(Integer.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${fornecedor}"));
        columnBinding.setColumnName("FORNECEDOR");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${laboratorio}"));
        columnBinding.setColumnName("Laboratorio");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${fabricante}"));
        columnBinding.setColumnName("Fabricante");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${tipoMovimento}"));
        columnBinding.setColumnName("Tipo Movimento");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${serieNota}"));
        columnBinding.setColumnName("Serie Nota");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${dataCadastro}"));
        columnBinding.setColumnName("Data Cadastro");
        columnBinding.setColumnClass(java.util.Date.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${serieLote}"));
        columnBinding.setColumnName("Serie Lote");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${localizacao}"));
        columnBinding.setColumnName("Localizacao");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${usuario}"));
        columnBinding.setColumnName("Usuario");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${idUsuario}"));
        columnBinding.setColumnName("Id Usuario");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${idForcedor}"));
        columnBinding.setColumnName("Id Forcedor");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${idLaboratorio}"));
        columnBinding.setColumnName("Id Laboratorio");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${idReagente}"));
        columnBinding.setColumnName("Id Reagente");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${flagNota}"));
        columnBinding.setColumnName("Flag Nota");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${flagLote}"));
        columnBinding.setColumnName("Flag Lote");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${statusNota}"));
        columnBinding.setColumnName("Status Nota");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${incompat}"));
        columnBinding.setColumnName("Incompat");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${flagFracionado}"));
        columnBinding.setColumnName("Flag Fracionado");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${flagReagente}"));
        columnBinding.setColumnName("Flag Reagente");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${statusReagente}"));
        columnBinding.setColumnName("Status Reagente");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${sala}"));
        columnBinding.setColumnName("Sala");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${idEstoque}"));
        columnBinding.setColumnName("Id Estoque");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${idFabricante}"));
        columnBinding.setColumnName("Id Fabricante");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${siteFabricante}"));
        columnBinding.setColumnName("Site Fabricante");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${telFabricante}"));
        columnBinding.setColumnName("Tel Fabricante");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${codQreagente}"));
        columnBinding.setColumnName("Cod Qreagente");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${idLocal}"));
        columnBinding.setColumnName("Id Local");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${caraterReagente}"));
        columnBinding.setColumnName("Carater Reagente");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${flagReagenteMat}"));
        columnBinding.setColumnName("Flag Reagente Mat");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${flagToxico}"));
        columnBinding.setColumnName("Flag Toxico");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${lperc}"));
        columnBinding.setColumnName("Lperc");
        columnBinding.setColumnClass(Double.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${tempCondi}"));
        columnBinding.setColumnName("Temp Condi");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${valorCompra}"));
        columnBinding.setColumnName("Valor Compra");
        columnBinding.setColumnClass(Double.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${valorFinalUnd}"));
        columnBinding.setColumnName("Valor Final Und");
        columnBinding.setColumnClass(Double.class);
        columnBinding.setEditable(false);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        masterScrollPane.setViewportView(masterTable);
        if (masterTable.getColumnModel().getColumnCount() > 0) {
            masterTable.getColumnModel().getColumn(0).setResizable(false);
            masterTable.getColumnModel().getColumn(0).setPreferredWidth(140);
            masterTable.getColumnModel().getColumn(1).setResizable(false);
            masterTable.getColumnModel().getColumn(1).setPreferredWidth(50);
            masterTable.getColumnModel().getColumn(2).setResizable(false);
            masterTable.getColumnModel().getColumn(2).setPreferredWidth(80);
            masterTable.getColumnModel().getColumn(3).setResizable(false);
            masterTable.getColumnModel().getColumn(3).setPreferredWidth(80);
            masterTable.getColumnModel().getColumn(4).setResizable(false);
            masterTable.getColumnModel().getColumn(4).setPreferredWidth(50);
            masterTable.getColumnModel().getColumn(5).setResizable(false);
            masterTable.getColumnModel().getColumn(5).setPreferredWidth(100);
            masterTable.getColumnModel().getColumn(6).setResizable(false);
            masterTable.getColumnModel().getColumn(6).setPreferredWidth(100);
            masterTable.getColumnModel().getColumn(7).setResizable(false);
            masterTable.getColumnModel().getColumn(7).setPreferredWidth(80);
            masterTable.getColumnModel().getColumn(8).setResizable(false);
            masterTable.getColumnModel().getColumn(8).setPreferredWidth(80);
            masterTable.getColumnModel().getColumn(9).setResizable(false);
            masterTable.getColumnModel().getColumn(9).setPreferredWidth(100);
            masterTable.getColumnModel().getColumn(10).setResizable(false);
            masterTable.getColumnModel().getColumn(10).setPreferredWidth(80);
            masterTable.getColumnModel().getColumn(11).setResizable(false);
            masterTable.getColumnModel().getColumn(11).setPreferredWidth(100);
            masterTable.getColumnModel().getColumn(12).setResizable(false);
            masterTable.getColumnModel().getColumn(13).setResizable(false);
            masterTable.getColumnModel().getColumn(14).setResizable(false);
            masterTable.getColumnModel().getColumn(15).setResizable(false);
            masterTable.getColumnModel().getColumn(16).setResizable(false);
            masterTable.getColumnModel().getColumn(17).setResizable(false);
            masterTable.getColumnModel().getColumn(17).setPreferredWidth(150);
            masterTable.getColumnModel().getColumn(18).setResizable(false);
            masterTable.getColumnModel().getColumn(19).setResizable(false);
            masterTable.getColumnModel().getColumn(20).setResizable(false);
            masterTable.getColumnModel().getColumn(21).setResizable(false);
            masterTable.getColumnModel().getColumn(22).setResizable(false);
            masterTable.getColumnModel().getColumn(23).setResizable(false);
            masterTable.getColumnModel().getColumn(24).setResizable(false);
            masterTable.getColumnModel().getColumn(25).setResizable(false);
            masterTable.getColumnModel().getColumn(26).setResizable(false);
            masterTable.getColumnModel().getColumn(27).setResizable(false);
            masterTable.getColumnModel().getColumn(28).setResizable(false);
            masterTable.getColumnModel().getColumn(29).setResizable(false);
            masterTable.getColumnModel().getColumn(30).setResizable(false);
            masterTable.getColumnModel().getColumn(31).setResizable(false);
            masterTable.getColumnModel().getColumn(32).setResizable(false);
            masterTable.getColumnModel().getColumn(33).setResizable(false);
            masterTable.getColumnModel().getColumn(34).setResizable(false);
            masterTable.getColumnModel().getColumn(35).setResizable(false);
            masterTable.getColumnModel().getColumn(36).setResizable(false);
            masterTable.getColumnModel().getColumn(37).setResizable(false);
            masterTable.getColumnModel().getColumn(38).setResizable(false);
            masterTable.getColumnModel().getColumn(39).setResizable(false);
            masterTable.getColumnModel().getColumn(40).setResizable(false);
            masterTable.getColumnModel().getColumn(41).setResizable(false);
            masterTable.getColumnModel().getColumn(42).setResizable(false);
            masterTable.getColumnModel().getColumn(43).setResizable(false);
            masterTable.getColumnModel().getColumn(44).setResizable(false);
            masterTable.getColumnModel().getColumn(45).setResizable(false);
            masterTable.getColumnModel().getColumn(46).setResizable(false);
            masterTable.getColumnModel().getColumn(47).setResizable(false);
            masterTable.getColumnModel().getColumn(48).setResizable(false);
            masterTable.getColumnModel().getColumn(49).setResizable(false);
            masterTable.getColumnModel().getColumn(50).setResizable(false);
        }

        detailScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        detailTable.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        detailTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        detailTable.setRowHeight(18);
        detailTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        detailTable.getTableHeader().setResizingAllowed(false);
        detailTable.getTableHeader().setReorderingAllowed(false);

        org.jdesktop.beansbinding.ELProperty eLProperty = org.jdesktop.beansbinding.ELProperty.create("${selectedElement.movDetList}");
        jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, eLProperty, detailTable);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${codBar}"));
        columnBinding.setColumnName("Cod Bar");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${statusReagenteUnd}"));
        columnBinding.setColumnName("Status Reagente Und");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${statusReagente}"));
        columnBinding.setColumnName("Status Reagente");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${localizacao}"));
        columnBinding.setColumnName("Localizacao");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${estoque1}"));
        columnBinding.setColumnName("Estoque1");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${estoque2}"));
        columnBinding.setColumnName("Estoque2");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${estoque3}"));
        columnBinding.setColumnName("Estoque3");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${sala}"));
        columnBinding.setColumnName("Sala");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${dataValidade}"));
        columnBinding.setColumnName("Data Validade");
        columnBinding.setColumnClass(java.util.Date.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${idMovDet}"));
        columnBinding.setColumnName("Id Mov Det");
        columnBinding.setColumnClass(Integer.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${nomeReagente}"));
        columnBinding.setColumnName("Nome Reagente");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${codPlanilha}"));
        columnBinding.setColumnName("Cod Planilha");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${concentracao}"));
        columnBinding.setColumnName("Concentracao");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${tipoReagente}"));
        columnBinding.setColumnName("Tipo Reagente");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${fabricante}"));
        columnBinding.setColumnName("Fabricante");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${incompat}"));
        columnBinding.setColumnName("Incompat");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${tipoUnd}"));
        columnBinding.setColumnName("Tipo Und");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${quantUnd}"));
        columnBinding.setColumnName("Quant Und");
        columnBinding.setColumnClass(Double.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${flagFracionado}"));
        columnBinding.setColumnName("Flag Fracionado");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${flagReagente}"));
        columnBinding.setColumnName("Flag Reagente");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${numeroNota}"));
        columnBinding.setColumnName("Numero Nota");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${serieNota}"));
        columnBinding.setColumnName("Serie Nota");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${dataCompra}"));
        columnBinding.setColumnName("Data Compra");
        columnBinding.setColumnClass(java.util.Date.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${dataNota}"));
        columnBinding.setColumnName("Data Nota");
        columnBinding.setColumnClass(java.util.Date.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${fornecedor}"));
        columnBinding.setColumnName("Fornecedor");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${numeroLote}"));
        columnBinding.setColumnName("Numero Lote");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${serieLote}"));
        columnBinding.setColumnName("Serie Lote");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${usuarioCadastro}"));
        columnBinding.setColumnName("Usuario Cadastro");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${laboratorio}"));
        columnBinding.setColumnName("Laboratorio");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${idUsuario}"));
        columnBinding.setColumnName("Id Usuario");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${idLab}"));
        columnBinding.setColumnName("Id Lab");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${flagLote}"));
        columnBinding.setColumnName("Flag Lote");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${statusLote}"));
        columnBinding.setColumnName("Status Lote");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${dataEntradaEstoque}"));
        columnBinding.setColumnName("Data Entrada Estoque");
        columnBinding.setColumnClass(java.util.Date.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${idEstoque}"));
        columnBinding.setColumnName("Id Estoque");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${idLocalizacao}"));
        columnBinding.setColumnName("Id Localizacao");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${idUsuarioEmprestimo}"));
        columnBinding.setColumnName("Id Usuario Emprestimo");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${emprestadoPor}"));
        columnBinding.setColumnName("Emprestado Por");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${dataEmprestimo}"));
        columnBinding.setColumnName("Data Emprestimo");
        columnBinding.setColumnClass(java.util.Date.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${horaEmprestimo}"));
        columnBinding.setColumnName("Hora Emprestimo");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${emprestadoPara}"));
        columnBinding.setColumnName("Emprestado Para");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${obs}"));
        columnBinding.setColumnName("Obs");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${flagEmprestimo}"));
        columnBinding.setColumnName("Flag Emprestimo");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${devolAgendada}"));
        columnBinding.setColumnName("Devol Agendada");
        columnBinding.setColumnClass(java.util.Date.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${dataDevol}"));
        columnBinding.setColumnName("Data Devol");
        columnBinding.setColumnClass(java.util.Date.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${horaDevol}"));
        columnBinding.setColumnName("Hora Devol");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${autorizadoPor}"));
        columnBinding.setColumnName("Autorizado Por");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${usuarioEmprestimo}"));
        columnBinding.setColumnName("Usuario Emprestimo");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${idUsuarioDevolucao}"));
        columnBinding.setColumnName("Id Usuario Devolucao");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${usuarioDevolucao}"));
        columnBinding.setColumnName("Usuario Devolucao");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${flagReagenteUnd}"));
        columnBinding.setColumnName("Flag Reagente Und");
        columnBinding.setColumnClass(Integer.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${codQrestoque}"));
        columnBinding.setColumnName("Cod Qrestoque");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${codQreagente}"));
        columnBinding.setColumnName("Cod Qreagente");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${usuarioDescarte}"));
        columnBinding.setColumnName("Usuario Descarte");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${idUsuarioDescarte}"));
        columnBinding.setColumnName("Id Usuario Descarte");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${dataDescarte}"));
        columnBinding.setColumnName("Data Descarte");
        columnBinding.setColumnClass(java.util.Date.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${horaDescarte}"));
        columnBinding.setColumnName("Hora Descarte");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${flagDescarte}"));
        columnBinding.setColumnName("Flag Descarte");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${usuarioAbertura}"));
        columnBinding.setColumnName("Usuario Abertura");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${idUsAbertura}"));
        columnBinding.setColumnName("Id Us Abertura");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${dataAbertura}"));
        columnBinding.setColumnName("Data Abertura");
        columnBinding.setColumnClass(java.util.Date.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${horaAbertura}"));
        columnBinding.setColumnName("Hora Abertura");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${flagAbertura}"));
        columnBinding.setColumnName("Flag Abertura");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${statusAbertura}"));
        columnBinding.setColumnName("Status Abertura");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${idReagente}"));
        columnBinding.setColumnName("Id Reagente");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${idFornecedor}"));
        columnBinding.setColumnName("Id Fornecedor");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${tempCond}"));
        columnBinding.setColumnName("Temp Cond");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${siglaLab}"));
        columnBinding.setColumnName("Sigla Lab");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${lperc}"));
        columnBinding.setColumnName("Lperc");
        columnBinding.setColumnClass(Double.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${quantRestante}"));
        columnBinding.setColumnName("Quant Restante");
        columnBinding.setColumnClass(Double.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${flagVal}"));
        columnBinding.setColumnName("Flag Val");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${flagToxico}"));
        columnBinding.setColumnName("Flag Toxico");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${flagMatReagenteDet}"));
        columnBinding.setColumnName("Flag Mat Reagente Det");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${valorCompra}"));
        columnBinding.setColumnName("Valor Compra");
        columnBinding.setColumnClass(Double.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${valorFinalUnd}"));
        columnBinding.setColumnName("Valor Final Und");
        columnBinding.setColumnClass(Double.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${caraterReagente}"));
        columnBinding.setColumnName("Carater Reagente");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        jTableBinding.setSourceUnreadableValue(java.util.Collections.emptyList());
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        detailScrollPane.setViewportView(detailTable);
        if (detailTable.getColumnModel().getColumnCount() > 0) {
            detailTable.getColumnModel().getColumn(0).setResizable(false);
            detailTable.getColumnModel().getColumn(0).setPreferredWidth(140);
            detailTable.getColumnModel().getColumn(1).setResizable(false);
            detailTable.getColumnModel().getColumn(1).setPreferredWidth(100);
            detailTable.getColumnModel().getColumn(2).setResizable(false);
            detailTable.getColumnModel().getColumn(2).setPreferredWidth(120);
            detailTable.getColumnModel().getColumn(3).setResizable(false);
            detailTable.getColumnModel().getColumn(3).setPreferredWidth(140);
            detailTable.getColumnModel().getColumn(4).setResizable(false);
            detailTable.getColumnModel().getColumn(4).setPreferredWidth(170);
            detailTable.getColumnModel().getColumn(5).setResizable(false);
            detailTable.getColumnModel().getColumn(5).setPreferredWidth(150);
            detailTable.getColumnModel().getColumn(6).setResizable(false);
            detailTable.getColumnModel().getColumn(6).setPreferredWidth(90);
            detailTable.getColumnModel().getColumn(7).setResizable(false);
            detailTable.getColumnModel().getColumn(7).setPreferredWidth(50);
            detailTable.getColumnModel().getColumn(8).setResizable(false);
            detailTable.getColumnModel().getColumn(8).setPreferredWidth(90);
            detailTable.getColumnModel().getColumn(9).setResizable(false);
            detailTable.getColumnModel().getColumn(10).setResizable(false);
            detailTable.getColumnModel().getColumn(11).setResizable(false);
            detailTable.getColumnModel().getColumn(12).setResizable(false);
            detailTable.getColumnModel().getColumn(13).setResizable(false);
            detailTable.getColumnModel().getColumn(14).setResizable(false);
            detailTable.getColumnModel().getColumn(15).setResizable(false);
            detailTable.getColumnModel().getColumn(16).setResizable(false);
            detailTable.getColumnModel().getColumn(17).setResizable(false);
            detailTable.getColumnModel().getColumn(18).setResizable(false);
            detailTable.getColumnModel().getColumn(19).setResizable(false);
            detailTable.getColumnModel().getColumn(20).setResizable(false);
            detailTable.getColumnModel().getColumn(21).setResizable(false);
            detailTable.getColumnModel().getColumn(22).setResizable(false);
            detailTable.getColumnModel().getColumn(23).setResizable(false);
            detailTable.getColumnModel().getColumn(24).setResizable(false);
            detailTable.getColumnModel().getColumn(25).setResizable(false);
            detailTable.getColumnModel().getColumn(26).setResizable(false);
            detailTable.getColumnModel().getColumn(27).setResizable(false);
            detailTable.getColumnModel().getColumn(28).setResizable(false);
            detailTable.getColumnModel().getColumn(29).setResizable(false);
            detailTable.getColumnModel().getColumn(30).setResizable(false);
            detailTable.getColumnModel().getColumn(31).setResizable(false);
            detailTable.getColumnModel().getColumn(32).setResizable(false);
            detailTable.getColumnModel().getColumn(33).setResizable(false);
            detailTable.getColumnModel().getColumn(34).setResizable(false);
            detailTable.getColumnModel().getColumn(35).setResizable(false);
            detailTable.getColumnModel().getColumn(36).setResizable(false);
            detailTable.getColumnModel().getColumn(37).setResizable(false);
            detailTable.getColumnModel().getColumn(38).setResizable(false);
            detailTable.getColumnModel().getColumn(39).setResizable(false);
            detailTable.getColumnModel().getColumn(40).setResizable(false);
            detailTable.getColumnModel().getColumn(41).setResizable(false);
            detailTable.getColumnModel().getColumn(42).setResizable(false);
            detailTable.getColumnModel().getColumn(43).setResizable(false);
            detailTable.getColumnModel().getColumn(44).setResizable(false);
            detailTable.getColumnModel().getColumn(45).setResizable(false);
            detailTable.getColumnModel().getColumn(46).setResizable(false);
            detailTable.getColumnModel().getColumn(47).setResizable(false);
            detailTable.getColumnModel().getColumn(48).setResizable(false);
            detailTable.getColumnModel().getColumn(49).setResizable(false);
            detailTable.getColumnModel().getColumn(50).setResizable(false);
            detailTable.getColumnModel().getColumn(51).setResizable(false);
            detailTable.getColumnModel().getColumn(52).setResizable(false);
            detailTable.getColumnModel().getColumn(53).setResizable(false);
            detailTable.getColumnModel().getColumn(54).setResizable(false);
            detailTable.getColumnModel().getColumn(55).setResizable(false);
            detailTable.getColumnModel().getColumn(56).setResizable(false);
            detailTable.getColumnModel().getColumn(57).setResizable(false);
            detailTable.getColumnModel().getColumn(58).setResizable(false);
            detailTable.getColumnModel().getColumn(59).setResizable(false);
            detailTable.getColumnModel().getColumn(60).setResizable(false);
            detailTable.getColumnModel().getColumn(61).setResizable(false);
            detailTable.getColumnModel().getColumn(62).setResizable(false);
            detailTable.getColumnModel().getColumn(63).setResizable(false);
            detailTable.getColumnModel().getColumn(64).setResizable(false);
            detailTable.getColumnModel().getColumn(65).setResizable(false);
            detailTable.getColumnModel().getColumn(66).setResizable(false);
            detailTable.getColumnModel().getColumn(67).setResizable(false);
            detailTable.getColumnModel().getColumn(68).setResizable(false);
            detailTable.getColumnModel().getColumn(69).setResizable(false);
            detailTable.getColumnModel().getColumn(70).setResizable(false);
            detailTable.getColumnModel().getColumn(71).setResizable(false);
            detailTable.getColumnModel().getColumn(72).setResizable(false);
            detailTable.getColumnModel().getColumn(73).setResizable(false);
            detailTable.getColumnModel().getColumn(74).setResizable(false);
            detailTable.getColumnModel().getColumn(75).setResizable(false);
        }

        jPanel1.setLayout(new java.awt.GridBagLayout());

        jToolBar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);

        deleteButton.setBackground(new java.awt.Color(102, 102, 102));
        deleteButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        deleteButton.setForeground(new java.awt.Color(255, 255, 255));
        deleteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sislab/images/excluir_lixeira_verde.png"))); // NOI18N
        deleteButton.setText("Excluir Lote");
        deleteButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        deleteButton.setMaximumSize(new java.awt.Dimension(100, 50));
        deleteButton.setMinimumSize(new java.awt.Dimension(100, 50));
        deleteButton.setPreferredSize(new java.awt.Dimension(100, 50));
        deleteButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), deleteButton, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        deleteButton.addActionListener(formListener);
        jToolBar1.add(deleteButton);

        refreshButton.setBackground(new java.awt.Color(102, 102, 102));
        refreshButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
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

        jButton3.setBackground(new java.awt.Color(102, 102, 102));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sislab/images/dialog-declare.png"))); // NOI18N
        jButton3.setText("Uso");
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setMaximumSize(new java.awt.Dimension(100, 50));
        jButton3.setMinimumSize(new java.awt.Dimension(100, 50));
        jButton3.setPreferredSize(new java.awt.Dimension(100, 50));
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, detailTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), jButton3, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        jButton3.addActionListener(formListener);
        jToolBar1.add(jButton3);

        jButton6.setBackground(new java.awt.Color(102, 102, 102));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sislab/images/dialog-error.png"))); // NOI18N
        jButton6.setText("Disponibilidade");
        jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton6.setMaximumSize(new java.awt.Dimension(160, 50));
        jButton6.setMinimumSize(new java.awt.Dimension(160, 50));
        jButton6.setPreferredSize(new java.awt.Dimension(160, 50));
        jButton6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, detailTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), jButton6, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        jButton6.addActionListener(formListener);
        jToolBar1.add(jButton6);

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jToolBar1.add(jPanel2);

        jButton2.setBackground(new java.awt.Color(102, 102, 102));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sislab/images/sair.png"))); // NOI18N
        jButton2.setText("Sair");
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setMaximumSize(new java.awt.Dimension(100, 50));
        jButton2.setMinimumSize(new java.awt.Dimension(100, 50));
        jButton2.setPreferredSize(new java.awt.Dimension(100, 50));
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(formListener);
        jToolBar1.add(jButton2);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHEAST;
        gridBagConstraints.weightx = 1.0;
        jPanel1.add(jToolBar1, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Pesquisar Em:");

        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboBox1.setRenderer(descarteReagenteEstoqueCellRenderer1);

        org.jdesktop.swingbinding.JComboBoxBinding jComboBoxBinding = org.jdesktop.swingbinding.SwingBindings.createJComboBoxBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, cadLocalizacaoList, jComboBox1);
        bindingGroup.addBinding(jComboBoxBinding);

        jComboBox1.addActionListener(formListener);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sislab/images/excluir_lixeira_verde.png"))); // NOI18N
        jButton4.setText("Excluir este Reagente");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, detailTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), jButton4, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        jButton4.addActionListener(formListener);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(detailScrollPane, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(masterScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 1044, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(masterScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(detailScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addContainerGap())
        );

        bindingGroup.bind();
    }

    // Code for dispatching events from components to event handlers.

    private class FormListener implements java.awt.event.ActionListener {
        FormListener() {}
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            if (evt.getSource() == deleteButton) {
                DescarteReagentesView.this.deleteButtonActionPerformed(evt);
            }
            else if (evt.getSource() == refreshButton) {
                DescarteReagentesView.this.refreshButtonActionPerformed(evt);
            }
            else if (evt.getSource() == jButton3) {
                DescarteReagentesView.this.jButton3ActionPerformed(evt);
            }
            else if (evt.getSource() == jButton6) {
                DescarteReagentesView.this.jButton6ActionPerformed(evt);
            }
            else if (evt.getSource() == jButton2) {
                DescarteReagentesView.this.jButton2ActionPerformed(evt);
            }
            else if (evt.getSource() == jComboBox1) {
                DescarteReagentesView.this.jComboBox1ActionPerformed(evt);
            }
            else if (evt.getSource() == jButton4) {
                DescarteReagentesView.this.jButton4ActionPerformed(evt);
            }
            else if (evt.getSource() == jButton5) {
                DescarteReagentesView.this.jButton5ActionPerformed(evt);
            }
            else if (evt.getSource() == jButton7) {
                DescarteReagentesView.this.jButton7ActionPerformed(evt);
            }
        }
    }// </editor-fold>//GEN-END:initComponents

        
    @SuppressWarnings("unchecked")
    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
    atualizar();
    }//GEN-LAST:event_refreshButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
    excluirLote();
    }//GEN-LAST:event_deleteButtonActionPerformed
    
    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
//        pesquisarJPA();
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    excluirReagente();
       savarTudo();       
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
 
        JF_ALTERAR_ESTATUS.setSize(362, 121);//[]
        JF_ALTERAR_ESTATUS.setLocationRelativeTo(null);
        JF_ALTERAR_ESTATUS.pack();
        JF_ALTERAR_ESTATUS.setResizable(false);
        JF_ALTERAR_ESTATUS.setVisible(true);
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
      savarTudo();
      JF_ALTERAR_ESTATUS.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
    JF_ALTERAR_DISPONIBILIDADE.setSize(362, 142);//[][]
    JF_ALTERAR_DISPONIBILIDADE.setLocationRelativeTo(null);
    JF_ALTERAR_DISPONIBILIDADE.pack();
    JF_ALTERAR_DISPONIBILIDADE.setResizable(false);
    JF_ALTERAR_DISPONIBILIDADE.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
    savarTudo();
    JF_ALTERAR_DISPONIBILIDADE.dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
fecharJanela();  
    }//GEN-LAST:event_jButton2ActionPerformed

    
//         public void  pesquisarJPA()
//         {
//         String filtro = String.valueOf(jComboBox1.getSelectedItem());
//         int tmt = filtro.length();
//         String filtrado = filtro.substring((tmt-3), tmt);
//         int tmt1 = filtrado.length();
//         String fil1 = filtrado.substring(0, (tmt1-1));
//     
//
//
//        query = entityManager.createNamedQuery("CadLotes.PesquisaLabLocal");
//        query.setParameter("idLaboratorio", cont.getCadLaboratorio().getIdLab().toString());
//        query.setParameter("idLocal",fil1);
//
//        java.util.Collection dadosResposta1 = query.getResultList();
//        list.clear();
//        list.addAll(dadosResposta1);  
//        }  
    
    
    
    
    public void excluirLote(){
          int opcao;
        Object[] botoes = {" SIM "," NÃO "};
        opcao = JOptionPane.showOptionDialog(null, "Confirma exclusão do registro: "+masterTable.getValueAt(masterTable.getSelectedRow(), 1), "PERGUNTA DO SISTEMA", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,null,botoes,botoes[0]);
        if (opcao ==  JOptionPane.YES_OPTION) {
      int[] selected = masterTable.getSelectedRows();
        List<sislab.proteomica.view.lotesNotas.CadLotes> toRemove = new ArrayList<sislab.proteomica.view.lotesNotas.CadLotes>(selected.length);
        for (int idx = 0; idx < selected.length; idx++) {
            sislab.proteomica.view.lotesNotas.CadLotes c = list.get(masterTable.convertRowIndexToModel(selected[idx]));
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
            List<sislab.proteomica.view.lotesNotas.CadLotes> merged = new ArrayList<sislab.proteomica.view.lotesNotas.CadLotes>(list.size());
            for (sislab.proteomica.view.lotesNotas.CadLotes c : list) {
                merged.add(entityManager.merge(c));
            }
            list.clear();
            list.addAll(merged);
            atualizar();
        }
        atualizar();
        }
    
    }

    public void excluirReagente(){
          int opcao;
        Object[] botoes = {" SIM "," NÃO "};
        opcao = JOptionPane.showOptionDialog(null, "Confirma exclusão do registro: "+masterTable.getValueAt(masterTable.getSelectedRow(), 1), "PERGUNTA DO SISTEMA", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,null,botoes,botoes[0]);
        if (opcao ==  JOptionPane.YES_OPTION) {
     int index = masterTable.getSelectedRow();
        sislab.proteomica.view.lotesNotas.CadLotes c = list.get(masterTable.convertRowIndexToModel(index));
        Collection<sislab.proteomica.view.movimento.MovDet> ms = c.getMovDetList();
        int[] selected = detailTable.getSelectedRows();
        List<sislab.proteomica.view.movimento.MovDet> toRemove = new ArrayList<sislab.proteomica.view.movimento.MovDet>(selected.length);
        for (int idx = 0; idx < selected.length; idx++) {
            selected[idx] = detailTable.convertRowIndexToModel(selected[idx]);
            int count = 0;
            Iterator<sislab.proteomica.view.movimento.MovDet> iter = ms.iterator();
            while (count++ < selected[idx]) {
                iter.next();
            }
            sislab.proteomica.view.movimento.MovDet m = iter.next();
            toRemove.add(m);
            entityManager.remove(m);
        }
        ms.removeAll(toRemove);
        masterTable.clearSelection();
        masterTable.setRowSelectionInterval(index, index);
        
        
       // atualizar();
        }
         try {
            entityManager.getTransaction().commit();
            entityManager.getTransaction().begin();
        } catch (RollbackException rex) {
            rex.printStackTrace();
            entityManager.getTransaction().begin();
            List<sislab.proteomica.view.lotesNotas.CadLotes> merged = new ArrayList<sislab.proteomica.view.lotesNotas.CadLotes>(list.size());
            for (sislab.proteomica.view.lotesNotas.CadLotes c : list) {
                merged.add(entityManager.merge(c));
            }
            list.clear();
            list.addAll(merged);
        }
        atualizar();
    
    
    }
    
    public void savarTudo(){
      try {
            entityManager.getTransaction().commit();
            entityManager.getTransaction().begin();
        } catch (RollbackException rex) {
            rex.printStackTrace();
            entityManager.getTransaction().begin();
            List<sislab.proteomica.view.lotesNotas.CadLotes> merged = new ArrayList<sislab.proteomica.view.lotesNotas.CadLotes>(list.size());
            for (sislab.proteomica.view.lotesNotas.CadLotes c : list) {
                merged.add(entityManager.merge(c));
            }
            list.clear();
            list.addAll(merged);
        }
    
    
    }
    
    
    
    public void atualizar(){
    
        entityManager.getTransaction().rollback();
        entityManager.getTransaction().begin();
        java.util.Collection data = query.getResultList();
        for (Object entity : data) {
            entityManager.refresh(entity);
        }
        list.clear();
        list.addAll(data);
    
    }
       
   public void fecharJanela()
   {
     int opcao;
        Object[] botoes = {" SIM "," NÃO "};
        opcao = JOptionPane.showOptionDialog(null, "Deseja Fechar o Cadastro de Fabricantes ?", "PERGUNTA DO SISTEMA", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,null,botoes,botoes[0]);
        if (opcao ==  JOptionPane.YES_OPTION) {
                
                
                
                frameDescarteReagentesView.dispose();
                
        }

   
   }
   
//    public void editar()
//    {
//        FabricanteEditView fb = new FabricanteEditView(null, true);
//        fb.setRegistroAtualFabricante(list.get(masterTable.getSelectedRow()));
//        fb.setVisible(true);
//        if(fb.isConfirmaFabricanteEdit()){
//       salvar();
//            //saveButton.doClick();
//        }else{
//       refreshButton.doClick();
//        }
//    }


//   private void hotKeyF1()
//    {
//            frameDescarteReagentesView.getRootPane().registerKeyboardAction(new ActionListener() {
//            public void actionPerformed(ActionEvent e)
//            {
//            newButton.doClick();
//            }
//        }, KeyStroke.getKeyStroke(KeyEvent.VK_F1, 0),
//                JComponent.WHEN_IN_FOCUSED_WINDOW);
//    }
      private void hotKeyF2()
    {
            frameDescarteReagentesView.getRootPane().registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
             refreshButton.requestFocusInWindow();
            refreshButton.doClick();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_F2, 0),JComponent.WHEN_IN_FOCUSED_WINDOW);
    }
//       private void hotKeyF3()
//    {
//            frameDescarteReagentesView.getRootPane().registerKeyboardAction(new ActionListener() {
//            public void actionPerformed(ActionEvent e)
//            {
//                salvar();
//            //saveButton.doClick();
//            }
//        }, KeyStroke.getKeyStroke(KeyEvent.VK_F3, 0),
//                JComponent.WHEN_IN_FOCUSED_WINDOW);
//    }
//        private void hotKeyF4()
//    {
//            frameDescarteReagentesView.getRootPane().registerKeyboardAction(new ActionListener() {
//            public void actionPerformed(ActionEvent e)
//            {
//            jbt_editar.doClick();
//            }
//        }, KeyStroke.getKeyStroke(KeyEvent.VK_F4, 0),
//                JComponent.WHEN_IN_FOCUSED_WINDOW);
//    }

     private void hotKeyF5()
    {
            frameDescarteReagentesView.getRootPane().registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
            if(masterTable.getSelectedRow() > 0)
            {
                deleteButton.doClick();
            }
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_F5, 0),
                JComponent.WHEN_IN_FOCUSED_WINDOW);
    }

         private void hotKeyEsc()
    {
            frameDescarteReagentesView.getRootPane().registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                         
                 int opcao;
        Object[] botoes = {" SIM "," NÃO "};
        opcao = JOptionPane.showOptionDialog(null, "Deseja Fechar o Cadastro de Fabricantes ?", "PERGUNTA DO SISTEMA", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,null,botoes,botoes[0]);
        if (opcao ==  JOptionPane.YES_OPTION) {
                
                
                
                frameDescarteReagentesView.dispose();
                
        }
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0),
                JComponent.WHEN_IN_FOCUSED_WINDOW);
    }

           private void iniKeyActions()
           {
         //  hotKeyF1();
           hotKeyF2();
       //    hotKeyF3();
        //   hotKeyF4();
           hotKeyF5();
           //hotKeyDel();
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
                                                     //  System.out.println(tecla[1]);
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
    private javax.swing.JFrame JF_ALTERAR_DISPONIBILIDADE;
    private javax.swing.JFrame JF_ALTERAR_ESTATUS;
    private java.util.List<sislab.proteomica.beans.CadLocalizacao> cadLocalizacaoList;
    private javax.persistence.Query cadLocalizacaoQuery;
    private javax.swing.JButton deleteButton;
    private sislab.proteomica.view.movimento.DescarteReagenteEstoqueCellRenderer descarteReagenteEstoqueCellRenderer1;
    private javax.swing.JScrollPane detailScrollPane;
    private javax.swing.JTable detailTable;
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JToolBar jToolBar1;
    private java.util.List<sislab.proteomica.view.lotesNotas.CadLotes> list;
    private javax.swing.JScrollPane masterScrollPane;
    private javax.swing.JTable masterTable;
    private javax.persistence.Query query;
    private javax.swing.JButton refreshButton;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                if(frameDescarteReagentesView == null) 
                frameDescarteReagentesView = new JFrame();
                frameDescarteReagentesView.setContentPane(new DescarteReagentesView());
                frameDescarteReagentesView.setSize(1044, 563);
                frameDescarteReagentesView.setResizable(false);
                frameDescarteReagentesView.setLocationRelativeTo(null);
                frameDescarteReagentesView.pack();
                frameDescarteReagentesView.setVisible(true);
                frameDescarteReagentesView.setTitle(args[0]); 
            }
        });
    }
    
}
