/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.util.ArrayList;
import model.Enfermeiro;
import model.EnfermeiroDAO;

/**
 *
 * @author João Victor
 */
public class ControllerEnfermeiro {
    public void CadastrarEnfermeiro (Enfermeiro enfermeiro){
        EnfermeiroDAO eDAO = new EnfermeiroDAO();
        eDAO.cadastrar(enfermeiro);
    }
    public ArrayList<Enfermeiro> listarEnfermeiro(){
        EnfermeiroDAO eDAO = new EnfermeiroDAO();
        return eDAO.buscar();
    }
}
