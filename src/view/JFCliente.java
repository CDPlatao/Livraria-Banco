package view;

import DAO.ClienteDAO;
import javax.swing.JOptionPane;
import util.Validadores;

public class JFCliente extends javax.swing.JFrame {

    public JFCliente() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFundo = new javax.swing.JPanel();
        jlTitulo = new javax.swing.JLabel();
        jlBarra = new javax.swing.JSeparator();
        jlNome = new javax.swing.JLabel();
        jlCPF = new javax.swing.JLabel();
        jlEndereco = new javax.swing.JLabel();
        jlTelefone = new javax.swing.JLabel();
        jtextNome = new javax.swing.JTextField();
        jtextCPF = new javax.swing.JTextField();
        jtextEndereco = new javax.swing.JTextField();
        jformTelefone = new javax.swing.JFormattedTextField();
        jbSalvar = new javax.swing.JButton();
        jbEditar = new javax.swing.JButton();
        jbLimpar = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();
        Tabela = new javax.swing.JScrollPane();
        jtClientes = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cliente");

        jFundo.setBackground(new java.awt.Color(204, 204, 204));

        jlTitulo.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jlTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlTitulo.setText("GERENCIA CLIENTE");
        jlTitulo.setToolTipText("");

        jlNome.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlNome.setText("Nome:");

        jlCPF.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlCPF.setText("CPF:");

        jlEndereco.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlEndereco.setText("Endereço:");

        jlTelefone.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlTelefone.setText("Telefone:");

        jtextNome.setToolTipText("Informe o nome completo");
        jtextNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtextNomeKeyTyped(evt);
            }
        });

        jtextCPF.setToolTipText("Informe somente números");
        jtextCPF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtextCPFFocusLost(evt);
            }
        });
        jtextCPF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtextCPFKeyTyped(evt);
            }
        });

        jtextEndereco.setToolTipText("Informe o endereço completo");

        try {
            jformTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jformTelefone.setToolTipText("Informe somente números");

        jbSalvar.setText("Salvar");
        jbSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarActionPerformed(evt);
            }
        });

        jbEditar.setText("Editar");
        jbEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEditarActionPerformed(evt);
            }
        });

        jbLimpar.setText("Limpar");
        jbLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimparActionPerformed(evt);
            }
        });

        jbCancelar.setText("Cancelar");
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });

        jtClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Nome", "CPF", "Endereço", "Telefone"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtClientesMouseClicked(evt);
            }
        });
        Tabela.setViewportView(jtClientes);

        javax.swing.GroupLayout jFundoLayout = new javax.swing.GroupLayout(jFundo);
        jFundo.setLayout(jFundoLayout);
        jFundoLayout.setHorizontalGroup(
            jFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFundoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Tabela)
                    .addGroup(jFundoLayout.createSequentialGroup()
                        .addGroup(jFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlNome)
                            .addComponent(jlEndereco)
                            .addComponent(jlTelefone)
                            .addComponent(jlCPF))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtextEndereco)
                            .addComponent(jtextNome, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jtextCPF, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jformTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, 434, Short.MAX_VALUE)))
                    .addGroup(jFundoLayout.createSequentialGroup()
                        .addComponent(jbSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jbEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jbLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jbCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFundoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlTitulo)
                .addGap(169, 169, 169))
            .addComponent(jlBarra)
        );
        jFundoLayout.setVerticalGroup(
            jFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFundoLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jlTitulo)
                .addGap(10, 10, 10)
                .addComponent(jlBarra, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(jFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtextCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlCPF))
                .addGap(19, 19, 19)
                .addGroup(jFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtextNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlNome))
                .addGap(19, 19, 19)
                .addGroup(jFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtextEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlEndereco))
                .addGap(19, 19, 19)
                .addGroup(jFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlTelefone)
                    .addComponent(jformTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbSalvar)
                    .addComponent(jbEditar)
                    .addComponent(jbLimpar)
                    .addComponent(jbCancelar))
                .addGap(19, 19, 19)
                .addComponent(Tabela, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jFundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jFundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed

    }//GEN-LAST:event_jbSalvarActionPerformed

    private void jtextCPFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtextCPFKeyTyped
        String numCPF = "0123456789";
        if (jtextCPF.getText().length() <= 11) {
            if (!numCPF.contains(evt.getKeyChar() + "")) {
                evt.consume();
            }
        } else {
            evt.consume();
        }
    }//GEN-LAST:event_jtextCPFKeyTyped

    private void jtextCPFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtextCPFFocusLost
        if (!Validadores.isCPF(jtextCPF.getText())) {
            JOptionPane.showMessageDialog(this, "CPF Inválido!");
            jtextCPF.requestFocus();
        }
    }//GEN-LAST:event_jtextCPFFocusLost

    private void jtextNomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtextNomeKeyTyped
        String Letras = "\"0123456789<>:?/~^}][{´`=+-_!|'\\'@#$%¨&*()²³£¢¬§º°ª\";";
        if (Letras.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_jtextNomeKeyTyped

    private void jbEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEditarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbEditarActionPerformed

    private void jbLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimparActionPerformed
        jtextNome.setText("");
        jtextCPF.setText("");
        jtextEndereco.setText("");
        jformTelefone.setText("");
        jtextNome.requestFocus();
    }//GEN-LAST:event_jbLimparActionPerformed

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbCancelarActionPerformed

    private void jtClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtClientesMouseClicked
        jbLimpar.setEnabled(false);
        jbEditar.setEnabled(true);
        jbSalvar.setText("Confirmar");
        
    }//GEN-LAST:event_jtClientesMouseClicked

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
            java.util.logging.Logger.getLogger(JFCliente.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFCliente.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFCliente.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFCliente.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane Tabela;
    private javax.swing.JPanel jFundo;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbEditar;
    private javax.swing.JButton jbLimpar;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JFormattedTextField jformTelefone;
    private javax.swing.JSeparator jlBarra;
    private javax.swing.JLabel jlCPF;
    private javax.swing.JLabel jlEndereco;
    private javax.swing.JLabel jlNome;
    private javax.swing.JLabel jlTelefone;
    private javax.swing.JLabel jlTitulo;
    private javax.swing.JTable jtClientes;
    private javax.swing.JTextField jtextCPF;
    private javax.swing.JTextField jtextEndereco;
    private javax.swing.JTextField jtextNome;
    // End of variables declaration//GEN-END:variables
}
