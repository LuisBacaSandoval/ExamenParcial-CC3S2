//Se importa el paquete java.util.function.Consumer para poder usar
//la expresion lambda Consumer
import java.util.function.Consumer;
//interfaz Secret
interface Secret {
    String magic(double d);
}
//clase Secret1 que implementa la interfaz Secret
class Secret1 implements Secret {
    public static void main(String[] args) {
        //mostrar el  uso del metodo magic()
        Secret1 secret1 = new Secret1();
        System.out.println(secret1.magic(2.4578));

        //mostrar el uso del metodo expLambda()
        secret1.expLambda(2.4521);
    }
    //metodo magic() recibe como parametro un double para luego retornar
    // el String "Poof", este retorno es independiente de parametro double
    //que le pasemos. Siempre retornará el String "Poof"
    public String magic(double d) {
        return "Poof";
    }
    //metodo expLambda() recibe como parametro un double y dentro de este se
    //utiliza la expresicon lambda (Double db) -> {
    //            System.out.println("poof");
    //        } al igual que el metodo magic() el retorno es independiente
    // del valor double que le pasemos
    public void expLambda(double d){
        Consumer<Double> poof = (Double db) -> {
            System.out.println("Poof con expresion Lambda");
        };
        poof.accept(d);
    }
}
