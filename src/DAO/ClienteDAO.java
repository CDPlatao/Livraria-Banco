package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import Conexao.Conexao;
import java.sql.ResultSet;
import java.util.ArrayList;
import Model.Cliente;

public class ClienteDAO {

    public void cadClienteDAO(Cliente cVO) {// Inicio CAD
        // Busca conexão com o BD
        Connection con = Conexao.getConexao();
        try {// Cria espaço de trabalho SQL
             // é a área no java onde iremos executar os scripts SQL
            String sql;
            sql = "insert into clientes values (null,?,?,null,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, cVO.getNomeCliente());
            pst.setString(2, cVO.getCpf());
            pst.setString(3, cVO.getEndereco());
            pst.setString(4, cVO.getTelefone());

            pst.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Erro ao cadastrar!\n"
                    + ex.getMessage());
        }
    }// Fim CAD

    public ArrayList<Cliente> getClientesDAO() {// Inicio GET
        Connection con = Conexao.getConexao();
        ArrayList<Cliente> clientes = new ArrayList<>();
        try {
            Statement stat = con.createStatement();
            String sql = "select * from clientes";
            ResultSet rs = stat.executeQuery(sql);
            while (rs.next()) {
                Cliente c = new Cliente();
                // lado do java'c...'' |x| lado do banco '()''
                c.setIdCliente(rs.getInt("idcliente"));
                c.setNomeCliente(rs.getString("nome"));
                c.setCpf(rs.getString("cpf"));
                c.setEndereco(rs.getString("endereco"));
                c.setTelefone(rs.getString("telefone"));
                clientes.add(c);
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao listar!\n"
                    + ex.getMessage());
        }
        return clientes;
    }// Fim GET

    public Cliente getClienteByDoc(String cpf) {// Inicio DOC
        Connection con = Conexao.getConexao();
        Cliente c = null;
        try {
            String sql = "Select * from clientes where cpf = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, cpf);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                // lado do java'c...'' |x| lado do banco '()''
                c = new Cliente();
                c.setIdCliente(rs.getInt("idcliente"));
                c.setNomeCliente(rs.getString("nome"));
                c.setCpf(rs.getString("cpf"));
                c.setEndereco(rs.getString("endereco"));
                c.setTelefone(rs.getString("telefone"));
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao consultar cpf!\n" + ex.getMessage());
        }
        return c;

    }// Fim DOC

    public void delClienteDAO(String cpf) {// Incio DEL
        Connection con = Conexao.getConexao();
        try {
            String sql = "delete from clientes where cpf = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, cpf);
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Erro ao deletar cpf!\n"
                    + ex.getMessage());
        }
    }// Fim DEL

    public void attClientebyDoc(Cliente cVO) {// Inicio ATT
        Connection con = Conexao.getConexao();
        try {
            String sql = "update clientes set nome = ?, endereco = ?, telefone = ?"
                    + "where cpf = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, cVO.getNomeCliente());
            pst.setString(2, cVO.getEndereco());
            pst.setString(3, cVO.getTelefone());
            pst.setString(4, cVO.getCpf());
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Erro ao atualizar cliente!\n"
                    + ex.getMessage());
        }
    }// Fim ATT

    public Cliente getClienteID(int idcliente) {// Inicio GET
        Cliente c = new Cliente();
        try {
            Connection con = Conexao.getConexao();
            String sql = " select * from clientes where idcliente = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, idcliente);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                c.setIdCliente(rs.getInt("idcliente"));
                c.setNomeCliente(rs.getString("nome"));
                c.setCnpj(rs.getString("cnpj"));
                c.setEndereco(rs.getString("endereco"));
                c.setTelefone(rs.getString("telefone"));

            }
        } catch (SQLException ex) {
            System.out.println("Erro ao consultar cliente!\n" + ex.getMessage());
        }
        return c;
    }// Fim GET
}
