
package proyecto;


public class Dato {
    private int codeProducto=0;
    private String descripPro="";
    private int cantExistente=0;
    private double precio=0.00;
    
    public Dato(){
        this.codeProducto=0;
        this.descripPro="";
        this.cantExistente=0;
        this.precio=0.00;
    }

    public int getCodeProducto() {
        return codeProducto;
    }

    public void setCodeProducto(int codeProducto) {
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

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
}
