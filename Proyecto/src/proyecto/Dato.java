
package proyecto;


public class Dato {
    private String codeProducto="";
    private String descripPro="";
    private int cantExistente=0;
    private int precio=0;
    
    public Dato(){
        this.codeProducto="";
        this.descripPro="";
        this.cantExistente=0;
        this.precio=0;
        
        
        

    }

    public String getCodeProducto() {
        return codeProducto;
    }

    public void setCodeProducto(String codeProducto) {
        this.codeProducto = codeProducto;
    }

  

    public String getDescripPro() {
        return descripPro;
    }

    public void setDescripPro(String descripPro) {
        this.descripPro = descripPro;
    }

    public int getCantExistente() {
        return cantExistente;
    }

    public void setCantExistente(int cantExistente) {
        this.cantExistente = cantExistente;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    
}
