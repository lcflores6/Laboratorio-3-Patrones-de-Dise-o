package SingletonTaximetro;
import java.util.*;
public class Singleton {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RecargoRetraso moduloRecargo = new RecargoRetraso();
        Taximetro taximetro = Taximetro.getInstancia();
        int op;
        double km;
        int min;
        double montoretraso;
        
        do {
            System.out.println("\n=== TERMINAL DEL TAXISTA ===");
            System.out.println("1. Registrar Kilometros Recorridos");
            System.out.println("2. Registrar Minutos de Retraso");
            System.out.println("3. Ver Total Actual");
            System.out.println("4. Reiniciar Taximetro (Nuevo Viaje)");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opcion: ");
            op = sc.nextInt();
            sc.nextLine();
            
            switch (op) {
                case 1:
                    System.out.print("Ingrese los km recorridos: ");
                    km = sc.nextDouble();
                    sc.nextLine();
                    taximetro.registrarRecorrido(km);break;
                case 2:
                    System.out.print("Ingrese los minutos de retraso: ");
                    min = sc.nextInt();          
                    sc.nextLine();
                    moduloRecargo.aplicarRecargo(min);break;    
                case 3:
                    System.out.println("TOTAL ACUMULADO: $" + taximetro.getTotal());break;    
                case 4:  
                    taximetro.reiniciar();
                    System.out.println("Taximetro puesto a cero.");break;        
                case 5:  
                    System.out.println("Saliendo del sistema...");break;        
                default: System.out.println("Opción no válida.");break;
            }
        } while (op != 5);
        sc.close();           
    }   
}
