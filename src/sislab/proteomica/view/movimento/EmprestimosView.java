/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sislab.proteomica.view.movimento;

import sislab.proteomica.pds.ImportarContatoPDSEmprestimoView;
import java.awt.AWTEvent;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.beans.Beans;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import javax.persistence.RollbackException;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.KeyStroke;
import javax.swing.SpinnerDateModel;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
import sislab.proteomica.engine.Container;
import sislab.proteomica.importsview.ImportReagentesEmprestimoFrameView;

/**
 *
 * @author canep
 */
public class EmprestimosView extends JPanel {
     private static JFrame frameEmprestimosView;
   static  Container cont = new Container();
      public static EmprestimosView empres;
    public EmprestimosView() {
        initComponents();
        if (!Beans.isDesignTime()) {
            entityManager.getTransaction().begin();
        }
        jtf_idUsuarioEmprestimo.setVisible(false);
        jtf_usuarioEmprestimo.setVisible(false);
        jtf_statusReagente.setVisible(false);
        jSpinner2.setVisible(false);
        jtf_idpds.setVisible(false);
        jTextField9.setVisible(false);
        jTextField10.setVisible(false);
        jtf_empContatoIdMvd.setVisible(false);
        jtf_emprestadoPor.setVisible(false);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("fenyx?zeroDateTimeBehavior=convertToNullPU").createEntityManager();
        query = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT m FROM MovDet m WHERE m.idLab ="+cont.getCadLaboratorio().getIdLab().toString()+" AND m.statusLote='ATIVO' AND m.statusReagente='ATIVO'");
        list = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(query.getResultList());
        JD_kk = new javax.swing.JDialog();
        Date date = new Date();
        SpinnerDateModel sm = new SpinnerDateModel(date, null, null, Calendar.HOUR_OF_DAY);
        jSpinner1 = new javax.swing.JSpinner(sm);
        JD_EmprestimosView = new javax.swing.JDialog();
        jLabel29 = new javax.swing.JLabel();
        jTextField21 = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jDateChooser7 = new com.toedter.calendar.JDateChooser();
        SpinnerDateModel sm1 = new SpinnerDateModel(date, null, null, Calendar.HOUR_OF_DAY);
        jSpinner2 = new javax.swing.JSpinner(sm1);
        jLabel32 = new javax.swing.JLabel();
        jTextField24 = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jtf_statusReagente = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jDateChooser8 = new com.toedter.calendar.JDateChooser();
        jtf_idUsuarioEmprestimo = new javax.swing.JTextField();
        jtf_usuarioEmprestimo = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        timer1 = new org.netbeans.examples.lib.timerbean.Timer();
        cadLocalizacaoQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT c FROM CadLocalizacao c WHERE c.idLab ="+cont.getCadLaboratorio().getIdLab().toString());
        cadLocalizacaoList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : cadLocalizacaoQuery.getResultList();
        localizacaoEmprestimoCellRenderer1 = new sislab.proteomica.view.movimento.LocalizacaoEmprestimoCellRenderer();
        JF_EMPRESTAR = new javax.swing.JFrame();
        jLabel7 = new javax.swing.JLabel();
        jtf_labpds = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jtf_localpds = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jtf_deptpds = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jtf_salapds = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jtf_telpds = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jtf_responpds = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jtf_nomecontatopds = new javax.swing.JTextField();
        jButton8 = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        jtf_vincpds = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jtf_telemailcontatopds = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jdt_data_emprestimo = new com.toedter.calendar.JDateChooser();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel27 = new javax.swing.JLabel();
        jDateChooser4 = new com.toedter.calendar.JDateChooser();
        jPanel6 = new javax.swing.JPanel();
        jToolBar3 = new javax.swing.JToolBar();
        jButton9 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jButton10 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jtf_emprestadoPor = new javax.swing.JTextField();
        jtf_empContatoIdMvd = new javax.swing.JTextField();
        jtf_idpds = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        JF_RECEBIMENTO = new javax.swing.JFrame();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jDateChooser3 = new com.toedter.calendar.JDateChooser();
        jLabel28 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jmi_emprestar = new javax.swing.JMenuItem();
        jmi_receber = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        JF_PESQUISA_ = new javax.swing.JFrame();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jtf_nomeReagenteImportado = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        JF_PESQUISAR_DATA_VEOL = new javax.swing.JFrame();
        jdc_dataInicialDevol = new com.toedter.calendar.JDateChooser(new Date());
        jdc_dataFinalDevol = new com.toedter.calendar.JDateChooser();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        JF_VISDADOS = new javax.swing.JFrame();
        jTextField13 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jTextField16 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jTextField17 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jTextField18 = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        jDateChooser5 = new com.toedter.calendar.JDateChooser();
        jTextField19 = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jTextField20 = new javax.swing.JTextField();
        jButton17 = new javax.swing.JButton();
        jLabel38 = new javax.swing.JLabel();
        jTextField22 = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        jDateChooser6 = new com.toedter.calendar.JDateChooser();
        JF_DADOS_PESQUISA_LAB = new javax.swing.JFrame();
        jLabel40 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jButton18 = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        consultaReagentesEmprestadosCellRenderer1 = new sislab.proteomica.view.movimento.ConsultaReagentesEmprestadosCellRenderer();
        pdsQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT p FROM Pds p");
        pdsList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : pdsQuery.getResultList();
        masterScrollPane = new javax.swing.JScrollPane();
        masterTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        refreshButton = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jbt_emprestar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        FormListener formListener = new FormListener();

        JSpinner.DateEditor de = new JSpinner.DateEditor(jSpinner1, "HH:mm:ss");
        jSpinner1.setEditor(de);

        javax.swing.GroupLayout JD_kkLayout = new javax.swing.GroupLayout(JD_kk.getContentPane());
        JD_kk.getContentPane().setLayout(JD_kkLayout);
        JD_kkLayout.setHorizontalGroup(
            JD_kkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JD_kkLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(340, 340, 340))
        );
        JD_kkLayout.setVerticalGroup(
            JD_kkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JD_kkLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel29.setText("Emprestado Para:");

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.emprestadoPara}"), jTextField21, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jTextField21.addActionListener(formListener);

