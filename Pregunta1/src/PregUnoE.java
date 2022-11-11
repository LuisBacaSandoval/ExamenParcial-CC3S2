import java.util.function.Supplier;

public class PregUnoE {
    public static void main(String[] args) {
        int length = 3;
        //el bucle for iterará desde i=0 hasta i=2
        for (int i = 0; i < 3; i++) {
            //si el valor de i es multiplo de dos haremos lo siguiente:
            //a "supplier" se le asignara el valor de length = 3
            if (i % 2 == 0) {
                Supplier<Integer> supplier = () -> length; // A
                System.out.println(supplier.get()); // B
            } else {
                //en el caso en que i no sea multiplo de dos haremos lo siguiente:
                //a supplier se le asignara el valor de j, que coincide con el valor
                //actual del iterador "i"
                int j = i;
                Supplier<Integer> supplier = () -> j; // C
                System.out.println(supplier.get()); // D
            }
        }

    }
}
