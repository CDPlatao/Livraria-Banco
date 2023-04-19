package Services;

import java.util.ArrayList;
import DAO.ClienteDAO;
import DAO.FactoryDAO;
import Model.Cliente;

public class ClienteServicos {// Inicio CLIENTE
    public void cadCliente(Cliente cVO) {// Inicio CAD
        ClienteDAO cDAO = FactoryDAO.getClienteDAO();
        cDAO.cadClienteDAO(cVO);
    }// Fim CAD

    public void attCliente(Cliente cVO) {// Inicio ATT
        ClienteDAO cDAO = FactoryDAO.getClienteDAO();
        cDAO.attClientebyDoc(cVO);
    }// Fim ATT

    public void delCliente(String cpf) {// Inicio DEL
        ClienteDAO cDAO = FactoryDAO.getClienteDAO();
        cDAO.delClienteDAO(cpf);
    }// Fim DEL

    public Cliente buscarClienteCPF(String cpf) {// Inicio BUSCA
        ClienteDAO cDAO = FactoryDAO.getClienteDAO();
        return cDAO.getClienteByDoc(cpf);
    }// Fim BUSCA

    public ArrayList<Cliente> getClientes() {// Inicio GET
        ClienteDAO cDAO = FactoryDAO.getClienteDAO();
        return cDAO.getClientesDAO();
    }// Fim GET

    public Cliente getClienteID(int id) {
        ClienteDAO cDAO = FactoryDAO.getClienteDAO();
        return cDAO.getClienteID(id);
    }
}// Fim CLIENTE
