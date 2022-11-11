//Se importa el paquete java.util.* para poder usar
//listas
import java.util.*;
//clase PregUnoF
public class PregUnoF {
    //metodo romove() recibe como parametro una lista de caracteres,
    //este metodo se encarga de eliminar
    //todo el contenido de la lista
    public void remove(List<Character> chars) {
        char end = 'z';
        chars.add('r');
        chars.add('a');
        chars.add('b');
        chars.add('g');
        chars.add('d');
        chars.add('z');
        //mostramos el contenido de la lista
        System.out.println("Lista: " + chars);
        chars.removeIf(c -> {
            char start = 'a';
            return start <= c && c <= end;
        });
        //mostramos el contenido de la lista,
        //aqui los elementos de la lista ya
        // fueron eliminados
        System.out.println("Lista vacia: " + chars);
    }

    public static void main(String[] args) {
        PregUnoF p1 = new PregUnoF();
        List<Character> chars1 = new ArrayList<>();;
        //llamamos al metodo remove()
        p1.remove(chars1);
    }
}