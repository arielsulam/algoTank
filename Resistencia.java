package algotank;

public class Resistencia {

    private int valor;

    public Resistencia (int valor){
        this.valor=valor;
    }
    public void disminuirResistencia(int disminuendo) {
        if (this.valor >= disminuendo){
            this.valor = this.valor - disminuendo;
        }
        else {
            this.valor = 0;
        }
    }

    public int getValor() {
        return valor;
    }
    public void aumentarResistencia(double multiplicador){
        this.valor = (int) (this.valor*multiplicador);
    }

}
