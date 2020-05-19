/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.util.ArrayList;
import model.ProntoSocorro;
import model.ProntoSocorroDAO;

/**
 *
 * @author João Victor
 */
public class ControllerProntoSocorro {
    public void CadastrarProntoSocorro (ProntoSocorro prontoSocorro){
        ProntoSocorroDAO psDAO = new ProntoSocorroDAO();
        psDAO.cadastrar(prontoSocorro);
    }
    public ArrayList<ProntoSocorro> listarProntoSocorro(){
        ProntoSocorroDAO psDAO = new ProntoSocorroDAO();
        return psDAO.buscar();
    }
}
