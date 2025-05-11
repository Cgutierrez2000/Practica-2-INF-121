package Herencia.Ejercicio3;

public class Persona {
    protected int ci;
    protected String nombre;
    protected String apellido;
    protected int celular;
    protected int fecha_Nac; // año de nacimiento

    public Persona(int ci, String n, String ap, int cel, int fn) {
        this.ci = ci;
        this.nombre = n;
        this.apellido = ap;
        this.celular = cel;
        this.fecha_Nac = fn;
    }

    public Persona() {
        this.ci = 0;
        this.nombre = "Nombre";
        this.apellido = "Apellido";
        this.celular = 0;
        this.fecha_Nac = 2000;
    }

    public int getCi() {
        return ci;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getCelular() {
        return celular;
    }

    public int getFecha_Nac() {
        return fecha_Nac;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }

    public void setNombre(String n) {
        this.nombre = n;
    }

    public void setApellido(String ap) {
        this.apellido = ap;
    }

    public void setCelular(int cel) {
        this.celular = cel;
    }

    public void setFecha_Nac(int fn) {
        this.fecha_Nac = fn;
    }

    public int getEdad(int añoActual) {
        return añoActual - this.fecha_Nac;
    }
}
