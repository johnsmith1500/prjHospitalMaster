/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.util.ArrayList;
import model.Hospital;
import model.HospitalDAO;

/**
 *
 * @author João Victor
 */
public class ControllerHospital {
    public void CadastrarHospital (Hospital hospital){
        HospitalDAO hDAO = new HospitalDAO();
        hDAO.cadastrar(hospital);
    }
    public ArrayList<Hospital> listarHospital(){
        HospitalDAO hDAO = new HospitalDAO();
        return hDAO.buscar();
    }
    public void atualizar(Hospital hospital){
        HospitalDAO hDAO = new HospitalDAO();
        hDAO.atualizar(hospital);
    }
    
    public void deletar(int idHospital){
        HospitalDAO hDAO = new HospitalDAO();
        hDAO.deletar(idHospital);
    }
}
