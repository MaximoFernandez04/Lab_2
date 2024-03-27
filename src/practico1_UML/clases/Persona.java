package practico1_UML.clases;

public abstract class Persona {
    private String fechaNacimiento;
    private String nombre;

    public Persona(String fechaNacimiento, String nombre){
        this.fechaNacimiento=fechaNacimiento;
        this.nombre=nombre;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
