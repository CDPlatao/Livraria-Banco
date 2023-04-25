package view;

import Model.Cliente;
import Services.ClienteServicos;
import Services.FactoryServicos;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import util.Validadores;

public class JFCliente extends javax.swing.JFrame {

    public JFCliente() {
        initComponents();
        addRowToTable();
        jbDeletar.setVisible(false);
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFundo = new javax.swing.JPanel();
        jlTitulo = new javax.swing.JLabel();
        jBarra = new javax.swing.JSeparator();
        jlNome = new javax.swing.JLabel();
        jlCPF = new javax.swing.JLabel();
        jlEndereco = new javax.swing.JLabel();
        jlTelefone = new javax.swing.JLabel();
        jtextNome = new javax.swing.JTextField();
        jtextCPF = new javax.swing.JTextField();
        jtextEndereco = new javax.swing.JTextField();
        jformTelefone = new javax.swing.JFormattedTextField();
        jbDeletar = new javax.swing.JButton();
        jbSalvar = new javax.swing.JButton();
        jbEditar = new javax.swing.JButton();
        jbLimpar = new javax.swing.JButton();
        jbFechar = new javax.swing.JButton();
        jBarra2 = new javax.swing.JSeparator();
        Tabela = new javax.swing.JScrollPane();
        jtClientes = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cliente");
        setMaximizedBounds(new java.awt.Rectangle(528, 470, 470, 470));
        setMaximumSize(new java.awt.Dimension(528, 470));
        setResizable(false);

        jFundo.setBackground(new java.awt.Color(204, 204, 204));

        jlTitulo.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jlTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlTitulo.setText("GERENCIA CLIENTE");
        jlTitulo.setToolTipText("");

        jlNome.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlNome.setText("Nome *  ");

        jlCPF.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlCPF.setText("CPF*");

        jlEndereco.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlEndereco.setText("Endereço *");

        jlTelefone.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlTelefone.setText("Telefone *");

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

        jtClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "CPF", "Nome", "Endereço", "Telefone"
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
            .addComponent(jBarra)
            .addGroup(jFundoLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Tabela, javax.swing.GroupLayout.DEFAULT_SIZE, 514, Short.MAX_VALUE)
                    .addGroup(jFundoLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jFundoLayout.createSequentialGroup()
                                .addComponent(jlCPF)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jFundoLayout.createSequentialGroup()
                                .addGroup(jFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlEndereco)
                                    .addComponent(jlTelefone))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jFundoLayout.createSequentialGroup()
                                        .addComponent(jtextCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jlNome)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtextNome))
                                    .addComponent(jtextEndereco)
                                    .addComponent(jformTelefone, javax.swing.GroupLayout.Alignment.TRAILING)))
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
                                .addComponent(jbFechar)))))
                .addGap(15, 15, 15))
            .addComponent(jBarra2)
            .addGroup(jFundoLayout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(jlTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jFundoLayout.setVerticalGroup(
            jFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFundoLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jlTitulo)
                .addGap(15, 15, 15)
                .addComponent(jBarra, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(jFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtextCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlCPF)
                    .addComponent(jlNome)
                    .addComponent(jtextNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlEndereco)
                    .addComponent(jtextEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jformTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlTelefone))
                .addGap(20, 20, 20)
                .addGroup(jFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbSalvar)
                    .addComponent(jbEditar)
                    .addComponent(jbLimpar)
                    .addComponent(jbFechar)
                    .addComponent(jbDeletar))
                .addGap(20, 20, 20)
                .addComponent(jBarra2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(Tabela, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                .addGap(15, 15, 15))
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
        if (validaInput()) {
            int idCliente = 0;
            String nome = jtextNome.getText();
            String cpf = jtextCPF.getText();
            String cnpj = null;
            String endereco = jtextEndereco.getText();
            String telefone = jformTelefone.getText();
            ClienteServicos clienteS = FactoryServicos.getClienteServicos();

            Cliente c = new Cliente(idCliente, nome, cpf, cnpj, endereco, telefone);
            clienteS.cadCliente(c);
            limparCampo();
            addRowToTable();
        }
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
        if (!jtextCPF.getText().equals("")) {
            if (!Validadores.isCPF(jtextCPF.getText())) {
                JOptionPane.showMessageDialog(this, "CPF Inválido!");
                jtextCPF.requestFocus();
            }
        }

    }//GEN-LAST:event_jtextCPFFocusLost

    private void jtextNomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtextNomeKeyTyped
        String Letras = "\"0123456789<>:?/~^}][{´`=+-_!|'\\'@#$%¨&*()²³£¢¬§º°ª\";";
        if (Letras.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_jtextNomeKeyTyped

    private void jbEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEditarActionPerformed
        jtextCPF.setEnabled(false);
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
            jtextCPF.setEnabled(true);
        }
    }//GEN-LAST:event_jbLimparActionPerformed

    public void limparCampo() {
        jtextNome.setText("");
        jtextCPF.setText("");
        jtextEndereco.setText("");
        jformTelefone.setText("");
        jtextNome.requestFocus();
    }

    private void jbFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbFecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbFecharActionPerformed

    private void jtClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtClientesMouseClicked
        jbEditar.setEnabled(true);
        jbDeletar.setVisible(true);
    }//GEN-LAST:event_jtClientesMouseClicked

    private void jbDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDeletarActionPerformed
        int linha;
        String cpf;
        linha = jtClientes.getSelectedRow();
        cpf = (String) jtClientes.getValueAt(linha, 0);
        ClienteServicos clienteS = FactoryServicos.getClienteServicos();
        Object[] rep = {"Sim", "Não"};
        int resposta = JOptionPane.showOptionDialog(this, "Deseja realmente deletar este CPF ?", "Deletar", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, rep, rep[0]);
        if (resposta == 0) {
            clienteS.delCliente(cpf);
            addRowToTable();
            JOptionPane.showMessageDialog(this, "Cliente deletado com sucesso!.");
        } else {
            JOptionPane.showMessageDialog(this, "Opção cancelada!.");
        }
        jbDeletar.setVisible(false);
    }//GEN-LAST:event_jbDeletarActionPerformed

    public boolean validaInput() {
        if (jtextCPF.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Preencher CPF!");
            jtextCPF.requestFocus();
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
        } else if (jformTelefone.getText() == null) {
            JOptionPane.showMessageDialog(this, "Preencher telefone!");
            jformTelefone.requestFocus();
            return false;
        }
        return true;
    }

    public void addRowToTable() {
        DefaultTableModel model = (DefaultTableModel) jtClientes.getModel();
        model.getDataVector().removeAllElements();// Remove todas as linhas
        model.fireTableDataChanged();
        Object rowData[] = new Object[4];
        ClienteServicos clienteS = FactoryServicos.getClienteServicos();
        for (Cliente cliente : clienteS.getClientes()) {
            rowData[0] = cliente.getCpf();
            rowData[1] = cliente.getNomeCliente();
            rowData[2] = cliente.getEndereco();
            rowData[3] = cliente.getTelefone();
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
    private javax.swing.JSeparator jBarra;
    private javax.swing.JSeparator jBarra2;
    private javax.swing.JPanel jFundo;
    private javax.swing.JButton jbDeletar;
    private javax.swing.JButton jbEditar;
    private javax.swing.JButton jbFechar;
    private javax.swing.JButton jbLimpar;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JFormattedTextField jformTelefone;
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
