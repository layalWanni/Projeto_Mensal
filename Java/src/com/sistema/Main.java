package com.sistema;

public class Main {

    public static void main(String[] args) {

        Produto p1 = new Produto(001, 001, 001, 7777777, "Coca-Cola 350ml", 15, 2.50, 5.00);
        Produto p2 = new Produto(002, 001, 002, 8888888, "Guarana Antartica 350ml", 10, 2.50, 5.00);

        Categoria c1 = new Categoria(001, "Refrigerante");
        c1.getProdutosCategoria().add(p1);
        c1.getProdutosCategoria().add(p2);

        System.out.println(c1);
    }
}
