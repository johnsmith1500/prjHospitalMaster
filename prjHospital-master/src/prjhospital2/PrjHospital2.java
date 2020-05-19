/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prjhospital2;

import java.sql.Connection;
import javax.swing.JOptionPane;
import model.ConnectionFactory;
import view.CadHospital;
/**
 *
 * @author Aluno01
 */
public class PrjHospital2 {
   
    public static void main(String[] args){
        
        try{
            Connection con = new ConnectionFactory().getConnection();
            JOptionPane.showMessageDialog(null, "Conectado ao Banco!");
            con.close();
        }catch(Exception e){
            JOptionPane.showConfirmDialog(null, e);
        }
    }
}
