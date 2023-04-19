package Conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    // Cria uma constante com o endereço do BD/Schema
    private static String url = "jdbc:mysql://localhost:3306/livraria";
    // Cria uma constante com um user do BD
    private static String user = "root";
    // Cria uma constante com a senha do BD
    private static String pass = "";

    public static Connection getConexao() {
        //Inicia conexão nula, ainda não estabelecida
        Connection c = null;
        //Tenta estabelecer conexão
        try {
            c = DriverManager.getConnection(url, user, pass);
        } catch (SQLException e) {
            System.out.println("Erro ao conectar ao banco!\n" + e.getMessage());
        }
        return c;
    }
}
