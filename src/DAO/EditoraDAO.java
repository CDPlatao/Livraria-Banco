package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import Conexao.Conexao;
import java.sql.ResultSet;
import java.util.ArrayList;
import Model.Editora;

public class EditoraDAO {

    public void cadEditoraDAO(Editora eVO) {// Inicio CAD
        // Busca conexão com o BD
        Connection con = Conexao.getConexao();
        try {// Cria espaço de trabalho SQL
             // é a área no java onde iremos executar os scripts SQL
            String sql;
            sql = "insert into editoras values (null,?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, eVO.getnomeEditora());
            pst.setString(2, eVO.getEndereco());
            pst.setString(3, eVO.getcnpj());
            pst.setString(4, eVO.getTelefone());
            pst.setString(5, eVO.getGerente());
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Erro ao cadastrar!\n"
                    + ex.getMessage());
        }
    }// Fim CAD

    public ArrayList<Editora> getEditoraDAO() {// Inicio GET
        Connection con = Conexao.getConexao();
        ArrayList<Editora> editoras = new ArrayList<>();
        try {
            Statement stat = con.createStatement();
            String sql = "select * from editoras";
            ResultSet rs = stat.executeQuery(sql);
            while (rs.next()) {
                Editora e = new Editora();
                // lado do java'c...'' |x| lado do banco '()''
                e.setIdEditora(rs.getInt("ideditora"));
                e.setNomeEditora(rs.getString("nomeEditora"));
                e.setCnpj(rs.getString("cnpj"));
                e.setEndereco(rs.getString("endereco"));
                e.setTelefone(rs.getString("telefone"));
                e.setGerente(rs.getString("gerente"));
                editoras.add(e);
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao listar!\n"
                    + ex.getMessage());
        }
        return editoras;
    }// Fim GET

    public Editora getEditorabyDoc(String cnpj) {// Inicio DOC
        Connection con = Conexao.getConexao();
        Editora e = null;
        try {
            String sql = "Select * from editoras where cnpj = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, cnpj);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                // lado do java'c...'' |x| lado do banco '()''
                e = new Editora();
                e.setIdEditora(rs.getInt("ideditora"));
                e.setNomeEditora(rs.getString("nomeEditora"));
                e.setCnpj(rs.getString("cnpj"));
                e.setEndereco(rs.getString("endereco"));
                e.setTelefone(rs.getString("telefone"));
                e.setGerente(rs.getString("gerente"));
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao consultar cnpj!\n" + ex.getMessage());
        }
        return e;

    }// Fim DOC

    public void delEditoraDAO(String cnpj) {// Incio DEL
        Connection con = Conexao.getConexao();
        try {
            String sql = "delete from editoras where cnpj = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, cnpj);
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Erro ao deletar cnpj!\n"
                    + ex.getMessage());
        }
    }// Fim DEL

    public void attEditorabyDoc(Editora eVO) {// Inicio ATT
        Connection con = Conexao.getConexao();
        try {
            String sql = "update editoras set nome = ?, endereco = ?, telefone = ?, gerente = ?"
                    + "where cnpj = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, eVO.getnomeEditora());
            pst.setString(2, eVO.getcnpj());
            pst.setString(3, eVO.getEndereco());
            pst.setString(4, eVO.getTelefone());
            pst.setString(5, eVO.getGerente());
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Erro ao atualizar editora!\n"
                    + ex.getMessage());
        }
    }// Fim ATT

    public Editora getEditoraID(int ideditora) {// Inicio GET
        Editora e = new Editora();
        try {
            Connection con = Conexao.getConexao();
            String sql = " select * from editoras where ideditora = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, ideditora);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                e.setIdEditora(rs.getInt("idEditora"));
                e.setNomeEditora(rs.getString("nomeEditora"));
                e.setEndereco(rs.getString("endereco"));
                e.setCnpj(rs.getString("cnpj"));
                e.setTelefone(rs.getString("telefone"));
                e.setGerente(rs.getString("gerente"));
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao consultar editora!\n" + ex.getMessage());
        }
        return e;
    }// Fim GET
}
