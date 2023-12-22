package model;

public class Livro {
    private String titulo;
    private String autor;
    private double valor;

    public Livro(String titulo, String autor, double valor) {
        this.titulo = titulo;
        this.autor = autor;
        this.valor = valor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
