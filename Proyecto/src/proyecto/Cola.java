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
public class Cola {
    private NodoC inicio;
    private NodoC fin;
    
    public Cola(){
        this.inicio=null;
        this.fin=null;
    }
    public boolean esVacia(){
        if(inicio==null){
            return true;
        }else{return false;}
    }
    public void encolar(){
        Dato d= new Dato();
        d.setCodeProducto(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el codigo del producto: ")));
        d.setDescripPro(JOptionPane.showInputDialog(null,"Digite la descripcion del producto: "));
        d.setCantExistente(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite la cantidad existente: ")));
        d.setPrecio(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite el precio")));
        NodoC nuevo = new NodoC();
        nuevo.setElemento(d);
        if(esVacia()){
            inicio= nuevo;
            fin=nuevo;
        }else{
            fin.setSiguiente(nuevo);
            fin=nuevo;
        }
    }
   /*
    public void eliminarCola(){
        if(!esVacia()){
            inicio=inicio.getSiguiente();
            JOptionPane.showMessageDialog(null,"El elemento fue extraido");
        }else{
            JOptionPane.showMessageDialog(null,"No se puede extrar, cola vacia");
        }
    }
*/
    public void eliminarEspecifico(){
        if(!esVacia()){
            String descripcion=JOptionPane.showInputDialog(null,"Digite la descripcion del producto: ");
            if(inicio.getElemento().getDescripPro().equals(descripcion)){
                inicio=inicio.getSiguiente();
            }else{
                NodoC anterior;
                NodoC auxiliar;
                anterior=inicio;
                auxiliar=inicio.getSiguiente();
                while((auxiliar!=null)&&(!auxiliar.getElemento().getDescripPro().equals(descripcion))){
                    
                }
                if(auxiliar!=null){
                    anterior.setSiguiente(auxiliar.getSiguiente());
                }
            }
        }
    }
    public void mostrarCola(){
        if(!esVacia()){
            String s= "";
            NodoC aux=inicio;
            while(aux!=null){
                s=s+ aux.getElemento().getCodeProducto()+"--"+ aux.getElemento().getDescripPro()+"--"+ aux.getElemento().getCantExistente()+"--"+ aux.getElemento().getPrecio()+"--";
                aux=aux.getSiguiente();
            }
            JOptionPane.showMessageDialog(null, "La cola contiene:\n"+s);
        }else{
            JOptionPane.showMessageDialog(null, "La cola no contiene elementos para mostrar");
        }
    }
}
