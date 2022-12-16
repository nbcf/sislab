
package sislab.proteomica.view.movimento;

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
import sislab.proteomica.engine.Container;
import sislab.proteomica.importsview.EstoqueImportsView;
import sislab.proteomica.importsview.FabricanteImports;
import sislab.proteomica.importsview.ImportIncompatView;

/**
 *
 * @author NILDO
 */
public class CadastroReagentesView extends JPanel {
      private static JFrame frameCadastroReagentesView;
      public static CadastroReagentesView crw;
      Container cont = new Container();
      
    public CadastroReagentesView() {
        initComponents();
       
        if (!Beans.isDesignTime()) {
            entityManager.getTransaction().begin();
        }
        
        jtf_idLab.setVisible(false);
                jtf_id_localizacao.setVisible(false);
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("fenyx?zeroDateTimeBehavior=convertToNullPU").createEntityManager();
        query = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT r FROM Reagente r WHERE r.idLab= "+cont.getCadLaboratorio().getIdLab().toString());
        list = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(query.getResultList());
        JF_CadastroReagentesView = new javax.swing.JFrame();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jtf_nomeEstoque = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jtf_sala = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jtf_tipoEstoque = new javax.swing.JTextField();
        jtf_lab = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jtf_localizacaoEstoque = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jtf_estoqueDetalhe = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        jtf_concentracaoReagente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jcb_tipoReagente = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jcb_tipoQuant = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jtf_quantUnd = new javax.swing.JTextField();
        jl_percent = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jtf_IdEstoque = new javax.swing.JTextField();
        jtf_IdFabricante = new javax.swing.JTextField();
        jtf_id_localizacao = new javax.swing.JTextField();
        jtf_idLab = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel8 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtf_fabricante = new javax.swing.JTextField();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        jtf_quantMin = new javax.swing.JTextField();
        jtf_nomeReagente = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jtf_codReagente = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox<>();
        jButton6 = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        localizacaoCadastroReagentesCellRenderer1 = new sislab.proteomica.view.movimento.LocalizacaoCadastroReagentesCellRenderer();
        cadLocalizacaoQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT c FROM CadLocalizacao c WHERE c.idLab ="+cont.getCadLaboratorio().getIdLab().toString());
        cadLocalizacaoList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : cadLocalizacaoQuery.getResultList();
        jLabel20 = new javax.swing.JLabel();
        JF_pesquisarCadastroReagentesView = new javax.swing.JFrame();
        jLabel27 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jComboBox6 = new javax.swing.JComboBox<>();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        converterBusca1 = new sislab.proteomica.engine.ConverterBusca();
        masterScrollPane = new javax.swing.JScrollPane();
        masterTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        newButton = new javax.swing.JButton();
        refreshButton = new javax.swing.JButton();
        jbt_editar = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();

        FormListener formListener = new FormListener();

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("Localização:");

        jtf_nomeEstoque.setBackground(new java.awt.Color(204, 204, 255));
        jtf_nomeEstoque.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.est1}"), jtf_nomeEstoque, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), jtf_nomeEstoque, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setText("Nome Est.:");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel14.setText("Sala:");

