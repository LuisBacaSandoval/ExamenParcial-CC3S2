//Se importa el paquete java.util.function.* para poder usar
//las expresiones lambda
import java.util.function.*;

//Clase Panda
public class Panda {
    //Atributos
    int age;

    //Metodo main()
    public static void main(String[] args) {
        //Se instancia el objeto p1 del tipo Panda
        Panda p1 = new Panda();
        //Se le asigna el valor de 1 al atributo age
        p1.age = 1;
        //Se llama al metodo check()
        check(p1, p -> p.age < 5);
    }

    //metodo check() recibe por atributos un objeto Panda y una expresion Lambda,
    //esta expresion Lambda(p -> p.age < 5) lo que hace es retornar true or false
    private static void check(Panda panda,
                              Predicate<Panda> pred) {
        //Se le asigna a la variable result el valor "match" en el caso la expresion lambda sea true
        //si no se le asigna el valor "not match"
        String result =
                pred.test(panda) ? "match" : "not match";
        //Finalmente imprimos el resultado, en este caso lo que se mostrara en consola es: "match"
        // debido a que la expresion lambda(p -> p.age < 5) nos da true
        System.out.print(result);
    }
}
