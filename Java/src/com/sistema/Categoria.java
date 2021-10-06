package com.sistema;

import java.util.ArrayList;
import java.util.List;

public class Categoria {

    private long idCategoria;
    private String nomeCategoria;
    private List<Produto> produtosCategoria = new ArrayList<Produto>();

    //constructor vazio
    public Categoria() {
    }
    //constructor com todos
    public Categoria(long idCategoria, String nomeCategoria, List<Produto> produtosCategoria) {
        this.idCategoria = idCategoria;
        this.nomeCategoria = nomeCategoria;
        this.produtosCategoria = produtosCategoria;
    }
    //constructor sem a lista
    public Categoria(long idCategoria, String nomeCategoria) {
        this.idCategoria = idCategoria;
        this.nomeCategoria = nomeCategoria;
    }

    //getter and setters
    public long getIdCategoria() {
        return idCategoria;
    }
    public void setIdCategoria(long idCategoria) {
        this.idCategoria = idCategoria;
    }
    public String getNomeCategoria() {
        return nomeCategoria;
    }
    public void setNomeCategoria(String nomeCategoria) {
        this.nomeCategoria = nomeCategoria;
    }
    public List<Produto> getProdutosCategoria() {
        return produtosCategoria;
    }
    public void setProdutosCategoria(List<Produto> produtosCategoria) {
        this.produtosCategoria = produtosCategoria;
    }

    //toString
    @Override
    public String toString() {
        return "Categoria{" +
                "idCategoria=" + idCategoria +
                ", nomeCategoria='" + nomeCategoria + '\'' +
                ", produtosCategoria=" + produtosCategoria +
                '}';
    }
}
