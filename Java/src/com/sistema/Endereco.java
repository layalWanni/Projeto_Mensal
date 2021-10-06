package com.sistema;

public class Endereco {

    private String estado;
    private String cidade;
    private String idEndereco;
    private String rua;
    private String bairro;
    private long numeroMoradia;

    public Endereco() {
    }
    public Endereco(String estado, String cidade, String idEndereco, String rua, String bairro, long numeroMoradia) {
        this.estado = estado;
        this.cidade = cidade;
        this.idEndereco = idEndereco;
        this.rua = rua;
        this.bairro = bairro;
        this.numeroMoradia = numeroMoradia;
    }

    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public String getIdEndereco() {
        return idEndereco;
    }
    public void setIdEndereco(String idEndereco) {
        this.idEndereco = idEndereco;
    }
    public String getRua() {
        return rua;
    }
    public void setRua(String rua) {
        this.rua = rua;
    }
    public String getBairro() {
        return bairro;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public long getNumeroMoradia() {
        return numeroMoradia;
    }
    public void setNumeroMoradia(long numeroMoradia) {
        this.numeroMoradia = numeroMoradia;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "estado='" + estado + '\'' +
                ", cidade='" + cidade + '\'' +
                ", idEndereco='" + idEndereco + '\'' +
                ", rua='" + rua + '\'' +
                ", bairro='" + bairro + '\'' +
                ", numeroMoradia=" + numeroMoradia +
                '}';
    }
}
