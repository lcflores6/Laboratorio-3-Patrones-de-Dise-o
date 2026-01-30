package MenuRestaurante;
import java.util.ArrayList;
import java.util.List;

public class Combo implements ComponenteAlimento{
    
    private String nombre;
    private List<ComponenteAlimento> alimentos = new ArrayList<>();

    public Combo(String nombre) {
        this.nombre = nombre;
    }
    
    public void agregar(ComponenteAlimento alimento){
        alimentos.add(alimento);
        System.out.println(alimento.getNombre() +" agregado. Precio: $"+ alimento.getPrecio());
    }

    @Override
    public void mostrar() {
        System.out.println(nombre);
        for (ComponenteAlimento alimento: alimentos) {
            alimento.mostrar();
        }
    }

    @Override
    public double getPrecio() {
        double total = 0;
        for (ComponenteAlimento alimento: alimentos) {
            total = total + alimento.getPrecio();
        }
        return total;
    }

    @Override
    public String getNombre() {
        return nombre;
    }
}
