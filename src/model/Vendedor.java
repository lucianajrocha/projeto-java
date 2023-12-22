package model;

public class Vendedor extends Pessoa implements Autenticavel {

    private double salario;

    public Vendedor(String nome, String email, String senha, Endereco endereco) {
        super(nome, email, senha, endereco);
        this.salario = 800;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    @Override
    public boolean autenticar(String senha, String email) {
        return this.getSenha().equals(senha) && this.getEmail().equals(email);
    }


}
