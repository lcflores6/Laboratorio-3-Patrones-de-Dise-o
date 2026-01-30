package Factory2;

public class PagoTransferencia implements Pagos{
    
    private static double saldoTransferencia = 0;
    @Override
    public void procesarPago(double monto) {
        saldoTransferencia = saldoTransferencia + monto;
        System.out.println("Se paga con transferencia la cantidad de $ "+monto);
    }
    
    public static double getSaldoTransferencia() {
        return saldoTransferencia;
    }
}
