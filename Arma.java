package algotank;

public class Arma {

    //Atributos

    private int velocidadDisparo;

    private boolean isAlgoTank;

    //Constructor

    public Arma(int velocidadDisparoParam, boolean isAlgoTankParam){
        this.velocidadDisparo=velocidadDisparoParam;
        this.isAlgoTank=isAlgoTankParam;
    }

    // Metodos

    public int getVelocidadDisparo() {
        return velocidadDisparo;
    }

    public void setVelocidadDisparo(int velocidadDisparo) {
        this.velocidadDisparo = velocidadDisparo;
    }

    public boolean isAlgoTank() {
        return isAlgoTank;
    }

    public void setAlgoTank(boolean algoTank) {
        isAlgoTank = algoTank;
    }

    //Crear proyectil

}
