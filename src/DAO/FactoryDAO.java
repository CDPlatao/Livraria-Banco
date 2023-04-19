package DAO;

public class FactoryDAO {
    private static ClienteDAO cDAO = new ClienteDAO();
    private static EditoraDAO eDAO = new EditoraDAO();
    private static LivrosDAO lDAO = new LivrosDAO();
    private static PedidoDAO pDAO = new PedidoDAO();

    public static ClienteDAO getClienteDAO() {
        return cDAO;
    }

    public static EditoraDAO getEditoraDAO() {
        return eDAO;
    }

    public static LivrosDAO getLivroDAO() {
        return lDAO;
    }

    public static PedidoDAO getPedidoDAO(){
        return pDAO;
    }
}
