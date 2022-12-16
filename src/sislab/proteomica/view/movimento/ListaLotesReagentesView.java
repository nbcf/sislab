/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sislab.proteomica.view.movimento;

import java.awt.EventQueue;
import java.beans.Beans;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import javax.persistence.RollbackException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import sislab.proteomica.engine.Container;

/**
 *
 * @author NILDO
 */
public class ListaLotesReagentesView extends JPanel {
     private static JFrame frameListaLotesReagentesView;
     Container cont = new Container();
    public ListaLotesReagentesView() {
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
        query = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT c FROM sislab.proteomica.view.lotesNotas.CadLotes c WHERE c.statusLote = null AND c.idLaboratorio=0");
        list = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(query.getResultList());
        JF_LISTAREAGENTES = new javax.swing.JFrame();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jPanel3 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        cadLocalizacaoQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT c FROM CadLocalizacao c");
        cadLocalizacaoList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : cadLocalizacaoQuery.getResultList();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        masterScrollPane = new javax.swing.JScrollPane();
        masterTable = new javax.swing.JTable();
        detailScrollPane = new javax.swing.JScrollPane();
        detailTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        refreshButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        FormListener formListener = new FormListener();

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("LOTE:");

        jTextField5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.localizacao}"), jTextField5, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), jTextField5, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.lote}"), jTextField3, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), jTextField3, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.numeroNota}"), jTextField2, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), jTextField2, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        jTextField7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.est2}"), jTextField7, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), jTextField7, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("ESTOQUE:");

        jTextField6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.est1}"), jTextField6, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), jTextField6, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("CODIGO:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("NUMERO NOTA:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("VALIDADE:");

        jTextField8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.estf}"), jTextField8, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), jTextField8, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("TIPO ESTOQUE:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("DETALHE");

        jTextField4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.codQreagente}"), jTextField4, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), jTextField4, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("LOCALIZAÇÃO:");

        jTextField9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), jTextField9, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("?");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.validadeLote}"), jDateChooser1, org.jdesktop.beansbinding.BeanProperty.create("date"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), jDateChooser1, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(131, 131, 131))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField5)
                            .addComponent(jTextField4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField6)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField7, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField8, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField9, javax.swing.GroupLayout.Alignment.LEADING))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton3.setText("Cancelar");
        jButton3.addActionListener(formListener);

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton4.setText("Excluir");
        jButton4.addActionListener(formListener);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addContainerGap())
        );

        javax.swing.GroupLayout JF_LISTAREAGENTESLayout = new javax.swing.GroupLayout(JF_LISTAREAGENTES.getContentPane());
        JF_LISTAREAGENTES.getContentPane().setLayout(JF_LISTAREAGENTESLayout);
        JF_LISTAREAGENTESLayout.setHorizontalGroup(
            JF_LISTAREAGENTESLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JF_LISTAREAGENTESLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JF_LISTAREAGENTESLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        JF_LISTAREAGENTESLayout.setVerticalGroup(
            JF_LISTAREAGENTESLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JF_LISTAREAGENTESLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenuItem1.setText("Descartar Reagente");
        jMenuItem1.addActionListener(formListener);
        jPopupMenu1.add(jMenuItem1);

        masterScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        masterTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, list, masterTable);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${numeroNota}"));
        columnBinding.setColumnName("NUMERO NOTA");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${dataNota}"));
        columnBinding.setColumnName("EMISSÃO");
        columnBinding.setColumnClass(java.util.Date.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${lote}"));
        columnBinding.setColumnName("NUMERO LOTE");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${validadeLote}"));
        columnBinding.setColumnName("VALIDADE");
        columnBinding.setColumnClass(java.util.Date.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${reagente}"));
        columnBinding.setColumnName("REAGENTE");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${fornecedor}"));
        columnBinding.setColumnName("FORNECEDOR");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${fabricante}"));
        columnBinding.setColumnName("FABRICANTE");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${idCadLotes}"));
        columnBinding.setColumnName("Id Cad Lotes");
        columnBinding.setColumnClass(Integer.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${laboratorio}"));
        columnBinding.setColumnName("Laboratorio");
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
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${codPlanilha}"));
        columnBinding.setColumnName("Cod Planilha");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${concentracao}"));
        columnBinding.setColumnName("Concentracao");
        columnBinding.setColumnClass(Double.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${dataCompra}"));
        columnBinding.setColumnName("Data Compra");
        columnBinding.setColumnClass(java.util.Date.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${dataCadastro}"));
        columnBinding.setColumnName("Data Cadastro");
        columnBinding.setColumnClass(java.util.Date.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${quantCompra}"));
        columnBinding.setColumnName("Quant Compra");
        columnBinding.setColumnClass(Integer.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${serieLote}"));
        columnBinding.setColumnName("Serie Lote");
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
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${statusLote}"));
        columnBinding.setColumnName("Status Lote");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${tipoReagente}"));
        columnBinding.setColumnName("Tipo Reagente");
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
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${localizacao}"));
        columnBinding.setColumnName("Localizacao");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${sala}"));
        columnBinding.setColumnName("Sala");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${est1}"));
        columnBinding.setColumnName("Est1");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${est2}"));
        columnBinding.setColumnName("Est2");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${estf}"));
        columnBinding.setColumnName("Estf");
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
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        masterScrollPane.setViewportView(masterTable);
        if (masterTable.getColumnModel().getColumnCount() > 0) {
            masterTable.getColumnModel().getColumn(0).setResizable(false);
            masterTable.getColumnModel().getColumn(0).setPreferredWidth(120);
            masterTable.getColumnModel().getColumn(1).setResizable(false);
            masterTable.getColumnModel().getColumn(1).setPreferredWidth(120);
            masterTable.getColumnModel().getColumn(2).setResizable(false);
            masterTable.getColumnModel().getColumn(2).setPreferredWidth(120);
            masterTable.getColumnModel().getColumn(3).setResizable(false);
            masterTable.getColumnModel().getColumn(3).setPreferredWidth(120);
            masterTable.getColumnModel().getColumn(4).setResizable(false);
            masterTable.getColumnModel().getColumn(4).setPreferredWidth(200);
            masterTable.getColumnModel().getColumn(5).setResizable(false);
            masterTable.getColumnModel().getColumn(5).setPreferredWidth(130);
            masterTable.getColumnModel().getColumn(6).setResizable(false);
            masterTable.getColumnModel().getColumn(6).setPreferredWidth(130);
            masterTable.getColumnModel().getColumn(7).setResizable(false);
            masterTable.getColumnModel().getColumn(8).setResizable(false);
            masterTable.getColumnModel().getColumn(9).setResizable(false);
            masterTable.getColumnModel().getColumn(10).setResizable(false);
            masterTable.getColumnModel().getColumn(11).setResizable(false);
            masterTable.getColumnModel().getColumn(12).setResizable(false);
            masterTable.getColumnModel().getColumn(13).setResizable(false);
            masterTable.getColumnModel().getColumn(14).setResizable(false);
            masterTable.getColumnModel().getColumn(15).setResizable(false);
            masterTable.getColumnModel().getColumn(16).setResizable(false);
            masterTable.getColumnModel().getColumn(17).setResizable(false);
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
        }

        detailScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        detailTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        detailTable.setComponentPopupMenu(jPopupMenu1);
        detailTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        org.jdesktop.beansbinding.ELProperty eLProperty = org.jdesktop.beansbinding.ELProperty.create("${selectedElement.movDetList}");
        jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, eLProperty, detailTable);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${statusReagente}"));
        columnBinding.setColumnName("STATUS");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${codBar}"));
        columnBinding.setColumnName("CODIGO");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${dataValidade}"));
        columnBinding.setColumnName("VALIDADE");
        columnBinding.setColumnClass(java.util.Date.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${localizacao}"));
        columnBinding.setColumnName("LOCALIZACAO");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${estoque1}"));
        columnBinding.setColumnName("NOME ESTOQUE");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${estoque2}"));
        columnBinding.setColumnName("TIPO ESTOQUE");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${estoque3}"));
        columnBinding.setColumnName("DETALHE");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${nomeReagente}"));
        columnBinding.setColumnName("REAGENTE");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${tipoReagente}"));
        columnBinding.setColumnName("Tipo Reagente");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${concentracao}"));
        columnBinding.setColumnName("Concentracao");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${codQreagente}"));
        columnBinding.setColumnName("Cod Qreagente");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${idMovDet}"));
        columnBinding.setColumnName("Id Mov Det");
        columnBinding.setColumnClass(Integer.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${codPlanilha}"));
        columnBinding.setColumnName("Cod Planilha");
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
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${numeroLote}"));
        columnBinding.setColumnName("Numero Lote");
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
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${sala}"));
        columnBinding.setColumnName("Sala");
        columnBinding.setColumnClass(String.class);
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
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${statusReagenteUnd}"));
        columnBinding.setColumnName("Status Reagente Und");
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
        jTableBinding.setSourceUnreadableValue(java.util.Collections.emptyList());
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        detailTable.addMouseListener(formListener);
        detailScrollPane.setViewportView(detailTable);
        if (detailTable.getColumnModel().getColumnCount() > 0) {
            detailTable.getColumnModel().getColumn(0).setResizable(false);
            detailTable.getColumnModel().getColumn(0).setPreferredWidth(100);
            detailTable.getColumnModel().getColumn(1).setResizable(false);
            detailTable.getColumnModel().getColumn(1).setPreferredWidth(100);
            detailTable.getColumnModel().getColumn(2).setResizable(false);
            detailTable.getColumnModel().getColumn(2).setPreferredWidth(100);
            detailTable.getColumnModel().getColumn(3).setResizable(false);
            detailTable.getColumnModel().getColumn(3).setPreferredWidth(120);
            detailTable.getColumnModel().getColumn(4).setResizable(false);
            detailTable.getColumnModel().getColumn(4).setPreferredWidth(150);
            detailTable.getColumnModel().getColumn(5).setResizable(false);
            detailTable.getColumnModel().getColumn(5).setPreferredWidth(120);
            detailTable.getColumnModel().getColumn(6).setResizable(false);
            detailTable.getColumnModel().getColumn(6).setPreferredWidth(120);
            detailTable.getColumnModel().getColumn(7).setResizable(false);
            detailTable.getColumnModel().getColumn(7).setPreferredWidth(130);
            detailTable.getColumnModel().getColumn(8).setResizable(false);
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
        }

        jPanel1.setLayout(new java.awt.GridBagLayout());

        jToolBar1.setBackground(new java.awt.Color(102, 102, 102));
        jToolBar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);

        refreshButton.setBackground(new java.awt.Color(102, 102, 102));
        refreshButton.setForeground(new java.awt.Color(255, 255, 255));
        refreshButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sislab/images/atualizar.png"))); // NOI18N
        refreshButton.setText("ATUALIZAR");
        refreshButton.setMaximumSize(new java.awt.Dimension(100, 50));
        refreshButton.setMinimumSize(new java.awt.Dimension(100, 50));
        refreshButton.setPreferredSize(new java.awt.Dimension(100, 50));
        refreshButton.addActionListener(formListener);
        jToolBar1.add(refreshButton);

        deleteButton.setBackground(new java.awt.Color(102, 102, 102));
        deleteButton.setText("DESCARTE LOTES");
        deleteButton.setMaximumSize(new java.awt.Dimension(100, 50));
        deleteButton.setMinimumSize(new java.awt.Dimension(100, 50));
        deleteButton.setPreferredSize(new java.awt.Dimension(100, 50));

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), deleteButton, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        deleteButton.addActionListener(formListener);
        jToolBar1.add(deleteButton);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHEAST;
        gridBagConstraints.weightx = 1.0;
        jPanel1.add(jToolBar1, gridBagConstraints);

        jLabel1.setText("Pesquisar em:");

        jButton1.setText("Limpar Pesquisa");
        jButton1.addActionListener(formListener);

        jButton2.setText("Buscar");
        jButton2.addActionListener(formListener);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(masterScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 944, Short.MAX_VALUE)
                    .addComponent(detailScrollPane))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(masterScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(detailScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        bindingGroup.bind();
    }

    // Code for dispatching events from components to event handlers.

    private class FormListener implements java.awt.event.ActionListener, java.awt.event.MouseListener {
        FormListener() {}
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            if (evt.getSource() == refreshButton) {
                ListaLotesReagentesView.this.refreshButtonActionPerformed(evt);
            }
            else if (evt.getSource() == deleteButton) {
                ListaLotesReagentesView.this.deleteButtonActionPerformed(evt);
            }
            else if (evt.getSource() == jButton1) {
                ListaLotesReagentesView.this.jButton1ActionPerformed(evt);
            }
            else if (evt.getSource() == jButton2) {
                ListaLotesReagentesView.this.jButton2ActionPerformed(evt);
            }
            else if (evt.getSource() == jButton3) {
                ListaLotesReagentesView.this.jButton3ActionPerformed(evt);
            }
            else if (evt.getSource() == jButton4) {
                ListaLotesReagentesView.this.jButton4ActionPerformed(evt);
            }
            else if (evt.getSource() == jMenuItem1) {
                ListaLotesReagentesView.this.jMenuItem1ActionPerformed(evt);
            }
        }

        public void mouseClicked(java.awt.event.MouseEvent evt) {
            if (evt.getSource() == detailTable) {
                ListaLotesReagentesView.this.detailTableMouseClicked(evt);
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
    
    }//GEN-LAST:event_refreshButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
     
    }//GEN-LAST:event_deleteButtonActionPerformed
    
    private void detailTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_detailTableMouseClicked

    }//GEN-LAST:event_detailTableMouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
callChangeLocalition(); 
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
int opcao;
        Object[] botoes = {" SIM "," NÃO "};
        opcao = JOptionPane.showOptionDialog(null, "Confirma o descarte deste Reagente? Ao confirmar o descarte, o registro do Reagente não constará mais no bancos de dados", "PERGUNTA DO SISTEMA", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,null,botoes,botoes[0]);
        if (opcao ==  JOptionPane.YES_OPTION) {

               descartar();
               
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       pesquisaLote();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
fechaCancelandoCadastro();
    }//GEN-LAST:event_jButton3ActionPerformed

       public void fechaCancelandoCadastro()
    {

    JF_LISTAREAGENTES.dispose();
    atualizar();
    }
    
       
   public void deletaLote(){ 
    int opcao;
        Object[] botoes = {" SIM "," NÃO "};
        opcao = JOptionPane.showOptionDialog(null, "Confirma o descarte deste Reagente? Ao confirmar o descarte, o registro do Reagente não constará mais no bancos de dados", "PERGUNTA DO SISTEMA", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,null,botoes,botoes[0]);
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
        }
        
        entityManager.getTransaction().rollback();
        entityManager.getTransaction().begin();
        java.util.Collection data = query.getResultList();
        for (Object entity : data) {
            entityManager.refresh(entity);
        }
        list.clear();
        list.addAll(data);
         JF_LISTAREAGENTES.dispose();
        }
   } 


   
public void salvar(){
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
public void descartar(){
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
        
        
}

    public void callChangeLocalition()
    {
        JF_LISTAREAGENTES.setSize(538, 460);//[365, 437][538, 460]
    
        JF_LISTAREAGENTES.setLocationRelativeTo(null);
        JF_LISTAREAGENTES.pack();
        JF_LISTAREAGENTES.setResizable(false);
        JF_LISTAREAGENTES.setVisible(true);
    }
    public void pesquisaLote(){

    query = entityManager.createNamedQuery("CadLotes.BuscaLabLote");
    query.setParameter("idLaboratorio", cont.getCadLaboratorio().getIdLab().toString());
    query.setParameter("lote",jTextField1.getText());
    java.util.Collection dadosResposta2 = query.getResultList();
    list.clear();
    list.addAll(dadosResposta2);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame JF_LISTAREAGENTES;
    private java.util.List<sislab.proteomica.beans.CadLocalizacao> cadLocalizacaoList;
    private javax.persistence.Query cadLocalizacaoQuery;
    private javax.swing.JButton deleteButton;
    private javax.swing.JScrollPane detailScrollPane;
    private javax.swing.JTable detailTable;
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
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
                frameListaLotesReagentesView = new JFrame();
                frameListaLotesReagentesView.setContentPane(new ListaLotesReagentesView());
                frameListaLotesReagentesView.setSize(843, 602);//[644, 578][][][]
                frameListaLotesReagentesView.setResizable(false);
                frameListaLotesReagentesView.setLocationRelativeTo(null);
                frameListaLotesReagentesView.pack();
                frameListaLotesReagentesView.setVisible(true);
                frameListaLotesReagentesView.setTitle(args[0]); 
            }
        });
    }
    
}
