package model;

import java.util.ArrayList;

public class Livraria {
    ArrayList<Livro> lista;

    public Livraria() {
        this.lista = new ArrayList<>();
        this.lista.add(new Livro("Harry Potter", "J.K. Rowling", 50));
        this.lista.add(new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 60));
        this.lista.add(new Livro("O Pequeno Príncipe", "Antoine de Saint-Exupéry", 40));
        this.lista.add(new Livro("Dom Quixote", "Miguel de Cervantes", 30));
        this.lista.add(new Livro("O Hobbit", "J.R.R. Tolkien", 50));
        this.lista.add(new Livro("O Diário de Anne Frank", "Anne Frank", 40));
    }

    public ArrayList<Livro> getLista() {
        return this.lista;
    }

    public void adicionarLivro(Livro livro){
        this.lista.add(livro);
    }

    public void imprimirLista(){
        for (Livro livro : lista) {
            System.out.println(livro.getTitulo() + " - " + livro.getAutor() + " - " + livro.getValor());
        }
    }

    public void imprimirListaComID(){
        for (int i = 0 ; i < lista.size(); i++){
            System.out.println( i + " - " + lista.get(i).getTitulo() + " - " + lista.get(i).getAutor() + " - " + lista.get(i).getValor());
        }
    }

    public void removerDaListaPeloID(int ID){
        this.lista.remove(ID);
    }

}