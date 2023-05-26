import java.util.ArrayList;

public class Navigation {
    private int weather;
    private int size;
    private int[][] graph;

    public Navigation(int weather, ArrayList<Node> cities) {
        try {
            setWeather(1);
        } catch (Exception e) {
            System.out.println("es imposible que esto se imprima. :b");
        }
        calculateGraph(cities);
    }

    public void setWeather(int weather) throws Exception {
        if ((0 < weather) && (weather < 5)) {
            this.weather = weather;
        } else {
            throw new Exception();
        }
    }

    public void navigate(String city1, String city2, ArrayList<Node> graph) {
        
    }

    public void calculateGraph(ArrayList<Node> cities) {
        setSize(cities.size());

        int count_n = 0;
        for (Node n : cities) {
            int count_v = 0;

            for (Vector v : n.getVectors()) {

                if (count_v == count_n) {
                    graph[count_n][count_v] = 0;
                } else {
                    graph[count_n][count_v] = currentTime(v);
                }

                count_v += 1;
            }

            count_n += 1;
        }
    }

    public int currentTime(Vector v) {
        switch (weather) {
            case 1:
                return v.getTiempoNormal();
            case 2:
                return v.getTiempoLluvia();
            case 3:
                return v.getTiempoNieve();
            case 4:
                return v.getTiempoTormenta();
            default:
                return 0;
        }
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
