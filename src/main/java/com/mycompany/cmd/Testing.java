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
public class Testing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Calculadora BasiCal = new Calculadora();
       String [] tipoOperacion ={"+","-","*","/"};
       int operacion = 0;
       String dato;
       String menu;
       float num1=0f, num2=0f;
       boolean salir = false;
       menu = "Elige la operación deseada \n1.- SUMA\n2.- RESTA \n3.- MULTIPLICACION\n4.-DIVISION\n5.- SALIR";
            while (!salir){
                salir = false;
            do {
                try{
                    dato = JOptionPane.showInputDialog(menu);
                    operacion = Integer.parseInt(dato);
                }catch(NumberFormatException ex){
                    JOptionPane.showMessageDialog(null,"Proporciona un opcion entre 1 y 5.");
                }
            } while (operacion == 0);
            
            if (operacion<=4){
                num1 = BasiCal.operador(1);
                num2 = BasiCal.operador(2);
                JOptionPane.showMessageDialog(null, num1 + " " + tipoOperacion[operacion - 1] + " " + num2 + " = " +
                + BasiCal.operacion(operacion, num1, num2),"Calculadora Basica",JOptionPane.PLAIN_MESSAGE);
            }
            else if(operacion>=6){
                 JOptionPane.showMessageDialog(null,"Opción Invalida porfavor Asigne una correcta.. Gracias!");
            }else{
                 JOptionPane.showMessageDialog(null, "Calculadora Basica UEES", "Calculadora Basica", JOptionPane.PLAIN_MESSAGE);
                 salir = true;
         }
      }
   }
        
}
    

