package algotank;

import java.util.ArrayList;
import java.util.List;

public class Cañon extends Arma{


    private static int CANTIDAD_PROYECTILES = 20;
    private List Proyectiles = new ArrayList() ;

    public Cañon(int velocidadDisparoParam, boolean isAlgoTankParam) {
        super(velocidadDisparoParam, isAlgoTankParam);
        Proyectiles add new Proyectil();

    }
}

