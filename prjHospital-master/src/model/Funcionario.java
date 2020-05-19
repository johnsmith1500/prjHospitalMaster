package model;

public class Funcionario extends Pessoa {

    private int Matricula;
    private String Senha;
    private double valorHora;
    private int idFuncionario;
    private int idHospital;

    public int getIdHospital() {
        return idHospital;
    }

    public void setIdHospital(int idHospital) {
        this.idHospital = idHospital;
    }

    public int getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public Funcionario(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public int getMatricula() {
        return Matricula;
    }

    public void setMatricula(int Matricula) {
        this.Matricula = Matricula;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String Senha) {
        this.Senha = Senha;
    }

    public void setFuncionario(String nome, String rg, String cpf, int idade, int matricula, String senha) {
        this.Matricula = matricula;
        this.Senha = senha;
        this.setNome(nome);
        this.setCpf(cpf);
        this.setIdade(idade);
        this.setRg(rg);
    }

    public double CalcSalario() {
        return valorHora * 30;
    }

    public double CalcSalario(double descontos) {
        return (valorHora * 30) - descontos;
    }

    public double gerarBonus() {
        return CalcSalario() * 0.1;
    }
}
