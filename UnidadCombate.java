public abstract class UnidadCombate {
    protected int posicionX;
    protected int posicionY;
    protected int energia;
    public UnidadCombate(int posicionX, int getPosicionY, int energia) {
        this.posicionX = posicionX;
        this.posicionY = getPosicionY;
        this.energia = energia;
    }
    public abstract void moverse(int nuevaX, int nuevaY);
    public abstract void atacar();
    public void mostrarPosicion() {
        System.out.println("posicion: X=" + posicionX + "Y=" + posicionY);
        System.out.println("energia: " + energia);
    }
}
