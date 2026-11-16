import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<UnidadCombate> unidades = new ArrayList<>();
        unidades.add(new Infanteria(0, 0, 150));
        unidades.add(new Caballeria(1, 1, 300));
        unidades.add(new UnidadAerea(0, 2, 500));
        Ejercito ejercito = new Ejercito();
        ejercito.ejecutarAcciones(unidades);
    }
}