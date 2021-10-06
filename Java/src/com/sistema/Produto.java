package com.sistema;

public class Produto {

    private long idProduto;
    private long idCategoria;
    private long idFornecedor;
    private long codigoDeBarras;
    private String nomeProduto;
    private long quantProduto;
    private Double valorCusto;
    private Double valorVenda;
    //private Instant dataValidade;
    //private Instant dataChegada;


    public Produto() {
    }
    public Produto(long idProduto, long idCategoria, long idFornecedor, long codigoDeBarras, String nomeProduto, long quantProduto, Double valorCusto, Double valorVenda) {
        this.idProduto = idProduto;
        this.idCategoria = idCategoria;
        this.idFornecedor = idFornecedor;
        this.codigoDeBarras = codigoDeBarras;
        this.nomeProduto = nomeProduto;
        this.quantProduto = quantProduto;
        this.valorCusto = valorCusto;
        this.valorVenda = valorVenda;
    }

    public long getIdProduto() {
        return idProduto;
    }
    public void setIdProduto(long idProduto) {
        this.idProduto = idProduto;
    }
    public long getIdCategoria() {
        return idCategoria;
    }
    public void setIdCategoria(long idCategoria) {
        this.idCategoria = idCategoria;
    }
    public long getIdFornecedor() {
        return idFornecedor;
    }
    public void setIdFornecedor(long idFornecedor) {
        this.idFornecedor = idFornecedor;
    }
    public long getCodigoDeBarras() {
        return codigoDeBarras;
    }
    public void setCodigoDeBarras(long codigoDeBarras) {
        this.codigoDeBarras = codigoDeBarras;
    }
    public String getNomeProduto() {
        return nomeProduto;
    }
    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }
    public long getQuantProduto() {
        return quantProduto;
    }
    public void setQuantProduto(long quantProduto) {
        this.quantProduto = quantProduto;
    }
    public Double getValorCusto() {
        return valorCusto;
    }
    public void setValorCusto(Double valorCusto) {
        this.valorCusto = valorCusto;
    }
    public Double getValorVenda() {
        return valorVenda;
    }
    public void setValorVenda(Double valorVenda) {
        this.valorVenda = valorVenda;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "idProduto=" + idProduto +
                ", idCategoria=" + idCategoria +
                ", idFornecedor=" + idFornecedor +
                ", codigoDeBarras=" + codigoDeBarras +
                ", nomeProduto='" + nomeProduto + '\'' +
                ", quantProduto=" + quantProduto +
                ", valorCusto=" + valorCusto +
                ", valorVenda=" + valorVenda +
                '}';
    }
}
