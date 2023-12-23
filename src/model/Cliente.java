package model;

public class Cliente extends Pessoa implements Autenticavel{

    private String metodoPagamento;

    public Cliente(String nome, String email, String senha, Endereco endereco) {
        super(nome, email, senha, endereco);
        this.metodoPagamento = "";
    }

    @Override
    public boolean autenticar(String senha, String email) {
        return this.getSenha().equals(senha) && this.getEmail().equals(email);
    }

    public String getMetodoPagamento() {
        return metodoPagamento;
    }

    public void setMetodoPagamento(String metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }
}
