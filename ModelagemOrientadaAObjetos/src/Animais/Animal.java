package Animais;

public class Animal {
    protected String name;
    protected String color;
    protected int height;
    protected double weight;
    protected String spiritState;

    public Animal(String name, String color, int height, double weight, String spiritState) {
        this.name = name;
        this.color = color;
        this.height = height;
        this.weight = weight;
        this.spiritState = spiritState;
    }

    protected void comer() {}

    protected void dormir() {}

    public void soar() {
        System.out.println(" ");
    }
}