        jLabel30.setText("Data Emprestimo:");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.dataEmprestimo}"), jDateChooser7, org.jdesktop.beansbinding.BeanProperty.create("date"));
        bindingGroup.addBinding(binding);

        JSpinner.DateEditor de1 = new JSpinner.DateEditor(jSpinner2, "HH:mm:ss");
        jSpinner2.setEditor(de1);

        jLabel32.setText("Autorizado:");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.autorizadoPor}"), jTextField24, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jTextField24.addActionListener(formListener);

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.empObsMvd}"), jTextArea3, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jScrollPane3.setViewportView(jTextArea3);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sislab/images/excluir.png"))); // NOI18N
        jButton4.setText("Salvar");
        jButton4.addActionListener(formListener);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sislab/images/cancelar.png"))); // NOI18N
        jButton5.setText("Cancelar");
        jButton5.addActionListener(formListener);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.statusReagente}"), jtf_statusReagente, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jtf_statusReagente.addActionListener(formListener);

        jLabel33.setText("Dev. Para:");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.devolAgendada}"), jDateChooser8, org.jdesktop.beansbinding.BeanProperty.create("date"));
        bindingGroup.addBinding(binding);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.idUsuarioEmprestimo}"), jtf_idUsuarioEmprestimo, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.usuarioEmprestimo}"), jtf_usuarioEmprestimo, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jLabel31.setText("Obs.:");

        jLabel1.setText("Vinculação:");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.empVinculacao}"), jTextField2, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jLabel2.setText("Depto:");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.empDep}"), jTextField3, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jLabel4.setText("Lab:");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.empLab}"), jTextField4, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jLabel5.setText("Sala:");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.empSala}"), jTextField5, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.empLocalizacao}"), jTextField6, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jLabel6.setText("Localização:");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.empContatoId}"), jTextField7, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.empLabId}"), jTextField8, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        javax.swing.GroupLayout JD_EmprestimosViewLayout = new javax.swing.GroupLayout(JD_EmprestimosView.getContentPane());
        JD_EmprestimosView.getContentPane().setLayout(JD_EmprestimosViewLayout);
        JD_EmprestimosViewLayout.setHorizontalGroup(
            JD_EmprestimosViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JD_EmprestimosViewLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JD_EmprestimosViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JD_EmprestimosViewLayout.createSequentialGroup()
                        .addGroup(JD_EmprestimosViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel30)
                            .addComponent(jLabel32))
                        .addGap(18, 18, 18)
                        .addGroup(JD_EmprestimosViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField24)
                            .addGroup(JD_EmprestimosViewLayout.createSequentialGroup()
                                .addComponent(jDateChooser7, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel33)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jDateChooser8, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(JD_EmprestimosViewLayout.createSequentialGroup()
                        .addGroup(JD_EmprestimosViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel31)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JD_EmprestimosViewLayout.createSequentialGroup()
                        .addGroup(JD_EmprestimosViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(JD_EmprestimosViewLayout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jtf_idUsuarioEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)
                                .addComponent(jtf_usuarioEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jtf_statusReagente, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                                .addComponent(jButton5)
                                .addGap(18, 18, 18)
                                .addComponent(jButton4))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, JD_EmprestimosViewLayout.createSequentialGroup()
                                .addGroup(JD_EmprestimosViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel29)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6))
                                .addGap(18, 18, 18)
                                .addGroup(JD_EmprestimosViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField21, javax.swing.GroupLayout.DEFAULT_SIZE, 386, Short.MAX_VALUE)
                                    .addComponent(jTextField2)
                                    .addComponent(jTextField4)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JD_EmprestimosViewLayout.createSequentialGroup()
                                        .addComponent(jTextField3)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jTextField6))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        JD_EmprestimosViewLayout.setVerticalGroup(
            JD_EmprestimosViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JD_EmprestimosViewLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JD_EmprestimosViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(JD_EmprestimosViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(JD_EmprestimosViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addGroup(JD_EmprestimosViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(JD_EmprestimosViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(JD_EmprestimosViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(JD_EmprestimosViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel30)
                    .addComponent(jDateChooser7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33)
                    .addComponent(jDateChooser8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(JD_EmprestimosViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(JD_EmprestimosViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JD_EmprestimosViewLayout.createSequentialGroup()
                        .addComponent(jLabel31)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(JD_EmprestimosViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton5)
                    .addComponent(jtf_statusReagente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtf_usuarioEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtf_idUsuarioEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        localizacaoEmprestimoCellRenderer1.setText("localizacaoEmprestimoCellRenderer1");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Laboratório:");

        jtf_labpds.setEditable(false);
        jtf_labpds.setBackground(new java.awt.Color(255, 204, 204));
        jtf_labpds.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtf_labpds.setEnabled(false);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.empLabMvd}"), jtf_labpds, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Localização:");

        jtf_localpds.setEditable(false);
        jtf_localpds.setBackground(new java.awt.Color(255, 204, 204));
        jtf_localpds.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtf_localpds.setEnabled(false);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.empLocalizacaoMvd}"), jtf_localpds, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("Departamento:");

        jtf_deptpds.setEditable(false);
        jtf_deptpds.setBackground(new java.awt.Color(255, 204, 204));
        jtf_deptpds.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtf_deptpds.setEnabled(false);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.empDepMvd}"), jtf_deptpds, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("Sala:");

        jtf_salapds.setEditable(false);
        jtf_salapds.setBackground(new java.awt.Color(255, 204, 204));
        jtf_salapds.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtf_salapds.setEnabled(false);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.empSalaMvd}"), jtf_salapds, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setText("Telefone");

        jtf_telpds.setEditable(false);
        jtf_telpds.setBackground(new java.awt.Color(255, 204, 204));
        jtf_telpds.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtf_telpds.setEnabled(false);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.empLabTel}"), jtf_telpds, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setText("Responsável:");

        jtf_responpds.setEditable(false);
        jtf_responpds.setBackground(new java.awt.Color(255, 204, 204));
        jtf_responpds.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtf_responpds.setEnabled(false);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.empResponsavelMvd}"), jtf_responpds, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel23.setText("Nome Cont.:");

        jtf_nomecontatopds.setEditable(false);
        jtf_nomecontatopds.setBackground(new java.awt.Color(255, 204, 204));
        jtf_nomecontatopds.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtf_nomecontatopds.setEnabled(false);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.emprestadoPara}"), jtf_nomecontatopds, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sislab/images/viewmag.png"))); // NOI18N
        jButton8.addActionListener(formListener);

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel24.setText("Vinculação:");

        jtf_vincpds.setEditable(false);
        jtf_vincpds.setBackground(new java.awt.Color(255, 204, 204));
        jtf_vincpds.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtf_vincpds.setEnabled(false);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.empVinculacaoMvd}"), jtf_vincpds, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel25.setText("Contato:");

        jtf_telemailcontatopds.setEditable(false);
        jtf_telemailcontatopds.setBackground(new java.awt.Color(255, 204, 204));
        jtf_telemailcontatopds.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtf_telemailcontatopds.setEnabled(false);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.empContatoTelMvd}"), jtf_telemailcontatopds, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel26.setText("Data:");

        jdt_data_emprestimo.setBackground(new java.awt.Color(255, 255, 255));
        jdt_data_emprestimo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.dataEmprestimo}"), jdt_data_emprestimo, org.jdesktop.beansbinding.BeanProperty.create("date"));
        bindingGroup.addBinding(binding);

        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextArea2.setRows(5);
        jTextArea2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Observações", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.empObsMvd}"), jTextArea2, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jScrollPane2.setViewportView(jTextArea2);

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel27.setText("Devolução Prevista Em:");

        jDateChooser4.setBackground(new java.awt.Color(255, 255, 255));
        jDateChooser4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.devolAgendada}"), jDateChooser4, org.jdesktop.beansbinding.BeanProperty.create("date"));
        bindingGroup.addBinding(binding);

        jPanel6.setLayout(new java.awt.GridBagLayout());

        jToolBar3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jToolBar3.setFloatable(false);
        jToolBar3.setRollover(true);

        jButton9.setBackground(new java.awt.Color(102, 102, 102));
        jButton9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sislab/images/excluir.png"))); // NOI18N
        jButton9.setText("Salvar");
        jButton9.setMaximumSize(new java.awt.Dimension(130, 35));
        jButton9.setMinimumSize(new java.awt.Dimension(130, 35));
        jButton9.setPreferredSize(new java.awt.Dimension(130, 35));
        jButton9.addActionListener(formListener);
        jToolBar3.add(jButton9);

        jPanel7.setBackground(new java.awt.Color(102, 102, 102));
        jToolBar3.add(jPanel7);

        jButton10.setBackground(new java.awt.Color(102, 102, 102));
        jButton10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton10.setForeground(new java.awt.Color(255, 255, 255));
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sislab/images/cancelar.png"))); // NOI18N
        jButton10.setText("Cancelar");
        jButton10.setFocusable(false);
        jButton10.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton10.setMaximumSize(new java.awt.Dimension(130, 35));
        jButton10.setMinimumSize(new java.awt.Dimension(130, 35));
        jButton10.setPreferredSize(new java.awt.Dimension(130, 35));
        jButton10.addActionListener(formListener);
        jToolBar3.add(jButton10);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHEAST;
        gridBagConstraints.weightx = 1.0;
        jPanel6.add(jToolBar3, gridBagConstraints);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.emprestadoPor}"), jtf_emprestadoPor, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.empContatoIdMvd}"), jtf_empContatoIdMvd, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.empLabIdMvd}"), jtf_idpds, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.usuarioEmprestimo}"), jTextField9, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.idUsuarioEmprestimo}"), jTextField10, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jtf_emprestadoPor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtf_empContatoIdMvd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jtf_idpds, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtf_emprestadoPor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtf_empContatoIdMvd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtf_idpds, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout JF_EMPRESTARLayout = new javax.swing.GroupLayout(JF_EMPRESTAR.getContentPane());
        JF_EMPRESTAR.getContentPane().setLayout(JF_EMPRESTARLayout);
        JF_EMPRESTARLayout.setHorizontalGroup(
            JF_EMPRESTARLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(JF_EMPRESTARLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JF_EMPRESTARLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JF_EMPRESTARLayout.createSequentialGroup()
                        .addGroup(JF_EMPRESTARLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel24)
                            .addComponent(jLabel25))
                        .addGap(37, 37, 37)
                        .addGroup(JF_EMPRESTARLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtf_vincpds)
                            .addGroup(JF_EMPRESTARLayout.createSequentialGroup()
                                .addComponent(jtf_telemailcontatopds, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel27)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jDateChooser4, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE))))
                    .addGroup(JF_EMPRESTARLayout.createSequentialGroup()
                        .addGroup(JF_EMPRESTARLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel8)
                            .addGroup(JF_EMPRESTARLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel12)
                            .addComponent(jLabel23))
                        .addGap(18, 18, 18)
                        .addGroup(JF_EMPRESTARLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtf_nomecontatopds)
                            .addComponent(jtf_responpds)
                            .addComponent(jtf_localpds)
                            .addComponent(jtf_deptpds)
                            .addGroup(JF_EMPRESTARLayout.createSequentialGroup()
                                .addComponent(jtf_labpds)
                                .addGap(18, 18, 18)
                                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(JF_EMPRESTARLayout.createSequentialGroup()
                                .addComponent(jtf_salapds, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addComponent(jtf_telpds, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel26)
                                .addGap(18, 18, 18)
                                .addComponent(jdt_data_emprestimo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        JF_EMPRESTARLayout.setVerticalGroup(
            JF_EMPRESTARLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JF_EMPRESTARLayout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(JF_EMPRESTARLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JF_EMPRESTARLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButton8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(JF_EMPRESTARLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jtf_labpds, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JF_EMPRESTARLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jtf_localpds, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JF_EMPRESTARLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jtf_deptpds, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JF_EMPRESTARLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JF_EMPRESTARLayout.createSequentialGroup()
                        .addGroup(JF_EMPRESTARLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jtf_salapds, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(jtf_telpds, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel26))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(JF_EMPRESTARLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(jtf_responpds, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(JF_EMPRESTARLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23)
                            .addComponent(jtf_nomecontatopds, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(JF_EMPRESTARLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel24)
                            .addComponent(jtf_vincpds, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jdt_data_emprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JF_EMPRESTARLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDateChooser4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(JF_EMPRESTARLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel25)
                        .addComponent(jtf_telemailcontatopds, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel27)))
                .addGap(20, 20, 20)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE))
        );

        jTextArea4.setColumns(20);
        jTextArea4.setRows(5);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.empObsMvd}"), jTextArea4, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jScrollPane4.setViewportView(jTextArea4);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.dataDevol}"), jDateChooser3, org.jdesktop.beansbinding.BeanProperty.create("date"));
        bindingGroup.addBinding(binding);

        jLabel28.setText("Recebido em:");

        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sislab/images/excluir.png"))); // NOI18N
        jButton11.setText("Salvar");
        jButton11.addActionListener(formListener);

        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sislab/images/cancelar.png"))); // NOI18N
        jButton12.setText("Cancelar");
        jButton12.addActionListener(formListener);

        javax.swing.GroupLayout JF_RECEBIMENTOLayout = new javax.swing.GroupLayout(JF_RECEBIMENTO.getContentPane());
        JF_RECEBIMENTO.getContentPane().setLayout(JF_RECEBIMENTOLayout);
        JF_RECEBIMENTOLayout.setHorizontalGroup(
            JF_RECEBIMENTOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JF_RECEBIMENTOLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JF_RECEBIMENTOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JF_RECEBIMENTOLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton12)
                        .addGap(18, 18, 18)
                        .addComponent(jButton11))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JF_RECEBIMENTOLayout.createSequentialGroup()
                        .addGap(114, 320, Short.MAX_VALUE)
                        .addComponent(jLabel28)
                        .addGap(18, 18, 18)
                        .addComponent(jDateChooser3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        JF_RECEBIMENTOLayout.setVerticalGroup(
            JF_RECEBIMENTOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JF_RECEBIMENTOLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JF_RECEBIMENTOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jDateChooser3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(JF_RECEBIMENTOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton11)
                    .addComponent(jButton12))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jmi_emprestar.setText("Emprestar");
        jmi_emprestar.addActionListener(formListener);
        jPopupMenu1.add(jmi_emprestar);

        jmi_receber.setText("Receber");
        jmi_receber.addActionListener(formListener);
        jPopupMenu1.add(jmi_receber);

        jMenuItem1.setText("Visualizar Dados de Empréstimos e Recebimento");
        jMenuItem1.addActionListener(formListener);
        jPopupMenu1.add(jMenuItem1);

        jButton2.setText("Pesquisar");
        jButton2.addActionListener(formListener);

        jLabel3.setText("Pesquisar Em:");

        jComboBox2.setRenderer(localizacaoEmprestimoCellRenderer1);

        org.jdesktop.swingbinding.JComboBoxBinding jComboBoxBinding = org.jdesktop.swingbinding.SwingBindings.createJComboBoxBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, cadLocalizacaoList, jComboBox2);
        bindingGroup.addBinding(jComboBoxBinding);

        jComboBox2.addActionListener(formListener);

        jLabel13.setText("Parametro:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ETIQUETA", "DO ESTOQUE" }));
        jComboBox1.addActionListener(formListener);

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sislab/images/viewmag.png"))); // NOI18N
        jButton6.addActionListener(formListener);

        jButton7.setText("Fechar");
        jButton7.addActionListener(formListener);

        javax.swing.GroupLayout JF_PESQUISA_Layout = new javax.swing.GroupLayout(JF_PESQUISA_.getContentPane());
        JF_PESQUISA_.getContentPane().setLayout(JF_PESQUISA_Layout);
        JF_PESQUISA_Layout.setHorizontalGroup(
            JF_PESQUISA_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JF_PESQUISA_Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JF_PESQUISA_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JF_PESQUISA_Layout.createSequentialGroup()
                        .addComponent(jtf_nomeReagenteImportado, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JF_PESQUISA_Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(JF_PESQUISA_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JF_PESQUISA_Layout.createSequentialGroup()
                                .addGroup(JF_PESQUISA_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel13))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(JF_PESQUISA_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBox2, 0, 180, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JF_PESQUISA_Layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addGap(18, 18, 18)
                                .addComponent(jButton7)))))
                .addContainerGap())
        );
        JF_PESQUISA_Layout.setVerticalGroup(
            JF_PESQUISA_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JF_PESQUISA_Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JF_PESQUISA_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(JF_PESQUISA_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addGroup(JF_PESQUISA_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtf_nomeReagenteImportado)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(JF_PESQUISA_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton7))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton14.setText("Pesquisar");
        jButton14.addActionListener(formListener);

        jButton15.setText("Fechar");
        jButton15.addActionListener(formListener);

        jLabel15.setText("Data Inicial:");

        jLabel16.setText("Data Final:");

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setLayout(new java.awt.GridBagLayout());

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("PESQUISAR POR DATA DE DEVOLUÇÃO");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHEAST;
        gridBagConstraints.weightx = 1.0;
        jPanel3.add(jLabel14, gridBagConstraints);

        javax.swing.GroupLayout JF_PESQUISAR_DATA_VEOLLayout = new javax.swing.GroupLayout(JF_PESQUISAR_DATA_VEOL.getContentPane());
        JF_PESQUISAR_DATA_VEOL.getContentPane().setLayout(JF_PESQUISAR_DATA_VEOLLayout);
        JF_PESQUISAR_DATA_VEOLLayout.setHorizontalGroup(
            JF_PESQUISAR_DATA_VEOLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(JF_PESQUISAR_DATA_VEOLLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JF_PESQUISAR_DATA_VEOLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JF_PESQUISAR_DATA_VEOLLayout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jdc_dataInicialDevol, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jdc_dataFinalDevol, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JF_PESQUISAR_DATA_VEOLLayout.createSequentialGroup()
                        .addComponent(jButton14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton15)))
                .addContainerGap())
        );
        JF_PESQUISAR_DATA_VEOLLayout.setVerticalGroup(
            JF_PESQUISAR_DATA_VEOLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JF_PESQUISAR_DATA_VEOLLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(JF_PESQUISAR_DATA_VEOLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16)
                    .addComponent(jdc_dataInicialDevol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jdc_dataFinalDevol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(JF_PESQUISAR_DATA_VEOLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton15)
                    .addComponent(jButton14))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTextField13.setEnabled(false);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.emprestadoPara}"), jTextField13, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jLabel19.setText("Laboratório");

        jTextField14.setEnabled(false);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.empLabMvd}"), jTextField14, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jLabel20.setText("Responsável");

        jTextField15.setEnabled(false);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.empResponsavelMvd}"), jTextField15, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jLabel21.setText("Depto.:");

        jTextField16.setEnabled(false);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.empDepMvd}"), jTextField16, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jLabel22.setText("Local:");

        jTextField17.setEnabled(false);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.empLocalizacaoMvd}"), jTextField17, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jLabel18.setText("Sala:");

        jLabel34.setText("Devolução:");

        jLabel35.setText("Empretador Para:");

        jTextField18.setEnabled(false);

        jLabel36.setText("Tel.:");

        jDateChooser5.setEnabled(false);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.dataDevol}"), jDateChooser5, org.jdesktop.beansbinding.BeanProperty.create("date"));
        bindingGroup.addBinding(binding);

        jTextField19.setEnabled(false);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.empContatoTelMvd}"), jTextField19, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jLabel37.setText("Vinculação:");

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setEnabled(false);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.empObsMvd}"), jTextArea1, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jScrollPane5.setViewportView(jTextArea1);

        jTextField20.setEnabled(false);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.empVinculacaoMvd}"), jTextField20, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jButton17.setText("Fechar");
        jButton17.addActionListener(formListener);

        jLabel38.setText("Contato:");

        jTextField22.setEnabled(false);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.empContatoTelMvd}"), jTextField22, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jLabel39.setText("Data Emp:");

        jDateChooser6.setEnabled(false);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.dataEmprestimo}"), jDateChooser6, org.jdesktop.beansbinding.BeanProperty.create("date"));
        bindingGroup.addBinding(binding);

        javax.swing.GroupLayout JF_VISDADOSLayout = new javax.swing.GroupLayout(JF_VISDADOS.getContentPane());
        JF_VISDADOS.getContentPane().setLayout(JF_VISDADOSLayout);
        JF_VISDADOSLayout.setHorizontalGroup(
            JF_VISDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JF_VISDADOSLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton17)
                .addContainerGap())
            .addGroup(JF_VISDADOSLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JF_VISDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JF_VISDADOSLayout.createSequentialGroup()
                        .addComponent(jScrollPane5)
                        .addContainerGap())
                    .addGroup(JF_VISDADOSLayout.createSequentialGroup()
                        .addGroup(JF_VISDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel35)
                            .addComponent(jLabel37)
                            .addComponent(jLabel38)
                            .addComponent(jLabel39)
                            .addComponent(jLabel34))
                        .addGap(18, 18, 18)
                        .addGroup(JF_VISDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField13)
                            .addComponent(jTextField20)
                            .addComponent(jTextField22)
                            .addComponent(jDateChooser6, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                            .addComponent(jDateChooser5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(JF_VISDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(JF_VISDADOSLayout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField15))
                            .addGroup(JF_VISDADOSLayout.createSequentialGroup()
                                .addGroup(JF_VISDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel19)
                                    .addComponent(jLabel21))
                                .addGap(24, 24, 24)
                                .addGroup(JF_VISDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField16)
                                    .addComponent(jTextField14)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, JF_VISDADOSLayout.createSequentialGroup()
                                .addGroup(JF_VISDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel22)
                                    .addComponent(jLabel18))
                                .addGap(51, 51, 51)
                                .addGroup(JF_VISDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(JF_VISDADOSLayout.createSequentialGroup()
                                        .addComponent(jTextField18, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel36)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jTextField17))))
                        .addGap(18, 18, 18))))
        );
        JF_VISDADOSLayout.setVerticalGroup(
            JF_VISDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JF_VISDADOSLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JF_VISDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(JF_VISDADOSLayout.createSequentialGroup()
                        .addGroup(JF_VISDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(JF_VISDADOSLayout.createSequentialGroup()
                                .addGroup(JF_VISDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel35)
                                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel19)
                                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(JF_VISDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel37)
                                    .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel21)
                                    .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(JF_VISDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel38)
                                    .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel20)
                                    .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(JF_VISDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel39)
                                    .addComponent(jDateChooser6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField17, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel22))
                        .addGap(18, 18, 18)
                        .addGroup(JF_VISDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel34)
                            .addComponent(jDateChooser5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(JF_VISDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel18)
                        .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel36)
                        .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton17)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel40.setText("Pesquisar:");

        jComboBox3.setRenderer(consultaReagentesEmprestadosCellRenderer1);

        jComboBoxBinding = org.jdesktop.swingbinding.SwingBindings.createJComboBoxBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, pdsList, jComboBox3);
        bindingGroup.addBinding(jComboBoxBinding);

        jButton18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sislab/images/find.png"))); // NOI18N
        jButton18.setText("Buscar");
        jButton18.addActionListener(formListener);

        jCheckBox1.setText("Gerar Arquivo para Impressão");

        javax.swing.GroupLayout JF_DADOS_PESQUISA_LABLayout = new javax.swing.GroupLayout(JF_DADOS_PESQUISA_LAB.getContentPane());
        JF_DADOS_PESQUISA_LAB.getContentPane().setLayout(JF_DADOS_PESQUISA_LABLayout);
        JF_DADOS_PESQUISA_LABLayout.setHorizontalGroup(
            JF_DADOS_PESQUISA_LABLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JF_DADOS_PESQUISA_LABLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JF_DADOS_PESQUISA_LABLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JF_DADOS_PESQUISA_LABLayout.createSequentialGroup()
                        .addGap(0, 148, Short.MAX_VALUE)
                        .addComponent(jCheckBox1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JF_DADOS_PESQUISA_LABLayout.createSequentialGroup()
                        .addComponent(jLabel40)
                        .addGap(24, 24, 24)
                        .addComponent(jComboBox3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        JF_DADOS_PESQUISA_LABLayout.setVerticalGroup(
            JF_DADOS_PESQUISA_LABLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JF_DADOS_PESQUISA_LABLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JF_DADOS_PESQUISA_LABLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addGroup(JF_DADOS_PESQUISA_LABLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton18)
                    .addComponent(jCheckBox1))
                .addContainerGap())
        );

        consultaReagentesEmprestadosCellRenderer1.setText("consultaReagentesEmprestadosCellRenderer1");

        masterScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        masterTable.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        masterTable.setToolTipText("");
        masterTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        masterTable.setComponentPopupMenu(jPopupMenu1);
        masterTable.setRowHeight(20);
        masterTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        masterTable.getTableHeader().setResizingAllowed(false);
        masterTable.getTableHeader().setReorderingAllowed(false);

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, list, masterTable);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${codBar}"));
        columnBinding.setColumnName("IDENTIFICAÇÃO");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${statusReagente}"));
        columnBinding.setColumnName("ESTATUS");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${nomeReagente}"));
        columnBinding.setColumnName("REAGENTE");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${emprestadoPara}"));
        columnBinding.setColumnName("EMP. PARA");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${empContatoTel}"));
        columnBinding.setColumnName("CONTATO");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${dataEmprestimo}"));
        columnBinding.setColumnName("DATA EMP.");
        columnBinding.setColumnClass(java.util.Date.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${devolAgendada}"));
        columnBinding.setColumnName("DATA DEV.");
        columnBinding.setColumnClass(java.util.Date.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${dataValidade}"));
        columnBinding.setColumnName("VALIDADE");
        columnBinding.setColumnClass(java.util.Date.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${empLab}"));
        columnBinding.setColumnName("EMP. LAB");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${concentracao}"));
        columnBinding.setColumnName("CONC.");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${tipoReagente}"));
        columnBinding.setColumnName("TIPO R.");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${tipoUnd}"));
        columnBinding.setColumnName("TIPO UND.");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${quantUnd}"));
        columnBinding.setColumnName("UND.");
        columnBinding.setColumnClass(Double.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${emprestadoPor}"));
        columnBinding.setColumnName("AUTOR EMPRESTIMO");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${empVinculacao}"));
        columnBinding.setColumnName("EMP. VINCULAÇÃO");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${fornecedor}"));
        columnBinding.setColumnName("FORNECEDOR");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${empLocalizacao}"));
        columnBinding.setColumnName("EMP. LOCAL");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${empDep}"));
        columnBinding.setColumnName("EMP. DEPTO");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${fabricante}"));
        columnBinding.setColumnName("FABRICANTE");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${empSala}"));
        columnBinding.setColumnName("EMP. SALA");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${empLabTel}"));
        columnBinding.setColumnName("EMP. LAB TEL");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${empResponsavel}"));
        columnBinding.setColumnName("EMP. RESPONSÁVEL");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${codPlanilha}"));
        columnBinding.setColumnName("COD. COMPRA");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${numeroNota}"));
        columnBinding.setColumnName("N. NOTA");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${numeroLote}"));
        columnBinding.setColumnName("LOTE");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${dataCompra}"));
        columnBinding.setColumnName("DATA COMPRA");
        columnBinding.setColumnClass(java.util.Date.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${dataNota}"));
        columnBinding.setColumnName("DATA NOTA");
        columnBinding.setColumnClass(java.util.Date.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${autorizadoPor}"));
        columnBinding.setColumnName("AUTORIZADO POR");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${usuarioEmprestimo}"));
        columnBinding.setColumnName("EMP. POR");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${usuarioDevolucao}"));
        columnBinding.setColumnName("RECEBIDO POR");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${idUsuarioEmprestimo}"));
        columnBinding.setColumnName("");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${statusReagenteUnd}"));
        columnBinding.setColumnName("");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${idUsuarioDevolucao}"));
        columnBinding.setColumnName("");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${empContatoId}"));
        columnBinding.setColumnName("");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${idUsuario}"));
        columnBinding.setColumnName("");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${idMovDet}"));
        columnBinding.setColumnName("");
        columnBinding.setColumnClass(Integer.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${idLab}"));
        columnBinding.setColumnName("");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${empLabId}"));
        columnBinding.setColumnName("");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${empObs}"));
        columnBinding.setColumnName("");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${idReagente}"));
        columnBinding.setColumnName("");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${idFornecedor}"));
        columnBinding.setColumnName("");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${flagReagente}"));
        columnBinding.setColumnName("");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${obs}"));
        columnBinding.setColumnName("");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${flagEmprestimo}"));
        columnBinding.setColumnName("");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${statusAbertura}"));
        columnBinding.setColumnName("");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${idLocalizacao}"));
        columnBinding.setColumnName("");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${idCadLotes}"));
        columnBinding.setColumnName("");
        columnBinding.setColumnClass(sislab.proteomica.view.lotesNotas.CadLotes.class);
        columnBinding.setEditable(false);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        masterTable.addMouseListener(formListener);
        masterScrollPane.setViewportView(masterTable);
        if (masterTable.getColumnModel().getColumnCount() > 0) {
            masterTable.getColumnModel().getColumn(0).setResizable(false);
            masterTable.getColumnModel().getColumn(0).setPreferredWidth(220);
            masterTable.getColumnModel().getColumn(1).setResizable(false);
            masterTable.getColumnModel().getColumn(1).setPreferredWidth(110);
            masterTable.getColumnModel().getColumn(2).setResizable(false);
            masterTable.getColumnModel().getColumn(2).setPreferredWidth(200);
            masterTable.getColumnModel().getColumn(3).setResizable(false);
            masterTable.getColumnModel().getColumn(3).setPreferredWidth(140);
            masterTable.getColumnModel().getColumn(4).setResizable(false);
            masterTable.getColumnModel().getColumn(4).setPreferredWidth(130);
            masterTable.getColumnModel().getColumn(5).setResizable(false);
            masterTable.getColumnModel().getColumn(5).setPreferredWidth(90);
            masterTable.getColumnModel().getColumn(6).setResizable(false);
            masterTable.getColumnModel().getColumn(6).setPreferredWidth(90);
            masterTable.getColumnModel().getColumn(7).setResizable(false);
            masterTable.getColumnModel().getColumn(7).setPreferredWidth(90);
            masterTable.getColumnModel().getColumn(8).setResizable(false);
            masterTable.getColumnModel().getColumn(8).setPreferredWidth(200);
            masterTable.getColumnModel().getColumn(9).setResizable(false);
            masterTable.getColumnModel().getColumn(9).setPreferredWidth(60);
            masterTable.getColumnModel().getColumn(10).setResizable(false);
            masterTable.getColumnModel().getColumn(10).setPreferredWidth(60);
            masterTable.getColumnModel().getColumn(11).setResizable(false);
            masterTable.getColumnModel().getColumn(11).setPreferredWidth(60);
            masterTable.getColumnModel().getColumn(12).setResizable(false);
            masterTable.getColumnModel().getColumn(12).setPreferredWidth(40);
            masterTable.getColumnModel().getColumn(13).setResizable(false);
            masterTable.getColumnModel().getColumn(14).setResizable(false);
            masterTable.getColumnModel().getColumn(14).setPreferredWidth(80);
            masterTable.getColumnModel().getColumn(15).setResizable(false);
            masterTable.getColumnModel().getColumn(15).setPreferredWidth(120);
            masterTable.getColumnModel().getColumn(16).setResizable(false);
            masterTable.getColumnModel().getColumn(16).setPreferredWidth(80);
            masterTable.getColumnModel().getColumn(17).setResizable(false);
            masterTable.getColumnModel().getColumn(17).setPreferredWidth(80);
            masterTable.getColumnModel().getColumn(18).setResizable(false);
            masterTable.getColumnModel().getColumn(18).setPreferredWidth(120);
            masterTable.getColumnModel().getColumn(19).setResizable(false);
            masterTable.getColumnModel().getColumn(19).setPreferredWidth(80);
            masterTable.getColumnModel().getColumn(20).setResizable(false);
            masterTable.getColumnModel().getColumn(20).setPreferredWidth(80);
            masterTable.getColumnModel().getColumn(21).setResizable(false);
            masterTable.getColumnModel().getColumn(21).setPreferredWidth(80);
            masterTable.getColumnModel().getColumn(22).setResizable(false);
            masterTable.getColumnModel().getColumn(22).setPreferredWidth(50);
            masterTable.getColumnModel().getColumn(23).setResizable(false);
            masterTable.getColumnModel().getColumn(23).setPreferredWidth(70);
            masterTable.getColumnModel().getColumn(24).setResizable(false);
            masterTable.getColumnModel().getColumn(24).setPreferredWidth(70);
            masterTable.getColumnModel().getColumn(25).setResizable(false);
            masterTable.getColumnModel().getColumn(25).setPreferredWidth(70);
            masterTable.getColumnModel().getColumn(26).setResizable(false);
            masterTable.getColumnModel().getColumn(26).setPreferredWidth(70);
            masterTable.getColumnModel().getColumn(27).setResizable(false);
            masterTable.getColumnModel().getColumn(27).setPreferredWidth(100);
            masterTable.getColumnModel().getColumn(28).setResizable(false);
            masterTable.getColumnModel().getColumn(28).setPreferredWidth(100);
            masterTable.getColumnModel().getColumn(29).setResizable(false);
            masterTable.getColumnModel().getColumn(29).setPreferredWidth(100);
            masterTable.getColumnModel().getColumn(30).setResizable(false);
            masterTable.getColumnModel().getColumn(30).setPreferredWidth(0);
            masterTable.getColumnModel().getColumn(31).setResizable(false);
            masterTable.getColumnModel().getColumn(31).setPreferredWidth(0);
            masterTable.getColumnModel().getColumn(32).setResizable(false);
            masterTable.getColumnModel().getColumn(32).setPreferredWidth(0);
            masterTable.getColumnModel().getColumn(33).setResizable(false);
            masterTable.getColumnModel().getColumn(33).setPreferredWidth(0);
            masterTable.getColumnModel().getColumn(34).setResizable(false);
            masterTable.getColumnModel().getColumn(34).setPreferredWidth(0);
            masterTable.getColumnModel().getColumn(35).setResizable(false);
            masterTable.getColumnModel().getColumn(35).setPreferredWidth(0);
            masterTable.getColumnModel().getColumn(36).setResizable(false);
            masterTable.getColumnModel().getColumn(36).setPreferredWidth(0);
            masterTable.getColumnModel().getColumn(37).setResizable(false);
            masterTable.getColumnModel().getColumn(37).setPreferredWidth(0);
            masterTable.getColumnModel().getColumn(38).setResizable(false);
            masterTable.getColumnModel().getColumn(38).setPreferredWidth(0);
            masterTable.getColumnModel().getColumn(39).setResizable(false);
            masterTable.getColumnModel().getColumn(39).setPreferredWidth(0);
            masterTable.getColumnModel().getColumn(40).setResizable(false);
            masterTable.getColumnModel().getColumn(40).setPreferredWidth(0);
            masterTable.getColumnModel().getColumn(41).setResizable(false);
            masterTable.getColumnModel().getColumn(41).setPreferredWidth(0);
            masterTable.getColumnModel().getColumn(42).setResizable(false);
            masterTable.getColumnModel().getColumn(42).setPreferredWidth(0);
            masterTable.getColumnModel().getColumn(43).setResizable(false);
            masterTable.getColumnModel().getColumn(43).setPreferredWidth(0);
            masterTable.getColumnModel().getColumn(44).setResizable(false);
            masterTable.getColumnModel().getColumn(44).setPreferredWidth(0);
            masterTable.getColumnModel().getColumn(45).setResizable(false);
            masterTable.getColumnModel().getColumn(45).setPreferredWidth(0);
            masterTable.getColumnModel().getColumn(46).setResizable(false);
            masterTable.getColumnModel().getColumn(46).setPreferredWidth(0);
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

        jButton3.setBackground(new java.awt.Color(102, 102, 102));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sislab/images/zoom-3.png"))); // NOI18N
        jButton3.setText("Para Empréstimo");
        jButton3.setFocusable(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setMaximumSize(new java.awt.Dimension(150, 50));
        jButton3.setMinimumSize(new java.awt.Dimension(150, 50));
        jButton3.setPreferredSize(new java.awt.Dimension(150, 50));
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton3.addActionListener(formListener);
        jToolBar1.add(jButton3);

        jButton19.setBackground(new java.awt.Color(102, 102, 102));
        jButton19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton19.setForeground(new java.awt.Color(255, 255, 255));
        jButton19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sislab/images/zoom-3.png"))); // NOI18N
        jButton19.setText("Lab Devedores");
        jButton19.setFocusable(false);
        jButton19.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton19.setMaximumSize(new java.awt.Dimension(130, 50));
        jButton19.setMinimumSize(new java.awt.Dimension(130, 50));
        jButton19.setPreferredSize(new java.awt.Dimension(130, 50));
        jButton19.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton19.addActionListener(formListener);
        jToolBar1.add(jButton19);

        jButton16.setBackground(new java.awt.Color(102, 102, 102));
        jButton16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton16.setForeground(new java.awt.Color(255, 255, 255));
        jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sislab/images/go-jump-today.png"))); // NOI18N
        jButton16.setText("Para Devolução");
        jButton16.setFocusable(false);
        jButton16.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton16.setMaximumSize(new java.awt.Dimension(131, 50));
        jButton16.setMinimumSize(new java.awt.Dimension(131, 50));
        jButton16.setPreferredSize(new java.awt.Dimension(131, 50));
        jButton16.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton16.addActionListener(formListener);
        jToolBar1.add(jButton16);

        jbt_emprestar.setBackground(new java.awt.Color(102, 102, 102));
        jbt_emprestar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbt_emprestar.setForeground(new java.awt.Color(255, 255, 255));
        jbt_emprestar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sislab/images/emprestar.png"))); // NOI18N
        jbt_emprestar.setText("Emprestar");
        jbt_emprestar.setFocusable(false);
        jbt_emprestar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbt_emprestar.setMaximumSize(new java.awt.Dimension(100, 50));
        jbt_emprestar.setMinimumSize(new java.awt.Dimension(100, 50));
        jbt_emprestar.setPreferredSize(new java.awt.Dimension(100, 50));
        jbt_emprestar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), jbt_emprestar, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        jbt_emprestar.addActionListener(formListener);
        jToolBar1.add(jbt_emprestar);

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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 980, Short.MAX_VALUE)
            .addComponent(masterScrollPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(masterScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE))
        );

        bindingGroup.bind();
    }

    // Code for dispatching events from components to event handlers.

    private class FormListener implements java.awt.event.ActionListener, java.awt.event.MouseListener {
        FormListener() {}
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            if (evt.getSource() == refreshButton) {
                EmprestimosView.this.refreshButtonActionPerformed(evt);
            }
            else if (evt.getSource() == jButton3) {
                EmprestimosView.this.jButton3ActionPerformed(evt);
            }
            else if (evt.getSource() == jButton19) {
                EmprestimosView.this.jButton19ActionPerformed(evt);
            }
            else if (evt.getSource() == jButton16) {
                EmprestimosView.this.jButton16ActionPerformed(evt);
            }
            else if (evt.getSource() == jbt_emprestar) {
                EmprestimosView.this.jbt_emprestarActionPerformed(evt);
            }
            else if (evt.getSource() == jButton1) {
                EmprestimosView.this.jButton1ActionPerformed(evt);
            }
            else if (evt.getSource() == jTextField21) {
                EmprestimosView.this.jTextField21ActionPerformed(evt);
            }
            else if (evt.getSource() == jTextField24) {
                EmprestimosView.this.jTextField24ActionPerformed(evt);
            }
            else if (evt.getSource() == jButton4) {
                EmprestimosView.this.jButton4ActionPerformed(evt);
            }
            else if (evt.getSource() == jButton5) {
                EmprestimosView.this.jButton5ActionPerformed(evt);
            }
            else if (evt.getSource() == jtf_statusReagente) {
                EmprestimosView.this.jtf_statusReagenteActionPerformed(evt);
            }
            else if (evt.getSource() == jButton8) {
                EmprestimosView.this.jButton8ActionPerformed(evt);
            }
            else if (evt.getSource() == jButton10) {
                EmprestimosView.this.jButton10ActionPerformed(evt);
            }
            else if (evt.getSource() == jButton9) {
                EmprestimosView.this.jButton9ActionPerformed(evt);
            }
            else if (evt.getSource() == jButton11) {
                EmprestimosView.this.jButton11ActionPerformed(evt);
            }
            else if (evt.getSource() == jButton12) {
                EmprestimosView.this.jButton12ActionPerformed(evt);
            }
            else if (evt.getSource() == jmi_emprestar) {
                EmprestimosView.this.jmi_emprestarActionPerformed(evt);
            }
            else if (evt.getSource() == jmi_receber) {
                EmprestimosView.this.jmi_receberActionPerformed(evt);
            }
            else if (evt.getSource() == jMenuItem1) {
                EmprestimosView.this.jMenuItem1ActionPerformed(evt);
            }
            else if (evt.getSource() == jButton2) {
                EmprestimosView.this.jButton2ActionPerformed(evt);
            }
            else if (evt.getSource() == jComboBox2) {
                EmprestimosView.this.jComboBox2ActionPerformed(evt);
            }
            else if (evt.getSource() == jComboBox1) {
                EmprestimosView.this.jComboBox1ActionPerformed(evt);
            }
            else if (evt.getSource() == jButton6) {
                EmprestimosView.this.jButton6ActionPerformed(evt);
            }
            else if (evt.getSource() == jButton7) {
                EmprestimosView.this.jButton7ActionPerformed(evt);
            }
            else if (evt.getSource() == jButton14) {
                EmprestimosView.this.jButton14ActionPerformed(evt);
            }
            else if (evt.getSource() == jButton15) {
                EmprestimosView.this.jButton15ActionPerformed(evt);
            }
            else if (evt.getSource() == jButton17) {
                EmprestimosView.this.jButton17ActionPerformed(evt);
            }
            else if (evt.getSource() == jButton18) {
                EmprestimosView.this.jButton18ActionPerformed(evt);
            }
        }

        public void mouseClicked(java.awt.event.MouseEvent evt) {
            if (evt.getSource() == masterTable) {
                EmprestimosView.this.masterTableMouseClicked(evt);
            }
        }

        public void mouseEntered(java.awt.event.MouseEvent evt) {
            if (evt.getSource() == masterTable) {
                EmprestimosView.this.masterTableMouseEntered(evt);
            }
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
                            query = entityManager.createNamedQuery("MovDet.findByPesquisaEstaticaStatusLoteStatusReagente");
                            query.setParameter("idLab", cont.getCadLaboratorio().getIdLab().toString());
                            query.setParameter("statusReagente","ATIVO");
                            query.setParameter("statusLote","ATIVO");
                            java.util.Collection dadosResposta1 = query.getResultList();
                            list.clear();
                            list.addAll(dadosResposta1);          
    }//GEN-LAST:event_refreshButtonActionPerformed
    
    private void jbt_emprestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_emprestarActionPerformed
    callFormularioEmprestimo();
    }//GEN-LAST:event_jbt_emprestarActionPerformed

    private void jTextField21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField21ActionPerformed

    private void jTextField24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField24ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField24ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    fechaSalvandoFrameEmp();
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jtf_statusReagenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_statusReagenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_statusReagenteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
   frameEmprestimosView.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
    fechaCancelandoCadastroEmp();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed

    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    pesquisarJPA();  
    JF_PESQUISA_.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
    fechaSalvandoFrameRec();        
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
    fechaCancelandoCadastroRec();      
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jmi_emprestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_emprestarActionPerformed
    callFormularioEmprestimo();   
    }//GEN-LAST:event_jmi_emprestarActionPerformed

    private void jmi_receberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_receberActionPerformed
    callFormularioRecebimeto();        
    }//GEN-LAST:event_jmi_receberActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
    callContatoPDSEmprestimo();     
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
    fechaSalvandoFrameEmp();  
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
    fechaCancelandoCadastroEmp();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       jButton6.setEnabled(false);
        
        JF_PESQUISA_.setSize(277, 121);//[]
        JF_PESQUISA_.setLocationRelativeTo(null);
        JF_PESQUISA_.pack();
        JF_PESQUISA_.setTitle("Buscar Reagentes Disponíveis");
        JF_PESQUISA_.setResizable(false);
        JF_PESQUISA_.setVisible(true);

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
    callPesquisaChamareagente();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
if(jComboBox1.getSelectedItem().toString() == "DO ESTOQUE")
{
jButton6.setEnabled(true);

}  
else if(jComboBox1.getSelectedItem().toString() == "ETIQUETA")
{
jButton6.setEnabled(false);

} 
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
JF_PESQUISA_.dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
JF_PESQUISAR_DATA_VEOL.dispose();
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
   if(jdc_dataInicialDevol.getDate().before(jdc_dataFinalDevol.getDate())){
    query = entityManager.createNamedQuery("MovDet.BuscaDataDevolucao");
    query.setParameter("idLab",cont.getCadLaboratorio().getIdLab().toString());       
    query.setParameter("statusReagente","EMPRESTADO");
    query.setParameter("dataIni",jdc_dataInicialDevol.getDate());
    query.setParameter("dataFim",jdc_dataFinalDevol.getDate());
    java.util.Collection dadosResposta1 = query.getResultList();
    list.clear();
    list.addAll(dadosResposta1);    
}   
   JF_PESQUISAR_DATA_VEOL.dispose();          
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
       JF_PESQUISAR_DATA_VEOL.setSize(420, 119);//
       JF_PESQUISAR_DATA_VEOL.setLocationRelativeTo(null);
       JF_PESQUISAR_DATA_VEOL.pack();
       JF_PESQUISAR_DATA_VEOL.setTitle("Pesquisar Reagentes por Data de Devolução");
       JF_PESQUISAR_DATA_VEOL.setResizable(false);
       JF_PESQUISAR_DATA_VEOL.setVisible(true);
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        JF_VISDADOS.dispose();
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
String estatus = ((String)masterTable.getValueAt(masterTable.getSelectedRow(), 1));
        if(estatus.equals("EMPRESTADO"))
        {
        JF_VISDADOS.setSize(606, 468);//[]
        JF_VISDADOS.setLocationRelativeTo(null);
        JF_VISDADOS.pack();
        JF_VISDADOS.setTitle("Visusalização do Dados de Empréstimo");
        JF_VISDADOS.setResizable(false);
        JF_VISDADOS.setVisible(true);  
        }else if(!estatus.equals("EMPRESTADO")){
        JOptionPane.showMessageDialog(null, "Reagente Não Emprestado");
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void masterTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_masterTableMouseClicked
//((String)masterTable.getValueAt(masterTable.getSelectedRow(), 2)); 
    }//GEN-LAST:event_masterTableMouseClicked

    private void masterTableMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_masterTableMouseEntered
   
    }//GEN-LAST:event_masterTableMouseEntered

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        pesquisaEmprestimos();
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
    JF_DADOS_PESQUISA_LAB.setSize(451, 145);//[][]
    JF_DADOS_PESQUISA_LAB.setLocationRelativeTo(null);
    JF_DADOS_PESQUISA_LAB.pack();
    JF_DADOS_PESQUISA_LAB.setTitle("Pesquisa Por Laboratórios Devedores");
    JF_DADOS_PESQUISA_LAB.setResizable(false);
    JF_DADOS_PESQUISA_LAB.setVisible(true);  
    }//GEN-LAST:event_jButton19ActionPerformed

    
     public void pesquisaEmprestimos(){
             String filtro = String.valueOf(jComboBox3.getSelectedItem());
             int tmt = filtro.length(); 
             String filtrado = filtro.substring((tmt-3), tmt);     
             int tmt1 = filtrado.length();
             String fil1 = filtrado.substring(0, (tmt1-1));
             System.out.println(fil1);
            query = entityManager.createNamedQuery("MovDet.BuscarLabEmprestado");
            query.setParameter("idLab", cont.getCadLaboratorio().getIdLab().toString());
            query.setParameter("statusReagente","EMPRESTADO");
            query.setParameter("empLabIdMvd",fil1);
            java.util.Collection dadosResposta1 = query.getResultList();
        
        if(dadosResposta1.isEmpty()){
        
        JOptionPane.showMessageDialog(null, "O Laboratório Pesquisado Não possui Empréstimos", "Aviso do Sistema", JOptionPane.INFORMATION_MESSAGE);
        }else if(dadosResposta1.size() > 0){
        list.clear();
        list.addAll(dadosResposta1);  
       if(jCheckBox1.isSelected()){
       try{
        java.sql.Connection con = new ConexaoMySQL().getConnection();
        HashMap parametros = new HashMap();
        parametros.put("ID_LAB",cont.getCadLaboratorio().getIdLab().toString());
        parametros.put("STATUS_REAGENTE","EMPRESTADO");
        parametros.put("EMP_LAB_ID_MVD", fil1);

        JasperPrint jp = JasperFillManager.fillReport("./Jasper/Relatorios_Lab_Devedores.jasper", parametros, con);    
        JasperViewer jrv = new JasperViewer(jp, false);
        jrv.setVisible(true);
       
        }
    catch(Exception e){
        e.printStackTrace();
    }
     
               }
               JF_DADOS_PESQUISA_LAB.dispose();
        }
 } 
