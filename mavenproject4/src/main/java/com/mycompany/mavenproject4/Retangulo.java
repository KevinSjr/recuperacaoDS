/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject4;

/**
 *
 * @author Admin
 */
public class Retangulo extends Forma{
    double largura;
    double altura;
    
    public Retangulo(String nome,double largura,double altura) {
        super(nome);
        this.altura = altura;
        this.largura = largura;
             
    }
    public void CalcularArea(){
    System.out.println("area = "+largura*altura);
    }
}
