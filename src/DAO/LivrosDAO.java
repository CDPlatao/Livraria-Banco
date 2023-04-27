package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import Conexao.Conexao;
import java.sql.ResultSet;
import java.util.ArrayList;
import Model.Livro;
import Services.EditoraServicos;
import Services.FactoryServicos;

public class LivrosDAO {

    public void cadLivro(Livro lVO) {// Inicio CAD
        // Busca conexão com o BD
        Connection con = Conexao.getConexao();
        try {// Cria espaço de trabalho SQL
             // é a área no java onde iremos executar os scripts SQL
            String sql;
            sql = "insert into livros values (null,?,?,?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, lVO.getTitulo());
            pst.setString(2, lVO.getAutor());
            pst.setString(3, lVO.getAssunto());
            pst.setString(4, lVO.getIsbn());
            pst.setInt(5, lVO.getEstoque());
            pst.setFloat(6, lVO.getPreco());
            pst.setInt(7, lVO.getIdEditora().getIdEditora());
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Erro ao cadastrar!\n"
                    + ex.getMessage());
        }
    }// Fim CAD

    public ArrayList<Livro> getLivroDAO() {// Inicio GET
        Connection con = Conexao.getConexao();
        ArrayList<Livro> Livros = new ArrayList<>();
        EditoraServicos ediS = FactoryServicos.getEditoraServicos();
        try {
            Statement stat = con.createStatement();
            String sql = "select * from Livros";
            ResultSet rs = stat.executeQuery(sql);
            while (rs.next()) {
                Livro e = new Livro();
                // lado do java'c...'' |x| lado do banco '()''
                e.setIdLivro(rs.getInt("idLivro"));
                e.setTitulo(rs.getString("titulo"));
                e.setAutor(rs.getString("autor"));
                e.setAssunto(rs.getString("assunto"));
                e.setIsbn(rs.getString("isbn"));
                e.setEstoque(rs.getInt("estoque"));
                e.setPreco(rs.getFloat("preco"));
                e.setIdEditora(ediS.getEditorabyID(rs.getInt("ideditora")));
                Livros.add(e);
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao listar!\n"
                    + ex.getMessage());
        }
        return Livros;
    }// Fim GET

    public Livro getLivrobyDoc(String isbn) {// Inicio DOC
        Connection con = Conexao.getConexao();
        Livro l = null;
        EditoraServicos ediS = FactoryServicos.getEditoraServicos();
        try {
            String sql = "Select * from Livros where isbn = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, isbn);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                // lado do java'c...'' |x| lado do banco '()''
                l = new Livro();
                l.setIdLivro(rs.getInt("idLivro"));
                l.setTitulo(rs.getString("titulo"));
                l.setAutor(rs.getString("autor"));
                l.setAssunto(rs.getString("assunto"));
                l.setIsbn(rs.getString("isbn"));
                l.setEstoque(rs.getInt("estoque"));
                l.setPreco(rs.getFloat("preco"));
                l.setIdEditora(ediS.getEditorabyID(rs.getInt("idEditora")));
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao consultar livro!\n" + ex.getMessage());
        }
        return l;

    }// Fim DOC

    public void delLivroDAO(String isbn) {// Incio DEL
        Connection con = Conexao.getConexao();
        try {
            String sql = "delete from Livros where isbn = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, isbn);
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Erro ao deletar livro!\n"
                    + ex.getMessage());
        }
    }// Fim DEL

    public void attLivrobyDoc(Livro lVO) {// Inicio ATT
        Connection con = Conexao.getConexao();
        try {
            String sql = "update livros set titulo = ?, autor = ?, assunto = ?, estoque = ?, preco = ?"
                    + "where isbn = ?";
            PreparedStatement pst = con.prepareStatement(sql);            
            pst.setString(1, lVO.getTitulo());
            pst.setString(2, lVO.getAutor());
            pst.setString(3, lVO.getAssunto());
            pst.setInt(4, lVO.getEstoque());
            pst.setFloat(5, lVO.getPreco());
            pst.setString(6,lVO.getIsbn());
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Erro ao atualizar livro!\n"
                    + ex.getMessage());
        }
    }// Fim ATT

    public void attEstoque(Livro lVO) {// Incio ATE
        Connection con = Conexao.getConexao();
        try {
            String sql = "update Livros set estoque = ? "
                    + "where isbn = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, lVO.getEstoque());
            pst.setString(2, lVO.getIsbn());
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Erro ao atualizar estoque!\n"
                    + ex.getMessage());
        }
    }// Fim ATE
}
