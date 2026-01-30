package DecoradorEnvio;

public abstract class FacturaDecorador implements Factura{
    
    protected Factura factura;

    public FacturaDecorador(Factura factura) {
        this.factura = factura;
    }

    @Override
    public String getDescripcion() {
        return factura.getDescripcion();
    }

    @Override
    public double getTotal() {
        return factura.getTotal();
    }
}
