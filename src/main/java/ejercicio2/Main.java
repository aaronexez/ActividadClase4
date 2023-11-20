package ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> textos = new ArrayList<>();
        String texto1 = "hola";
        String texto2 = "adios";
        textos.add(texto1);
        textos.add(texto2);

        Concatenador concatenador = new Concatenador();
        String mayusculas = concatenador.concatenar(textos,7);

        System.out.println(mayusculas);
    }
}
