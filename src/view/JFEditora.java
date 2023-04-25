package view;

import Model.Editora;
import Services.EditoraServicos;
import Services.FactoryServicos;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import util.Validadores;

public class JFEditora extends javax.swing.JFrame {
    
    public JFEditora() {
        initComponents();
        addRowToTable();
        jbDeletar.setVisible(false);
        this.setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label1 = new java.awt.Label();
        jFundo = new javax.swing.JPanel();
        jlEditora = new javax.swing.JLabel();
        jBarra = new javax.swing.JSeparator();
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
        jbDeletar = new javax.swing.JButton();
        jbSalvar = new javax.swing.JButton();
        jbEditar = new javax.swing.JButton();
        jbLimpar = new javax.swing.JButton();
        jbFechar = new javax.swing.JButton();
        jBarra2 = new javax.swing.JSeparator();
        Tabela = new javax.swing.JScrollPane();
        jtEditoras = new javax.swing.JTable();

        label1.setText("label1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Editora");
        setMaximizedBounds(new java.awt.Rectangle(536, 530, 530, 530));
        setResizable(false);

        jFundo.setBackground(new java.awt.Color(204, 204, 204));
        jFundo.setPreferredSize(new java.awt.Dimension(532, 463));

        jlEditora.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jlEditora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlEditora.setText("GERENCIA EDITORA");
        jlEditora.setMaximumSize(new java.awt.Dimension(198, 26));
        jlEditora.setMinimumSize(new java.awt.Dimension(199, 26));
        jlEditora.setPreferredSize(new java.awt.Dimension(198, 26));

        jlNome.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlNome.setText("Nome *");

        jlCnpj.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlCnpj.setText("CNPJ *");

        jlEndereco.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlEndereco.setText("Endereço *");

        jlTelefone.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlTelefone.setText("Telefone *");

        jlGerente.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlGerente.setText("Gerente *");

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

        jbDeletar.setText("Deletar");
        jbDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDeletarActionPerformed(evt);
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

        jbFechar.setText("Fechar");
        jbFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbFecharActionPerformed(evt);
            }
        });

        jtEditoras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "Cnpj", "Nome", "Endereço", "Telefone", "Gerente"
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
            .addComponent(jBarra)
            .addComponent(jBarra2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jFundoLayout.createSequentialGroup()
                .addGroup(jFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jFundoLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlEndereco)
                            .addComponent(jlTelefone)
                            .addComponent(jlCnpj))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jFundoLayout.createSequentialGroup()
                                .addComponent(jtextCnpj)
                                .addGap(18, 18, 18)
                                .addComponent(jlNome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtextNome, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jFundoLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jbDeletar)
                                .addGap(18, 18, 18)
                                .addComponent(jbSalvar)
                                .addGap(18, 18, 18)
                                .addComponent(jbEditar)
                                .addGap(18, 18, 18)
                                .addComponent(jbLimpar)
                                .addGap(18, 18, 18)
                                .addComponent(jbFechar))
                            .addComponent(jtextEndereco, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jFundoLayout.createSequentialGroup()
                                .addComponent(jformTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jlGerente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jtextGerente, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jFundoLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(Tabela)))
                .addGap(15, 15, 15))
            .addGroup(jFundoLayout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(jlEditora, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jFundoLayout.setVerticalGroup(
            jFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFundoLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jlEditora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jBarra, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(jFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtextCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlCnpj)
                    .addComponent(jlNome)
                    .addComponent(jtextNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlEndereco)
                    .addComponent(jtextEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jformTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtextGerente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlGerente)
                    .addComponent(jlTelefone))
                .addGap(20, 20, 20)
                .addGroup(jFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbFechar)
                    .addComponent(jbLimpar)
                    .addComponent(jbEditar)
                    .addComponent(jbSalvar)
                    .addComponent(jbDeletar))
                .addGap(20, 20, 20)
                .addComponent(jBarra2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(Tabela, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jFundo, javax.swing.GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jFundo, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtextCnpjFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtextCnpjFocusLost
        if (!jtextCnpj.getText().equals("")) {
            if (!Validadores.isCNPJ(jtextCnpj.getText())) {
                JOptionPane.showMessageDialog(this, "Cnpj Inválido!");
                jtextCnpj.requestFocus();
            }
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
        if (validaInput()) {
            int idEditora = 0;
            String nome = jtextNome.getText();
            String cnpj = jtextCnpj.getText();            
            String endereco = jtextEndereco.getText();
            String telefone = jformTelefone.getText();
            String gerente = jtextGerente.getText();
            EditoraServicos editoraS = FactoryServicos.getEditoraServicos();
            
            Editora e = new Editora(idEditora, nome, cnpj, endereco, telefone, gerente);
            editoraS.cadEditora(e);
            limparCampo();
            addRowToTable();
        }
    }//GEN-LAST:event_jbSalvarActionPerformed

    private void jbEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEditarActionPerformed
        jtextCnpj.setEnabled(false);
        jbSalvar.setText("Confirmar");
        jbFechar.setText("Cancelar");
    }//GEN-LAST:event_jbEditarActionPerformed

    private void jbLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimparActionPerformed
        if (jbLimpar.getText().equals("Limpar")) {
            limparCampo();
        } else {
            limparCampo();
            jbLimpar.setText("Limpar");
            jbSalvar.setText("Salvar");
            jbEditar.setEnabled(false);
            jtextCnpj.setEnabled(true);
        }
    }//GEN-LAST:event_jbLimparActionPerformed
    
    public void limparCampo() {
        jtextNome.setText("");
        jtextCnpj.setText("");
        jtextEndereco.setText("");
        jformTelefone.setText("");
        jtextGerente.setText("");
        jtextNome.requestFocus();
    }

    private void jbFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbFecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbFecharActionPerformed

    private void jtEditorasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtEditorasMouseClicked
        jbLimpar.setEnabled(false);
        jbDeletar.setVisible(true);
    }//GEN-LAST:event_jtEditorasMouseClicked

    private void jbDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDeletarActionPerformed
        int linha;
        String cnpj;
        linha = jtEditoras.getSelectedRow();
        cnpj = (String) jtEditoras.getValueAt(linha, 0);
        EditoraServicos editoraS = FactoryServicos.getEditoraServicos();
        Object[] rep = {"Sim", "Não"};
        int resposta = JOptionPane.showOptionDialog(this, "Deseja realmente deletar este CNPJ ?", "Deletar", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, rep, rep[0]);
        if (resposta == 0) {
            editoraS.delEditora(cnpj);
            addRowToTable();
            JOptionPane.showMessageDialog(this, "Editora deletado com sucesso!.");
        } else {
            JOptionPane.showMessageDialog(this, "Opção cancelada!.");
        }
        jbDeletar.setVisible(false);
    }//GEN-LAST:event_jbDeletarActionPerformed
    
    public boolean validaInput() {
        if (jtextCnpj.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Preencher Cnpj!");
            jtextCnpj.requestFocus();
            return false;
        }
        if (jtextNome.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Preencher Nome!");
            jtextNome.requestFocus();
            return false;
        }
        if (jtextEndereco.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Preencher Endereço!");
            jtextEndereco.requestFocus();
            return false;
        }
        if (jtextGerente.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Preencher Gerente!");
            jtextGerente.requestFocus();
        }
        if (jformTelefone.getText().length() < 14) {
            JOptionPane.showMessageDialog(this, "Preencher telefone!");
            jformTelefone.requestFocus();
            return false;
        }
        return true;
    }
    
    public void addRowToTable() {
        DefaultTableModel model = (DefaultTableModel) jtEditoras.getModel();
        model.getDataVector().removeAllElements();// Remove todas as linhas
        model.fireTableDataChanged();
        Object rowData[] = new Object[5];
        EditoraServicos editoraS = FactoryServicos.getEditoraServicos();
        for (Editora editora : editoraS.getEditoras()) {
            rowData[0] = editora.getcnpj();
            rowData[1] = editora.getnomeEditora();
            rowData[2] = editora.getEndereco();
            rowData[3] = editora.getTelefone();
            rowData[4] = editora.getGerente();
            model.addRow(rowData);
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
    private javax.swing.JSeparator jBarra;
    private javax.swing.JSeparator jBarra2;
    private javax.swing.JPanel jFundo;
    private javax.swing.JButton jbDeletar;
    private javax.swing.JButton jbEditar;
    private javax.swing.JButton jbFechar;
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
    private java.awt.Label label1;
    // End of variables declaration//GEN-END:variables
}