        jtf_sala.setBackground(new java.awt.Color(204, 204, 255));
        jtf_sala.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.sala}"), jtf_sala, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sislab/images/viewmag.png"))); // NOI18N
        jButton7.setText("Importar alocação Padrão");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), jButton7, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        jButton7.addActionListener(formListener);

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel15.setText("Laboratório:");

        jtf_tipoEstoque.setBackground(new java.awt.Color(204, 204, 255));
        jtf_tipoEstoque.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.est2}"), jtf_tipoEstoque, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), jtf_tipoEstoque, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        jtf_tipoEstoque.addActionListener(formListener);

        jtf_lab.setBackground(new java.awt.Color(204, 204, 255));
        jtf_lab.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.laboratorio}"), jtf_lab, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), jtf_lab, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setText("Detalhe:");

        jtf_localizacaoEstoque.setBackground(new java.awt.Color(204, 204, 255));
        jtf_localizacaoEstoque.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.localizacao}"), jtf_localizacaoEstoque, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), jtf_localizacaoEstoque, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel13.setText("Tipo Estoque:");

        jtf_estoqueDetalhe.setBackground(new java.awt.Color(204, 204, 255));
        jtf_estoqueDetalhe.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.estf}"), jtf_estoqueDetalhe, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), jtf_estoqueDetalhe, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel15))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtf_nomeEstoque)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addComponent(jtf_tipoEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtf_estoqueDetalhe))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(jtf_localizacaoEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel14)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jtf_sala, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jtf_lab))
                                .addGap(0, 207, Short.MAX_VALUE))))
                    .addComponent(jButton7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jtf_lab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jtf_localizacaoEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(jtf_sala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jtf_nomeEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jtf_estoqueDetalhe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtf_tipoEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("ALOCAÇÃO PADRÃO", jPanel5);

        jLabel7.setText("Carater:");

        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "NENHUM", "NÃO INFORMADO", "ÁCIDO", "BÁSICO", "CAÚSTICO", "VOLATIL" }));

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.caraterReagente}"), jComboBox1, org.jdesktop.beansbinding.BeanProperty.create("selectedItem"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), jComboBox1, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        jLabel9.setText("Tóxico:");

        jComboBox2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "SIM", "NÃO" }));

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.flagToxico}"), jComboBox2, org.jdesktop.beansbinding.BeanProperty.create("selectedItem"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), jComboBox2, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        jLabel17.setText("Concentração:");

        jtf_concentracaoReagente.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.concentracao}"), jtf_concentracaoReagente, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), jtf_concentracaoReagente, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        jLabel2.setText("Tipo:");

        jcb_tipoReagente.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jcb_tipoReagente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--------- Reagentes--------- ", "Liofilizado", "Líquido", "Granulado", "Pó", "Gel", "Pasta", "---------Materiais------------", "Vidraria - UV - VU - VS - EQ", "Vidraria - UV - EQ", "Plasticos - Esterilizaveis", "Kit", " " }));

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.tipoReagente}"), jcb_tipoReagente, org.jdesktop.beansbinding.BeanProperty.create("selectedItem"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), jcb_tipoReagente, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        jLabel4.setText("Tipo Quant.:");

        jcb_tipoQuant.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jcb_tipoQuant.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "und", "kit", "Kg", "gr", "mg", "µg", "L", "ml", "µL", " " }));

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.tipoUnd}"), jcb_tipoQuant, org.jdesktop.beansbinding.BeanProperty.create("selectedItem"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), jcb_tipoQuant, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        jLabel3.setText("Quant. Und.:");

        jtf_quantUnd.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.quantUnd}"), jtf_quantUnd, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), jtf_quantUnd, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        jl_percent.setText("Percentual:");

        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.lperc}"), jTextField3, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), jTextField3, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        jLabel19.setText("Temperatura:");

        jTextField4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.tempCondi}"), jTextField4, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), jTextField4, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.idEstoque}"), jtf_IdEstoque, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.idFabricante}"), jtf_IdFabricante, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.idLocalizacao}"), jtf_id_localizacao, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jtf_id_localizacao.addActionListener(formListener);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.idLab}"), jtf_idLab, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jcb_tipoReagente, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.LEADING, 0, 229, Short.MAX_VALUE)
                    .addComponent(jcb_tipoQuant, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel17)
                    .addComponent(jl_percent)
                    .addComponent(jLabel19))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField4, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                    .addComponent(jTextField3)
                    .addComponent(jtf_concentracaoReagente)
                    .addComponent(jtf_quantUnd))
                .addGap(18, 18, 18)
                .addComponent(jtf_IdEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jtf_IdFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jtf_id_localizacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jtf_idLab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jtf_quantUnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jcb_tipoQuant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(jtf_concentracaoReagente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_percent)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jcb_tipoReagente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtf_IdEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtf_IdFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtf_id_localizacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtf_idLab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("COMPLEMENTOS", jPanel6);

        jButton5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sislab/images/viewmag.png"))); // NOI18N
        jButton5.setText("Importar Incompatibilidade do Reagente");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), jButton5, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        jButton5.addActionListener(formListener);

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        jTextArea1.setRows(5);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.incompat}"), jTextArea1, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 722, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("IMCOMPATIBILIDADE", jPanel3);

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton3.setText("Cancelar");
        jButton3.addActionListener(formListener);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Salvar");
        jButton1.addActionListener(formListener);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton3))
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Cod. interno:");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel16.setText("Cod. Compra:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Quant. Min.:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Fabricante:");

        jtf_fabricante.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.fabricante}"), jtf_fabricante, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), jtf_fabricante, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel18.setText("jLabel18");

        jtf_quantMin.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.quantMin}"), jtf_quantMin, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), jtf_quantMin, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        jtf_nomeReagente.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.nome}"), jtf_nomeReagente, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), jtf_nomeReagente, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.codPlanilha}"), jTextField1, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), jTextField1, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        jtf_codReagente.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.codQreagente}"), jtf_codReagente, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), jtf_codReagente, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Nome:");

        jComboBox5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Reagente", "Material" }));

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.flagReagenteMaterail}"), jComboBox5, org.jdesktop.beansbinding.BeanProperty.create("selectedItem"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), jComboBox5, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sislab/images/viewmag.png"))); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), jButton6, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        jButton6.addActionListener(formListener);

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel26.setText("Tipo");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jtf_fabricante, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel26))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jtf_nomeReagente, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel16))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(25, 25, 25)
                        .addComponent(jtf_codReagente, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jtf_quantMin, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel18)))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1)
                    .addComponent(jComboBox5, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtf_nomeReagente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtf_fabricante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel26)
                        .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jtf_codReagente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jtf_quantMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout JF_CadastroReagentesViewLayout = new javax.swing.GroupLayout(JF_CadastroReagentesView.getContentPane());
        JF_CadastroReagentesView.getContentPane().setLayout(JF_CadastroReagentesViewLayout);
        JF_CadastroReagentesViewLayout.setHorizontalGroup(
            JF_CadastroReagentesViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(JF_CadastroReagentesViewLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JF_CadastroReagentesViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        JF_CadastroReagentesViewLayout.setVerticalGroup(
            JF_CadastroReagentesViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JF_CadastroReagentesViewLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1)
                .addGap(18, 18, 18)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        localizacaoCadastroReagentesCellRenderer1.setText("localizacaoCadastroReagentesCellRenderer1");

        jLabel20.setText("jLabel20");

        JF_pesquisarCadastroReagentesView.addWindowListener(formListener);

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel27.setText("Por:");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${rowSorter}"), jTextField5, org.jdesktop.beansbinding.BeanProperty.create("text"));
        binding.setConverter(converterBusca1);
        bindingGroup.addBinding(binding);

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel28.setText("Pesquisar em:");

        jComboBox6.setRenderer(localizacaoCadastroReagentesCellRenderer1);

        org.jdesktop.swingbinding.JComboBoxBinding jComboBoxBinding = org.jdesktop.swingbinding.SwingBindings.createJComboBoxBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, cadLocalizacaoList, jComboBox6);
        bindingGroup.addBinding(jComboBoxBinding);

        jComboBox6.addActionListener(formListener);

        jButton8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton8.setText("Pesquisar");

        jButton9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton9.setText("Limpar");

        javax.swing.GroupLayout JF_pesquisarCadastroReagentesViewLayout = new javax.swing.GroupLayout(JF_pesquisarCadastroReagentesView.getContentPane());
        JF_pesquisarCadastroReagentesView.getContentPane().setLayout(JF_pesquisarCadastroReagentesViewLayout);
        JF_pesquisarCadastroReagentesViewLayout.setHorizontalGroup(
            JF_pesquisarCadastroReagentesViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JF_pesquisarCadastroReagentesViewLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JF_pesquisarCadastroReagentesViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel28)
                    .addComponent(jLabel27))
                .addGap(18, 18, 18)
                .addGroup(JF_pesquisarCadastroReagentesViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField5)
                    .addComponent(jComboBox6, 0, 283, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(JF_pesquisarCadastroReagentesViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        JF_pesquisarCadastroReagentesViewLayout.setVerticalGroup(
            JF_pesquisarCadastroReagentesViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JF_pesquisarCadastroReagentesViewLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JF_pesquisarCadastroReagentesViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JF_pesquisarCadastroReagentesViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        converterBusca1.setTable(masterTable);

        masterScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        masterTable.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        masterTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        masterTable.setRowHeight(18);
        masterTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        masterTable.getTableHeader().setResizingAllowed(false);
        masterTable.getTableHeader().setReorderingAllowed(false);

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, list, masterTable);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${flagReagenteMaterail}"));
        columnBinding.setColumnName("TIPO PRODUTO");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${nome}"));
        columnBinding.setColumnName("REAGENTE");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${tipoReagente}"));
        columnBinding.setColumnName("TIPO");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${tipoUnd}"));
        columnBinding.setColumnName("UND");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${quantUnd}"));
        columnBinding.setColumnName("QUANT. UND");
        columnBinding.setColumnClass(Double.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${concentracao}"));
        columnBinding.setColumnName("CONC.");
        columnBinding.setColumnClass(Double.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${tempCondi}"));
        columnBinding.setColumnName("TEMP.");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${flagToxico}"));
        columnBinding.setColumnName("TÓXICO");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${codPlanilha}"));
        columnBinding.setColumnName("COD. COMPRA");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${fabricante}"));
        columnBinding.setColumnName("FABRICANTE");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${quantAtual}"));
        columnBinding.setColumnName("ESTOQUE");
        columnBinding.setColumnClass(Integer.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${quantMin}"));
        columnBinding.setColumnName("Quant Min");
        columnBinding.setColumnClass(Integer.class);
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
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${laboratorio}"));
        columnBinding.setColumnName("Laboratorio");
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
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${idReagente}"));
        columnBinding.setColumnName("Id Reagente");
        columnBinding.setColumnClass(Integer.class);
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
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${idLab}"));
        columnBinding.setColumnName("Id Lab");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${idLocalizacao}"));
        columnBinding.setColumnName("Id Localizacao");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${incompat}"));
        columnBinding.setColumnName("Incompat");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${caraterReagente}"));
        columnBinding.setColumnName("Carater Reagente");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${lperc}"));
        columnBinding.setColumnName("Lperc");
        columnBinding.setColumnClass(Double.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${flagReagenteMaterail}"));
        columnBinding.setColumnName("Especie");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        masterScrollPane.setViewportView(masterTable);
        if (masterTable.getColumnModel().getColumnCount() > 0) {
            masterTable.getColumnModel().getColumn(0).setResizable(false);
            masterTable.getColumnModel().getColumn(0).setPreferredWidth(100);
            masterTable.getColumnModel().getColumn(1).setResizable(false);
            masterTable.getColumnModel().getColumn(1).setPreferredWidth(192);
            masterTable.getColumnModel().getColumn(2).setResizable(false);
            masterTable.getColumnModel().getColumn(2).setPreferredWidth(100);
            masterTable.getColumnModel().getColumn(3).setResizable(false);
            masterTable.getColumnModel().getColumn(3).setPreferredWidth(60);
            masterTable.getColumnModel().getColumn(4).setResizable(false);
            masterTable.getColumnModel().getColumn(4).setPreferredWidth(90);
            masterTable.getColumnModel().getColumn(5).setResizable(false);
            masterTable.getColumnModel().getColumn(6).setResizable(false);
            masterTable.getColumnModel().getColumn(7).setResizable(false);
            masterTable.getColumnModel().getColumn(8).setResizable(false);
            masterTable.getColumnModel().getColumn(8).setPreferredWidth(120);
            masterTable.getColumnModel().getColumn(9).setResizable(false);
            masterTable.getColumnModel().getColumn(9).setPreferredWidth(160);
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
            masterTable.getColumnModel().getColumn(18).setResizable(false);
            masterTable.getColumnModel().getColumn(18).setPreferredWidth(60);
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
        }

        jPanel1.setLayout(new java.awt.GridBagLayout());

        jToolBar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);

        newButton.setBackground(new java.awt.Color(102, 102, 102));
        newButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        newButton.setForeground(new java.awt.Color(255, 255, 255));
        newButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sislab/images/adicionar.png"))); // NOI18N
        newButton.setText("Novo");
        newButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        newButton.setMaximumSize(new java.awt.Dimension(100, 50));
        newButton.setMinimumSize(new java.awt.Dimension(100, 50));
        newButton.setPreferredSize(new java.awt.Dimension(100, 50));
        newButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement == null}"), newButton, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        newButton.addActionListener(formListener);
        jToolBar1.add(newButton);

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

        jbt_editar.setBackground(new java.awt.Color(102, 102, 102));
        jbt_editar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbt_editar.setForeground(new java.awt.Color(255, 255, 255));
        jbt_editar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sislab/images/editar.png"))); // NOI18N
        jbt_editar.setText("Editar");
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

        deleteButton.setBackground(new java.awt.Color(102, 102, 102));
        deleteButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        deleteButton.setForeground(new java.awt.Color(255, 255, 255));
        deleteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sislab/images/excluir_lixeira_verde.png"))); // NOI18N
        deleteButton.setText("Excluir");
        deleteButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        deleteButton.setMaximumSize(new java.awt.Dimension(100, 50));
        deleteButton.setMinimumSize(new java.awt.Dimension(100, 50));
        deleteButton.setPreferredSize(new java.awt.Dimension(100, 50));
        deleteButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), deleteButton, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        deleteButton.addActionListener(formListener);
        jToolBar1.add(deleteButton);

        jButton4.setBackground(new java.awt.Color(102, 102, 102));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sislab/images/zoom-3.png"))); // NOI18N
        jButton4.setText("Pesquisar");
        jButton4.setFocusable(false);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setMaximumSize(new java.awt.Dimension(100, 50));
        jButton4.setMinimumSize(new java.awt.Dimension(100, 50));
        jButton4.setPreferredSize(new java.awt.Dimension(100, 50));
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement == null}"), jButton4, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        jButton4.addActionListener(formListener);
        jToolBar1.add(jButton4);

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 444, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jToolBar1.add(jPanel2);

        jButton2.setBackground(new java.awt.Color(102, 102, 102));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(masterScrollPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(masterScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 538, Short.MAX_VALUE))
        );

        bindingGroup.bind();
    }

    // Code for dispatching events from components to event handlers.

    private class FormListener implements java.awt.event.ActionListener, java.awt.event.WindowListener {
        FormListener() {}
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            if (evt.getSource() == newButton) {
                CadastroReagentesView.this.newButtonActionPerformed(evt);
            }
            else if (evt.getSource() == refreshButton) {
                CadastroReagentesView.this.refreshButtonActionPerformed(evt);
            }
            else if (evt.getSource() == jbt_editar) {
                CadastroReagentesView.this.jbt_editarActionPerformed(evt);
            }
            else if (evt.getSource() == deleteButton) {
                CadastroReagentesView.this.deleteButtonActionPerformed(evt);
            }
            else if (evt.getSource() == jButton4) {
                CadastroReagentesView.this.jButton4ActionPerformed(evt);
            }
            else if (evt.getSource() == jButton2) {
                CadastroReagentesView.this.jButton2ActionPerformed(evt);
            }
            else if (evt.getSource() == jButton7) {
                CadastroReagentesView.this.jButton7ActionPerformed(evt);
            }
            else if (evt.getSource() == jtf_tipoEstoque) {
                CadastroReagentesView.this.jtf_tipoEstoqueActionPerformed(evt);
            }
            else if (evt.getSource() == jtf_id_localizacao) {
                CadastroReagentesView.this.jtf_id_localizacaoActionPerformed(evt);
            }
            else if (evt.getSource() == jButton5) {
                CadastroReagentesView.this.jButton5ActionPerformed(evt);
            }
            else if (evt.getSource() == jButton6) {
                CadastroReagentesView.this.jButton6ActionPerformed(evt);
            }
            else if (evt.getSource() == jButton3) {
                CadastroReagentesView.this.jButton3ActionPerformed(evt);
            }
            else if (evt.getSource() == jButton1) {
                CadastroReagentesView.this.jButton1ActionPerformed(evt);
            }
            else if (evt.getSource() == jComboBox6) {
                CadastroReagentesView.this.jComboBox6ActionPerformed(evt);
            }
        }

        public void windowActivated(java.awt.event.WindowEvent evt) {
        }

        public void windowClosed(java.awt.event.WindowEvent evt) {
        }

        public void windowClosing(java.awt.event.WindowEvent evt) {
            if (evt.getSource() == JF_pesquisarCadastroReagentesView) {
                CadastroReagentesView.this.JF_pesquisarCadastroReagentesViewWindowClosing(evt);
            }
        }

        public void windowDeactivated(java.awt.event.WindowEvent evt) {
        }

        public void windowDeiconified(java.awt.event.WindowEvent evt) {
        }

        public void windowIconified(java.awt.event.WindowEvent evt) {
        }

        public void windowOpened(java.awt.event.WindowEvent evt) {
        }
    }// </editor-fold>//GEN-END:initComponents

    
    @SuppressWarnings("unchecked")
    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
    atualizar();
    jTextField5.setText("");
    }//GEN-LAST:event_refreshButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
    excluir();
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void newButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newButtonActionPerformed
    novo();
    
    }//GEN-LAST:event_newButtonActionPerformed
    
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
    callFabricante();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jbt_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_editarActionPerformed
    editar();
    }//GEN-LAST:event_jbt_editarActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
    callAlterarLocal();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jtf_id_localizacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_id_localizacaoActionPerformed
      
    }//GEN-LAST:event_jtf_id_localizacaoActionPerformed

    private void jtf_tipoEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_tipoEstoqueActionPerformed
    
    }//GEN-LAST:event_jtf_tipoEstoqueActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    fecharJanela();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
