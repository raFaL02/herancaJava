package Animais;

public class Gato extends Animal {

    static int numerosDeGatos;

    public Gato(String name, String cor, int height, double weight) {
        super(name, cor, height, weight);
    }

    @Override
    public String toString() {
        return "Gato{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public void soar() {
        System.out.println("MIAU MIAU CARALHOOO!");
    }
}
