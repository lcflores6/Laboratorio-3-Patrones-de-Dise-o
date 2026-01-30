package singleton;

public class Singleton {

    public static void main(String[] args) {
        Impresora u1 = Impresora.getInstancia();
        Impresora u2 = Impresora.getInstancia();
        Impresora u3 = Impresora.getInstancia();
       
        u1.imprimir("Deber de POO");
        u1.imprimir("Deber de Fisica");
        u2.imprimir("Ejercicio de Fisica");
        u3.imprimir("Reporte de los Ceros");
        
        System.out.println("Total impresiones: "+u1.getTotalImpresiones());
        System.out.println("Total impresiones: "+u2.getTotalImpresiones());
        
        System.out.println(u1 == u2);
    } 
}
