package classes.programas;
import classes.ContaBancaria;

public class TestaContaBancaria {
    public static void main(String[] args) {
        ContaBancaria cb = new ContaBancaria();

        cb.titular = "Enzo lero lero";
        cb.numero = 123456;
        cb.saldo = 1;
        cb.tipoConta = "Corrente";
        cb.agencia = 5678;
        cb.banco = "Banco JK";

        System.out.println("Titular: " + cb.titular);
        System.out.println("Banco: " + cb.banco);
        System.out.println("Saldo: R$ " + cb.saldo);
        System.out.println("Número da conta: " + cb.numero);
        System.out.println("Tipo da conta: " + cb.tipoConta);
        System.out.println("Agência: " + cb.agencia);

    }
}