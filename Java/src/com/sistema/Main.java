package com.sistema;

public class Main {

    public static void main(String[] args) {

        Produto p1 = new Produto(001, 001, 001, 7777777, "Coca-Cola 350ml", 15, 5.00, 2.50);
        Produto p2 = new Produto(002, 001, 002, 8888888, "Guarana Antartica 350ml", 10, 5.00, 2.50);

        Categoria c1 = new Categoria(001, "Refrigerante");
        c1.getProdutosCategoria().add(p1);
        c1.getProdutosCategoria().add(p2);

        System.out.println("Categoria: " + c1.getNomeCategoria());
        System.out.println("Id da Categoria: " + c1.getIdCategoria());
        System.out.println("Produtos: " + c1.getProdutosCategoria());
    }
}
