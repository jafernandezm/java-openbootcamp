import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Locale;
import java.util.function.Function;
import java.util.stream.Stream;

public class main {


    public static void main(String[] args){
        int result=suma(1,2);
        int result2=suma(1,2);
        System.out.println(result+ " "+result2);



        Funcionales f = new Funcionales();
        f.pruebas();


        //programacion funcional

        ArrayList<String> nombres =new ArrayList<>();
        nombres.add("juan");
        nombres.add("pedro");
        nombres.add("pablo");
        //recorrer un arrar list funcionalmente
        //nombres.stream().forEach(System.out::println);
        nombres.stream().forEach( x-> System.out.println(x));


        Stream<String> valores= nombres.stream().map(x->x.toUpperCase());

        valores.forEach(x->System.out.println(x));
    }








    public static int suma(int a, int b){
        return a+b;
    }
}
