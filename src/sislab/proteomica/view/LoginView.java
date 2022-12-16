/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sislab.proteomica.view;

import br.com.bueno.unlock.engine.PIdMb;
import java.awt.EventQueue;
import java.beans.Beans;

import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import sislab.proteomica.Segurança.PcsCadastrados;
import sislab.proteomica.beans.CadLaboratorio;
import sislab.proteomica.beans.CadLocalizacao;
import sislab.proteomica.beans.CadUsuario;
import sislab.proteomica.engine.Container;
import sislab.proteomica.engine.PIdHd;


/**
 *
 * @author Nildo
 */
public class LoginView extends JPanel {
    private static JFrame frameLoginView;
    private static Integer  cde;
    private static String varId ;
    int youtime =3;
    public LoginView() {
        initComponents();
        lookandfeel();
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
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("fenyx?zeroDateTimeBehavior=convertToNullPU").createEntityManager();
        query = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT c FROM CadUsuario c");
        list = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(query.getResultList());
        query1 = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT c FROM CadLaboratorio c");
        laboratorioQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT c FROM CadLaboratorio c");
        laboratorioList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : laboratorioQuery.getResultList();
        loginLabCellRenderer1 = new sislab.proteomica.engine.LoginLabCellRenderer();
        query2 = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT p FROM PcsCadastrados p");
        list1 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : query2.getResultList();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        FormListener formListener = new FormListener();

        loginLabCellRenderer1.setText("loginLabCellRenderer1");

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField1.addActionListener(formListener);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Confirmar");
        jButton1.addActionListener(formListener);

        jPasswordField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPasswordField1.addActionListener(formListener);

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setText("Cancelar");
        jButton2.addActionListener(formListener);

        jPanel1.setBackground(new java.awt.Color(0, 102, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Sislab - Login");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBox1.setRenderer(loginLabCellRenderer1);

        org.jdesktop.swingbinding.JComboBoxBinding jComboBoxBinding = org.jdesktop.swingbinding.SwingBindings.createJComboBoxBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, laboratorioList, jComboBox1);
        bindingGroup.addBinding(jComboBoxBinding);

        jComboBox1.addActionListener(formListener);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Laboratório:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Usuário:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Senha:");

        jLabel3.setText("Serial:");

        jLabel6.setText(" ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPasswordField1)
                            .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6))
                .addContainerGap())
        );

        bindingGroup.bind();
    }

    // Code for dispatching events from components to event handlers.

    private class FormListener implements java.awt.event.ActionListener {
        FormListener() {}
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            if (evt.getSource() == jTextField1) {
                LoginView.this.jTextField1ActionPerformed(evt);
            }
            else if (evt.getSource() == jButton1) {
                LoginView.this.jButton1ActionPerformed(evt);
            }
            else if (evt.getSource() == jPasswordField1) {
                LoginView.this.jPasswordField1ActionPerformed(evt);
            }
            else if (evt.getSource() == jButton2) {
                LoginView.this.jButton2ActionPerformed(evt);
            }
            else if (evt.getSource() == jComboBox1) {
                LoginView.this.jComboBox1ActionPerformed(evt);
            }
        }
    }// </editor-fold>//GEN-END:initComponents

    

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    
        
    if(jTextField1.getText().isEmpty() || (jPasswordField1.getText().isEmpty()))
    {
    JOptionPane.showMessageDialog(null,"OS CAMPOS ESTÃO VAZIOS, INSIRA OS DADOS CORRETAMENTE!!", "AVISO DO SISTEMA",JOptionPane.WARNING_MESSAGE);

    }
    else {

                            String filtro = String.valueOf(jComboBox1.getSelectedItem());
                            int tmt = filtro.length();
                            String filtrado = filtro.substring((tmt-3), tmt);
                            int tmt1 = filtrado.length();
                            String fil1 = filtrado.substring(0, (tmt1-1));
                            System.out.println(fil1);
                                query = entityManager.createNamedQuery("CadUsuario.findByVerificaLogin");
                                query.setParameter("idLab",fil1);
                                query.setParameter("login", jTextField1.getText());
                                query.setParameter("senha", jPasswordField1.getText());
                               // query.setParameter("tipoPermissao", jPasswordField1.getText());
                                List<CadUsuario> data = query.getResultList();
                                Container.setCadUsuario((CadUsuario)data.get(0));  

                                varId  = data.get(0).getIdLab();
                                cde  = Integer.parseInt(varId);
                                int c = cde;
                                String cod = Integer.toString(c);
                              
                                 query1 = entityManager.createNamedQuery("CadLaboratorio.findByIdLab");
                                query1.setParameter("idLab",c);
                                List<CadLaboratorio> data2 = query1.getResultList() ;
                                Container.setCadLaboratorio((CadLaboratorio) data2.get(0));

                            PIdMb pmb = new PIdMb();
                            String idPlacaMae = pmb.Nil_IdMtB();
                            PIdHd hd = new PIdHd();
                            String idHD = hd.getSerialNumber("C");
                            jLabel6.setText(idPlacaMae);
                            query2 = entityManager.createNamedQuery("PcsCadastrados.PesquisaPMCadastrada");
                            query2.setParameter("idLab",cod);
                            query2.setParameter("idPlacaMae", idPlacaMae);
                            List<PcsCadastrados> data3 = query2.getResultList() ;
                            
                            
                        if(data.size() > 0 && data3.size() > 0  )
                        {
                               String args[] = new String[1];
                       
                              // String args1[] = new String[1];
                               args[0] = "CALCULA VENCIMENTOS";
                              // args[1] = "CALCULA VENCIMENTOS";
                               MenuView1.main(args);
                            //   VerificaValidadeView.main(args1);
                               frameLoginView.dispose();
                               
                               
                        } else if(data.size() > 0 && data3.size() == 0  ) {
                          JOptionPane.showMessageDialog(null, "Voçê está tentando logar no sistema em um computador não cadastrado"+"\n"+"Consulte Suporte ou a Gerência","Aviso do Sistema",JOptionPane.INFORMATION_MESSAGE);
                                }    
//            
                        }
  
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
frameLoginView.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    private java.util.List<sislab.proteomica.beans.CadLaboratorio> laboratorioList;
    private javax.persistence.Query laboratorioQuery;
    private java.util.List<sislab.proteomica.beans.CadUsuario> list;
    private java.util.List<sislab.proteomica.Segurança.PcsCadastrados> list1;
    private sislab.proteomica.engine.LoginLabCellRenderer loginLabCellRenderer1;
    private javax.persistence.Query query;
    private javax.persistence.Query query1;
    private javax.persistence.Query query2;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
  
     public void lookandfeel()
    {
                try
                    {
                    UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
                    SwingUtilities.updateComponentTreeUI(this);
                    }
                    catch (Exception erro)
                    {
                    JOptionPane.showMessageDialog(null,erro);
                    }
    }

    
    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {
            public void run() {

                frameLoginView = new JFrame();
                frameLoginView.setContentPane(new LoginView());
             //   frameUsuarioView.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                frameLoginView.setSize(300, 224);//[1127, 600][363, 311][][]
                frameLoginView.setResizable(false);
                frameLoginView.setLocationRelativeTo(null);
                frameLoginView.pack();
                frameLoginView.setVisible(true);
//                frameLoginView.setTitle(args[0]);
            }
        });
    }
    
}