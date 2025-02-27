package classes.programas;

import classes.Produto;

public class TestaProduto {
    public static void main(String[] args) {
        
        Produto pt = new Produto();

        pt.categoria = "enlatados";
        pt.codigo = "350";
        pt.estoque = 50;
        pt.fornecedor = "Panco";
        pt.nome = "Feijão";
        pt.preco = 25;

        System.out.println("Categoria: " + pt.categoria);
        System.out.println("Código: " + pt.codigo);
        System.out.println("Estoque: " + pt.estoque);
        System.out.println("Fornecedor: " + pt.fornecedor);
        System.out.println("Nome: " + pt.nome);
        System.out.println("Preço: " + pt.preco);
    }
}
