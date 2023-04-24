package Livraria;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import Controle.CCliente;
import Controle.CEditora;
import Controle.CLivro;
import Controle.CVendaLivro;
import Model.Cliente;
import Model.Editora;
import Model.Livro;
import Model.VendaLivro;
import Services.ClienteServicos;
import Services.EditoraServicos;
import Services.FactoryServicos;
import Services.LivroServicos;
import Services.PedidoServicos;
import util.Validadores;
import view.menu;

public class Livraria { // Incio CLASS

    public static CCliente CadCliente = new CCliente();
    public static CEditora CadEditora = new CEditora();
    public static CLivro CadLivro = new CLivro();
    public static CVendaLivro CadVendaLivro = new CVendaLivro();
    public static Scanner ler = new Scanner(System.in);
    public static String tpCad = null;

    public static int lerNum() {// Incio LEIA
        Scanner ler = new Scanner(System.in);
        try {
            return ler.nextInt();
        } catch (Exception e) {
            System.out.println("Tente novamente!");
            lerNum();
        }
        return 0;
    }// Fim LEIA

    public static float lerNumFLOAT() {// Incio LEIA
        Scanner ler = new Scanner(System.in);
        try {
            return ler.nextFloat();
        } catch (Exception e) {
            System.out.println("Tente novamente!");
            lerNumFLOAT();
        }
        return 0;
    }// Fim LEIA

    // Inicio MENUS
    public static void MenuP() {// Inicio MENU
        System.out.println("\n+----------------------+");
        System.out.println("|       LIVRARIA       |");
        System.out.println("+----------------------+");
        System.out.println("| 1 - Ger. Cliente     |");
        System.out.println("| 2 - Ger. Editora     |");
        System.out.println("| 3 - Ger. Livro       |");
        System.out.println("| 4 - Venda Livro      |");
        System.out.println("| 0 - Sair             |");
        System.out.println("+----------------------+");
        System.out.print("  Escolha uma opção: ");

    }// Fim MENU

    public static void SubMenu(int op) {// Inicio SUBMENU
        tpCad = null;
        switch (op) {
            case 1:
                tpCad = "Cliente";
                break;
            case 2:
                tpCad = "Editora";
                break;
            case 3:
                tpCad = "Livro";
                break;
        }
        System.out.println("+-----------------------------------------+");
        System.out.println("|              Gerenciamento              |");
        System.out.println("+-----------------------------------------+");
        System.out.println("| 1 - Cadastrar " + tpCad + "\t                  |");
        System.out.println("| 2 - Editar " + tpCad + "\t                  |");
        System.out.println("| 3 - Listar " + tpCad + " \t                  |");
        System.out.println("| 4 - Deletar " + tpCad + "\t                  |");
        System.out.println("| 0 - Voltar                              |");
        System.out.println("+-----------------------------------------+");
        System.out.print(" Escolha uma opção: ");
    }// Fim SUBMENU
    // Fim MENUS

    // Inicio CLIENTE
    public static void cadastrarCliente() {// Inicio CADCLIENTE
        String nomeCliente;
        String cpf;
        String endereco;
        String telefone;
        ClienteServicos ClienteS = FactoryServicos.getClienteServicos();
        System.out.println("+----------------------------+");
        System.out.println("| -- Cadastro de clientes -- |");
        System.out.println("+----------------------------+");
        System.out.print("Informe o CPF: ");

        boolean cpfValido;
        int opCPF = 0;

        do {
            cpf = ler.nextLine();
            cpfValido = Validadores.isCPF(cpf);

            if (!cpfValido) {
                System.out.println("CPF inválido\nDeseja tentar novamente? 1 - Sim | 2 - Não");
                opCPF = ler.nextInt();
                ler.nextLine(); // limpa o buffer do teclado

                if (opCPF == 2) {
                    System.out.println("Cadastro cancelado pelo usuário");
                    return;
                }
            }
        } while (!cpfValido);

        if (opCPF != 2 && ClienteS.buscarClienteCPF(cpf) != null) {
            System.out.println("Cliente já cadastrado");
        } else if (opCPF != 2) { // adiciona a verificação de que o usuário não cancelou
            System.out.print("Informe o nome: ");
            nomeCliente = ler.nextLine();
            System.out.print("Informe o telefone: ");
            telefone = ler.nextLine();
            System.out.print("Informe o endereço: ");
            endereco = ler.nextLine();
            int idCliente = CadCliente.geraID();
            Cliente cli = new Cliente(idCliente, nomeCliente, cpf, cpf, endereco, telefone);
            ClienteS.cadCliente(cli);
            CadCliente.addCliente(cli);
            System.out.println("Cliente cadastrado com sucesso!");
        }

    }// Fim CADCLIENTE

