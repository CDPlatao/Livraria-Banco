package view;

import Model.Editora;
import Model.Livro;
import Services.EditoraServicos;
import Services.FactoryServicos;
import Services.LivroServicos;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class JFLivro extends javax.swing.JFrame {

    public JFLivro() {
        initComponents();
        addRowToTable();
        jbDeletar.setVisible(false);
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFundo = new javax.swing.JPanel();
        jBarra = new javax.swing.JSeparator();
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
        jtextAssunto = new javax.swing.JTextField();
        jtextEstoque = new javax.swing.JTextField();
        jtextPreco = new javax.swing.JTextField();
        jbDeletar = new javax.swing.JButton();
        jbSalvar = new javax.swing.JButton();
        jbEditar = new javax.swing.JButton();
        jbLimpar = new javax.swing.JButton();
        jbFechar = new javax.swing.JButton();
        jBarra2 = new javax.swing.JSeparator();
        Tabela = new javax.swing.JScrollPane();
        jtLivros = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Livro");
        setMaximizedBounds(new java.awt.Rectangle(528, 530, 530, 530));
        setMaximumSize(new java.awt.Dimension(528, 530));
        setPreferredSize(new java.awt.Dimension(528, 530));
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

        jtextAssunto.setToolTipText("Informe o nome completo");
        jtextAssunto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtextAssuntoKeyTyped(evt);
            }
        });

        jtextEstoque.setToolTipText("Informe o nome completo");
        jtextEstoque.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtextEstoqueKeyTyped(evt);
            }
        });

        jtextPreco.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtextPrecoKeyTyped(evt);
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

        jtLivros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Isbn", "Editora", "Titulo", "Autor", "Assunto", "Estoque", "Preço"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
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

        javax.swing.GroupLayout jFundoLayout = new javax.swing.GroupLayout(jFundo);
        jFundo.setLayout(jFundoLayout);
        jFundoLayout.setHorizontalGroup(
            jFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jBarra)
            .addComponent(jBarra2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFundoLayout.createSequentialGroup()
                .addContainerGap(114, Short.MAX_VALUE)
                .addComponent(jlLivros, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(114, 114, 114))
            .addGroup(jFundoLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Tabela)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFundoLayout.createSequentialGroup()
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
                    .addGroup(jFundoLayout.createSequentialGroup()
                        .addGroup(jFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlAutor)
                            .addComponent(jlEstoque))
                        .addGap(10, 10, 10)
                        .addGroup(jFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jFundoLayout.createSequentialGroup()
                                .addComponent(jtextEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jlPreco)
                                .addGap(18, 18, 18)
                                .addComponent(jtextPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jtextAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFundoLayout.createSequentialGroup()
                        .addGroup(jFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlTitulo)
                            .addComponent(jlIsbn))
                        .addGap(29, 29, 29)
                        .addGroup(jFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jFundoLayout.createSequentialGroup()
                                .addComponent(jtextIsbn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jlCnpj)
                                .addGap(18, 18, 18)
                                .addComponent(jtextCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFundoLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 187, Short.MAX_VALUE)
                                .addComponent(jlAssunto)
                                .addGap(18, 18, 18)
                                .addComponent(jtextAssunto, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jtextTitulo))))
                .addGap(15, 15, 15))
        );
        jFundoLayout.setVerticalGroup(
            jFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFundoLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jlLivros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jBarra, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(jFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtextIsbn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlIsbn)
                    .addComponent(jtextCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlCnpj))
                .addGap(20, 20, 20)
                .addGroup(jFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlTitulo)
                    .addComponent(jtextTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlAutor)
                    .addComponent(jtextAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtextAssunto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlAssunto))
                .addGap(20, 20, 20)
                .addGroup(jFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtextEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlEstoque)
                    .addComponent(jlPreco)
                    .addComponent(jtextPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
            .addComponent(jFundo, javax.swing.GroupLayout.DEFAULT_SIZE, 528, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jFundo, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed
        EditoraServicos editoraS = FactoryServicos.getEditoraServicos();
        LivroServicos livroS = FactoryServicos.getLivroServicos();
        if (validaInput()) {
            int idLivro = 0;
            int estoque = Integer.parseInt(jtextEstoque.getText());
            float preco = Float.parseFloat(jtextPreco.getText());
            String titulo = jtextTitulo.getText();
            Editora idEditora = editoraS.buscarEditora(jtextCnpj.getText());
            String autor = jtextAutor.getText();
            String assunto = jtextAssunto.getText();
            String isbn = jtextIsbn.getText();

            Livro l = new Livro(idLivro, titulo, autor, assunto, isbn, estoque, preco, idEditora);
            
            if (jbSalvar.getText().equals("Confirmar")) {
                livroS.attLivro(l);
            } else {
                livroS.cadLivro(l);
            }
            limparCampo();
            addRowToTable();
        }
    }//GEN-LAST:event_jbSalvarActionPerformed

    private void jbEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEditarActionPerformed
        jtextIsbn.setEnabled(false);
        jtextCnpj.setEnabled(false);
        jbSalvar.setText("Confirmar");
        jbFechar.setText("Cancelar");

        int linha;
        linha = jtLivros.getSelectedRow();

        jtextIsbn.setText((String) jtLivros.getValueAt(linha, 0));
        jtextCnpj.setText((String) jtLivros.getValueAt(linha, 1));
        jtextTitulo.setText((String) jtLivros.getValueAt(linha, 2));
        jtextAutor.setText((String) jtLivros.getValueAt(linha, 3));
        jtextAssunto.setText((String) jtLivros.getValueAt(linha, 4));
        jtextEstoque.setText(String.valueOf( jtLivros.getValueAt(linha, 5)));
        jtextPreco.setText(String.valueOf( jtLivros.getValueAt(linha, 6)));
        jtextTitulo.requestFocus();
    }//GEN-LAST:event_jbEditarActionPerformed

    private void jbLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimparActionPerformed
        if (jbLimpar.getText().equals("Limpar")) {
            limparCampo();
        } else {
            limparCampo();
            jbLimpar.setText("Limpar");
            jbSalvar.setText("Salvar");
            jbEditar.setEnabled(false);
            jtextIsbn.setEnabled(true);
            jtextCnpj.setEnabled(true);
        }
    }//GEN-LAST:event_jbLimparActionPerformed

    public void limparCampo() {
        jtextTitulo.setText("");
        jtextIsbn.setText("");
        jtextAutor.setText("");
        jtextAssunto.setText("");
        jtextEstoque.setText("");
        jtextPreco.setText("");
        jtextIsbn.requestFocus();
    }

    private void jbFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbFecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbFecharActionPerformed

    private void jtLivrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtLivrosMouseClicked
        jbEditar.setEnabled(true);
        jbDeletar.setVisible(true);
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
        EditoraServicos editoraS = FactoryServicos.getEditoraServicos();
        Editora ed = editoraS.buscarEditora(jtextCnpj.getText());
        if (ed.getcnpj() == null) {
            JOptionPane.showMessageDialog(this, "Editora não cadastrada!");            
        } else {
            Object[] rep = {"Sim", "Não"};
            int resposta = JOptionPane.showOptionDialog(this, "Editora "+ ed.getnomeEditora() + " está correta ?", "Pesquisa", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, rep, rep[0]);
            if (resposta == 1) {
                jtextCnpj.setText("");
                jtextCnpj.requestFocus();
            } else {
                jtextTitulo.requestFocus();
            }
        }


    }//GEN-LAST:event_jtextCnpjFocusLost

    private void jtextAssuntoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtextAssuntoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jtextAssuntoKeyTyped

    private void jtextEstoqueKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtextEstoqueKeyTyped
        String Letras = "\".,ABCDEFGHIJKLMNOPQRSTUVWXYZÇabcdefghijklmnopqrstuvwxyzç<>:?/~^}][{´`=+-_!|'\\'@#$%¨&*()²³£¢¬§º°ª\";";
        if (Letras.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_jtextEstoqueKeyTyped

    private void jbDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDeletarActionPerformed
        int linha;
        String isbn;
        linha = jtLivros.getSelectedRow();
        isbn = (String) jtLivros.getValueAt(linha, 0);
        LivroServicos livroS = FactoryServicos.getLivroServicos();
        Object[] rep = {"Sim", "Não"};
        int resposta = JOptionPane.showOptionDialog(this, "Deseja realmente deletar este livro ?", "Deletar", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, rep, rep[0]);
        if (resposta == 0) {
            livroS.delLivro(isbn);
            addRowToTable();
            JOptionPane.showMessageDialog(this, "Livro deletado com sucesso!.");
        } else {
            JOptionPane.showMessageDialog(this, "Opção cancelada!.");
        }
        jbDeletar.setVisible(false);

    }//GEN-LAST:event_jbDeletarActionPerformed

    private void jtextPrecoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtextPrecoKeyTyped
        String Letras = "\",ABCDEFGHIJKLMNOPQRSTUVWXYZÇabcdefghijklmnopqrstuvwxyzç<>:?/~^}][{´`=+-_!|'\\'@#$%¨&*()²³£¢¬§º°ª\";";
        if (Letras.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_jtextPrecoKeyTyped

    public boolean validaInput() {
        if (jtextCnpj.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Preencher Cnpj!");
            jtextCnpj.requestFocus();
            return false;
        }
        if (jtextIsbn.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Preencher Isbn!");
            jtextIsbn.requestFocus();
            return false;
        }
        if (jtextTitulo.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Preencher Titulo!.");
            return false;
        }
        if (jtextAutor.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Preencher Autor!");
            jtextAutor.requestFocus();
            return false;
        }
        if (jtextAssunto.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Preencher Assunto!");
            jtextAssunto.requestFocus();
            return false;
        }
        if (jtextEstoque.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Preencher Estoque!.");
            return false;
        }
        if (jtextPreco.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Preencher preço!.");
            return false;
        };

        return true;
    }

    public void addRowToTable() {
        DefaultTableModel model = (DefaultTableModel) jtLivros.getModel();
        model.getDataVector().removeAllElements();// Remove todas as linhas
        model.fireTableDataChanged();
        Object rowData[] = new Object[7];
        LivroServicos livroS = FactoryServicos.getLivroServicos();
        for (Livro livro : livroS.getLivros()) {
            rowData[0] = livro.getIsbn();
            rowData[1] = livro.getIdEditora().getnomeEditora();
            rowData[2] = livro.getTitulo();
            rowData[3] = livro.getAutor();
            rowData[4] = livro.getAssunto();
            rowData[5] = livro.getEstoque();
            rowData[6] = livro.getPreco();
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
    private javax.swing.JSeparator jBarra;
    private javax.swing.JSeparator jBarra2;
    private javax.swing.JPanel jFundo;
    private javax.swing.JButton jbDeletar;
    private javax.swing.JButton jbEditar;
    private javax.swing.JButton jbFechar;
    private javax.swing.JButton jbLimpar;
    private javax.swing.JButton jbSalvar;
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
    private javax.swing.JTextField jtextPreco;
    private javax.swing.JTextField jtextTitulo;
    // End of variables declaration//GEN-END:variables
}
