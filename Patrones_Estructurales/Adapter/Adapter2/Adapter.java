package Adapter2;

public class Adapter {

    public static void main(String[] args) {
        Reproductor reproduce = new ReproductorAdapter(new ReproductorMP4());
        reproduce.reproducir("Video Fiestas Navideñas");
    }
    
}
