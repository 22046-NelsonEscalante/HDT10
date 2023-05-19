public class Vector {
    
    private Node points_to;
    private int tiempoNormal;
    private int tiempoLluvia;
    private int tiempoNieve;
    private int tiempoTormenta;

    public Vector(Node points_to, int tiempoNormal, int tiempoLluvia, int tiempoNieve, int tiempoTormenta) {
        setPoints_to(points_to);
        setTiempoNormal(tiempoNormal);
        setTiempoLluvia(tiempoLluvia);
        setTiempoNieve(tiempoNieve);
        setTiempoTormenta(tiempoTormenta);
    }

    public Node getPoints_to() {
        return points_to;
    }

    public void setPoints_to(Node points_to) {
        this.points_to = points_to;
    }

    public int getTiempoNormal() {
        return tiempoNormal;
    }

    public void setTiempoNormal(int tiempoNormal) {
        this.tiempoNormal = tiempoNormal;
    }

    public int getTiempoLluvia() {
        return tiempoLluvia;
    }

    public void setTiempoLluvia(int tiempoLluvia) {
        this.tiempoLluvia = tiempoLluvia;
    }

    public int getTiempoNieve() {
        return tiempoNieve;
    }

    public void setTiempoNieve(int tiempoNieve) {
        this.tiempoNieve = tiempoNieve;
    }

    public int getTiempoTormenta() {
        return tiempoTormenta;
    }

    public void setTiempoTormenta(int tiempoTormenta) {
        this.tiempoTormenta = tiempoTormenta;
    }
}
