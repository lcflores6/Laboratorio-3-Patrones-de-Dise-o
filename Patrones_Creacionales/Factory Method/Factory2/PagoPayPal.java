package Factory2;

public class PagoPayPal implements Pagos{

    private static double saldoPayPal = 0;
    @Override
    public void procesarPago(double monto) {
        saldoPayPal = saldoPayPal + monto;
        System.out.println("Se paga mediante PayPal la cantidad de $ "+monto);
    }
 
    public static double getSaldoPayPal() {
        return saldoPayPal;
    }    
}

