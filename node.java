import java.util.ArrayList;

public class Node {
    
    private String ciudad;
    private ArrayList<Vector> vectors;

    public Node(String ciudad, Vector vector) {
        setCiudad(ciudad);
        ArrayList<Vector> arr = new ArrayList<>();
        arr.add(vector);
        setVectors(arr);        
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
}
