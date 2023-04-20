package view;

import javax.swing.JOptionPane;
import util.Validadores;

public class JFEditora extends javax.swing.JFrame {
    public JFEditora() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFundo = new javax.swing.JPanel();
        jlEditora = new javax.swing.JLabel();
        jSeparador = new javax.swing.JSeparator();
        jlNome = new javax.swing.JLabel();
        jlCnpj = new javax.swing.JLabel();
        jlEndereco = new javax.swing.JLabel();
        jlTelefone = new javax.swing.JLabel();
        jlGerente = new javax.swing.JLabel();
        jtextNome = new javax.swing.JTextField();
        jtextCnpj = new javax.swing.JTextField();
        jtextEndereco = new javax.swing.JTextField();
        jformTelefone = new javax.swing.JFormattedTextField();
        jtextGerente = new javax.swing.JTextField();
        jbSalvar = new javax.swing.JButton();
        jbEditar = new javax.swing.JButton();
        jbLimpar = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();
        Tabela = new javax.swing.JScrollPane();
        jtEditoras = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Editora");
        setPreferredSize(new java.awt.Dimension(536, 463));

        jFundo.setBackground(new java.awt.Color(204, 204, 204));
        jFundo.setPreferredSize(new java.awt.Dimension(532, 463));

        jlEditora.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jlEditora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlEditora.setText("GERENCIA EDITORA");
        jlEditora.setMaximumSize(new java.awt.Dimension(198, 26));
        jlEditora.setMinimumSize(new java.awt.Dimension(199, 26));
        jlEditora.setPreferredSize(new java.awt.Dimension(198, 26));

        jlNome.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlNome.setText("Nome:");

        jlCnpj.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlCnpj.setText("CNPJ:");

        jlEndereco.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlEndereco.setText("Endereço:");

        jlTelefone.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlTelefone.setText("Telefone:");

        jlGerente.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlGerente.setText("Gerente:");

        jtextNome.setToolTipText("Informe o nome completo");
        jtextNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtextNomeKeyTyped(evt);
            }
        });

        jtextCnpj.setToolTipText("Informe somente números");
        jtextCnpj.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtextCnpjFocusLost(evt);
            }
        });
        jtextCnpj.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtextCnpjKeyTyped(evt);
            }
        });

        jtextEndereco.setToolTipText("Informe o endereço completo");

        try {
            jformTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jformTelefone.setToolTipText("Informe somente números");

        jtextGerente.setToolTipText("Informe o nome completo");
        jtextGerente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtextGerenteKeyTyped(evt);
            }
        });

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

        jtEditoras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "Nome", "Cnpj", "Endereço", "Telefone", "Gerente"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtEditoras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtEditorasMouseClicked(evt);
            }
        });
        Tabela.setViewportView(jtEditoras);

        javax.swing.GroupLayout jFundoLayout = new javax.swing.GroupLayout(jFundo);
        jFundo.setLayout(jFundoLayout);
        jFundoLayout.setHorizontalGroup(
            jFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparador)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFundoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jFundoLayout.createSequentialGroup()
                        .addComponent(jbSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jbEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jbLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jbCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(Tabela)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jFundoLayout.createSequentialGroup()
                        .addGroup(jFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlNome)
                            .addComponent(jlCnpj)
                            .addGroup(jFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jlEndereco, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jlGerente)
                                    .addComponent(jlTelefone))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtextEndereco)
                            .addComponent(jformTelefone)
                            .addComponent(jtextGerente)
                            .addComponent(jtextNome, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jtextCnpj, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
            .addGroup(jFundoLayout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addComponent(jlEditora, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jFundoLayout.setVerticalGroup(
            jFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFundoLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jlEditora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jSeparador, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(jFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtextCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlCnpj))
                .addGap(19, 19, 19)
                .addGroup(jFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNome)
                    .addComponent(jtextNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(jtextGerente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlGerente))
                .addGap(19, 19, 19)
                .addGroup(jFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbSalvar)
                    .addComponent(jbEditar)
                    .addComponent(jbLimpar)
                    .addComponent(jbCancelar))
                .addGap(19, 19, 19)
                .addComponent(Tabela, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jFundo, javax.swing.GroupLayout.DEFAULT_SIZE, 536, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jFundo, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtextCnpjFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtextCnpjFocusLost
        if (!Validadores.isCNPJ(jtextCnpj.getText())) {
            JOptionPane.showMessageDialog(this, "Cnpj Inválido!");
            jtextCnpj.requestFocus();
        }
    }//GEN-LAST:event_jtextCnpjFocusLost

    private void jtextCnpjKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtextCnpjKeyTyped
        String numCPF = "0123456789";
        if (jtextCnpj.getText().length() <= 14) {
            if (!numCPF.contains(evt.getKeyChar() + "")) {
                evt.consume();
            }
        } else {
            evt.consume();
        }
    }//GEN-LAST:event_jtextCnpjKeyTyped

    private void jtextNomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtextNomeKeyTyped
        String Letras = "\"0123456789<>:?/~^}][{´`=+-_!|'\\'@#$%¨&*()²³£¢¬§º°ª\";";
        if (Letras.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_jtextNomeKeyTyped

    private void jtextGerenteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtextGerenteKeyTyped
        String Letras = "\"0123456789<>:?/~^}][{´`=+-_!|'\\'@#$%¨&*()²³£¢¬§º°ª\";";
        if (Letras.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_jtextGerenteKeyTyped

    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed

    }//GEN-LAST:event_jbSalvarActionPerformed

    private void jbEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEditarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbEditarActionPerformed

    private void jbLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimparActionPerformed
        jtextNome.setText("");
        jtextCnpj.setText("");
        jtextEndereco.setText("");
        jformTelefone.setText("");
        jtextGerente.setText("");
        jtextNome.requestFocus();
    }//GEN-LAST:event_jbLimparActionPerformed

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbCancelarActionPerformed

    private void jtEditorasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtEditorasMouseClicked
        jbLimpar.setEnabled(false);
        jbEditar.setEnabled(true);
        jbSalvar.setText("Confirmar");

    }//GEN-LAST:event_jtEditorasMouseClicked

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
            java.util.logging.Logger.getLogger(JFEditora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFEditora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFEditora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFEditora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFEditora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane Tabela;
    private javax.swing.JPanel jFundo;
    private javax.swing.JSeparator jSeparador;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbEditar;
    private javax.swing.JButton jbLimpar;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JFormattedTextField jformTelefone;
    private javax.swing.JLabel jlCnpj;
    private javax.swing.JLabel jlEditora;
    private javax.swing.JLabel jlEndereco;
    private javax.swing.JLabel jlGerente;
    private javax.swing.JLabel jlNome;
    private javax.swing.JLabel jlTelefone;
    private javax.swing.JTable jtEditoras;
    private javax.swing.JTextField jtextCnpj;
    private javax.swing.JTextField jtextEndereco;
    private javax.swing.JTextField jtextGerente;
    private javax.swing.JTextField jtextNome;
    // End of variables declaration//GEN-END:variables
}
