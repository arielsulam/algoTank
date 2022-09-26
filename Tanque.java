package algotank;

public class Tanque {

    private Disparable disparable;

    private int RESISTENCIA_INICIAL=100;
    private Resistencia resistencia;

    public Tanque (Resistencia resistencia){
        this.resistencia = new Resistencia(RESISTENCIA_INICIAL);
        this.disparable = new Canion();

    }

    public int getResistencia() {
        return this.resistencia.getValor();
    }

    public void disparar(){
        this.disparable.disparar();
    }

    public void recibirProyectil(Proyectil proyectil){
        this.resistencia.disminuirResistencia(proyectil.getPoderDestructivo();
    }
    public boolean estaVivo(){
        return this.resistencia.getValor() > 0;
    }

    public void recibirArma(Disparable disparable){
     this.disparable=disparable;
    }

    public void recibirBonusVida(Bonus bonus){
        this.resistencia.aumentarResistencia(bonus.getBonusVida());
    }



}

