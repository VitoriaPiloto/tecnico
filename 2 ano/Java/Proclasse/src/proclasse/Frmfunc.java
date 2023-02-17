package proclasse;
import javax.swing.JOptionPane;
import cadastrar.Cadastro;
import javax.swing.DefaultListModel;
import persistencia.funcionario;
public class Frmfunc extends javax.swing.JFrame {
 Cadastro c = new Cadastro();
 int numReg;
 double totfo;
 DefaultListModel lista = new DefaultListModel();
    public Frmfunc() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tMat = new javax.swing.JTextField();
        tNome = new javax.swing.JTextField();
        tSal = new javax.swing.JTextField();
        cmbFuncao = new javax.swing.JComboBox();
        btnAd = new javax.swing.JButton();
        btnPesq = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        Saida = new javax.swing.JRadioButtonMenuItem();
        jMenu3 = new javax.swing.JMenu();
        totFome = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Matricula");

        jLabel2.setText("Nome");

        jLabel3.setText("Função");

        jLabel4.setText("Salário");

        tMat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tMatActionPerformed(evt);
            }
        });

        cmbFuncao.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Marketing", "Limpeza", "TI", "RH" }));
        cmbFuncao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbFuncaoActionPerformed(evt);
            }
        });

        btnAd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visao/s_success.png"))); // NOI18N
        btnAd.setText("Adiciona");
        btnAd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdActionPerformed(evt);
            }
        });

        btnPesq.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visao/b_search.png"))); // NOI18N
        btnPesq.setText("Pesquisa");
        btnPesq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesqActionPerformed(evt);
            }
        });

        jMenu2.setText("Arquivo");

        Saida.setSelected(true);
        Saida.setText("Saida");
        Saida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visao/b_usrcheck.png"))); // NOI18N
        Saida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaidaActionPerformed(evt);
            }
        });
        jMenu2.add(Saida);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Funções");

        totFome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visao/b_sql.png"))); // NOI18N
        totFome.setText("Total da folha");
        totFome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totFomeActionPerformed(evt);
            }
        });
        jMenu3.add(totFome);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tMat, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAd)
                        .addGap(47, 47, 47)
                        .addComponent(btnPesq))
                    .addComponent(tNome, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(cmbFuncao, javax.swing.GroupLayout.Alignment.LEADING, 0, 137, Short.MAX_VALUE)
                        .addComponent(tSal, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tMat, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tNome, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                        .addGap(3, 3, 3)))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbFuncao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tSal, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAd)
                    .addComponent(btnPesq))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbFuncaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbFuncaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbFuncaoActionPerformed

    private void tMatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tMatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tMatActionPerformed

    private void btnAdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdActionPerformed
      funcionario f = new funcionario();
      numReg++;
      totfo=totfo+(Double.parseDouble(tSal.getText()));
      tMat.setText(String.valueOf(numReg));
      f.setCodFunc(numReg);
      f.setFuncao(String.valueOf(cmbFuncao.getSelectedItem()));
      f.setnomef(tNome.getText());
      f.setSal(Double.parseDouble(tSal.getText()));
      int cr = c.adiciona(f);
      if (cr==0){
          JOptionPane.showMessageDialog(null,"Registro concluido");
      }
      else{
          JOptionPane.showMessageDialog(null,"Falha no registro");
      }
    }//GEN-LAST:event_btnAdActionPerformed

    private void btnPesqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesqActionPerformed
     int i= c.pesquisa(JOptionPane.showInputDialog(null,"Insira o nome do cabloco"));
     tMat.setEnabled(true);
     tMat.setText(String.valueOf(c.getListFunc().get(i).getCodFunc()));
     tNome.setText(c.getListFunc().get(i).getnomef());
     cmbFuncao.setSelectedItem(c.getListFunc().get(i).getFuncao());
     tSal.setText(String.valueOf(c.getListFunc().get(i).getSal()));
     tMat.setEnabled(false);
    }//GEN-LAST:event_btnPesqActionPerformed

    private void SaidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaidaActionPerformed
      int resp=JOptionPane.showConfirmDialog(null, "Deseja sair?");
      if (resp==0){
          System.exit(0);
      }
      else{
          System.out.println(resp);
      }
    }//GEN-LAST:event_SaidaActionPerformed

    private void totFomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totFomeActionPerformed
     double valor=c.totFolha();
     JOptionPane.showMessageDialog(null, "A empresa gasta "+valor+" na folha de pagamento");
    }//GEN-LAST:event_totFomeActionPerformed

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
            java.util.logging.Logger.getLogger(Frmfunc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frmfunc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frmfunc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frmfunc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frmfunc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButtonMenuItem Saida;
    private javax.swing.JButton btnAd;
    private javax.swing.JButton btnPesq;
    private javax.swing.JComboBox cmbFuncao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JTextField tMat;
    private javax.swing.JTextField tNome;
    private javax.swing.JTextField tSal;
    private javax.swing.JMenuItem totFome;
    // End of variables declaration//GEN-END:variables
}
