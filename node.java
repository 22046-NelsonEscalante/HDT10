import java.util.ArrayList;

public class Node {
    
    private String ciudad;
    private ArrayList<Vector> vectors = new ArrayList<>();

    public Node(String ciudad, Vector vector) {
        setCiudad(ciudad);
        addVector(vector);
    }


    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public ArrayList<Vector> getVectors() {
        return vectors;
    }

    public void setVectors(ArrayList<Vector> vectors) {
        this.vectors = vectors;
    }

    public void addVector(Vector vector) {
        vectors.add(vector);
    }
}
