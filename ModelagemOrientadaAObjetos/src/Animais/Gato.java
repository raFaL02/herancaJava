package Animais;

public class Gato {

    static String numeroDeGatos;
    private String name;
    private String color;
    private int height;
    private double weight;
    private String spiritState;

    public Gato(String name, String color, int height, double weight, String spiritState) {
        this.name = name;
        this.color = color;
        this.height = height;
        this.weight = weight;
        this.spiritState = spiritState;
    }

    void comer() {}

    void dormir() {}

    void soar() {
        System.out.println("MIAU MIAU CARALHO");
    }

    @Override
    public String toString() {
        return "Gato{" +
                "name='" + name + '\'' +
                '}';
    }
}
