/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author Admin
 */
public class ProdutocomDesconto extends Produto{
    double desconto;

    public ProdutocomDesconto(String nome, double preco,double desconto) {
        super(nome, preco);
        this.desconto = desconto;
    }
    void exibirDetalhesComDesconto(){
        double desconto1 = 100 - desconto;
        
    System.out.println("preco com desconto : "+preco/100*desconto1);
            }
}
