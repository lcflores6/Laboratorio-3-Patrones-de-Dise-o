package Factory2;

public class PagosFactory {

    public static Pagos crearPago(int tipo){
        switch (tipo) {
            case 1: 
                return new PagoEfectivo();
            case 2:
                return new PagoTransferencia(); 
            case 3:
                return new PagoTarjetaDebito();
            case 4:
                return new PagoTarjetaCredito();
            case 5:
                return new PagoPayPal();
            default:
                System.out.println("Pago no disponible");      
        }
        return null;
    }
}
