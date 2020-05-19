/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.util.ArrayList;
import model.Funcionario;
import model.FuncionarioDAO;
import model.Hospital;
import model.HospitalDAO;


/**
 *
 * @author João Victor
 */
public class ControllerFuncionario {
    public void CadastrarFuncionario (Funcionario funcionario){
        FuncionarioDAO fDAO = new FuncionarioDAO();
        fDAO.cadastrar(funcionario);
    }
    public ArrayList<Funcionario> listarFuncionario(){
        FuncionarioDAO fDAO = new FuncionarioDAO();
        return fDAO.buscar();
    }
    public void atualizar(Funcionario funcionario){
        FuncionarioDAO fDAO = new FuncionarioDAO();
        fDAO.atualizar(funcionario);
    }
    
    public void deletar(int idFuncionario){
        FuncionarioDAO fDAO = new FuncionarioDAO();
        fDAO.deletar(idFuncionario);
    }
}