import java.util.ArrayList;
public class Ejercito {
    public void ejecutarAcciones(ArrayList<UnidadCombate> unidades) {
        for (UnidadCombate unidad : unidades) {
            unidad.moverse(2, 3);
            unidad.atacar();
            unidad.mostrarPosicion();
            System.out.println();
        }
    }
}