    private static void editarCliente() {// Inicio EDICLIENTE
        System.out.println("+----------------------------+");
        System.out.println("| --  Edição de clientes  -- |");
        System.out.println("+----------------------------+");
        System.out.print(" Informe o CPF: ");
        String cpf = ler.nextLine();
        ClienteServicos clienteS = FactoryServicos.getClienteServicos();
        if (Validadores.isCPF(cpf)) {
            Cliente cli = clienteS.buscarClienteCPF(cpf);
            if (cli != null) {
                System.out.println("1- Nome:\t" + cli.getNomeCliente());
                System.out.println("2- Endereco:\t" + cli.getEndereco());
                System.out.println("3- Telefone:\t" + cli.getTelefone());
                System.out.println("4- Todos os campos acima.");
                System.out.print("Qual campo gostaria de alterar ? \nDigite aqui:");
                int opEditor = lerNum();
                if (opEditor == 1 || opEditor == 4) {
                    System.out.print("Informe o Nome: ");
                    cli.setNomeCliente(ler.nextLine());
                }
                if (opEditor == 2 || opEditor == 4) {
                    System.out.print("Informe o Endereço: ");
                    cli.setEndereco(ler.nextLine());
                }
                if (opEditor == 3 || opEditor == 4) {
                    System.out.print("Informe o Telefone: ");
                    cli.setTelefone(ler.nextLine());
                }
                clienteS.attCliente(cli);
            } else {
                System.out.println("Cliente não consta na base de dados!.");
            }
        }

    }// Fim EDICLIENTE

    public static void deletarCliente() {// Inicio DELCLIENTE
        ClienteServicos clienteS = FactoryServicos.getClienteServicos();
        System.out.println("+-----------------------------+");
        System.out.println("| --  Remoção de clientes  -- |");
        System.out.println("+-----------------------------+");
        System.out.print("Informe o CPF: ");
        String cpf = ler.next();
        if (Validadores.isCPF(cpf)) {
            Cliente cli = clienteS.buscarClienteCPF(cpf);
            if (cli != null) {
                clienteS.delCliente(cpf);
                System.out.println("Cliente deletado com sucesso!.");
            } else {
                System.out.println("Cliente não consta na base de dados.");
            }
        } else {
            System.out.println("CPF Inválido!.");
        }
    }// Fim DELCLIENTE

    public static void listarCliente() {// Inicio LISTACLIENTE
        ClienteServicos clienteS = FactoryServicos.getClienteServicos();
        for (Cliente cli : clienteS.getClientes()) {
            System.out.println("+-------------------------------------+");
            System.out.println("CPF: " + cli.getCpf());
            System.out.println("Nome:" + cli.getNomeCliente());
            System.out.println("Telefone: " + cli.getTelefone());
            System.out.println("Endereço: " + cli.getEndereco());
        }
    }// Fim LISTACLIENTE
    // Fim CLIENTE

    // Inicio EDITORA
    public static void cadastrarEditora() {// Inicio CADEDITORA
        int idEditora;
        String nomeEditora;
        String cnpj;
        String endereco;
        String telefone;
        String nomeGerente;
        EditoraServicos EditoraS = FactoryServicos.getEditoraServicos();
        System.out.println("+----------------------------+");
        System.out.println("| -- Cadastro de editoras -- |");
        System.out.println("+----------------------------+");
        System.out.print("Informe o CNPJ:");
        boolean cnpjis;
        int opCNPJ;
        do {// Inicio DO
            cnpj = ler.nextLine();
            cnpjis = Validadores.isCNPJ(cnpj);
            if (!cnpjis) {
                System.out.println("CNPJ inválido" + "\nDeseja tentar novamente ? 1 - Sim | 2 - Não");
                opCNPJ = lerNum();

                if (opCNPJ == 1) {
                    System.out.println("Informe o CNPJ:");
                } else if (opCNPJ == 2) {
                    System.out.println("Cadastro cancelado pelo usuário");
                    return;
                }
            }
        } while (!Validadores.isCNPJ(cnpj));
        if (EditoraS.buscarEditora(cnpj) != null) {
            System.out.println("Editora já cadastrada");
        } else {
            System.out.print("Informe o nome da Editora: ");
            nomeEditora = ler.nextLine();
            System.out.print("Informe o Telefone: ");
            telefone = ler.nextLine();
            System.out.print("Informe o Endereço: ");
            endereco = ler.nextLine();
            System.out.print("Informe o nome do Gerente: ");
            nomeGerente = ler.nextLine();
            idEditora = CadEditora.geraID();
            Editora edi = new Editora(idEditora, nomeEditora, cnpj, endereco, telefone, nomeGerente);
            EditoraS.cadEditora(edi);
            CadEditora.addEditora(edi);
            System.out.println("Editora cadastrada com sucesso!");
        } // Fim DO
    }// Fim CADEDITORA

