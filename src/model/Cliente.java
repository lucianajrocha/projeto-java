package model;

public class Cliente extends Pessoa implements Autenticavel{

    private Livro[] listaDeLivros;
    private String metodoPagamento;

    public Cliente(String nome, String email, String senha, Endereco endereco) {
        super(nome, email, senha, endereco);
        this.listaDeLivros = new Livro[10];
        this.metodoPagamento = "";
    }

    @Override
    public boolean autenticar(String senha, String email) {
        return this.getSenha().equals(senha) && this.getEmail().equals(email);
    }
}
