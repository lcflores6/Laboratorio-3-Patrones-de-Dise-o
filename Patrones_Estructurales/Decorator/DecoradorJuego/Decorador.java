package DecoradorJuego;
import java.util.Scanner;

public class Decorador {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op;
        
        do {
            System.out.println("==== JUEGO CRASH ====");
            System.out.println("1. Personaje Base");
            System.out.println("2. Agregar Espada");
            System.out.println("3. Agregar Escudo");
            System.out.println("4. Agregar Armadura");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opcion: ");
            op = sc.nextInt();
            sc.nextLine();
            
            Personaje personaje = new PersonajeBase(); 
            switch (op) {
                case 1:
                    System.out.println(personaje.getDescripcion());
                    System.out.println("Ataque: "+personaje.getAtaque());
                    System.out.println("Defensa: "+personaje.getDefensa());break;
                case 2: personaje = new Espada(personaje); 
                    System.out.println(personaje.getDescripcion());
                    System.out.println("Espada agregada !!");
                    System.out.println("Ataque: "+personaje.getAtaque());
                    System.out.println("Defensa: "+personaje.getDefensa());break;
                case 3: personaje = new Escudo(personaje); 
                    System.out.println(personaje.getDescripcion());
                    System.out.println("Escudo agregado !!");
                    System.out.println("Ataque: "+personaje.getAtaque());
                    System.out.println("Defensa: "+personaje.getDefensa());break;
                case 4: personaje = new Armadura(personaje); 
                    System.out.println(personaje.getDescripcion());
                    System.out.println("Armadura agregada !!");
                    System.out.println("Ataque: "+personaje.getAtaque());
                    System.out.println("Defensa: "+personaje.getDefensa());break;
                case 5: break;
                default: System.out.println("No existe esa opcion... ");
            }
        } while (op != 5);
        sc.close();
    }   
}
