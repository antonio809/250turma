package classes.programas;

import classes.Livro;

public class TestaLivro {   
    public static void main(String[] args) {
        
        Livro li = new Livro();

        li.anoPublicacao = 2009;
        li.autor = "Beatriz Costa";
        li.editora = "OZOV";
        li.paginas = 450;
        li.titulo = "Organização Zona Oeste Verde";
        li.isbn = 001;

        System.out.println("Ano de publicação: " + li.anoPublicacao);
        System.out.println("Autora: " + li.autor);
        System.out.println("Editora: " + li.editora);
        System.out.println("Quantidade de páginas: " + li.paginas);
        System.out.println("Título: " + li.titulo);
        System.out.println("Código de verificação: " + li.isbn);
    }
}
