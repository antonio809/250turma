package classes.programas;

import classes.Filme;

public class TestaFilme {
    public static void main(String[] args) {
        
        Filme fil = new Filme();

        fil.anoLancamento = 2009;
        fil.classificacao = "16 Anos";
        fil.diretor = "Antônio Jorge";
        fil.duracao = "150 Minutos";
        fil.genero = "Drama";
        fil.titulo = "A vida é uma só para desperdiçar oportunidades!";
        
        System.out.println("Ano de lançamento: " + fil.anoLancamento);
        System.out.println("Classificação: " + fil.classificacao);
        System.out.println("Diretor: " + fil.diretor);
        System.out.println("Duração: " + fil.duracao);
        System.out.println("Gênero: " + fil.genero);
        System.out.println("Título: " + fil.titulo);
    }
}
