package practico1_UML;

import practico1_UML.clases.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Piloto piloto1= new Piloto("24/08/1995","Juan Nuñez", 32143421);
        Avion avion1= new Avion(2013,"Boing 737",203);
        Flota flotaMendoza= new Flota("Mendoza");
        flotaMendoza.addAviones(avion1);
        Vuelo mdzBsAS= new Vuelo(250,avion1);
        mdzBsAS.setAvion(avion1);
        Reserva reservaMdzBsAS= new Reserva("Mendoza","Buenos Aires", 28, 250000, mdzBsAS);
        reservaMdzBsAS.imprimirReserva();
        piloto1.volar();
    }
}