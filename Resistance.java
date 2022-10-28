package algotank;

public class Resistance {

    private int value;

    public Resistencia(int valor) {
        this.value = valor;
    }

    public void lowerResistance(int diminishing) {
        if (this.value >= diminishing) {
            this.value = this.value - diminishing;
        } else {
            this.value = 0;
        }
    }

    public int getValue() {
        return value;
    }

    public void increaseResistance(double multiplier) {
        this.value = (int) (this.value * multiplier);
    }

}
