package ejercicio1;

import java.util.List;
import java.util.stream.Collectors;

public class Transformador  implements Mensaje{
    @Override
    public List<String> mayusculas(List<String> texto) {
        return texto.stream().map(textos->textos.toUpperCase()).collect(Collectors.toList());
    }
}
