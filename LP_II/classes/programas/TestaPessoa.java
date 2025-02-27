package classes.programas;
import classes.Pessoa;
import java.util.Scanner;

public class TestaPessoa {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Pessoa pe = new Pessoa();

        pe.nome = "Antônio";
        pe.idade = 16;
        pe.cpf = 123645;
        pe.endereco = "Rua Alvarenga Peixoto, 256";
        pe.telefone = 98787832;

        System.out.println("Nome: " + pe.nome);
        System.out.println("Idade: " + pe.idade);
        System.out.println("CPF: " + pe.cpf);
        System.out.println("Endereço: " + pe.endereco);
        System.out.println("Telefone: " + pe.telefone);
    }
}