//        private static void setDataPesquisaEmprestimo(){
//
//        GregorianCalendar cal2 = new GregorianCalendar();
//        Date diaHoje = new Date();
//        Date validade ;
//           int intintervaloVencimento = Integer.parseInt(cont.getCadLaboratorio().getMonitorarDiasIntervalo());
//           cal2.setTime(jdc_dataInicialDevol.getDate());
//           cal2.add(GregorianCalendar.DAY_OF_MONTH, intintervaloVencimento);
//           jdc_dataFinalDevol.setDate(cal2.getTime());
//            query = entityManager.createNamedQuery("MovDet.VerificaDevolucaoReagenteEmprestadodeInicializacao");
//            query.setParameter("idLab", cont.getCadLaboratorio().getIdLab().toString());
//            query.setParameter("statusReagente","EMPRESTADO");
////            movDetQuery.setParameter("dataIni",jDateChooser2.getDate());
////            movDetQuery.setParameter("dataFim",jDateChooser1.getDate());
//                java.util.Collection dadosResposta1 = query.getResultList();
//                list.clear();
//                list.addAll(dadosResposta1); 
//        }
        
//             private static void carregaTodosEmprestados(){
//
//        GregorianCalendar cal2 = new GregorianCalendar();
//        Date diaHoje = new Date();
//        Date validade ;
//           int intintervaloVencimento = Integer.parseInt(cont.getCadLaboratorio().getMonitorarDiasIntervalo());
//           cal2.setTime(jdc_dataInicialDevol.getDate());
//           cal2.add(GregorianCalendar.DAY_OF_MONTH, intintervaloVencimento);
//           jdc_dataFinalDevol.setDate(cal2.getTime());
//            query = entityManager.createNamedQuery("MovDet.findByPesquisaEstaticaStatusReagente");
//            query.setParameter("idLab", cont.getCadLaboratorio().getIdLab().toString());
//            query.setParameter("statusReagente","EMPRESTADO");
////            movDetQuery.setParameter("dataIni",jDateChooser2.getDate());
////            movDetQuery.setParameter("dataFim",jDateChooser1.getDate());
//                java.util.Collection dadosResposta1 = query.getResultList();
//                list.clear();
//                list.addAll(dadosResposta1); 
//        } 
        
        
        
      public void callPesquisaChamareagente()
    {
      String args[] = new String[1];
      args[0] = "Importar Nomes de Reagentes";
        ImportReagentesEmprestimoFrameView.main(args);
    }

    
    public void callContatoPDSEmprestimo()
    {
      String args[] = new String[1];
      args[0] = "Importar Contatos de Laboratórios Autorizados Para Emprestimo";
      ImportarContatoPDSEmprestimoView.main(args);
    }


                            public void  pesquisarJPA(){
                                
                                
                                
                            String filtro = String.valueOf(jComboBox2.getSelectedItem());
                             System.out.println("filtro: "+filtro);
                             int tmt = filtro.length();
                             System.out.println(String.valueOf("tmt: "+tmt));
                             String filtrado = filtro.substring((tmt-3), tmt);
                             System.out.println("filtrado: "+filtrado);
                             int tmt1 = filtrado.length();
                             System.out.println(String.valueOf("tmt1: "+tmt1));
                             String fil1 = filtrado.substring(0, (tmt1-1));
                             System.out.println(fil1);
                             
                           if(jComboBox1.getSelectedItem().toString() == "ETIQUETA"){
                                query = entityManager.createNamedQuery("MovDet.BuscaEmprestimoLocal");
                            query.setParameter("idLab",cont.getCadLaboratorio().getIdLab().toString());
                            query.setParameter("idLocalizacao",fil1);
                            query.setParameter("statusReagente","ATIVO");
                            query.setParameter("codBar",jtf_nomeReagenteImportado.getText());
                            java.util.Collection dadosResposta1 = query.getResultList();
                            list.clear();
                            list.addAll(dadosResposta1);  
                           
                           }
                           else if (jComboBox1.getSelectedItem().toString() == "DO ESTOQUE"){
                                query = entityManager.createNamedQuery("MovDet.BuscaEmprestimoNome");
                            query.setParameter("idLab",cont.getCadLaboratorio().getIdLab().toString());
                            query.setParameter("idLocalizacao",fil1);
                            query.setParameter("statusReagente","ATIVO");
                            query.setParameter("nomeReagente",jtf_nomeReagenteImportado.getText());
                            java.util.Collection dadosResposta1 = query.getResultList();
                            list.clear();
                            list.addAll(dadosResposta1);  
                        
                           }
       
                       
                             
                        }  

