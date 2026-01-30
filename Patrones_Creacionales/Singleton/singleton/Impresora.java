package singleton;

public class Impresora {
// 1. Definir una variable estatica }
    private int totalImpresiones;
    private static Impresora instancia;
// 2. Crear un constructor privado
    private Impresora() {
        System.out.println("Impresora Lista para imprimir");
    }
 // 3. Agregar un método publico estatico
    public static Impresora getInstancia(){
        if(instancia == null){
            instancia = new Impresora();
        }
        return instancia;
    }
    
    public void imprimir(String documento){
        totalImpresiones++;
        System.out.println("Documento impreso: "+documento);
    }
    
    public int getTotalImpresiones(){
        return totalImpresiones;
    }
}
