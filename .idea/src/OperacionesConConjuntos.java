import java.util.HashSet;
import java.util.Set;

public class OperacionesConConjuntos {
    public static Set<Object> Uniones(Set<Object> a, Set<Object> b) {
        Set<Object> resultado = new HashSet<>(a);
        resultado.addAll(b);
        return resultado;
    }
    public static Set<Object> Interseccion(Set<Object> a, Set<Object> b) {
        Set<Object> resultado = new HashSet<>(a);
        resultado.retainAll(b);
        return resultado;
    }
    public static Set<Object> Diferencia(Set<Object> a, Set<Object> b) {
        Set<Object> resultado = new HashSet<>(a);
        resultado.removeAll(b);
        return resultado;
    }
    public static boolean Subconjunto(Set<Object> a, Set<Object> b) {
        return a.containsAll(b);
    }
    public static Set<String> ParesOrdenados(Set<Object> a, Set<Object> b) {
        Set<String> resultado = new HashSet<>();
        for (Object ElementoA : a) {
            for (Object ElementoB : b) {
                resultado.add("(" + ElementoA + ", " + ElementoB + ")");
            }
        }
        return resultado;
    }
    public static void main(String[] args) {
        Set<Object> setA = new HashSet<>();
        Set<Object> setB = new HashSet<>();
        setA.add(3);
        setA.add(4);
        setA.add(5);
        setB.add(1);
        setB.add(2);
        setB.add(5);
        System.out.println("Unión: " + Uniones(setA, setB));
        System.out.println("Intersección: " + Interseccion(setA, setB));
        System.out.println("Diferencia (a - b): " + Diferencia(setA, setB));
        System.out.println("B es subconjunto de A: " + Subconjunto(setA, setB));
        System.out.println("Producto cartesiano a x b: " + ParesOrdenados(setA, setB));
    }
}