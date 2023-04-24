package view;

import javax.swing.JOptionPane;
import util.Validadores;

public class JFLivro extends javax.swing.JFrame {

    public JFLivro() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFundo = new javax.swing.JPanel();
        jSeparador = new javax.swing.JSeparator();
        jlLivros = new javax.swing.JLabel();
        jlIsbn = new javax.swing.JLabel();
        jlCnpj = new javax.swing.JLabel();
        jlTitulo = new javax.swing.JLabel();
        jlAutor = new javax.swing.JLabel();
        jlAssunto = new javax.swing.JLabel();
        jlEstoque = new javax.swing.JLabel();
        jlPreco = new javax.swing.JLabel();
        jtextIsbn = new javax.swing.JTextField();
        jtextCnpj = new javax.swing.JTextField();
        jtextTitulo = new javax.swing.JTextField();
        jtextAutor = new javax.swing.JTextField();
        jtextEstoque = new javax.swing.JTextField();
        jbSalvar = new javax.swing.JButton();
        jbEditar = new javax.swing.JButton();
        jbLimpar = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();
        Tabela = new javax.swing.JScrollPane();
        jtLivros = new javax.swing.JTable();
        jtextAssunto = new javax.swing.JTextField();
        jformPreco = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Livro");
        setMaximizedBounds(new java.awt.Rectangle(536, 570, 570, 570));
        setMaximumSize(new java.awt.Dimension(536, 570));
        setPreferredSize(new java.awt.Dimension(536, 570));
        setResizable(false);

        jFundo.setBackground(new java.awt.Color(204, 204, 204));
        jFundo.setPreferredSize(new java.awt.Dimension(532, 463));

        jlLivros.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jlLivros.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlLivros.setText("GERENCIA LIVROS");
        jlLivros.setMaximumSize(new java.awt.Dimension(198, 26));
        jlLivros.setMinimumSize(new java.awt.Dimension(199, 26));
        jlLivros.setPreferredSize(new java.awt.Dimension(198, 26));

        jlIsbn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlIsbn.setText("ISBN *");

        jlCnpj.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlCnpj.setText("CNPJ *");

        jlTitulo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlTitulo.setText("Titulo *");

        jlAutor.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlAutor.setText("Autor *");

        jlAssunto.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlAssunto.setText("Assunto *");

        jlEstoque.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlEstoque.setText("Estoque *");

        jlPreco.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlPreco.setText("Preço *");

        jtextIsbn.setToolTipText("Informe somente números");
        jtextIsbn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtextIsbnKeyTyped(evt);
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

