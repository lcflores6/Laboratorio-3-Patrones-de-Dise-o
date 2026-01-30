package MenuRestaurante;

public class Producto implements ComponenteAlimento{

    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    
    @Override
    public void mostrar() {
        System.out.println("- "+ nombre +" $ "+ precio);
    }

    @Override
    public double getPrecio() {
        return precio;
    }

    @Override
    public String getNombre() {
        return nombre;
    }
}