callIncompatiblidade();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jComboBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox6ActionPerformed
pesquisarJPA();
    }//GEN-LAST:event_jComboBox6ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
callPesquisar();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void JF_pesquisarCadastroReagentesViewWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_JF_pesquisarCadastroReagentesViewWindowClosing

    }//GEN-LAST:event_JF_pesquisarCadastroReagentesViewWindowClosing

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
 fechaCancelandoCadastro();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
  fechaSalvandoFrame();         // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    public void callPesquisar(){
       JF_pesquisarCadastroReagentesView.setSize(497, 79);
       JF_pesquisarCadastroReagentesView.setLocationRelativeTo(null);
       JF_pesquisarCadastroReagentesView.pack();
       JF_pesquisarCadastroReagentesView.setResizable(false);
       JF_pesquisarCadastroReagentesView.setVisible(true);
    }
    
                            public void  pesquisarJPA(){
                            String filtro = String.valueOf(jComboBox6.getSelectedItem());
                             System.out.println("filtro: "+filtro);
                             int tmt = filtro.length();
                             System.out.println(String.valueOf("tmt: "+tmt));
                             String filtrado = filtro.substring((tmt-3), tmt);
                             System.out.println("filtrado: "+filtrado);
                             int tmt1 = filtrado.length();
                             System.out.println(String.valueOf("tmt1: "+tmt1));
                             String fil1 = filtrado.substring(0, (tmt1-1));
                             System.out.println(fil1);

                            query = entityManager.createNamedQuery("Reagente.FiltraPorLocal");
                            query.setParameter("idLab", cont.getCadLaboratorio().getIdLab().toString());
                            query.setParameter("idLocalizacao",fil1);
                            java.util.Collection dadosResposta1 = query.getResultList();
                            list.clear();
                            list.addAll(dadosResposta1);  
                        } 
    
    
    
      public void callFabricante()
   {
      String args[] = new String[1];
      args[0] = "Importar Fornecedores";
      FabricanteImports.main(args);
   }
      
      public void callAlterarLocal()
   {
      String args[] = new String[1];
      args[0] = "Importar Estocagem Padrão";
      EstoqueImportsView.main(args);
   }
      
          public void callIncompatiblidade()
   {
      String args[] = new String[1];
      args[0] = "Importar Dados de Incompatibilidades de Reagentes";
       ImportIncompatView.main(args);
   }
      
     public void fecharJanela()
   {
    if(jtf_nomeReagente.isEnabled())
              {
                  int opcao4;
                        Object[] botoes4 = {" SIM "," NÃO "};
                        opcao4 = JOptionPane.showOptionDialog(null, "Deseja Fechar o Cadastro de Reagentes sem Salvar ?", "PERGUNTA DO SISTEMA", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,null,botoes4,botoes4[0]);
                        if (opcao4 ==  JOptionPane.YES_OPTION)
                        {
                   //         pararWebcam();
                         frameCadastroReagentesView.dispose();
                         } else if(opcao4 == JOptionPane.NO_OPTION)
                        {

                        }
              }
            else  if(jtf_nomeReagente.isEnabled() == false)
              {
                  int opcao5;
                        Object[] botoes5 = {" SIM "," NÃO "};
                        opcao5 = JOptionPane.showOptionDialog(null, "Confirma o fechamento do cadastro de reagentes ?", "PERGUNTA DO SISTEMA", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,null,botoes5,botoes5[0]);
                        if (opcao5 ==  JOptionPane.YES_OPTION)
                        {
                    //        pararWebcam();
                         frameCadastroReagentesView.dispose();
                         } else if(opcao5 == JOptionPane.NO_OPTION)
                        {
                        }
                }
   }

    public void callChangeLocalition()
    {
        JF_CadastroReagentesView.setSize(719, 388);
        JF_CadastroReagentesView.setLocationRelativeTo(null);
        JF_CadastroReagentesView.pack();
        JF_CadastroReagentesView.setResizable(false);
        JF_CadastroReagentesView.setVisible(true);
        jtf_IdEstoque.setVisible(false);
        jtf_IdFabricante.setVisible(false);
       
        
    }
    
    
    
    public void fechaSalvandoFrame()
    {
//    jbt_cancelaCadastroFormulario.setEnabled(false);
//    jbt_salvaFormulario.setEnabled(false);
     salvar();
    JF_CadastroReagentesView.dispose();
    }
    
       public void fechaCancelandoCadastro()
    {
//
//    jbt_cancelaCadastroFormulario.setEnabled(false);
//    jbt_salvaFormulario.setEnabled(false);
    JF_CadastroReagentesView.dispose();
    atualizar();
    }
    
       
      
    public void salvar()
    {
//      if(jtf_nomeReagente.getText().isEmpty() && jtf_quantUnd.getText().isEmpty() )
//      {
//          
//      JOptionPane.showMessageDialog(null, "Não foi possível salvar este registro", "Formulário Imcompleto", JOptionPane.ERROR_MESSAGE);
//     
//      }
//      else if (jtf_nomeReagente.getText().length()>5 && jtf_quantUnd.getText().length()>5 ){
      
          try {
            entityManager.getTransaction().commit();
            entityManager.getTransaction().begin();
        } catch (RollbackException rex) {
            rex.printStackTrace();
            entityManager.getTransaction().begin();
            List<sislab.proteomica.beans.Reagente> merged = new ArrayList<sislab.proteomica.beans.Reagente>(list.size());
            for (sislab.proteomica.beans.Reagente r : list) {
                merged.add(entityManager.merge(r));
            }
            list.clear();
            list.addAll(merged);
        
        
            
        }
              atualizar();
//              deleteButton.setEnabled(false);
//              newButton.setEnabled(true);
//                jbt_editar.setEnabled(true);
//              
      
      
  
    }

    public void salvarExclusao()
    {
      try {
            entityManager.getTransaction().commit();
            entityManager.getTransaction().begin();
        } catch (RollbackException rex) {
            rex.printStackTrace();
            entityManager.getTransaction().begin();
            List<sislab.proteomica.beans.Reagente> merged = new ArrayList<sislab.proteomica.beans.Reagente>(list.size());
            for (sislab.proteomica.beans.Reagente r : list) {
                merged.add(entityManager.merge(r));
            }
            list.clear();
            list.addAll(merged);
        }
    }
 
    public void excluir()
    {
         int opcao;
        Object[] botoes = {" SIM "," NÃO "};
        opcao = JOptionPane.showOptionDialog(null, "Confirma exclusão do reagente: "+masterTable.getValueAt(masterTable.getSelectedRow(), 1), "PERGUNTA DO SISTEMA", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,null,botoes,botoes[0]);
        if (opcao ==  JOptionPane.YES_OPTION) {
               int[] selected = masterTable.getSelectedRows();
        List<sislab.proteomica.beans.Reagente> toRemove = new ArrayList<sislab.proteomica.beans.Reagente>(selected.length);
        for (int idx = 0; idx < selected.length; idx++) {
            sislab.proteomica.beans.Reagente r = list.get(masterTable.convertRowIndexToModel(selected[idx]));
            toRemove.add(r);
            entityManager.remove(r);
        }
        list.removeAll(toRemove);
          try {
            entityManager.getTransaction().commit();
            entityManager.getTransaction().begin();
        } catch (RollbackException rex) {
            rex.printStackTrace();
            entityManager.getTransaction().begin();
            List<sislab.proteomica.beans.Reagente> merged = new ArrayList<sislab.proteomica.beans.Reagente>(list.size());
            for (sislab.proteomica.beans.Reagente r : list) {
                merged.add(entityManager.merge(r));
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
        sislab.proteomica.beans.Reagente r = new sislab.proteomica.beans.Reagente();
        entityManager.persist(r);
        r.setQuantAtual(0);
        r.setConcentracao(0.0);
        r.setLperc(0.0);
//      r.setIdLab(cont.getCadLaboratorio().getIdLab().toString());
//      r.setLaboratorio(cont.getCadLaboratorio().getLaboratorio());
        list.add(r);
        int row = list.size() - 1;
        masterTable.setRowSelectionInterval(row, row);
        masterTable.scrollRectToVisible(masterTable.getCellRect(row, 0, true));
        JF_CadastroReagentesView.setSize(719, 388);//[]615, 573
        JF_CadastroReagentesView.setLocationRelativeTo(null);
        JF_CadastroReagentesView.pack();
        JF_CadastroReagentesView.setResizable(false);
        JF_CadastroReagentesView.setVisible(true);
        jtf_IdEstoque.setVisible(false);
        jtf_IdFabricante.setVisible(false);
        
//         jbt_cancelaCadastroFormulario.setEnabled(true);
//         jbt_salvaFormulario.setEnabled(true);
        
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

        JF_CadastroReagentesView.setSize(719, 388);//[][]
        JF_CadastroReagentesView.setLocationRelativeTo(null);
        JF_CadastroReagentesView.pack();
        JF_CadastroReagentesView.setResizable(false);
        JF_CadastroReagentesView.setVisible(true);
        
        
        jtf_IdEstoque.setVisible(false);
        jtf_IdFabricante.setVisible(false);
//        jbt_cancelaCadastroFormulario.setEnabled(true);
//        jbt_salvaFormulario.setEnabled(true);
    }


   private void hotKeyF1()
    {
            frameCadastroReagentesView.getRootPane().registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
            newButton.doClick();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_F1, 0),
                JComponent.WHEN_IN_FOCUSED_WINDOW);
    }
      private void hotKeyF2()
    {
            frameCadastroReagentesView.getRootPane().registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
             refreshButton.requestFocusInWindow();
//            jbt_cancelaCadastroFormulario.doClick();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_F2, 0),JComponent.WHEN_IN_FOCUSED_WINDOW);
    }
       private void hotKeyF3()
    {
            frameCadastroReagentesView.getRootPane().registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
//            jbt_salvaFormulario.doClick();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_F3, 0),
                JComponent.WHEN_IN_FOCUSED_WINDOW);
    }
        private void hotKeyF4()
    {
            frameCadastroReagentesView.getRootPane().registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                
                   JF_CadastroReagentesView.setSize(719, 3882);
        JF_CadastroReagentesView.setLocationRelativeTo(null);
        JF_CadastroReagentesView.pack();
        JF_CadastroReagentesView.setResizable(false);
        JF_CadastroReagentesView.setVisible(true);
 
      
        jtf_IdEstoque.setVisible(false);
        jtf_IdFabricante.setVisible(false);
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_F4, 0),
                JComponent.WHEN_IN_FOCUSED_WINDOW);
    }
        
            private void hotKeyF11()
    {
            frameCadastroReagentesView.getRootPane().registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                if (jtf_nomeReagente.isEnabled()){
                
                    String args[] = new String[1];
                    args[0] = "Importar Fabricantes";
                    FabricanteImports.main(args);
                }
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_F4, 0),
                JComponent.WHEN_IN_FOCUSED_WINDOW);
    }
            
                private void hotKeyF12()
    {
            frameCadastroReagentesView.getRootPane().registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                if (jtf_nomeReagente.isEnabled()){
                
                    String args[] = new String[1];
                    args[0] = "Importar Estoque";
                    EstoqueImportsView.main(args);
                }
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_F4, 0),
                JComponent.WHEN_IN_FOCUSED_WINDOW);
    }

     private void hotKeyDel()
    {
            frameCadastroReagentesView.getRootPane().registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
            deleteButton.doClick();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_F5, 0),
                JComponent.WHEN_IN_FOCUSED_WINDOW);
    }

         private void hotKeyEsc()
    {
            frameCadastroReagentesView.getRootPane().registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
             if(jtf_nomeReagente.isEnabled())
              {
                  int opcao4;
                        Object[] botoes4 = {" SIM "," NÃO "};
                        opcao4 = JOptionPane.showOptionDialog(null, "Deseja fechar o Cadastro de Lotes sem salvar ?", "Pergunta do Sistema", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,null,botoes4,botoes4[0]);
                        if (opcao4 ==  JOptionPane.YES_OPTION)
                        {
                   //         pararWebcam();
                         frameCadastroReagentesView.dispose();
                         } else if(opcao4 == JOptionPane.NO_OPTION)
                        {

                        }
              }
            else  if(jtf_nomeReagente.isEnabled() == false)
              {
                  int opcao5;
                        Object[] botoes5 = {" SIM "," NÃO "};
                        opcao5 = JOptionPane.showOptionDialog(null, "Tem certeza que deseja fechar o Cadastro de Lotes ?", "Pergunta do Sistema", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,null,botoes5,botoes5[0]);
                        if (opcao5 ==  JOptionPane.YES_OPTION)
                        {
                    //        pararWebcam();
                         frameCadastroReagentesView.dispose();
                         } else if(opcao5 == JOptionPane.NO_OPTION)
                        {

                        }

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
           hotKeyF11();
           hotKeyF12();
           hotKeyDel();
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
       
    public void setJtf_estoqueDetalhe(String jtf_estoqueDetalhe) {
        this.jtf_estoqueDetalhe.setText(jtf_estoqueDetalhe);       
    }

    //### IMPORTAÇÕES DA ALOCAÇÃO PADRÃO ###

    public void setJtf_nomeEstoque(String jtf_nomeEstoque) {
        this.jtf_nomeEstoque.setText(jtf_nomeEstoque);
    }

    public void setJtf_localizacaoEstoque(String jtf_localizacaoEstoque) {
        this.jtf_localizacaoEstoque.setText(jtf_localizacaoEstoque);
    }
  

    public void setJtf_tipoEstoque(String jtf_tipoEstoque) {
        this.jtf_tipoEstoque.setText(jtf_tipoEstoque);
    }

    public void setJtf_IdEstoque(Integer jtf_IdEstoque) {
        this.jtf_IdEstoque.setText(jtf_IdEstoque.toString());
    }

    public void setJtf_sala(String jtf_sala) {
        this.jtf_sala.setText(jtf_sala);
    }

    public void setJtf_idLab(String jtf_idLab) {
        this.jtf_idLab.setText(jtf_idLab);
    }

    public void setJtf_id_localizacao(String jtf_id_localizacao) {
        this.jtf_id_localizacao.setText(jtf_id_localizacao);
    }

    public void setJtf_lab(String jtf_lab) {
        this.jtf_lab.setText(jtf_lab);
    }

    public void setjTextArea1(String jTextArea1) {
        this.jTextArea1.setText(jTextArea1);
    }
    
    
    
    

    //### IMPORTAÇÃO DADOS DO FABRICANTE ###
    public void setJtf_IdFabricante(Integer jtf_IdFabricante) {
        this.jtf_IdFabricante.setText(jtf_IdFabricante.toString());
    }

    public void setJtf_fabricante(String jtf_fabricante) {
        this.jtf_fabricante.setText(jtf_fabricante);
    }
       
       
       
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame JF_CadastroReagentesView;
    private javax.swing.JFrame JF_pesquisarCadastroReagentesView;
    private java.util.List<sislab.proteomica.beans.CadLocalizacao> cadLocalizacaoList;
    private javax.persistence.Query cadLocalizacaoQuery;
    private sislab.proteomica.engine.ConverterBusca converterBusca1;
    private javax.swing.JButton deleteButton;
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JButton jbt_editar;
    private javax.swing.JComboBox<String> jcb_tipoQuant;
    private javax.swing.JComboBox<String> jcb_tipoReagente;
    private javax.swing.JLabel jl_percent;
    private javax.swing.JTextField jtf_IdEstoque;
    private javax.swing.JTextField jtf_IdFabricante;
    private javax.swing.JTextField jtf_codReagente;
    private javax.swing.JTextField jtf_concentracaoReagente;
    private javax.swing.JTextField jtf_estoqueDetalhe;
    private javax.swing.JTextField jtf_fabricante;
    private javax.swing.JTextField jtf_idLab;
    private javax.swing.JTextField jtf_id_localizacao;
    private javax.swing.JTextField jtf_lab;
    private javax.swing.JTextField jtf_localizacaoEstoque;
    private javax.swing.JTextField jtf_nomeEstoque;
    private javax.swing.JTextField jtf_nomeReagente;
    private javax.swing.JTextField jtf_quantMin;
    private javax.swing.JTextField jtf_quantUnd;
    private javax.swing.JTextField jtf_sala;
    private javax.swing.JTextField jtf_tipoEstoque;
    private java.util.List<sislab.proteomica.beans.Reagente> list;
    private sislab.proteomica.view.movimento.LocalizacaoCadastroReagentesCellRenderer localizacaoCadastroReagentesCellRenderer1;
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
                if(frameCadastroReagentesView == null) 
                frameCadastroReagentesView = new JFrame();
                crw = new CadastroReagentesView();
                frameCadastroReagentesView.setContentPane(crw);   
                frameCadastroReagentesView.setSize(1048, 598);
                frameCadastroReagentesView.setResizable(false);
                frameCadastroReagentesView.setLocationRelativeTo(null);
                frameCadastroReagentesView.pack();
                frameCadastroReagentesView.setVisible(true);
                frameCadastroReagentesView.setTitle(args[0]);

            }
        });
    }
    
}
