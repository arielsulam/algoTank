package algotank;

public class Celda {

    //Atributos

    private Desplazable desplazable;
    //Crea celda vacia
    public Celda (){

    }
    //Recibe desplazable y lo asigna en la celda
    public Celda(Desplazable desplazable){
        this.desplazable=desplazable;
    }
}
