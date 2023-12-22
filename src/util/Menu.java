package util;

public class Menu {

    private int opcao;
    private int opcaoVendedor;
    private int opcaoComprador;

    public int getOpcaoVendedor() {
        return opcaoVendedor;
    }
    public void setOpcaoVendedor(int opcaoVendedor) {
        this.opcaoVendedor = opcaoVendedor;
    }

    public int getOpcaoComprador() {
        return opcaoComprador;
    }

    public void setOpcaoComprador(int opcaoComprador) {
        this.opcaoComprador = opcaoComprador;
    }

    public void mostrarMenuInicial() {
        System.out.println("********************************************");
        System.out.println("Menu principal: ");
        System.out.println("1 - Acessar menu de vendedor");
        System.out.println("2 - Acessar menu de comprador");
        System.out.println("3 - Cadastrar comprador");
        System.out.println("4 - Cadastrar vendedor");
        System.out.println("0 - Sair");
        System.out.println("********************************************");
    }

    public void mostrarMenuComprador(){
        System.out.println("********************************************");
        System.out.println("Menu de comprador: ");
        System.out.println("1 - Listar livros");
        System.out.println("2 - Comprar livro");
        System.out.println("0 - Sair");
        System.out.println("********************************************");
    }

    public void mostrarMenuVendedor(){
        System.out.println("********************************************");
        System.out.println("Menu de vendedor: ");
        System.out.println("1 - Cadastrar livro");
        System.out.println("2 - Remover livro");
        System.out.println("3 - Listar livros");
        System.out.println("4 - Alterar livro");
        System.out.println("0 - Sair");
        System.out.println("********************************************");
    }

    public void setOpcao(int opcao){
        this.opcao = opcao;
    }

    public int getOpcao(){
        return this.opcao;
    }
}