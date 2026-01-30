package DecoradorEnvio;

public class ServicioBomberos extends FacturaDecorador{
    
    public ServicioBomberos(Factura factura) {
        super(factura);
    }
    
    @Override
    public String getDescripcion() {
        return factura.getDescripcion() + " + aporte a los bomberos";
    }

    @Override
    public double getTotal() {
        return factura.getTotal() + 3.5;
    }
}