//    public void editar()
//    {
//        EmprestimosEditsView eedv = new EmprestimosEditsView(null, true);
//        eedv.setRegistroAtualEmprestimoReagente(list.get(masterTable.getSelectedRow()));
//        eedv.setVisible(true);
//        if(eedv.isConfirmaRegistroEmprestimo()){
//       salvar();
//            //saveButton.doClick();
//        }else{
//      // refreshButton.doClick();
//        }
//    }
//
//   
    public void fechaSalvandoFrameEmp()
    {
    jtf_statusReagente.setText("EMPRESTADO");
  
    salvar();
    atualizar();
    JF_EMPRESTAR.dispose();
    }
    
    public void fechaCancelandoCadastroEmp()
    {
    JF_EMPRESTAR.dispose();
    atualizar();
    }
       
    public void fechaSalvandoFrameRec()
    {
    jtf_statusReagente.setText("ATIVO");
    salvar();
    atualizar();
    JF_RECEBIMENTO.dispose();
    }
    
       public void fechaCancelandoCadastroRec()
    {
    JF_RECEBIMENTO.dispose();
    atualizar();
    }
       
       
    public void callFormularioEmprestimo(){   
        String estatus2 = ((String)masterTable.getValueAt(masterTable.getSelectedRow(),1));
        if(estatus2.equals("ATIVO")){
        JF_EMPRESTAR.setSize(588, 468);//[588, 540][]
        JF_EMPRESTAR.setLocationRelativeTo(null);
        JF_EMPRESTAR.pack();
        JF_EMPRESTAR.setTitle("Formulário Para Empréstimo");
        JF_EMPRESTAR.setResizable(false);
        JF_EMPRESTAR.setVisible(true);
        }else if(estatus2.equals("EMPRESTADO")){
                JOptionPane.showMessageDialog(null, "Item já Emprestado","Informação do Sistema",JOptionPane.INFORMATION_MESSAGE);
        }
    }
            
    public void callFormularioRecebimeto(){
        String estatus1 = ((String)masterTable.getValueAt(masterTable.getSelectedRow(),1));
        if(estatus1.equals("EMPRESTADO")){
        JF_RECEBIMENTO.setSize(522, 263);//[]588, 540
        JF_RECEBIMENTO.setLocationRelativeTo(null);
        JF_RECEBIMENTO.pack();
        JF_RECEBIMENTO.setTitle("Recebimento");
        JF_RECEBIMENTO.setResizable(false);
        JF_RECEBIMENTO.setVisible(true);
        }else if(estatus1.equals("ATIVO")){
             JOptionPane.showMessageDialog(null, "Item ainda não Emprestado","Informação do Sistema",JOptionPane.INFORMATION_MESSAGE);
        }
    }
       
