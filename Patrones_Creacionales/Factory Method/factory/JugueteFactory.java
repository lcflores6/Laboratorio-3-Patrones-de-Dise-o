package factory;

public class JugueteFactory {
    public static Juguete crearJuguete(int tipo){
        switch (tipo) {
            case 1:
                return new Peluche();
            case 2:
                return new Carrito(); 
            case 3:
                return new Barbie();
            default:
                System.out.println("Juguete no disponible");
                
        }
        return null;
    }
}
