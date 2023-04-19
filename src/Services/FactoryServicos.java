package Services;

public class FactoryServicos {// Inicio FACTORY
    private static ClienteServicos cServicos = new ClienteServicos();
    private static EditoraServicos eServicos = new EditoraServicos();
    private static LivroServicos lServicos = new LivroServicos();
    private static PedidoServicos pServicos = new PedidoServicos();

    public static ClienteServicos getClienteServicos() {// Inicio GET

        return cServicos;
    }// Fim GET

    public static EditoraServicos getEditoraServicos() {// Inicio GET

        return eServicos;
    }// Fim GET

    public static LivroServicos getLivroServicos() {// Inicio GET

        return lServicos;
    }// Fim GET

    public static PedidoServicos getPedidoServicos() {// Inicio GET

        return pServicos;
    }// Fim GET
}// Fim FACTORY
