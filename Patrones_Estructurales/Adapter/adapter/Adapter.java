package adapter;
import java.util.Scanner;

public class Adapter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op;
        double dinero;
        do {
            System.out.println("\n=== Pagos en Diferentes Divisas ===");
            System.out.println("1. Euros ");
            System.out.println("2. Pesos Colombianos ");
            System.out.println("3. Reales Brasilenios ");
            System.out.println("4. Salir ");
            System.out.print("Selecciones una opcion: ");
            
            op = sc.nextInt();
            sc.nextLine();
            
            if(op <= 3 && op >= 1){
                System.out.print("Cuanto desea transferir ? ");
                dinero = sc.nextDouble();
                
                Pago pago = new PagoAdapter(op);
                pago.pagar(dinero);
            }
        }while(op != 4);
    }
}

