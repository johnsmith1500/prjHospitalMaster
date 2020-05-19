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
public class ProntoSocorroDAO {
 private Connection con = new ConnectionFactory().getConnection();
    
    public void cadastrar(ProntoSocorro prontoSocorro){
        try{
            String query = "insert into prontoSocorro (id_hospital, endereco) values (?,?)";
            
            PreparedStatement preparedStmt = con.prepareStatement(query);
            preparedStmt.setInt(1, prontoSocorro.getIdHospital());
            preparedStmt.setString(2, prontoSocorro.getEndereco());

            
            
            preparedStmt.execute();
            
            con.close();
            
        }catch(Exception e){
            
        }
    }
    
    public ArrayList<ProntoSocorro> buscar(){
       ArrayList<ProntoSocorro> aps = new ArrayList();
    try{
        
        String query = "select * from prontoSocorro";
        PreparedStatement preparedStmt = con.prepareStatement(query);
        ResultSet rs = preparedStmt.executeQuery(query);
        
        while (rs.next()){
            ProntoSocorro ps = new ProntoSocorro(rs.getString("nome"));
            ps.setIdProntoSocorro(rs.getInt("id"));
            
            aps.add(ps);
            
        }
        con.close();
    
    }catch(Exception e){
        
    }
    return aps;
    }
}
