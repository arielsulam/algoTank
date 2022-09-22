package algotank;

public class Tanque {

    private Disparable disparable;

    private int RESISTENCIA_INICIAL=100;
    private int resistencia;

    public Tanque (int resistencia){
        this.resistencia = RESISTENCIA_INICIAL;
        this.disparable = new Canion();

    }

    public int getResistencia() {
        return resistencia;
    }

    public void disparar(){
        this.disparable.disparar();
    }

    public void recibirProyectil(Proyectil proyectil){

        if (this.resistencia >= proyectil.getPoderDestructivo()){
            this.resistencia= this.resistencia - proyectil.getPoderDestructivo();
        }
        else {
            this.resistencia = 0;
        }
    }
    public boolean estaVivo(){
        return this.resistencia > 0;
    }

    public void recibirArma(Disparable disparable){
     this.disparable=disparable;
    }

    public void recibirBonusVida(Bonus bonus) {

        this.resistencia = (int) (this.resistencia * bonus.getBonusVida());

    }

}

