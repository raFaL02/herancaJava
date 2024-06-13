package Animais;

public abstract class Animal {

    protected String name;
    protected String cor;
    protected int height;
    protected double weight;
    protected String spiritState;

    public Animal(String name, String cor, int height, double weight) {
        this.name = name;
        this.cor = cor;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getSpiritState() {
        return spiritState;
    }

    public void setSpiritState(String spiritState) {
        this.spiritState = spiritState;
    }

    protected void comer(){}

    protected void dormir(){}

    protected abstract void soar();
}
