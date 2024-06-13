package Animais;

public class Passaro extends Animal {

    static int numerosDePassaros;

    public Passaro(String name, String cor, int height, double weight, String spiritState) {
        super(name, cor, height, weight);

        numerosDePassaros ++;
    }

    @Override
    public String toString() {
        return "Passaro{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public void soar() {
        System.out.println("GATINHO GATINHO VAGABUNDA");
    }
}
