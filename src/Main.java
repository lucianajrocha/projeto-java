import model.Cliente;
import model.Endereco;
import model.Vendedor;
import util.Menu;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        Menu menu = new Menu();
        Cliente[] listaClientes = new Cliente[100];
        Vendedor[] listaVendedores = new Vendedor[100];
        boolean vendedorAutenticado = false;
        boolean compradorAutenticado = false;

        do {
            menu.mostrarMenuInicial();
            menu.setOpcao(Integer.parseInt(leia.nextLine()));

            switch (menu.getOpcao()) {
                case 1:
                    System.out.println("Digite seu email: ");
                    String emailVendedorLogin = leia.nextLine();
                    System.out.println("Digite sua senha: ");
                    String senhaVendedorLogin = leia.nextLine();

                    for (Vendedor vendedor : listaVendedores) {
                        if (vendedor != null && vendedor.autenticar(senhaVendedorLogin, emailVendedorLogin)) {
                            System.out.println("Login realizado com sucesso!");
                            vendedorAutenticado = true;
                            break;
                        }
                    }

                    if (!vendedorAutenticado) {
                        System.out.println("Email ou senha incorretos!");
                        break;
                    }

                    menu.mostrarMenuVendedor();
                    menu.setOpcao(Integer.parseInt(leia.nextLine()));
                    switch(menu.getOpcao()) {
                        case 1:
                            System.out.println("Cadastrar livro");
                            break;
                        case 2:
                            System.out.println("Remover livro");
                            break;
                        case 3:
                            System.out.println("Listar livros");
                            break;
                        case 4:
                            System.out.println("Alterar livro");
                            break;
                        case 0:
                            System.out.println("Saindo...");
                            vendedorAutenticado = false;
                            break;
                        default:
                            System.out.println("Opção inválida!");
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Digite seu email: ");
                    String emailCompradorLogin = leia.nextLine();
                    System.out.println("Digite sua senha: ");
                    String senhaCompradorLogin = leia.nextLine();

                    for (Cliente cliente : listaClientes) {
                        if (cliente != null && cliente.autenticar(senhaCompradorLogin, emailCompradorLogin)) {
                            System.out.println("Login realizado com sucesso!");
                            compradorAutenticado = true;
                            break;
                        }
                    }

                    if (!compradorAutenticado) {
                        System.out.println("Email ou senha incorretos!");
                        break;
                    }

                    menu.mostrarMenuComprador();
                    menu.setOpcao(Integer.parseInt(leia.nextLine()));
                    switch(menu.getOpcao()) {
                        case 1:
                            System.out.println("Listar livros");
                            break;
                        case 2:
                            System.out.println("Comprar livro");
                            break;
                        case 0:
                            System.out.println("Saindo...");
                            compradorAutenticado = false;
                            break;
                        default:
                            System.out.println("Opção inválida!");
                            break;
                    }
                    break;
                case 3:
                    System.out.println("Digite seu email: ");
                    String emailComprador = leia.nextLine();
                    System.out.println("Digite sua senha: ");
                    String senhaComprador = leia.nextLine();
                    System.out.println("Digite seu nome: ");
                    String nomeComprador = leia.nextLine();
                    System.out.println("Digite o nome da sua rua: ");
                    String ruaComprador = leia.nextLine();
                    System.out.println("Digite o número da sua casa: ");
                    String numeroComprador = leia.nextLine();
                    System.out.println("Digite o nome do seu bairro: ");
                    String bairroComprador = leia.nextLine();
                    Cliente comprador = new Cliente(nomeComprador, emailComprador, senhaComprador, new Endereco(ruaComprador, numeroComprador, bairroComprador));

                    for (int i = 0; i < listaClientes.length; i++) {
                        if (listaClientes[i] == null) {
                            listaClientes[i] = comprador;
                            break;
                        }
                    }
                    break;
                case 4:
                    System.out.println("Digite seu email: ");
                    String emailVendedor = leia.nextLine();
                    System.out.println("Digite sua senha: ");
                    String senhaVendedor = leia.nextLine();
                    System.out.println("Digite seu nome: ");
                    String nomeVendedor = leia.nextLine();
                    System.out.println("Digite o nome da sua rua: ");
                    String ruaVendedor = leia.nextLine();
                    System.out.println("Digite o número da sua casa: ");
                    String numeroVendedor = leia.nextLine();
                    System.out.println("Digite o nome do seu bairro: ");
                    String bairroVendedor = leia.nextLine();
                    Vendedor vendedor = new Vendedor(nomeVendedor, emailVendedor, senhaVendedor, new Endereco(ruaVendedor, numeroVendedor, bairroVendedor));

                    for (int i = 0; i < listaVendedores.length; i++) {
                        if (listaVendedores[i] == null) {
                            listaVendedores[i] = vendedor;
                            break;
                        }
                    }
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }

        }
        while (menu.getOpcao() != 0);
        leia.close();
    }
}