package model;

public class Paciente extends Pessoa {

    private int codPaciente;
    private String senha;
    private int idHospital;
    private int idPaciente;

    public Paciente(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    Paciente(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public int getIdHospital() {
        return idHospital;
    }

    public void setIdHospital(int idHospital) {
        this.idHospital = idHospital;
    }

    public int getCodPaciente() {
        return codPaciente;
    }

    public void setCodPaciente(int codPaciente) {
        this.codPaciente = codPaciente;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Paciente(int codPaciente, String nome, String rg,  String cpf, int idade, String senha) {
        this.setNome(nome);
        this.setRg(rg);
        this.setCpf(cpf);
        this.setIdade(idade);   
        this.setSenha(senha);
    }
}
