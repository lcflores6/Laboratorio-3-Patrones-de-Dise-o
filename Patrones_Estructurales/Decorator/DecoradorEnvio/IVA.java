package DecoradorEnvio;

public class IVA extends FacturaDecorador{
    
    public IVA(Factura factura) {
        super(factura);
    }
    
    @Override
    public String getDescripcion() {
        return factura.getDescripcion() + " + impuesto (IVA 15%)";
    }

    @Override
    public double getTotal() {
        return factura.getTotal() + (factura.getTotal() * 0.15);
    }
}
