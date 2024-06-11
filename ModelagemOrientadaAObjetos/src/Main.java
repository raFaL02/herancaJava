import Animais.Cachorro;
import Animais.Gato;
import Animais.Passaro;

public class Main {
    public static void main(String[] args) {

        Cachorro dog = new Cachorro("Pingo", "preto", 20,6.7, 6, "de boa");

        Gato cat = new Gato("Morgana", "preto", 7, 5.5, "de boa");

        Passaro bird = new Passaro("Taca", "verde", 3, 1,"feliz");

        dog.soar();
        cat.soar();
        bird.soar();

    }
}