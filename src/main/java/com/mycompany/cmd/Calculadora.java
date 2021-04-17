/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cmd;

import javax.swing.JOptionPane;

/**
 *
 * @author Dynamo
 */
public class Calculadora {
    
    float operacion (int operacion, float n1, float n2){
    float resultado = 0f;
    switch (operacion){
       case 1:
            resultado = n1+n2;
            break;
       case 2:
            resultado = n1-n2;
            break;
       case 3:
            resultado = n1*n2;
            break;
       case 4:
            resultado = n1/n2;
            break;
    }
        return resultado;

   }

     float operador(int a){
     boolean datoOk = false;
     String dato;
     float operador =0f;
do{

    try{
        dato = JOptionPane.showInputDialog("Valor " + a);
        operador = Float.parseFloat(dato);
    }catch(NumberFormatException ex){
        JOptionPane.showMessageDialog(null,"Por favor entre un número válido");

    }
   
  } while (datoOk);
    
    return operador;

  }
    
}
