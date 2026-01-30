package MenuRestaurante;
import java.util.Scanner;

public class Composite {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ComponenteAlimento papas = new Producto("Papas", 1);
        ComponenteAlimento cola = new Producto("Gaseosa", 0.75);
        ComponenteAlimento hamburguesa = new Producto("Hamburguesa", 2);
        Combo pedido = new Combo("Pedido del Cliente");

        int op;

        do {
            System.out.println("\n=== MENU FACTURA ===");
            System.out.println("1. Papas");
            System.out.println("2. Gaseosa");
            System.out.println("3. Hamburguesa");
            System.out.println("4. Combo Simple (Papas + Cola)");
            System.out.println("5. Combo Completo (Papas + Cola + Hamburguesa)");
            System.out.println("6. Ver pedido");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opcion: ");
            op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1: pedido.agregar(papas);break;
                case 2: pedido.agregar(cola);break;
                case 3: pedido.agregar(hamburguesa);break;
                case 4: Combo combosimple = new Combo("Combo simple");
                        combosimple.agregar(papas);
                        combosimple.agregar(cola);
                        pedido.agregar(combosimple);break;
                case 5: Combo combocompleto = new Combo("Combo completo");
                        combocompleto.agregar(papas);
                        combocompleto.agregar(cola);
                        combocompleto.agregar(hamburguesa);
                        pedido.agregar(combocompleto);break;
                case 6: System.out.println("\n=== SU PEDIDO ===");
                        pedido.mostrar();
                        System.out.println("TOTAL: $ " + pedido.getPrecio());break;
                case 7: break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (op != 7);
    }
}
