package Services;

import java.util.ArrayList;
import DAO.PedidoDAO;
import DAO.FactoryDAO;
import Model.VendaLivro;

public class PedidoServicos {

    public void cadLivro(VendaLivro vVO) {// Inicio CAD
        PedidoDAO pDAO = FactoryDAO.getPedidoDAO();
        pDAO.cadPedido(vVO);
    }// Fim CAD

    public void attVendalivro(VendaLivro vVO) {// Inicio ATT
        PedidoDAO pDAO = FactoryDAO.getPedidoDAO();
        pDAO.attVendalivrobyDoc(vVO);
    }// Fim ATT

    public void delVendaLivro(int idpedido) {// Inicio ATT
        PedidoDAO pDAO = FactoryDAO.getPedidoDAO();
        pDAO.delVendalivroDAO(idpedido);
    }// Fim ATT

    public VendaLivro buscarVendaLivro(int idpedido) {// Inicio ATT
        PedidoDAO pDAO = FactoryDAO.getPedidoDAO();
        return pDAO.getVendalivrobyDoc(idpedido);
    }// Fim ATT

    public ArrayList<VendaLivro> getVendaLivro() {// Inicio GET
        PedidoDAO pDAO = FactoryDAO.getPedidoDAO();
        return pDAO.getPedidosDAO();
    }// Fim GET

}
