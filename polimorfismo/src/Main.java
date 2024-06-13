import Animais.Cachorro;
import Loja.Petshop;

public class Main {
    public static void main(String[] args) {

        Cachorro dog = new Cachorro("Lua", "branca", 30, 20.5);
        Cachorro cat = new Cachorro("Tom", "marrom", 10, 5.6);
        Cachorro bird = new Cachorro("Gaviota", "verde", 4, 1.5);

        Petshop petshop= new Petshop();

        petshop.darBanho(dog);
        System.out.println(dog.getSpiritState());

        petshop.darBanho(cat);
        System.out.println(cat.getSpiritState());

        petshop.tosar(dog);
        System.out.println(dog.getSpiritState());
    }
}