/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.Date;

/**
 *
 * @author jonat
 */
public class ContatoFormulario {
    private int id;
    private String nome;
    private String idade;
    private String areaInteresse;
    private String descricao;
    private String status;
    private Date data;
    

        public int getId(){
            return id;
        }
        
        public Date getData(){
            return data;
        }
    
        public String getNome(){
            return nome;
        }

        public String getIdade(){
            return idade;
        }

        public String getAreaInteresse(){
            return areaInteresse;
        }

        public String getDescricao(){
            return descricao;
        }

        public String getStatus(){
            return status;
        }
        
        public void setId(int id){
        this.id = id;
        }

        public void setNome(String nome){
            this.nome = nome;
        }

        public void setIdade(String idade){
            this.idade = idade;
        }

        public void setAreaInteresse(String areaInteresse){
            this.areaInteresse = areaInteresse;
        }

        public void setDescricao(String descricao){
            this.descricao = descricao;
        }
        
        public void setStatus(String status){
        this.status = status;
        }
        
        public void setData(Date data){
        this.data = data;
        }
        
    
}
