/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject3;

/**
 *
 * @author Admin
 */
public class Desenvolvedor extends Funcionario{
    
    String linguagemProgramacao;
    
    public Desenvolvedor(String nome, int idade, double salario,String linguagemProgramacao) {
        super(nome, idade, salario);
        this.linguagemProgramacao = linguagemProgramacao;
     
    }
    @Override
       public void exbirInfo(){
   System.out.println("Nome: "+nome);
        System.out.println();
   System.out.println("Idade: "+idade);
        System.out.println();
   System.out.println("salario: "+salario);
        System.out.println();
   System.out.println("Departamento: "+linguagemProgramacao);
   }  
    
}
