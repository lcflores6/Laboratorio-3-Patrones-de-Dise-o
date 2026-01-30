package SingletonTaximetro;

public class RecargoRetraso {
    public double calculoRetraso(int minutos){
        return minutos * 0.25;
    }
    
    public void aplicarRecargo(int minutos){
        double monto = calculoRetraso(minutos);
        Taximetro taximetro = Taximetro.getInstancia();
        taximetro.agregarMonto(monto);
    }
}