public void salvar(){

      try {
            entityManager.getTransaction().commit();
            entityManager.getTransaction().begin();
        } catch (RollbackException rex) {
            rex.printStackTrace();
            entityManager.getTransaction().begin();
            List<sislab.proteomica.view.movimento.MovDet> merged = new ArrayList<sislab.proteomica.view.movimento.MovDet>(list.size());
            for (sislab.proteomica.view.movimento.MovDet m : list) {
                m.setHoraEmprestimo(jSpinner2.getValue().toString());
                merged.add(entityManager.merge(m));
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


    public void setJtf_deptpds(String jtf_deptpds) {
        this.jtf_deptpds.setText(jtf_deptpds);
    }

    public void setJtf_idpds(Integer jtf_idpds) {
        this.jtf_idpds.setText(jtf_idpds.toString());
    }

    public void setJtf_labpds(String jtf_labpds) {
        this.jtf_labpds.setText(jtf_labpds);
    }

    public void setJtf_localpds(String jtf_localpds) {
        this.jtf_localpds.setText(jtf_localpds);
    }

    public void setJtf_nomecontatopds(String jtf_nomecontatopds) {
        this.jtf_nomecontatopds.setText(jtf_nomecontatopds);
    }

    public void setJtf_responpds(String jtf_responpds) {
        this.jtf_responpds.setText(jtf_responpds);
    }

    public void setJtf_salapds(String jtf_salapds) {
        this.jtf_salapds.setText(jtf_salapds);
    }

    public void setJtf_telemailcontatopds(String jtf_telemailcontatopds) {
        this.jtf_telemailcontatopds.setText(jtf_telemailcontatopds);
    }

    public void setJtf_telpds(String jtf_telpds) {
        this.jtf_telpds.setText(jtf_telpds);
    }

    public void setJtf_vincpds(String jtf_vincpds) {
        this.jtf_vincpds.setText(jtf_vincpds);
    }

    public void setJtf_nomeReagenteImportado(String jtf_nomeReagenteImportado) {
        this.jtf_nomeReagenteImportado.setText(jtf_nomeReagenteImportado);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog JD_EmprestimosView;
    private javax.swing.JDialog JD_kk;
    private javax.swing.JFrame JF_DADOS_PESQUISA_LAB;
    private javax.swing.JFrame JF_EMPRESTAR;
    private javax.swing.JFrame JF_PESQUISAR_DATA_VEOL;
    private javax.swing.JFrame JF_PESQUISA_;
    private javax.swing.JFrame JF_RECEBIMENTO;
    private javax.swing.JFrame JF_VISDADOS;
    private java.util.List<sislab.proteomica.beans.CadLocalizacao> cadLocalizacaoList;
    private javax.persistence.Query cadLocalizacaoQuery;
    private sislab.proteomica.view.movimento.ConsultaReagentesEmprestadosCellRenderer consultaReagentesEmprestadosCellRenderer1;
    private static javax.persistence.EntityManager entityManager;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private com.toedter.calendar.JDateChooser jDateChooser3;
    private com.toedter.calendar.JDateChooser jDateChooser4;
    private com.toedter.calendar.JDateChooser jDateChooser5;
    private com.toedter.calendar.JDateChooser jDateChooser6;
    private com.toedter.calendar.JDateChooser jDateChooser7;
    private com.toedter.calendar.JDateChooser jDateChooser8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JToolBar jToolBar3;
    private javax.swing.JButton jbt_emprestar;
    private static com.toedter.calendar.JDateChooser jdc_dataFinalDevol;
    private static com.toedter.calendar.JDateChooser jdc_dataInicialDevol;
    private com.toedter.calendar.JDateChooser jdt_data_emprestimo;
    private javax.swing.JMenuItem jmi_emprestar;
    private javax.swing.JMenuItem jmi_receber;
    private javax.swing.JTextField jtf_deptpds;
    private javax.swing.JTextField jtf_empContatoIdMvd;
    private javax.swing.JTextField jtf_emprestadoPor;
    private javax.swing.JTextField jtf_idUsuarioEmprestimo;
    private javax.swing.JTextField jtf_idpds;
    private javax.swing.JTextField jtf_labpds;
    private javax.swing.JTextField jtf_localpds;
    private javax.swing.JTextField jtf_nomeReagenteImportado;
    private javax.swing.JTextField jtf_nomecontatopds;
    private javax.swing.JTextField jtf_responpds;
    private javax.swing.JTextField jtf_salapds;
    private javax.swing.JTextField jtf_statusReagente;
    private javax.swing.JTextField jtf_telemailcontatopds;
    private javax.swing.JTextField jtf_telpds;
    private javax.swing.JTextField jtf_usuarioEmprestimo;
    private javax.swing.JTextField jtf_vincpds;
    private static java.util.List<sislab.proteomica.view.movimento.MovDet> list;
    private sislab.proteomica.view.movimento.LocalizacaoEmprestimoCellRenderer localizacaoEmprestimoCellRenderer1;
    private javax.swing.JScrollPane masterScrollPane;
    private javax.swing.JTable masterTable;
    private java.util.List<sislab.proteomica.pds.Pds> pdsList;
    private javax.persistence.Query pdsQuery;
    private static javax.persistence.Query query;
    private javax.swing.JButton refreshButton;
    private org.netbeans.examples.lib.timerbean.Timer timer1;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
    public static void main(String[] args) {
//sislab.proteomica.view.movimento.MovDet
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                if(frameEmprestimosView == null)
                frameEmprestimosView = new JFrame();
                empres = new EmprestimosView();
                frameEmprestimosView.setContentPane(empres);  
                frameEmprestimosView.setSize(980, 550);//[]
          //     frameEmprestimosView.setExtendedState(JFrame.MAXIMIZED_BOTH);
                frameEmprestimosView.setResizable(false);
                frameEmprestimosView.setLocationRelativeTo(null);
                frameEmprestimosView.pack();
                frameEmprestimosView.setVisible(true);
                frameEmprestimosView.setTitle(args[0]); 
        //    setDataPesquisaEmprestimo();
        //     carregaTodosEmprestados();
            }
        });
    }
    
}
