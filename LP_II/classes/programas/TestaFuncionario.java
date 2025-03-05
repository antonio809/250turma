package classes.programas;
import classes.Funcionario;

public class TestaFuncionario {
    public static void main(String[] args) {
        
        Funcionario fun = new Funcionario();

        fun.cargo = "recepcionista";
        fun.cpf = 1233213;
        fun.dataContratacao = 1212;
        fun.departamento = "médico";
        fun.nome = "antônio";
        fun.salario = 2000.0;

        System.out.println("Cargo: " + fun.cargo);
        System.out.println("CPF: " + fun.cpf);
        System.out.println("Data de Contratação: " + fun.dataContratacao);
        System.out.println("Departamento: " + fun.departamento);
        System.out.println("Nome: " + fun.nome);
        System.out.println("Salário: " + fun.salario);
    }
}
