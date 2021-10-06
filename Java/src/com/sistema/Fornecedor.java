package com.sistema;

public class Fornecedor {

    private long idFornecedor;
    private long idEnderecoFornecedor;
    private String nomeFornecedor;
    private long telefoneFornecedor;
    //private Instant dataEntregas;


    public Fornecedor() {
    }
    public Fornecedor(long idFornecedor, long idEnderecoFornecedor, String nomeFornecedor, long telefoneFornecedor) {
        this.idFornecedor = idFornecedor;
        this.idEnderecoFornecedor = idEnderecoFornecedor;
        this.nomeFornecedor = nomeFornecedor;
        this.telefoneFornecedor = telefoneFornecedor;
    }

    public long getIdFornecedor() {
        return idFornecedor;
    }
    public void setIdFornecedor(long idFornecedor) {
        this.idFornecedor = idFornecedor;
    }
    public long getIdEnderecoFornecedor() {
        return idEnderecoFornecedor;
    }
    public void setIdEnderecoFornecedor(long idEnderecoFornecedor) {
        this.idEnderecoFornecedor = idEnderecoFornecedor;
    }
    public String getNomeFornecedor() {
        return nomeFornecedor;
    }
    public void setNomeFornecedor(String nomeFornecedor) {
        this.nomeFornecedor = nomeFornecedor;
    }
    public long getTelefoneFornecedor() {
        return telefoneFornecedor;
    }
    public void setTelefoneFornecedor(long telefoneFornecedor) {
        this.telefoneFornecedor = telefoneFornecedor;
    }

    @Override
    public String toString() {
        return "Fornecedor{" +
                "idFornecedor=" + idFornecedor +
                ", idEnderecoFornecedor=" + idEnderecoFornecedor +
                ", nomeFornecedor='" + nomeFornecedor + '\'' +
                ", telefoneFornecedor=" + telefoneFornecedor +
                '}';
    }
}
