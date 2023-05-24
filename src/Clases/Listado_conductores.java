
package Clases;

import java.util.ArrayList;

public class Listado_conductores {
    ArrayList<Conductor>lista;

    public Listado_conductores() {
        lista = new ArrayList();
    }
    public void AgregarConductores(Conductor c){
       lista.add(c);
       
    }
}
