package Animais;

public class Cachorro extends Animal {

    static int numerosDeCachorros;
    private int tailHeight;


    public Cachorro(String name, String cor, int height, double weight) {
        super(name, cor, height, weight);

        numerosDeCachorros ++;
    }

    public static int getNumerosDeAnimais() {
        return numerosDeCachorros;
    }

    public static void setNumerosDeAnimais(int numerosDeCachorros) {
        Cachorro.numerosDeCachorros = Cachorro.numerosDeCachorros;
    }

    public int getTailHeight() {
        return tailHeight;
    }

    public void setTailHeight(int tailHeight) {
        this.tailHeight = tailHeight;
    }

    public String interagir(String acao) {

        switch (acao) {
            case "Fazer carinho": this.spiritState = "feliz";
            break;
            case "Pisar na patinha": this.spiritState = "dor";
            break;
            case "Mandar dormir": this.spiritState = "triste";
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