        jtextTitulo.setToolTipText("Informe o nome completo");
        jtextTitulo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtextTituloKeyTyped(evt);
            }
        });

        jtextAutor.setToolTipText("Informe o nome completo");
        jtextAutor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtextAutorKeyTyped(evt);
            }
        });

        jtextEstoque.setToolTipText("Informe o nome completo");

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

        jtLivros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "Titulo", "Isbn", "Autor", "Assunto", "Estoque", "Preço"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtLivros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtLivrosMouseClicked(evt);
            }
        });
        Tabela.setViewportView(jtLivros);

        jtextAssunto.setToolTipText("Informe o nome completo");
        jtextAssunto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtextAssuntoKeyTyped(evt);
            }
        });

        jformPreco.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));
        jformPreco.setToolTipText("Informe o preço");

        javax.swing.GroupLayout jFundoLayout = new javax.swing.GroupLayout(jFundo);
        jFundo.setLayout(jFundoLayout);
        jFundoLayout.setHorizontalGroup(
            jFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparador)
            .addGroup(jFundoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFundoLayout.createSequentialGroup()
                        .addGroup(jFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlTitulo)
                            .addComponent(jlIsbn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jFundoLayout.createSequentialGroup()
                                .addComponent(jtextIsbn, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(jlCnpj)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jtextCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jtextTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11))
                    .addGroup(jFundoLayout.createSequentialGroup()
                        .addGroup(jFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jFundoLayout.createSequentialGroup()
                                .addComponent(jlAutor)
                                .addGap(30, 30, 30)
                                .addComponent(jtextAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jFundoLayout.createSequentialGroup()
                                .addGroup(jFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlEstoque)
                                    .addComponent(jlAssunto)
                                    .addComponent(jlPreco))
                                .addGap(10, 10, 10)
                                .addGroup(jFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtextEstoque)
                                    .addComponent(jtextAssunto, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jformPreco, javax.swing.GroupLayout.DEFAULT_SIZE, 436, Short.MAX_VALUE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jFundoLayout.createSequentialGroup()
                .addGap(162, 162, 162)
                .addComponent(jlLivros, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jFundoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Tabela)
                    .addGroup(jFundoLayout.createSequentialGroup()
                        .addComponent(jbSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jbEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jbLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jbCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jFundoLayout.setVerticalGroup(
            jFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFundoLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jlLivros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jSeparador, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(jFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtextIsbn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlIsbn)
                    .addComponent(jtextCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlCnpj))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlTitulo)
                    .addComponent(jtextTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlAutor)
                    .addComponent(jtextAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlAssunto)
                    .addComponent(jtextAssunto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jFundoLayout.createSequentialGroup()
                        .addComponent(jtextEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(jformPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jFundoLayout.createSequentialGroup()
                        .addComponent(jlEstoque)
                        .addGap(22, 22, 22)
                        .addComponent(jlPreco)))
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
            .addComponent(jFundo, javax.swing.GroupLayout.DEFAULT_SIZE, 528, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jFundo, javax.swing.GroupLayout.DEFAULT_SIZE, 541, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed

    }//GEN-LAST:event_jbSalvarActionPerformed

    private void jbEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEditarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbEditarActionPerformed

    private void jbLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimparActionPerformed
        jtextTitulo.setText("");
        jtextIsbn.setText("");
        jtextAutor.setText("");
        jtextAssunto.setText("");
        jtextEstoque.setText("");
        jtextPreco.setText("");
        jtextIsbn.requestFocus();
    }//GEN-LAST:event_jbLimparActionPerformed

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbCancelarActionPerformed

    private void jtLivrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtLivrosMouseClicked
        jbLimpar.setEnabled(false);
        jbEditar.setEnabled(true);
        jbSalvar.setText("Confirmar");
    }//GEN-LAST:event_jtLivrosMouseClicked

    private void jtextIsbnKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtextIsbnKeyTyped
        String numISBN = "0123456789";
        if (jtextIsbn.getText().length() <= 13) {
            if (!numISBN.contains(evt.getKeyChar() + "")) {
                evt.consume();
            }
        } else {
            evt.consume();
        }
    }//GEN-LAST:event_jtextIsbnKeyTyped

    private void jtextTituloKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtextTituloKeyTyped
        String Letras = "\"0123456789<>:?/~^}][{´`=+-_!|'\\'@#$%¨&*()²³£¢¬§º°ª\";";
        if (Letras.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_jtextTituloKeyTyped

    private void jtextAutorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtextAutorKeyTyped
        String Letras = "\"0123456789<>:?/~^}][{´`=+-_!|'\\'@#$%¨&*()²³£¢¬§º°ª\";";
        if (Letras.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_jtextAutorKeyTyped

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

    private void jtextCnpjFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtextCnpjFocusLost
        if (!jtextCnpj.getText().equals("")) {
            if (!Validadores.isCNPJ(jtextCnpj.getText())) {
                JOptionPane.showMessageDialog(this, "Cnpj Inválido!");
                jtextCnpj.requestFocus();
            }
        }
    }//GEN-LAST:event_jtextCnpjFocusLost

    private void jtextAssuntoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtextAssuntoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jtextAssuntoKeyTyped

    public void validaInput() {
        if (jtextCnpj.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Preencher Cnpj!");
            jtextCnpj.requestFocus();
        }
        if (jtextIsbn.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Preencher Isbn!");
            jtextIsbn.requestFocus();
        }
        if (jtextAutor.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Preencher Autor!");
            jtextAutor.requestFocus();
        }
        if (jtextAssunto.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Preencher Assunto!");
            jtextAssunto.requestFocus();
        }
    }

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
            java.util.logging.Logger.getLogger(JFLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFLivro().setVisible(true);
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
    private javax.swing.JFormattedTextField jformPreco;
    private javax.swing.JLabel jlAssunto;
    private javax.swing.JLabel jlAutor;
    private javax.swing.JLabel jlCnpj;
    private javax.swing.JLabel jlEstoque;
    private javax.swing.JLabel jlIsbn;
    private javax.swing.JLabel jlLivros;
    private javax.swing.JLabel jlPreco;
    private javax.swing.JLabel jlTitulo;
    private javax.swing.JTable jtLivros;
    private javax.swing.JTextField jtextAssunto;
    private javax.swing.JTextField jtextAutor;
    private javax.swing.JTextField jtextCnpj;
    private javax.swing.JTextField jtextEstoque;
    private javax.swing.JTextField jtextIsbn;
    private javax.swing.JTextField jtextTitulo;
    // End of variables declaration//GEN-END:variables
}
