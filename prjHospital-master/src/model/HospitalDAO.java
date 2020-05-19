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
 * @author Aluno02
 */
public class HospitalDAO {
    private Connection con = new ConnectionFactory().getConnection();
    
    public void cadastrar(Hospital hospital){
        try{
            String query = "insert into tb_hospital (nome, endereco) values (?,?)";
            
            PreparedStatement preparedStmt = con.prepareStatement(query);
            preparedStmt.setString(1, hospital.getNome());
            preparedStmt.setString(2, hospital.getEndereco());
            
            preparedStmt.execute();
            
            con.close();
            
        }catch(Exception e){
            
        }
    }
    
    public ArrayList<Hospital> buscar(){
       ArrayList<Hospital> ah = new ArrayList();
    try{
        
        String query = "select * from tb_hospital";
        PreparedStatement preparedStmt = con.prepareStatement(query);
        ResultSet rs = preparedStmt.executeQuery(query);
        
        while (rs.next()){
            Hospital h = new Hospital(rs.getString("nome"));
            h.setIdHospital(rs.getInt("id"));
            
            ah.add(h);
            
        }
        con.close();
    
    }catch(Exception e){
        
    }
    return ah;
    }
    
    public void atualizar(Hospital hospital){
        try{
            String query = "update tb_hospital set nome = ?, endereco = ? where id = ?";
        
            PreparedStatement preparedStmt = con.prepareStatement(query);
            preparedStmt.setString(1, hospital.getNome());
            preparedStmt.setString(2, hospital.getEndereco());
            preparedStmt.setInt(3, hospital.getIdHospital());
            
            preparedStmt.execute();
            
            con.close();
        }catch(Exception e){
    
        }
    }
        
        public void deletar(int id){
            try{
                String query = "delete from tb_hospital where id = ?";
                
                PreparedStatement preparedStmt = con.prepareStatement(query);
                preparedStmt.setInt(1, id);
                
                preparedStmt.execute();
                
                con.close();
                
            }catch(Exception e){
                
            }
        }
    }

