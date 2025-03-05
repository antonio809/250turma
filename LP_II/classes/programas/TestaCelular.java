package classes.programas;

import java.security.AuthProvider;

import classes.Celular;

public class TestaCelular {
    public static void main(String[] args) {
        
        Celular cell = new Celular();

        cell.bateria = 1000;
        cell.marca = "Apple";
        cell.memoria = 200;
        cell.modelo = "IPHONE 15";
        cell.preco = 1500.00;
        cell.tamanhoTela = 625;

        System.out.println("Bateria: " + cell.bateria);
        System.out.println("Marca: " + cell.marca);
        System.out.println("Memória: " + cell.memoria);
        System.out.println("Modelo: " + cell.modelo);
        System.out.println("Preço: " + cell.preco);
        System.out.println("Tamanho da tela: " + cell.tamanhoTela);

    }
}
