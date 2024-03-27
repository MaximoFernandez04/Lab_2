package practico1_UML.clases;

import practico1_UML.clases.Avion;

public class Vuelo {
    private int num_vuelo;
    private Avion avion;

    public Vuelo(int num_vuelo, Avion avion) {
        this.num_vuelo = num_vuelo;
        this.avion = avion;
    }

    public int getNum_vuelo() {
        return num_vuelo;
    }

    public void setNum_vuelo(int num_vuelo) {
        this.num_vuelo = num_vuelo;
    }

    public Avion getAvion() {
        return avion;
    }

    public void setAvion(Avion avion) {
        this.avion = avion;
    }
}
