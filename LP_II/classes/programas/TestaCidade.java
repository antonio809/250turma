package classes.programas;

import classes.Cidade;

public class TestaCidade {
    public static void main(String[] args) {
        
        Cidade city = new Cidade();

        city.anoFundacao = 1901;
        city.area = 111;
        city.estado = "Rio de Janeiro";
        city.nome = "Duque de Caxias";
        city.populacao = 10.000;
        city.prefeito = "Ariovaldo";

        System.out.println("Ano de fundação: " + city.anoFundacao);
        System.out.println("Área: " + city.area);
        System.out.println("Estado: " + city.estado);
        System.out.println("Nome: " + city.nome);
        System.out.println("População: " + city.populacao);
        System.out.println("Prefeito: " + city.prefeito);
    }
}
