package composite;
import java.util.ArrayList;
import java.util.List;

public class Carpeta implements ComponenteArchivo{

    private String nombre;
    private List<ComponenteArchivo> archivos = new ArrayList<>();

    public Carpeta(String nombre) {
        this.nombre = nombre;
    }

    public void agregar(ComponenteArchivo archivo){
        archivos.add(archivo);
    }
    
    @Override
    public void mostrar() {
        System.out.println("Carpeta "+ nombre);
        for (ComponenteArchivo e: archivos) {
            e.mostrar();
        }
    }

    @Override
    public int getTamanio() {
        int total = 0;
        for (ComponenteArchivo e: archivos) {
            total = total + e.getTamanio();
        }
        return total;
    }   
}
