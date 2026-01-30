package factory;
import java.util.Scanner;

public class Factory {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op;
        
        do {
            System.out.println("==== FABRICA DE JUGUETES ====");
            System.out.println("1. Crear un Peluche");
            System.out.println("2. Crear un Carrito");
            System.out.println("3. Crear un Barbie");
            System.out.println("4. Salir");
            
            System.out.println("Selecione una opcion: ");
            op = sc.nextInt();
            sc.nextLine();
            
            Juguete juguete = JugueteFactory.crearJuguete(op);
            if(juguete != null){
                juguete.crear();
                
            }else{
                System.out.println("No se ha podido crear un juguete");
            }
        } while (op != 4);
        sc.close();
    }
}
