package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import Conexao.Conexao;
import Model.Livro;
import Model.VendaLivro;
import Services.ClienteServicos;
import Services.FactoryServicos;
import java.sql.ResultSet;
import java.util.ArrayList;

public class PedidoDAO {

    public void cadPedido(VendaLivro vVO) {// Inicio CAD
        Connection con = Conexao.getConexao();
        try {
            String sql;
            sql = "insert into pedidos values (null,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            java.sql.Date dataVenda = java.sql.Date.valueOf(vVO.getDataVenda());
            pst.setDate(1, dataVenda);
            pst.setInt(2, vVO.getIdCliente().getIdCliente());
            pst.setInt(3, vVO.getQuant());
            pst.setFloat(4, vVO.getSubTotal());
            pst.executeUpdate();
            
            String sqlidpedido = "select max(idpedido) as idpedido from pedidos";
            PreparedStatement pst2 = con.prepareStatement(sqlidpedido);
            ResultSet rsIdPed = pst2.executeQuery();
            int idpedido = 0;
            while (rsIdPed.next()) {
                idpedido = rsIdPed.getInt("idpedido");
            }
            // Inserir informações dos pedidos e dos livros a tabela "PedidosLivros"
            String sqlPedLivros = "insert into pedidoslivros values (?,?)";
            PreparedStatement pst3 = con.prepareStatement(sqlPedLivros);
            for (Livro livro : vVO.getIdLivro()) {
                pst3.setInt(1, idpedido);
                pst3.setInt(2, livro.getIdLivro());
                pst3.executeUpdate();
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao cadastrar!\n"
                    + ex.getMessage());
        }
    }// Fim CAD

    public ArrayList<VendaLivro> getPedidosDAO() {// Inicio GET
        Connection con = Conexao.getConexao();
        ClienteServicos ClienteS = FactoryServicos.getClienteServicos();
        ArrayList<VendaLivro> Venda = new ArrayList<>();
        try {
            Statement stat = con.createStatement();
            String sql = "select * from Livros";
            ResultSet rs = stat.executeQuery(sql);
            while (rs.next()) {
                VendaLivro vl = new VendaLivro();
                // lado do java'c...'' |x| lado do banco '()''
                vl.setIdVendaLivro(rs.getInt("idpedido"));
                java.sql.Date dataVenda = rs.getDate("data");
                vl.setDataVenda(dataVenda.toLocalDate());
                vl.setIdCliente(ClienteS.getClienteID(rs.getInt("idcliente")));
                vl.setQuant(rs.getInt("quantidade"));
                vl.setSubTotal(rs.getFloat("subtotal"));
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao listar!\n"
                    + ex.getMessage());
        }
        return Venda;
    }// Fim GET

    public VendaLivro getVendalivrobyDoc(int idpedido) {// Inicio DOC
        Connection con = Conexao.getConexao();
        VendaLivro vl = null;
        ClienteServicos ClienteS = FactoryServicos.getClienteServicos();
        try {
            String sql = "Select * from pedido where idpedido = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, idpedido);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                // lado do java'c...'' |x| lado do banco '()''
                vl = new VendaLivro();
                vl.setIdVenda(rs.getInt("idpedido"));
                java.sql.Date dataVenda = rs.getDate("data");
                vl.setDataVenda(dataVenda.toLocalDate());
                vl.setIdCliente(ClienteS.getClienteID(rs.getInt("idcliente")));
                vl.setQuant(rs.getInt("quantidade"));
                vl.setSubTotal(rs.getFloat("subtotal"));
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao consultar livro!\n" + ex.getMessage());
        }
        return vl;
    }// Fim DOC

    public void delVendalivroDAO(int idpedido) {// Incio DEL
        Connection con = Conexao.getConexao();
        try {
            String sql = "delete from pedido where idpedido = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, idpedido);
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Erro ao deletar pedido!\n"
                    + ex.getMessage());
        }
    }// Fim DEL

    public void attVendalivrobyDoc(VendaLivro vVO) {// Inicio ATT
        Connection con = Conexao.getConexao();
        try {
            String sql = "update pedidos set data = ?, quantidade = ?, subtotal = ?"
                    + "where idpedido = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            java.sql.Date dataVenda = java.sql.Date.valueOf(vVO.getDataVenda());
            pst.setDate(1, dataVenda);
            pst.setInt(2, vVO.getQuant());
            pst.setFloat(3, vVO.getSubTotal());
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Erro ao atualizar pedido!\n"
                    + ex.getMessage());
        }
    }// Fim ATT
}
