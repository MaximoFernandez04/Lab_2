package practico1_UML.clases;

public class Avion {
    private int capacidad;
    private String modelo;
    private int anio;


    public Avion(int capacidad, String modelo, int anio) {
        this.capacidad = capacidad;
        this.modelo = modelo;
        this.anio = anio;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
}
