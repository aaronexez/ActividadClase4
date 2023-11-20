package ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> textos = new ArrayList<>();
        String texto1 = "hola";
        String texto2 = "adios";
        textos.add(texto1);
        textos.add(texto2);

        Transformador transformador = new Transformador();
        List<String> mayusculas = transformador.mayusculas(textos);

        mayusculas.forEach(System.out::println);
    }
}
