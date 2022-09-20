package algotank;

import java.util.ArrayList;
import java.util.List;

public class Canion {


    private static int CANTIDAD_PROYECTILES = 20;

    private ArrayList<Proyectil> proyectiles = new ArrayList<Proyectil>() ;

    public Canion(){

        for (int i = 0; i < CANTIDAD_PROYECTILES; i++) {
            proyectiles.add(new Proyectil());
        }


    }
}

