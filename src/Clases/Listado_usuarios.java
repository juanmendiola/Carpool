
package Clases;
import java.util.ArrayList;
public class Listado_usuarios {
    ArrayList<Usuario>lista;

    public Listado_usuarios() {
        lista = new ArrayList();
    }
    public void AgregarUsuarios(Usuario c){
       lista.add(c);
       
    }

  }
