/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import javax.swing.JOptionPane;

/**
 *
 * @author Sebas C
 */
public class Menu {
    private byte opcion;
    public void mostrarMenu(){
    
    Cola c=new Cola();
    while(opcion!=4){
        opcion=Byte.parseByte(JOptionPane.showInputDialog(null,"***MENÚ PRINCIPAL***\n\n"
        + "1.Encolar elemento\n2.Desencolar elemento\n3.Mostrar elementos\n4.Salir del sistema\n\n"
        + "Digite su opción:"));
        
        switch(opcion){ 
        case 1:{
            c.encolar();
            break;
        }
        case 2:{
            c.eliminarEspecifico();
            break;
        }
        case 3:{
            c.mostrarCola();
            break;
        }
        case 4:{
            System.exit(0);
            break;
        }
        default:{
            JOptionPane.showMessageDialog(null,"Opción incorrecta!");

                }       
            }
        }   
    }
}

