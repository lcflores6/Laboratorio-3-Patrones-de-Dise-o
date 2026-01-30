package DecoradorEnvio;

public class Descuento extends FacturaDecorador{
    
    public Descuento(Factura factura) {
        super(factura);
    }
    
    @Override
    public String getDescripcion() {
        return factura.getDescripcion() + " - descuento (Adulto Mayor)";
    }

    @Override
    public double getTotal() {
        return factura.getTotal() - 10;
    }
}