    private static void editarEditora() {// Inicio EDIEDITORA
        System.out.println("+----------------------------+");
        System.out.println("| --  Edição de editoras  -- |");
        System.out.println("+----------------------------+");
        System.out.print("Informe o CNPJ: ");
        String cnpj = ler.nextLine();
        EditoraServicos editoraS = FactoryServicos.getEditoraServicos();
        if (Validadores.isCNPJ(cnpj)) {
            Editora edi = editoraS.buscarEditora(cnpj);
            if (edi != null) {
                System.out.println("1- Nome Editora:\t" + edi.getnomeEditora());
                System.out.println("2- Endereço:\t" + edi.getEndereco());
                System.out.println("3- Telefone:\t" + edi.getTelefone());
                System.out.println("4- Nome Gerente:\t" + edi.getGerente());
                System.out.println("5- Todos os campos acima.");
                System.out.print("Qual campo gostaria de alterar ? +\nDigite aqui:");
                int opEditor = lerNum();
                if (opEditor == 1 || opEditor == 5) {
                    System.out.println("Informe o Nome:");
                    edi.setNomeEditora(cnpj);
                }
                if (opEditor == 2 || opEditor == 5) {
                    System.out.println("Informe o Endereço:");
                    edi.setEndereco(cnpj);
                }
                if (opEditor == 3 || opEditor == 5) {
                    System.out.println("Informe o Telefone:");
                    edi.setTelefone(cnpj);
                }
                if (opEditor == 4 || opEditor == 5) {
                    System.out.println("Informe o Gerente:");
                    edi.setGerente(cnpj);
                }
                System.out.println("Editora \n" + edi.toString());
                editoraS.attEditora(edi);
            } else {
                System.out.println("Editora não consta na base de dados!.");
            }
        }

    }// Fim EDIEDITORA

    public static void deletarEditora() {// Inicio DELEDITORA
        EditoraServicos editoraS = FactoryServicos.getEditoraServicos();
        System.out.println("+----------------------------+");
        System.out.println("| --  Remoção de editoras -- |");
        System.out.println("+----------------------------+");
        System.out.print("Informe o CNPJ: ");
        String cnpj = ler.next();
        if (Validadores.isCNPJ(cnpj)) {
            Editora edi = editoraS.buscarEditora(cnpj);
            if (edi != null) {
                editoraS.delEditora(cnpj);
                System.out.println("Editora deletada com sucesso!.");
            } else {
                System.out.println("Editora não consta na base de dados.");
            }
        } else {
            System.out.println("CNPJ Inválido!.");
        }
    }// Fim DELEDITORA

    public static void listarEditora() {// Inicio LISTAEDITORA
        EditoraServicos editoraS = FactoryServicos.getEditoraServicos();
        for (Editora edi : editoraS.getEditoras()) {
            System.out.println("+-------------------------------------+");
            System.out.println("CNPJ: " + edi.getcnpj());
            System.out.println("Nome Editora: " + edi.getnomeEditora());
            System.out.println("Telefone: " + edi.getTelefone());
            System.out.println("Endereço: " + edi.getEndereco());
            System.out.println("Gerente: " + edi.getGerente());
        }
    }// Fim LISTAEDITORA
    // Fim EDITORA

    // Inicio LIVRO
    public static void cadastrarLivro() {// Inicio CADLIVRO
        System.out.println("+----------------------------+");
        System.out.println("| --  Cadastro de livros  -- |");
        System.out.println("+----------------------------+");
        LivroServicos LivroS = FactoryServicos.getLivroServicos();
        EditoraServicos EditoraS = FactoryServicos.getEditoraServicos();
        System.out.print("Informe o ISBN: ");
        String isbn = ler.nextLine();
        if (LivroS.getLivrobyDoc(isbn) != null) {
            System.out.println("Livro já cadastrado!.");
        } else {
            int idLivro = CadLivro.geraID();
            System.out.print("Informe o titulo do livro: ");
            String titulo = ler.nextLine();
            System.out.print("Informe o autor do livro: ");
            String autor = ler.nextLine();
            System.out.print("Informe o gênero: ");
            String assunto = ler.nextLine();
            System.out.print("Informe o estoque: ");
            int estoque = lerNum();
            System.out.print("Informe o preço: ");
            float preco = lerNumFLOAT();
            boolean isCNPJ = false;
            Editora idEditora = null;
            do {
                System.out.print("Informe o CNPJ da editora: ");
                String cnpj = ler.nextLine();
                isCNPJ = Validadores.isCNPJ(cnpj);
                if (isCNPJ) {
                    idEditora = EditoraS.buscarEditora(cnpj);
                    if (idEditora == null) {
                        System.out.println("Editora não cadastrada!.");
                        isCNPJ = false;
                    } else {
                        Livro li = new Livro(idLivro, titulo, autor, assunto, isbn, estoque, preco, idEditora);
                        LivroS.cadLivro(li);
                        CadLivro.addLivro(li);
                        System.out.println("Livro cadastrado com sucesso!.");
                        isCNPJ = false;
                    }
                } else {
                    System.out.println("CNPJ inválido!.");
                }
            } while (isCNPJ);

        }
    }// Fim CADLIVRO

