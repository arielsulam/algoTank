package algotank;

public abstract class Tanque {

    //Atributos

    private int [] posicion = new int[2];

    private int resistencia;

    private int velocidadDesplazamiento;


    //Constructor

    public Tanque(int [] posicionparam, int resistenciaparam, int velocidadDesplazamientoparam){
        this.posicion=posicionparam;
        this.resistencia=resistenciaparam;
        this.velocidadDesplazamiento=velocidadDesplazamientoparam;
    }
    // Metodos


    public int[] getPosicion() {
        return posicion;
    }

    public void setPosicion(int[] posicion) {
        this.posicion = posicion;
    }
    public int getResistencia(){
        return resistencia;
    }
    public void setResistencia(){
        this.resistencia = resistencia;
    }

    public int getVelocidadDesplazamiento() {
        return velocidadDesplazamiento;
    }
    public void setVelocidadDesplazamiento(){
        this.velocidadDesplazamiento=velocidadDesplazamiento;
    }

    //Desplazarse
    //Recibir disparos
    //Disparar
}
