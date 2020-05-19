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
public class FuncionarioDAO {
private Connection con = new ConnectionFactory().getConnection();
    
    public void cadastrar(Funcionario funcionario){
        try{
            String query = "insert into funcionarios (nome, cpf, rg, idade, senha, id_hospital, valor_hora) values (?,?,?,?,?,?,?)";
            
            PreparedStatement preparedStmt = con.prepareStatement(query);
            preparedStmt.setString(1, funcionario.getNome());
            preparedStmt.setString(2, funcionario.getCpf());
            preparedStmt.setString(3, funcionario.getRg());
            preparedStmt.setInt(4, funcionario.getIdade());
            preparedStmt.setString(5, funcionario.getSenha());
            preparedStmt.setInt(6, funcionario.getIdHospital());
            preparedStmt.setDouble(7, funcionario.getValorHora());
            
            preparedStmt.execute();
            
            con.close();
            
        }catch(Exception e){
            
        }
    }
    
    public ArrayList<Funcionario> buscar(){
       ArrayList<Funcionario> af = new ArrayList();
    try{
        
        String query = "select * from tb_funcionario";
        PreparedStatement preparedStmt = con.prepareStatement(query);
        ResultSet rs = preparedStmt.executeQuery(query);
        
        while (rs.next()){
            Funcionario f = new Funcionario(rs.getString("nome"));
            f.setIdFuncionario(rs.getInt("id"));
            
            af.add(f);
            
        }
        con.close();
    
    }catch(Exception e){
        
    }
    return af;
    }

       public void atualizar(Funcionario funcionario){
        try{
            String query = "update funcionarios set nome = ?, cpf = ?, rg = ?, idade = ?, senha = ?, id_hospital = ?, valor_hora = ? where id = ?";
        
            PreparedStatement preparedStmt = con.prepareStatement(query);
            preparedStmt.setString(1, funcionario.getNome());
            preparedStmt.setString(2, funcionario.getCpf());
            preparedStmt.setString(3, funcionario.getRg());
            preparedStmt.setInt(4, funcionario.getIdade());
            preparedStmt.setString(5, funcionario.getSenha());
            preparedStmt.setInt(6, funcionario.getIdHospital());
            preparedStmt.setDouble(7, funcionario.getValorHora());
            
            preparedStmt.execute();
            
            con.close();
        }catch(Exception e){
    
        }
    }
        
        public void deletar(int id){
            try{
                String query = "delete from funcionarios where id = ?";
                
                PreparedStatement preparedStmt = con.prepareStatement(query);
                preparedStmt.setInt(1, id);
                
                preparedStmt.execute();
                
                con.close();
                
            }catch(Exception e){
                
            }
        }
}
  

