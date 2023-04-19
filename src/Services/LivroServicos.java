package Services;

import java.util.ArrayList;
import DAO.LivrosDAO;
import DAO.FactoryDAO;
import Model.Livro;

public class LivroServicos {// Inicio LIVRO
    public void cadLivro(Livro lVO) {// Inicio CAD
        LivrosDAO lDAO = FactoryDAO.getLivroDAO();
        lDAO.cadLivro(lVO);
    }// Fim CAD

    public void attLivro(Livro lVO) {// Inicio ATT
        LivrosDAO lDAO = FactoryDAO.getLivroDAO();
        lDAO.attLivrobyDoc(lVO);
    }// Fim ATT

    public void delLivro(String isbn) {// Inicio DEL
        LivrosDAO lDAO = FactoryDAO.getLivroDAO();
        lDAO.delLivroDAO(isbn);
    }// Fim DEL

    public Livro buscarLivro(String isbn) {// Inicio BUSCA
        LivrosDAO lDAO = FactoryDAO.getLivroDAO();
        return lDAO.getLivrobyDoc(isbn);
    }// Fim BUSCA

    public ArrayList<Livro> getLivros() {// Inicio GET
        LivrosDAO lDAO = FactoryDAO.getLivroDAO();
        return lDAO.getLivroDAO();
    }// Fim GET

    public Livro getLivrobyDoc(String isbn) {
        return null;
    }

    public void attEstoque(Livro lVO) {// Inicio ATE
        LivrosDAO lDAO = FactoryDAO.getLivroDAO();
        lDAO.attEstoque(lVO);
    }// Fim ATE
}// Fim LIVRO
