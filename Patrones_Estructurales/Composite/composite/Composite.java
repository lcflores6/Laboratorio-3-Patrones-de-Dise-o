package composite;

public class Composite {

    public static void main(String[] args) {
        
        Archivo a1 = new Archivo("Titi me pregunto.mp3", 4000);
        Archivo a2 = new Archivo("Amor prohibido.mp3", 5000);
        Archivo a3 = new Archivo("Mi Foto.jpg", 1000);
        
        //Carpeta Principal
        Carpeta raiz = new Carpeta("Mi Playlist");
        
        //Subcarpeta 
        Carpeta imagenes = new Carpeta("Imagenes");
                
        //Construccion del arbol de archivos
        
        raiz.agregar(a1);
        raiz.agregar(imagenes);
        raiz.agregar(a2);
        imagenes.agregar(a3);
        
        raiz.mostrar();
        System.out.println("\nTamanio Total: "+ raiz.getTamanio() +" Kb");
    }  
}
