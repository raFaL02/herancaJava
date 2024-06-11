import Animais.Cachorro;

public class Main {
    public static void main(String[] args) {

        Cachorro dog = new Cachorro("Pingo", "preto", 20,6.7, 6, "de boa");

        System.out.println(dog.getNumerosDeCachorros());

        Cachorro dog1 = new Cachorro("Pingo", "preto", 20,6.7, 6, "de boa");

        System.out.println(dog1.getNumerosDeCachorros());
        System.out.println(dog.getNumerosDeCachorros());
    }
}