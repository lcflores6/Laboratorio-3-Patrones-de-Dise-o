package Factory2;

public class PagoTarjetaCredito implements Pagos{
    
    private static double saldoTarjetaCredito = 0;
    @Override
    public void procesarPago(double monto) {
        saldoTarjetaCredito = saldoTarjetaCredito + monto;
        System.out.println("Se paga con tarjeta de credito a 6 meses plazo la cantidad de $ "+monto);
    }
 
    public static double getSaldoTarjetaCredito() {
        return saldoTarjetaCredito;
    }    
}

