package ejercicio2;

import java.util.List;
import java.util.stream.Collectors;

public class Concatenador  implements Mensaje{
    @Override
    public String concatenar(List<String> texto,Integer caracteres) {
        return texto.stream().filter(renglon -> renglon.length() > caracteres).collect(Collectors.joining(", "));
    }
}
