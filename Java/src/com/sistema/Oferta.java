package com.sistema;

public class Oferta {

    private long idProduto;
    private Double descontoProduto;
    //private Instant dataOfertal;


    public Oferta() {
    }
    public Oferta(long idProduto, Double descontoProduto) {
        this.idProduto = idProduto;
        this.descontoProduto = descontoProduto;
    }

    public long getIdProduto() {
        return idProduto;
    }
    public void setIdProduto(long idProduto) {
        this.idProduto = idProduto;
    }
    public Double getDescontoProduto() {
        return descontoProduto;
    }
    public void setDescontoProduto(Double descontoProduto) {
        this.descontoProduto = descontoProduto;
    }

    @Override
    public String toString() {
        return "Oferta{" +
                "idProduto=" + idProduto +
                ", descontoProduto=" + descontoProduto +
                '}';
    }
}
