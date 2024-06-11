package Animais;

public class Cachorro extends Animal {

    static int numerosDeCachorros;
    private int tailHeight;

    public Cachorro(String name, String color, int height, double weight, int tailHeight, String spiritState) {
        super(name, color, height, weight, spiritState);
        this.name = name;
        this.color = color;
        this.height = height;
        this.weight = weight;
        this.tailHeight = tailHeight;
        this.spiritState = spiritState;

        numerosDeCachorros ++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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

    public int getTailHeight() {
        return tailHeight;
    }

    public void setTailHeight(int tailHeight) {
        this.tailHeight = tailHeight;
    }

    public static int getNumerosDeCachorros() {
        return numerosDeCachorros;
    }

    public static void setNumerosDeCachorros(int numerosDeCachorros) {
        Cachorro.numerosDeCachorros = numerosDeCachorros;
    }

    public String pegar() {
        return "bolinha";
    }

    public String interagir(String acao) {

        switch (acao) {
            case "carinho": this.spiritState = "Feliz";
            break;
            case "pisar na patinha": this.spiritState = "com dor =/";
            break;
            case "vai dormir": this.spiritState = "triste";
            break;
            default: this.spiritState = "de boa";
            break;
        }

        return this.spiritState;
    }

    @Override
    public String toString() {
        return "Cachorro{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public void soar() {
        System.out.println("AU AU");
    }
}
