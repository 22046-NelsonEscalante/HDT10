public class Node {
    
    private String ciudad1;
    private String ciudad2;
    private int tiempoNormal;
    private int tiempoLluvia;
    private int tiempoNieve;
    private int tiempoTormenta;

    public Node(String ciudad1, String ciudad2, int tiempoNormal, int tiempoLluvia, int tiempoNieve, int tiempoTormenta) {
        setCiudad1(ciudad1);
        setCiudad2(ciudad2);
        setTiempoNormal(tiempoNormal);
        setTiempoLluvia(tiempoLluvia);
        setTiempoNieve(tiempoNieve);
        setTiempoTormenta(tiempoTormenta);
    }

    public String getCiudad1() {
        return ciudad1;
    }

    public void setCiudad1(String ciudad1) {
        this.ciudad1 = ciudad1;
    }

    public String getCiudad2() {
        return ciudad2;
    }

    public void setCiudad2(String ciudad2) {
        this.ciudad2 = ciudad2;
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
