/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visão;

import javax.swing.JOptionPane;
import Persistencia.Geral;
import Persistencia.Tecnico;
import Persistencia.Aluno;
import Cadastro.CLS_Cad;
import java.util.HashSet;
import java.util.Set;


/**
 *
 * @author aluno
 */
public class FrmPrincipal extends javax.swing.JFrame {
   CLS_Cad c=new CLS_Cad();
     int matricula = 0;
    /**
     * Creates new form FrmPrincipal
     */
    public FrmPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lCurso = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lprova = new javax.swing.JLabel();
        lfaltas = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tMat = new javax.swing.JTextField();
        tNome = new javax.swing.JTextField();
        tNota1 = new javax.swing.JTextField();
        tNota2 = new javax.swing.JTextField();
        cmbArea = new javax.swing.JComboBox();
        rbdfg = new javax.swing.JRadioButton();
        rbdtec = new javax.swing.JRadioButton();
        tProva = new javax.swing.JTextField();
        nFaltas = new javax.swing.JTextField();
        tMedia = new javax.swing.JTextField();
        BtnAdd = new javax.swing.JButton();
        BtnRec = new javax.swing.JButton();
        BtnCalcMedGrupo = new javax.swing.JButton();
        BtnCalcMedTec = new javax.swing.JButton();
        BtnClean = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Matrícula");

        jLabel2.setText("Nome do aluno");

        jLabel3.setText("Nota 1");

        jLabel4.setText("Nota 2");

        lCurso.setText("Curso");

        jLabel6.setText("Área");

        lprova.setText("Prova");

        lfaltas.setText("Faltas");

        jLabel9.setText("Média do período");

