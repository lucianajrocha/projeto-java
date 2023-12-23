import model.*;
import util.Menu;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        Menu menu = new Menu();
        Cliente[] listaClientes = new Cliente[100];
        Vendedor[] listaVendedores = new Vendedor[100];
        Livraria livraria = new Livraria();
        boolean vendedorAutenticado = false;
        boolean compradorAutenticado = false;

        do {
            menu.mostrarMenuInicial();

            try {
                menu.setOpcao(Integer.parseInt(leia.nextLine()));
            } catch (NumberFormatException e) {
                System.out.println("\nDigite valores inteiros!");
                menu.setOpcao(100);
            }

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
                    do {
                        menu.mostrarMenuVendedor();
                        try {
                            menu.setOpcaoVendedor(Integer.parseInt(leia.nextLine()));
                        } catch (NumberFormatException e) {
                            System.out.println("\nDigite valores inteiros!");
                            menu.setOpcaoVendedor(100);
                        }
                        switch (menu.getOpcaoVendedor()) {
                            case 1:
                                System.out.println("Digite o titulo do livro: ");
                                String tituloLivro = leia.nextLine();
                                System.out.println("Digite o autor do livro: ");
                                String autorLivro = leia.nextLine();
                                System.out.println("Digite o valor do livro: ");
                                double valorLivro = leia.nextDouble();
                                leia.nextLine(); //Limpar o buffer
                                Livro novoLivro = new Livro(tituloLivro, autorLivro, valorLivro);
                                livraria.adicionarLivro(novoLivro);
                                break;
                            case 2:
                                livraria.imprimirListaComID();
                                System.out.println("Digite o ID do livro a ser removido: ");
                                int idParaRemover = Integer.parseInt(leia.nextLine());
                                livraria.removerDaListaPeloID(idParaRemover);
                                break;
                            case 3:
                                livraria.imprimirLista();
                                break;
                            case 0:
                                System.out.println("Saindo...");
                                vendedorAutenticado = false;
                                break;
                            default:
                                System.out.println("Opção inválida!");
                                break;
                        }
                    } while (menu.getOpcaoVendedor() != 0);
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

                    do {
                        menu.mostrarMenuComprador();
                        try {
                            menu.setOpcaoComprador(Integer.parseInt(leia.nextLine()));
                        } catch (NumberFormatException e) {
                            System.out.println("\nDigite valores inteiros!");
                            menu.setOpcaoComprador(100);
                        }
                        switch (menu.getOpcaoComprador()) {
                            case 1:
                                livraria.imprimirLista();
                                break;
                            case 2:
                                livraria.imprimirListaComID();
                                System.out.println("Digite o ID do livro a ser comprado: ");
                                int idParaComprar = Integer.parseInt(leia.nextLine());
                                System.out.println("O total sera: " + livraria.getLista().get(idParaComprar).getValor() + " dirija-se ao caixa ");
                                break;
                            case 0:
                                System.out.println("Saindo...");
                                compradorAutenticado = false;
                                break;
                            default:
                                System.out.println("Opção inválida!");
                                break;
                        }
                    } while (menu.getOpcaoComprador() != 0);
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