package com.sistema;

import java.util.ArrayList;
import java.util.List;

public class Funcionario {

    private long idFuncionario;
    private long idEnderecoFuncionario;
    private String nomeFuncionario;
    private long numIdentidadeFuncionario;
    private long telefoneFuncionario;
    private  Double salarioFuncionario;
    private List<Venda> vendasFuncionario = new ArrayList<Venda>();
    //private Instant dataAdmissao;


    public Funcionario() {
    }
    public Funcionario(long idFuncionario, long idEnderecoFuncionario, String nomeFuncionario, long numIdentidadeFuncionario, long telefoneFuncionario, List<Venda> vendasFuncionario, Double salarioFuncionario) {
        this.idFuncionario = idFuncionario;
        this.idEnderecoFuncionario = idEnderecoFuncionario;
        this.nomeFuncionario = nomeFuncionario;
        this.numIdentidadeFuncionario = numIdentidadeFuncionario;
        this.telefoneFuncionario = telefoneFuncionario;
        this.vendasFuncionario = vendasFuncionario;
        this.salarioFuncionario = salarioFuncionario;
    }
    public Funcionario(long idFuncionario, long idEnderecoFuncionario, String nomeFuncionario, long numIdentidadeFuncionario, long telefoneFuncionario, Double salarioFuncionario) {
        this.idFuncionario = idFuncionario;
        this.idEnderecoFuncionario = idEnderecoFuncionario;
        this.nomeFuncionario = nomeFuncionario;
        this.numIdentidadeFuncionario = numIdentidadeFuncionario;
        this.telefoneFuncionario = telefoneFuncionario;
        this.salarioFuncionario = salarioFuncionario;
    }

    public long getIdFuncionario() {
        return idFuncionario;
    }
    public void setIdFuncionario(long idFuncionario) {
        this.idFuncionario = idFuncionario;
    }
    public long getIdEnderecoFuncionario() {
        return idEnderecoFuncionario;
    }
    public void setIdEnderecoFuncionario(long idEnderecoFuncionario) {
        this.idEnderecoFuncionario = idEnderecoFuncionario;
    }
    public String getNomeFuncionario() {
        return nomeFuncionario;
    }
    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }
    public long getNumIdentidadeFuncionario() {
        return numIdentidadeFuncionario;
    }
    public void setNumIdentidadeFuncionario(long numIdentidadeFuncionario) {
        this.numIdentidadeFuncionario = numIdentidadeFuncionario;
    }
    public long getTelefoneFuncionario() {
        return telefoneFuncionario;
    }
    public void setTelefoneFuncionario(long telefoneFuncionario) {
        this.telefoneFuncionario = telefoneFuncionario;
    }
    public Double getSalarioFuncionario() {
        return salarioFuncionario;
    }
    public void setSalarioFuncionario(Double salarioFuncionario) {
        this.salarioFuncionario = salarioFuncionario;
    }
    public List<Venda> getVendasFuncionario() {
        return vendasFuncionario;
    }
    public void setVendasFuncionario(List<Venda> vendasFuncionario) {
        this.vendasFuncionario = vendasFuncionario;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "idFuncionario=" + idFuncionario +
                ", idEnderecoFuncionario=" + idEnderecoFuncionario +
                ", nomeFuncionario='" + nomeFuncionario + '\'' +
                ", numIdentidadeFuncionario=" + numIdentidadeFuncionario +
                ", telefoneFuncionario=" + telefoneFuncionario +
                ", salarioFuncionario=" + salarioFuncionario +
                ", vendasFuncionario=" + vendasFuncionario +
                '}';
    }
}