    private static void editarLivro() {// Inicio EDILIVRO
        System.out.println("+----------------------------+");
        System.out.println("| --   Edição de livros   -- |");
        System.out.println("+----------------------------+");
        System.out.print("Informe o ISBN: ");
        String isbn = ler.nextLine();
        LivroServicos livroS = FactoryServicos.getLivroServicos();
        Livro li = livroS.buscarLivro(isbn);
        if (li != null) {
            System.out.println("Livro a ser alterado: " + li.getTitulo());
            System.out.print("Você tem certeza que deseja alterar este livro ? Digite 1 - Sim | 2 - Não \n");
            int op = lerNum();
            if (op == 1) {
                System.out.println("+------------------------+");
                System.out.println("+- INFORMAÇÕES DO LIVRO -+");
                System.out.println("+------------------------+");
                System.out.println(" 1- Nome livro:" + li.getTitulo());
                System.out.println(" 2- Autor:" + li.getAutor());
                System.out.println(" 3- Genero:" + li.getAssunto());
                System.out.println(" 4- Qt. em estoque:" + li.getEstoque());
                System.out.println(" 5- Preço:" + li.getPreco());
                System.out.println(" 6- Todos os campos acima.");
                System.out.print("Qual campo gostaria de alterar ? \nDigite aqui:");
                int opEditor = lerNum();
                if (opEditor == 1 || opEditor == 6) {
                    System.out.println("Informe o Nome:");
                    li.setTitulo(isbn);
                }
                if (opEditor == 2 || opEditor == 6) {
                    System.out.println("Informe o Autor:");
                    li.setAutor(isbn);
                }
                if (opEditor == 3 || opEditor == 6) {
                    System.out.println("Informe o Genero:");
                    li.setAssunto(isbn);
                }
                if (opEditor == 4 || opEditor == 6) {
                    System.out.println("Informe a quantia em Estoque:");
                    li.setEstoque(opEditor);
                }
                if (opEditor == 5 || opEditor == 6) {
                    System.out.println("Informe o Preço:");
                    li.setPreco(opEditor);
                }
                livroS.attLivro(li);
            } else {
                System.out.println("Alteração cancelada pelo usuário!.");
            }
        } else {
            System.out.println("ISBN não localizado!.");
        }

    }// Fim EDILIVRO

    public static void deletarLivro() {// Inicio DELLIVRO
        System.out.println("+----------------------------+");
        System.out.println("| --   Remoção de livros  -- |");
        System.out.println("+----------------------------+");
        System.out.print("Informe o ISBN: ");
        String isbn = ler.nextLine();
        Livro li = CadLivro.getLivroISBN(isbn);
        if (li != null) {
            System.out.println("Livro " + li.getTitulo() + " Será deletado!.");
            CadLivro.removeLivro(li);
        } else {
            System.out.println("ISBN não encontrado!.");
        }
    }// Fim DELLIVRO

    public static void listarLivro() {// Inicio LISTALIVRO
        LivroServicos livroS = FactoryServicos.getLivroServicos();
        for (Livro livro : livroS.getLivros()) {
            System.out.println("+-------------------------------------+");
            System.out.println("ISBN: " + livro.getIsbn());
            System.out.println("Titulo: " + livro.getTitulo());
            System.out.println("Assunto: " + livro.getAssunto());
            System.out.println("Autor: " + livro.getAutor());
            System.out.println("Estoque: " + livro.getEstoque());
            System.out.println("Preço: " + livro.getPreco());
            System.out.println("Editora: " + livro.getIdEditora().getnomeEditora() + "\n");
        }
    }// Fim LISTALIVRO
    // Fim LIVRO

