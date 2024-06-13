package Loja;

import Animais.Animal;
import Animais.Cachorro;

public class Petshop {

    public void darBanho(Animal animal) {
        animal.setSpiritState("limpo");
    }

    public void tosar(Cachorro dog) {
        dog.setSpiritState("tosado");
    }

    public void hotel(Animal animal) {
        animal.setSpiritState("com saudade");
    }
}
