public class Caballeria extends UnidadCombate {
    public Caballeria(int posicionX, int posicionY, int energia) {
        super(posicionX, posicionY, energia);
    }
    public void moverse(int nuevaX, int nuevaY) {
        if (nuevaX >= 0 && nuevaY >= 0 && Math.abs(nuevaX - posicionX) <= 3 && Math.abs(nuevaY - posicionY) <= 3) {
            posicionX = nuevaX;
            posicionY = nuevaY;
            System.out.println("la caballeria se movio rapida");
        } else {
            System.out.println("la caballeria no puede llegar a la posicion");
        }
    }
    public void atacar() {
        System.out.println("la caballeria ataca con lanza");
    }
}
