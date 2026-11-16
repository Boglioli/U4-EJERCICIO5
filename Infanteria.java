public class Infanteria extends UnidadCombate {
    public Infanteria(int posicionX, int posicionY, int energia) {
        super(posicionX, posicionY, energia);
    }
    public void moverse(int nuevaX, int nuevaY) {
        if (nuevaX >= 0 && nuevaY >= 0) {
            posicionX = nuevaX;
            posicionY = nuevaY;
            System.out.println("la infanteria se movo caminando");
        } else {
            System.out.println("la infanteria no puede moverse");
        }
    }
    public void atacar() {
        System.out.println("la infanteria ataca con espada");
    }
}
