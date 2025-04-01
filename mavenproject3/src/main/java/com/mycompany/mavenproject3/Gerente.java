/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject3;

/**
 *
 * @author Admin
 */
public class Gerente extends Funcionario{
    String departamento;

    public Gerente(String nome, int idade, double salario,String departamento) {
        super(nome, idade, salario);
        this.departamento = departamento;
             
    }
    @Override
     public void exbirInfo(){
   System.out.println("Nome: "+nome);
        System.out.println();
   System.out.println("Idade: "+idade);
        System.out.println();
   System.out.println("salario: "+salario);
        System.out.println();
   System.out.println("Departamento: "+departamento);
   }  
    
}
