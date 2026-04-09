interface Camera {
    void takePhoto();
}

interface MusicPlayer {
    void playMusic();
}

class Smartphone implements Camera, MusicPlayer {
    String brand;

    Smartphone(String brand) {
        this.brand = brand;
    }

    public void takePhoto() {
        System.out.println(brand + " taking photo");
    }

    public void playMusic() {
        System.out.println(brand + " playing music");
    }
}

public class Multiple {
    public static void main(String[] args) {
        Smartphone s = new Smartphone("Samsung");
        s.takePhoto();
        s.playMusic();
    }
}