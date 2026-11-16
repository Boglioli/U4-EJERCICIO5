public class UnidadAerea extends UnidadCombate {
    public UnidadAerea(int posicionY, int posicionX, int energia) {
        super(posicionX, posicionY, energia);
    }
    public void moverse(int nuevaX, int nuevaY) {
        if (nuevaX >= 0 && nuevaY >= 0) {
            posicionX = nuevaX;
            posicionY = nuevaY;
            System.out.println("la unidad aerea se desplazo");
        } else {
            System.out.println("la unidad aerea no pudo deplazarse");
        }
    }
    public void atacar() {
        System.out.println("la unidad aerea ataca desde arriba");
    }
}
