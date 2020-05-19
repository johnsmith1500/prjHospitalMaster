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
public class EnfermeiroDAO {
  private Connection con = new ConnectionFactory().getConnection();
    
    public void cadastrar(Enfermeiro enfermeiro){
        try{
            String query = "insert into enfermeiros (id_funcionario, coren) values (?,?)";
            
            PreparedStatement preparedStmt = con.prepareStatement(query);
            preparedStmt.setInt(1, enfermeiro.getIdFuncionario());
            preparedStmt.setString(2, enfermeiro.getCOREM());

            
            
            preparedStmt.execute();
            
            con.close();
            
        }catch(Exception e){
            
        }
    }
    
    public ArrayList<Enfermeiro> buscar(){
       ArrayList<Enfermeiro> ae = new ArrayList();
    try{
        
        String query = "select * from enfermeiros";
        PreparedStatement preparedStmt = con.prepareStatement(query);
        ResultSet rs = preparedStmt.executeQuery(query);
        
        while (rs.next()){
            Enfermeiro e = new Enfermeiro(rs.getString("nome"));
            e.setIdEnfermeiro(rs.getInt("id"));
            
            ae.add(e);
            
        }
        con.close();
    
    }catch(Exception e){
        
    }
    return ae;
    }
}