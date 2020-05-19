package model;

public class Enfermeiro extends Funcionario{

    private String COREM;
    private int idFuncionario;
    private int idEnfermeiro;

    public int getIdEnfermeiro() {
        return idEnfermeiro;
    }

    public void setIdEnfermeiro(int idEnfermeiro) {
        this.idEnfermeiro = idEnfermeiro;
    }

    public int getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public Enfermeiro(String text) {
        super(text);
    }

    public String getCOREM() {
        return COREM;
    }

    public void setCOREM(String COREM) {
        this.COREM = COREM;
    }

    public void setFuncionario(String COREM, String nome, String rg, String cpf, int idade, int matricula, String senha) {
        this.setCOREM(COREM);
        this.setMatricula(matricula);
        this.setSenha(senha);
        this.setNome(nome);
        this.setCpf(cpf);
        this.setIdade(idade);
        this.setRg(rg);
    }

    @Override
    public double gerarBonus() {
        return CalcSalario() * 0.2;
    }
}
