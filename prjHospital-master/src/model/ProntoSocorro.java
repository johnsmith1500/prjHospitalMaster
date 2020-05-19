package model;

public class ProntoSocorro {

    Hospital matriz;
    int idFilial;
    String endereco;
    private int idHospital;
    private int idProntoSocorro;

    ProntoSocorro(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getIdHospital() {
        return idHospital;
    }

    public void setIdHospital(int idHospital) {
        this.idHospital = idHospital;
    }

    public int getIdProntoSocorro() {
        return idProntoSocorro;
    }

    public void setIdProntoSocorro(int idProntoSocorro) {
        this.idProntoSocorro = idProntoSocorro;
    }

    public Hospital getMatriz() {
        return matriz;
    }

    public void setMatriz(Hospital matriz) {
        this.matriz = matriz;
    }

    public int getIdFilial() {
        return idFilial;
    }

    public void setIdFilial(int idFilial) {
        this.idFilial = idFilial;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public ProntoSocorro(Hospital matriz, int idFilial, String endereco) {
        this.matriz = matriz;
        this.idFilial = idFilial;
        this.endereco = endereco;
    }
}
