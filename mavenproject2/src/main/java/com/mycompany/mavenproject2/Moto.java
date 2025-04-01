/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;

/**
 *
 * @author Admin
 */
public class Moto extends Veiculo{
    
    int cilindrada;
    public Moto(String modelo, String placa, int ano, int cilindrada) {
        super(modelo, placa, ano);
        this.cilindrada = cilindrada;
    }
    @Override
    public void exibirInfo(){
      System.out.println("modelo: "+modelo);
           System.out.println();
System.out.println("placa: "+placa);
     System.out.println();
System.out.println("ano: "+ano);
     System.out.println();
System.out.println("cilindradas : "+cilindrada);
    }
}
