package Factory2;

public class PagoTarjetaDebito implements Pagos{
    
    private static double saldoTarjetaDebito = 0;
    @Override
    public void procesarPago(double monto) {
        saldoTarjetaDebito = saldoTarjetaDebito + monto;
        System.out.println("Se paga con tarjeta de debito la cantidad de $ "+monto);
    }
 
    public static double getSaldoTarjetaDebito() {
        return saldoTarjetaDebito;
    }
}
