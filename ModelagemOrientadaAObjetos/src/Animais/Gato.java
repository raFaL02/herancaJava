package Animais;

public class Gato extends Animal {

    static int numeroDeGatos;


    public Gato(String name, String color, int height, double weight, String spiritState) {
        super(name, color, height, weight, spiritState);
        this.name = name;
        this.color = color;
        this.height = height;
        this.weight = weight;
        this.spiritState = spiritState;

        numeroDeGatos ++;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public void soar() {
        System.out.println("MIAU MIAU CARALHO");
    }
}