        tMat.setEditable(false);
        tMat.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        tMat.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tNota2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tNota2ActionPerformed(evt);
            }
        });

        cmbArea.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Informática", "Administração", "Elerotécnica", "Telecomunicações", "Edificações" }));
        cmbArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbAreaActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbdfg);
        rbdfg.setText("Formação Geral");
        rbdfg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbdfgActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbdtec);
        rbdtec.setText("Técnico");
        rbdtec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbdtecActionPerformed(evt);
            }
        });

        nFaltas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nFaltasActionPerformed(evt);
            }
        });

        tMedia.setEditable(false);

        BtnAdd.setText("Adicionar");
        BtnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAddActionPerformed(evt);
            }
        });

        BtnRec.setText("Recupera");
        BtnRec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRecActionPerformed(evt);
            }
        });

        BtnCalcMedGrupo.setText("Calc Media Grupo");
        BtnCalcMedGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCalcMedGrupoActionPerformed(evt);
            }
        });

        BtnCalcMedTec.setText("Media Tec");
        BtnCalcMedTec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCalcMedTecActionPerformed(evt);
            }
        });

        BtnClean.setText("Limpa");
        BtnClean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCleanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tMat, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tNome, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tNota1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tNota2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rbdfg)
                                .addGap(35, 35, 35)
                                .addComponent(rbdtec))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lCurso)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                    .addComponent(lprova)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(tProva, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                    .addComponent(lfaltas)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(nFaltas, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGap(70, 70, 70))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel9)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(tMedia, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(cmbArea, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BtnAdd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnRec)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnCalcMedGrupo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnCalcMedTec)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnClean)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(tMat, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(tNota1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tNota2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(rbdfg)
                    .addComponent(rbdtec))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lCurso)
                    .addComponent(cmbArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lprova)
                    .addComponent(tProva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lfaltas)
                    .addComponent(nFaltas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(tMedia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnAdd)
                    .addComponent(BtnRec)
                    .addComponent(BtnCalcMedGrupo)
                    .addComponent(BtnCalcMedTec)
                    .addComponent(BtnClean))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnCalcMedGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCalcMedGrupoActionPerformed
        CLS_Cad c=new CLS_Cad();
        double med= c.calcMedia();
        System.out.println("Média do grupo"+med);
    }//GEN-LAST:event_BtnCalcMedGrupoActionPerformed

    private void BtnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAddActionPerformed
       boolean erro=false;
       double mediagrupo=0;
       matricula++;
       tMat.setText(String.valueOf(matricula));
       if(tMat.getText().equals("")){
           JOptionPane.showMessageDialog(null,"Preencha a matricula");
           erro=true;
       }else
           if(tNome.getText().equals("")){
           JOptionPane.showMessageDialog(null,"Preencha o nome");
           erro=true;
       }else
           if(tNota1.getText().equals("")){
           JOptionPane.showMessageDialog(null,"Preencha a nota 1");
           erro=true;
       }else
       if(tNota2.getText().equals("")){
           JOptionPane.showMessageDialog(null,"Preencha a nota 2 ");
           erro=true;
       }else
           if(cmbArea.getSelectedIndex()==-1){
           JOptionPane.showMessageDialog(null,"Preencha o curso ");
           erro=true;
       }else
               if(rbdtec.isSelected()==false && rbdfg.isSelected()==false){
           JOptionPane.showMessageDialog(null,"Preencha a area");
           erro=true;
       }else
                   if(rbdtec.isSelected()==true && nFaltas.getText().equals("")){
           JOptionPane.showMessageDialog(null,"Preencha as faltas");
           erro=true;
                       
           }else
                   if(rbdfg.isSelected()==true && tProva.getText().equals("")){
           JOptionPane.showMessageDialog(null,"Preencha a prova");
           erro=true;
          }
                   
                   
     if(erro==true){
         System.out.println("Erro na entrada de dados");
         System.exit(111);}
     
     Geral g=new Geral();
     Tecnico t=new Tecnico();
  
     Aluno a=null;
     if (rbdtec.isSelected()){
         a=t;
     }else{
         a=g;
     }
     a.setMatr(Integer.parseInt(tMat.getText()));
     a.setNome(tNome.getText());
     a.setCurso(String.valueOf(cmbArea.getSelectedItem()));
     a.setNot(Double.parseDouble(tNota1.getText()));
     a.setNot2(Double.parseDouble(tNota2.getText()));
     rbdfg.setSelected(false);
     if (rbdtec.isSelected()==true){
         t.setFaltas(Integer.parseInt(nFaltas.getText()));
         t.setArea("Técnico");
         t.calcMed();
         tMedia.setText(String.valueOf(t.getMed()));
         a=t;
         c.carrega(a);
     }else{
         a.setArea("Geral");
         g.setProva(Double.parseDouble(tProva.getText()));
         g.calcMed();
         tMedia.setText(String.valueOf(g.getMed()));
         a=g;
         c.carrega(a);
       //  System.out.println(c.getListAluno().get(1).getNome());
         
     }
    }//GEN-LAST:event_BtnAddActionPerformed

    private void cmbAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbAreaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbAreaActionPerformed

    private void nFaltasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nFaltasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nFaltasActionPerformed

    private void tNota2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tNota2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tNota2ActionPerformed

    private void rbdfgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbdfgActionPerformed
        nFaltas.setText("");
        nFaltas.setVisible(false);
        lfaltas.setVisible(false);
        tProva.setVisible(true);
        lprova.setVisible(true);
        cmbArea.setVisible(false);
        lCurso.setVisible(false);
       
    }//GEN-LAST:event_rbdfgActionPerformed

    private void BtnCleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCleanActionPerformed
        //Caixinhas de texto
        tMat.setText("");
        tNome.setText("");
        tNota1.setText("");
        tNota2.setText("");
        nFaltas.setText("");
        tMedia.setText("");
        tProva.setText("");
        //Caixinha de escolha
        cmbArea.setSelectedIndex(-1);
        //Colocando tudo como falso 
        tProva.setVisible(false);
        lprova.setVisible(false);
        nFaltas.setVisible(false);
        lfaltas.setVisible(false);
        rbdtec.setVisible(false);
        rbdfg.setVisible(false);
        buttonGroup1.clearSelection();
               
    }//GEN-LAST:event_BtnCleanActionPerformed

    private void rbdtecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbdtecActionPerformed
        tProva.setVisible(false);
        lprova.setVisible(false);
        nFaltas.setVisible(true);
        lfaltas.setVisible(true); 
        cmbArea.setVisible(true);
         lCurso.setVisible(true);
         tProva.setVisible(false);
     
    }//GEN-LAST:event_rbdtecActionPerformed

    private void BtnRecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRecActionPerformed
        buttonGroup1.clearSelection();
        rbdtec.setSelected(false);
        rbdfg.setSelected(false);
        Aluno a=null;
        int ind=c.recupera(tNome.getText());
        tMat.setText(String.valueOf(c.getListAluno().get(ind).getMatr()));
        cmbArea.setSelectedItem(c.getListAluno().get(ind).getCurso());
        tNota1.setText(String.valueOf(c.getListAluno().get(ind).getNot()));
        tNota2.setText(String.valueOf(c.getListAluno().get(ind).getNot2()));
        String area=c.getListAluno().get(ind).getArea();
        if (area.equals("Técnico")){
            buttonGroup1.clearSelection();
            rbdtec.setSelected(true);
            tMedia.setText(String.valueOf(c.getListAluno().get(ind).getMed()));
        }
        else{
            buttonGroup1.clearSelection();
            rbdfg.setSelected(true);
            tMedia.setText(String.valueOf(c.getListAluno().get(ind).getMed()));
                        
        }
         //tarea.setText(c.getListAluno().get(ind).getArea())
    }//GEN-LAST:event_BtnRecActionPerformed

    private void BtnCalcMedTecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCalcMedTecActionPerformed
        CLS_Cad c=new CLS_Cad();
        double med= c.calcMediaTec();
        System.out.println("Média do técnico"+med);
    }//GEN-LAST:event_BtnCalcMedTecActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
                
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAdd;
    private javax.swing.JButton BtnCalcMedGrupo;
    private javax.swing.JButton BtnCalcMedTec;
    private javax.swing.JButton BtnClean;
    private javax.swing.JButton BtnRec;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox cmbArea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lCurso;
    private javax.swing.JLabel lfaltas;
    private javax.swing.JLabel lprova;
    private javax.swing.JTextField nFaltas;
    private javax.swing.JRadioButton rbdfg;
    private javax.swing.JRadioButton rbdtec;
    private javax.swing.JTextField tMat;
    private javax.swing.JTextField tMedia;
    private javax.swing.JTextField tNome;
    private javax.swing.JTextField tNota1;
    private javax.swing.JTextField tNota2;
    private javax.swing.JTextField tProva;
    // End of variables declaration//GEN-END:variables
}
