import java.util.function.Function;

public class Funcionales {



    private Function<String,String> toMayus = x -> x.toUpperCase();

    private Function<Integer,Integer> sumador = x -> x.sum(x,x);


    public void pruebas(){
        toMayus.apply("Victor");

        sumador.apply(4);
    }

    public static String toMayuscula(String nombre){
        return nombre.toUpperCase();
    }
}
