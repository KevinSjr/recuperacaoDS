/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;

/**
 *
 * @author Admin
 */
public class Veiculo {
String modelo;
String placa;
int ano;

public Veiculo(String modelo, String placa, int ano){
this.ano = ano;
this.modelo = modelo;
this.placa = placa;
}
public void exibirInfo(){
System.out.println("modelo: "+modelo);
     System.out.println();
System.out.println("placa: "+placa);
     System.out.println();
System.out.println("ano: "+ano);
}
}
