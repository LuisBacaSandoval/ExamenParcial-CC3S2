//Se importa el paquete java.util.* para poder usar
//listas
import java.util.*;
//clase PregUnoD
public class PregUnoD {
    //metodo romove() recibe como parametro una lista de caracteres,
    //este metodo se encarga de eliminar
    //todo el contenido de la lista
    public void remove(List<Character> chars) {
        char end = 'z';
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
        PregUnoD p1 = new PregUnoD();
        List<Character> chars = new ArrayList<>();
        chars.add('c');
        chars.add('a');
        chars.add('b');
        chars.add('c');
        chars.add('d');
        chars.add('z');
        //mostramos el contenido de la lista
        System.out.println("Lista: "+chars);
        //llamamos al metodo remove()
        p1.remove(chars);
    }
}
