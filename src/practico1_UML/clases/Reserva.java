package practico1_UML.clases;

public class Reserva {
    private String origen;
    private String destino;
    private int numeroAsiento;
    private int precio;
    private Vuelo vuelo;

    public Reserva(String origen, String destino, int numeroAsiento, int precio, Vuelo vuelo) {
        this.origen = origen;
        this.destino = destino;
        this.numeroAsiento = numeroAsiento;
        this.precio = precio;
        this.vuelo = vuelo;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getNumeroAsiento() {
        return numeroAsiento;
    }

    public void setNumeroAsiento(int numeroAsiento) {
        this.numeroAsiento = numeroAsiento;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }



    public void imprimirReserva() {
        System.out.println("El origen de la reserva es " + getOrigen());
        System.out.println("El destino de la reserva es " + getDestino());
        System.out.println("  precio : " + getPrecio());
        System.out.println("  numero de asiento  es " + getNumeroAsiento());
        System.out.println("  numero de vuelo  es " + vuelo.getNum_vuelo());

    }
}

