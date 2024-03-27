package practico1_UML.clases;

public class Piloto  extends  Persona implements  Volador{

    private  int matricula;

    public Piloto(String fechaNacimiento, String nombre, int matricula) {
        super(fechaNacimiento, nombre);
        this.matricula = matricula;
    }


    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }


    @Override
    public void volar() {
        System.out.println("El piloto "+ getNombre() + " esta pilotando ");
    }
}

