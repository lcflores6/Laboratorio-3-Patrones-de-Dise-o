package decorador;

public class CafeSimple implements Bebida {

    @Override
    public String getDescripcion() {
        return "Cafe simple";
    }

    @Override
    public double getCosto() {
        return 1;
    }
    
}
