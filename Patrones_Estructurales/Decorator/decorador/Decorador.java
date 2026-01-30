package decorador;
import java.util.Scanner;

public class Decorador {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
        int op;
        
        do {
            System.out.println("CAFETERIA ESPE");
            System.out.println("1. Cafe Simple");
            System.out.println("2. Agregar Leche");
            System.out.println("3. Agregar Azucar");
            System.out.println("4. Agregar Crema de Canela");
            System.out.println("5. Agregar Extracto de vainilla");
            System.out.println("6. Salir");
            System.out.print("Ingrese una opcion: ");
            op = sc.nextInt();
            sc.nextLine();
            Bebida cafe = new CafeSimple(); 
            switch (op) {
                case 1: cafe = new CafeSimple(); 
                    System.out.println(cafe.getDescripcion()+ " $: "+cafe.getCosto());break;
                case 2: cafe = new Leche(cafe); 
                    System.out.println(cafe.getDescripcion()+ " $: "+cafe.getCosto());break;
                case 3: cafe = new Azucar(cafe); 
                    System.out.println(cafe.getDescripcion()+ " $: "+cafe.getCosto());break;
                case 4: cafe = new Crema(cafe); 
                    System.out.println(cafe.getDescripcion()+ " $: "+cafe.getCosto());break;
                case 5: cafe = new ExtractoVainilla(cafe);
                    System.out.println(cafe.getDescripcion()+ " $: "+cafe.getCosto());break;
                case 6: break;
                default: System.out.println("No existe esa opcion... ");
            }
            if(op != 6){
                System.out.println("\nActual: "+cafe.getDescripcion());
                System.out.println("Total: $ "+cafe.getCosto());
            }
        } while (op != 6);      
        sc.close();
    }   
}
