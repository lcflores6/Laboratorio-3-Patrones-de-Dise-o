package Factory2;
import java.util.Scanner;

public class FactoryPagos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op;
        double monto = 0;        
        double totalPagos = 0;
        
        do {
            System.out.println("\n==== TIPOS DE PAGOS ====");
            System.out.println("1. Pago en Efectivo");
            System.out.println("2. Pago con Transferencia");
            System.out.println("3. Pago con Tarjeta de Debito");
            System.out.println("4. Pago con Tarjeta de Credito");
            System.out.println("5. Pago con PayPal");
            System.out.println("6. Salir");            
            System.out.print("Selecione una opcion de pago: ");
            op = sc.nextInt();
            sc.nextLine();
            
            if(op >= 1 && op <= 5){
            System.out.print("Ingrese el monto a pagar: ");
            monto = sc.nextDouble();
            sc.nextLine();
            
            Pagos pago = PagosFactory.crearPago(op);
            
            if(pago != null){
                pago.procesarPago(monto);
                switch (op) {
                    case 1: 
                        System.out.println("Saldo acumulado en Efectivo: $" + PagoEfectivo.getSaldoEfectivo());break;
                    case 2: 
                        System.out.println("Saldo acumulado en Transferencia: $" + PagoTransferencia.getSaldoTransferencia());break;
                    case 3: 
                        System.out.println("Saldo acumulado en T. Debito: $" + PagoTarjetaDebito.getSaldoTarjetaDebito());break;
                    case 4: 
                        System.out.println("Saldo acumulado en T. Credito: $" + PagoTarjetaCredito.getSaldoTarjetaCredito());break;
                    case 5: 
                        System.out.println("Saldo acumulado en PayPal: $" + PagoPayPal.getSaldoPayPal());break;
                    }
                }
            }
            
            totalPagos = PagoEfectivo.getSaldoEfectivo() + PagoTransferencia.getSaldoTransferencia() + 
                                PagoTarjetaDebito.getSaldoTarjetaDebito() + PagoTarjetaCredito.getSaldoTarjetaCredito() + 
                                PagoPayPal.getSaldoPayPal();
            if (op != 6) {
                System.out.println("SALDO TOTAL EN EL SISTEMA: $" + totalPagos);
            }
        } while (op != 6);
        sc.close();
    }   
}
