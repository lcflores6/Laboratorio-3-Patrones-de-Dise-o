package DecoradorEnvio;

public class FacturaBase implements Factura{

    @Override
    public String getDescripcion() {
        return "Factura base";
    }

    @Override
    public double getTotal() {
        return 52.6;
    }
}
