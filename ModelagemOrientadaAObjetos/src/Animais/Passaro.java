package Animais;

public class Passaro {

    static int numeroDePassaros;
    private String name;
    private String color;
    private int height;
    private double weight;
    private String spiritState;

    public Passaro(String name, String color, int height, double weight, String spiritState) {
        this.name = name;
        this.color = color;
        this.height = height;
        this.weight = weight;
        this.spiritState = spiritState;

        numeroDePassaros ++;
    }

    void comer() {}

    void dormir() {}

    void soar() {
        System.out.println("PIU PIU");
    }

}
