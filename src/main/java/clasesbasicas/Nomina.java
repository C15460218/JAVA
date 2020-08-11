
package clasesbasicas;

public class Nomina {
    private int clave;
    private String nombre;
    private float sueldo;

    public Nomina(int clave, String nombre, float sueldo) {
        this.clave = clave;
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public Nomina() {
    }

    public int getClave() {
        return clave;
    }

    public String getNombre() {
        return nombre;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }
    
    public String toString(){
        return "La clave es: "+this.getClave()+" "+"con nombre"+this.getNombre()+
                " sueldo: "+this.getSueldo();
    }
    
}
