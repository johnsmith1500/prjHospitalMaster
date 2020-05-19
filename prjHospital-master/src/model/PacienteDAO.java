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
public class PacienteDAO {
  private Connection con = new ConnectionFactory().getConnection();
    
    public void cadastrar(Paciente paciente){
        try{
            String query = "insert into paciente (nome, cpf, rg, idade, senha, id_hospital) values (?,?,?,?,?,?)";
            
            PreparedStatement preparedStmt = con.prepareStatement(query);
            preparedStmt.setString(1, paciente.getNome());
            preparedStmt.setString(2, paciente.getCpf());
            preparedStmt.setString(3, paciente.getRg());
            preparedStmt.setInt(4, paciente.getIdade());
            preparedStmt.setString(5, paciente.getSenha());
            preparedStmt.setInt(6, paciente.getIdHospital());
            
            
            preparedStmt.execute();
            
            con.close();
            
        }catch(Exception e){
            
        }
    }
    
    public ArrayList<Paciente> buscar(){
       ArrayList<Paciente> ap = new ArrayList();
    try{
        
        String query = "select * from paciente";
        PreparedStatement preparedStmt = con.prepareStatement(query);
        ResultSet rs = preparedStmt.executeQuery(query);
        
        while (rs.next()){
            Paciente p = new Paciente(rs.getString("nome"));
            p.setIdHospital(rs.getInt("id"));
            
            ap.add(p);
            
        }
        con.close();
    
    }catch(Exception e){
        
    }
    return ap;
    }
    public void atualizar(Paciente paciente){
        try{
            String query = "update paciente set nome = ?, cpf = ?, rg = ?, idade = ?, senha = ?, id_hospital = ? where id = ?";
        
            PreparedStatement preparedStmt = con.prepareStatement(query);
            preparedStmt.setString(1, paciente.getNome());
            preparedStmt.setString(2, paciente.getCpf());
            preparedStmt.setString(3, paciente.getRg());
            preparedStmt.setInt(4, paciente.getIdade());
            preparedStmt.setString(5, paciente.getSenha());
            preparedStmt.setInt(6, paciente.getIdHospital());
            
            preparedStmt.execute();
            
            con.close();
        }catch(Exception e){
    
        }
    }
        
        public void deletar(int id){
            try{
                String query = "delete from paciente where id = ?";
                
                PreparedStatement preparedStmt = con.prepareStatement(query);
                preparedStmt.setInt(1, id);
                
                preparedStmt.execute();
                
                con.close();
                
            }catch(Exception e){
                
            }
        }
}
  