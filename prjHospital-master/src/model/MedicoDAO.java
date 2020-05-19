/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author João Victor
 */
public class MedicoDAO {
  private Connection con = new ConnectionFactory().getConnection();
    
    public void cadastrar(Medico medico){
        try{
            String query = "insert into Medicos (id_funcionario, crm, especialidade) values (?,?,?)";
            
            PreparedStatement preparedStmt = con.prepareStatement(query);
            preparedStmt.setInt(1, medico.getIdFuncionario());
            preparedStmt.setString(2, medico.getCRM());
            preparedStmt.setString(3, medico.getEspecialidade());
            
            preparedStmt.execute();
            
            con.close();
            
        }catch(Exception e){
            
        }
    }
    
    public ArrayList<Medico> buscar(){
       ArrayList<Medico> am = new ArrayList();
    try{
        
        String query = "select * from medicos";
        PreparedStatement preparedStmt = con.prepareStatement(query);
        ResultSet rs = preparedStmt.executeQuery(query);
        
        while (rs.next()){
            Medico m = new Medico(rs.getString("nome"));
            m.setIdMedico(rs.getInt("id"));
            
            am.add(m);
            
        }
        con.close();
    
    }catch(Exception e){
        
    }
    return am;
    }
}
  
