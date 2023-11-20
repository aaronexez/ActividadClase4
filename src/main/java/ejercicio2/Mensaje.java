package ejercicio2;

import java.util.List;
@FunctionalInterface
public interface Mensaje {
    String concatenar(List<String> texto, Integer caracteres);
}
