/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author Admin
 */
public class Produto {
    
    String nome;
    double preco;
    
    public Produto(String nome, double preco){
    
        this.nome = nome;
        this.preco = preco;
    }
    void exibirDetalhes(){
    System.out.println("Nome do produto : "+nome);
     System.out.println();
    System.out.println("preco do produto: "+preco);
    }
}
