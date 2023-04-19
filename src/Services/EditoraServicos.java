package Services;

import java.util.ArrayList;
import DAO.EditoraDAO;
import DAO.FactoryDAO;
import Model.Editora;

public class EditoraServicos {// Inicio EDITORA
    public void cadEditora(Editora eVO) {// Inicio CAD
        EditoraDAO eDAO = FactoryDAO.getEditoraDAO();
        eDAO.cadEditoraDAO(eVO);
    }// Fim CAD

    public void attEditora(Editora eVO) {// Inicio ATT
        EditoraDAO eDAO = FactoryDAO.getEditoraDAO();
        eDAO.attEditorabyDoc(eVO);
    }// Fim ATT

    public void delEditora(String cnpj) {// Inicio DEL
        EditoraDAO eDAO = FactoryDAO.getEditoraDAO();
        eDAO.delEditoraDAO(cnpj);
    }// Fim DEL

    public Editora buscarEditora(String cnpj) {// Inicio BUSCA
        EditoraDAO eDAO = FactoryDAO.getEditoraDAO();
        return eDAO.getEditorabyDoc(cnpj);
    }// Fim BUSCA

    public ArrayList<Editora> getEditoras() {// Inicio GET
        EditoraDAO eDAO = FactoryDAO.getEditoraDAO();
        return eDAO.getEditoraDAO();
    }// Fim GET

    public Editora getEditorabyDoc(String cnpj) {
        return null;
    }

    public Editora getEditorabyID(int id) {
        EditoraDAO eDAO = FactoryDAO.getEditoraDAO();
        return eDAO.getEditoraID(id);
    }

}// Fim EDITORA
