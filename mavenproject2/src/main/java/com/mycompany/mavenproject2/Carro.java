/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;

/**
 *
 * @author Admin
 */
public class Carro extends Veiculo{
    int numeroPortas;

    public Carro(String modelo, String placa, int ano, int numeroPortas) {
        super(modelo, placa, ano);
        this.numeroPortas = numeroPortas;
    }
    @Override
   public void exibirInfo(){
   System.out.println("modelo: "+modelo);
        System.out.println();
System.out.println("placa: "+placa);
     System.out.println();
System.out.println("ano: "+ano);
     System.out.println();
System.out.println("numero portas: "+numeroPortas);
   }
}
