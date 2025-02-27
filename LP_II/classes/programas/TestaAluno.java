package classes.programas;

import classes.Aluno;

public class TestaAluno {
    public static void main(String[] args) {
        
        Aluno al = new Aluno();

        al.anoDeEntrada = 2025;
        al.curso = "Informática";
        al.email = "coisinha@gmail.com";
        al.matricula = 1112025;
        al.nome = "Ariovaldo";
        al.telefone = 21999232;

        System.out.println("Ano de entrada: " + al.anoDeEntrada);
        System.out.println("Curso: " + al.curso);
        System.out.println("Email: " + al.email);
        System.out.println("Matrícula: " + al.matricula);
        System.out.println("Nome: " + al.nome);
        System.out.println("Telefone: " + al.telefone);
    }
}
