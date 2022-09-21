package algotank;

import java.util.ArrayList;

public abstract class ArmaMunicionFinita implements Disparable {


    private final ArrayList<Proyectil> proyectiles = new ArrayList<Proyectil>() ;

    public ArmaMunicionFinita(int cantidadProyectiles){
        for (int i = 0; i < cantidadProyectiles; i++) {
            this.proyectiles.add(new Proyectil());
        }
    }

    // Metodo disparar

    public void disparar (){
        this.proyectiles.remove(0);
    }
}
