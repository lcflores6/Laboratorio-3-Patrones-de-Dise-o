package DecoradorEnvio;
import java.util.Scanner;

public class Decorador {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
        int op;
        Factura factura = new FacturaBase(); 
        
        do {
            System.out.println("=== MENU FACTURA ===");
            System.out.println("1. Factura base");
            System.out.println("2. Agregar impuesto (IVA 15%)");
            System.out.println("3. Agregar descuento (Adulto Mayor)");
            System.out.println("4. Agregar aportacion a los bomberos");
            System.out.println("5. Ver factura");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opcion: ");
            op = sc.nextInt();
            sc.nextLine();
            
            switch (op) {
                case 1: System.out.println(factura.getDescripcion()+ " $: "+factura.getTotal());break;
                case 2: factura = new IVA(factura);
                    System.out.println(factura.getDescripcion()+ " $: "+factura.getTotal());break;
                case 3: factura = new Descuento(factura); 
                    System.out.println(factura.getDescripcion()+ " $: "+factura.getTotal());break;
                case 4: factura = new ServicioBomberos(factura); 
                    System.out.println(factura.getDescripcion()+ " $: "+factura.getTotal());break;
                case 5: 
                    System.out.println("\n"+ factura.getDescripcion());
                    System.out.println("Total a pagar: $ "+ factura.getTotal());break;
                case 6: break;
                default: System.out.println("No existe esa opcion... ");
            }
        } while (op != 6);      
        sc.close();
    }   
}
