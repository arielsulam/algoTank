package algotank;

public class Speed {

    private int value;

    public Speed(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void aumentarVelocidad(double multiplier) {
        this.value = (int) (this.value * multiplier);
    }

}