    // Inicio VENDALIVRO
    public static void VendaLivro() {
        PedidoServicos pedidoS = FactoryServicos.getPedidoServicos();
        Cliente cliente = solicitaCliente();
        ArrayList<Livro> livros = solicitaLivros();
        float subTotal = calculaSubTotal(livros);
        LocalDate dataVenda = LocalDate.now();
        int idVendaLivro = CadVendaLivro.geraID();
        VendaLivro vl = new VendaLivro(idVendaLivro, cliente, livros, idVendaLivro, subTotal, dataVenda, idVendaLivro);
        pedidoS.cadLivro(vl);
    }

    private static Cliente solicitaCliente() {
        ClienteServicos ClienteS = FactoryServicos.getClienteServicos();
        Cliente cliente = null;
        do {
            System.out.print("Informe o CPF do cliente: ");
            String cpf = ler.nextLine();
            if (Validadores.isCPF(cpf)) {
                cliente = ClienteS.buscarClienteCPF(cpf);
                if (cliente.getCpf() == null) {
                    System.out.println("Cliente não cadastrado, tente novamente!.");
                }
            } else {
                System.out.println("CPF Inválido, tente novamente!.");
            }
        } while (cliente.getCpf() == null);
        return cliente;
    }

    private static Livro solicitaLivro() {
        LivroServicos LivroS = FactoryServicos.getLivroServicos();
        Livro livro = null;
        do {
            System.out.print("Informe o ISBN: ");
            String isbn = ler.nextLine();
            livro = LivroS.buscarLivro(isbn);
            if (livro.getIsbn() == null) {
                System.out.print("Livro não encontrado, tente novamente!.");
            }
        } while (livro.getIsbn() == null);
        return livro;
    }

    private static ArrayList<Livro> solicitaLivros() {
        LivroServicos LivroS = FactoryServicos.getLivroServicos();
        ArrayList<Livro> livros = new ArrayList<>();
        boolean continuarCompra = true;
        do {
            Livro livro = solicitaLivro();
            livros.add(livro);
            livro.setEstoque(livro.getEstoque() - 1);
            LivroS.attEstoque(livro);
            System.out.print("Deseja comprar mais livros nesta venda? 1-Sim | 2-Não\nInforme a opção: ");
            int opcao = lerNum();
            continuarCompra = (opcao == 1);
        } while (continuarCompra);
        return livros;
    }

    private static float calculaSubTotal(ArrayList<Livro> livros) {
        float subTotal = 0;
        for (Livro livro : livros) {
            subTotal += livro.getPreco();
        }
        return subTotal;
    }
    // Fim VENDALIVRO

    // Inicio MAIN
    public static void main(String[] args) {// Inicio VOID
        menu jMenu = new menu();
        jMenu.setVisible(true);

        /* int opM;
        do {
            MenuP();
            opM = lerNum();
            switch (opM) {
                case 1:
                case 2:
                case 3:

                    int opSM;
                    do {
                        SubMenu(opM);
                        opSM = lerNum();

                        switch (opSM) {
                            case 1:
                                if (tpCad.equals("Cliente")) {
                                    cadastrarCliente();
                                }
                                if (tpCad.equals("Editora")) {
                                    cadastrarEditora();
                                }
                                if (tpCad.equals("Livro")) {
                                    cadastrarLivro();
                                }
                                break;
                            case 2:
                                if (tpCad.equals("Cliente")) {
                                    editarCliente();
                                }
                                if (tpCad.equals("Editora")) {
                                    editarEditora();
                                }
                                if (tpCad.equals("Livro")) {
                                    editarLivro();
                                }
                                break;
                            case 3:
                                if (tpCad.equals("Cliente")) {
                                    listarCliente();
                                }
                                if (tpCad.equals("Editora")) {
                                    listarEditora();
                                }
                                if (tpCad.equals("Livro")) {
                                    listarLivro();
                                }
                                break;
                            case 4:
                                if (tpCad.equals("Cliente")) {
                                    deletarCliente();
                                }
                                if (tpCad.equals("Editora")) {
                                    deletarEditora();
                                }
                                if (tpCad.equals("Livro")) {
                                    deletarLivro();
                                }
                                break;
                            case 0:
                                opM = 99;
                                break;
                            default:
                                System.out.println("Opção inválida, tente novamente!!");
                                break;
                        }

                    } while (opSM != 0); // SubMenu
                    break;
                case 4:
                    System.out.println("-- Venda Livros--");
                    VendaLivro();
                    break;
                case 0:
                    System.out.println("Serviço finalizado pelo usuário!!");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente!!");
                    break;
            }
        } while (opM != 0);// Sistema
         */
    }// Fim VOID
} // Fim MAIN
  // Fim CLASS
