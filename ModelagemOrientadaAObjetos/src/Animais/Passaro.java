package Animais;

public class Passaro extends Animal {

    static int numeroDePassaros;

    public Passaro(String name, String color, int height, double weight, String spiritState) {
        super(name, color, height, weight, spiritState);
        this.name = name;
        this.color = color;
        this.height = height;
        this.weight = weight;
        this.spiritState = spiritState;

        numeroDePassaros ++;
    }

    @Override
    public String toString() {
        return "Passaro{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public void soar() {
        System.out.println("PIU PIU MALUCÃO");
    }
}
