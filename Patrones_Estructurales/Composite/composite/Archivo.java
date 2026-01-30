package composite;

public class Archivo implements ComponenteArchivo{

    private String nombre;
    private int tamanio;

    public Archivo(String nombre, int tamaño) {
        this.nombre = nombre;
        this.tamanio = tamaño;
    }
    
    @Override
    public void mostrar() {
        System.out.println("Archivo: "+ nombre +" - Tamanio "+ tamanio +" Kb");
    }

    @Override
    public int getTamanio() {
        return tamanio;
    } 
}
