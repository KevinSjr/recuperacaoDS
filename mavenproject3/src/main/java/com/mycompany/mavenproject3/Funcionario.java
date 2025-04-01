/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject3;

/**
 *
 * @author Admin
 */
public class Funcionario {
    String nome;
    int idade;
    double salario;
    
    public Funcionario(String nome, int idade, double salario){
    this.idade = idade;
    this.nome = nome;
    this.salario = salario;
    }
    public void exbirInfo(){
   System.out.println("Nome: "+nome);
        System.out.println();
   System.out.println("Idade: "+idade);
        System.out.println();
   System.out.println("salario: "+salario);
   }
}
