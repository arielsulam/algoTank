package algotank;

public class Velocidad {

    private int valor;

    public Velocidad(int valor){
        this.valor=valor;
    }

    public int getValor() {
        return valor;
    }

    public void aumentarVelocidad(double multiplicador){
        this.valor = (int) (this.valor*multiplicador);
    }

}
