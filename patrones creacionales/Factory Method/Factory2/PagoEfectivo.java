package Factory2;

public class PagoEfectivo implements Pagos{

    private static double saldoEfectivo = 0;
    @Override
    public void procesarPago(double monto) {
        saldoEfectivo = saldoEfectivo + monto;
        System.out.println("Se paga en Efectivo la cantidad de $ "+monto);      
    }   
    
    public static double getSaldoEfectivo(){
        return saldoEfectivo;
    }
}
