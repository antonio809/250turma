package classes.programas;
import classes.Carro;

public class TestaCarro {
    public static void main(String[] args) {
        
        Carro car = new Carro();

        car.ano = 2009;
        car.cor = "Roxo";
        car.marca = "Renault";
        car.modelo = "Logan 2012";
        car.placa = "LGX9D90";
        car.quilometragem = 100000;

        System.out.println("Ano: " + car.ano);
        System.out.println("Cor do carro: " + car.cor);
        System.out.println("Marca do carro: " + car.marca);
        System.out.println("Modelo do carro: " + car.modelo);
        System.out.println("Placa: " + car.placa);
        System.out.println("Quilometragem: " +  car.quilometragem);
    }
}
