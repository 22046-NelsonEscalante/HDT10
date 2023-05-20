import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Reader {
    
    public ArrayList<Node> readFile(String path) throws Exception {
        try {
            ArrayList<String> lines = new ArrayList<>();
            ArrayList<Node> nodes = new ArrayList<>();

            BufferedReader reader = new BufferedReader(new FileReader(path));
            String line = reader.readLine();
            while (line != null) {
                lines.add(line);
                line = reader.readLine();
            }

            for (String s : lines) {
                String[] params = s.split(" ");
                Node city2  = new Node(params[1], null);
                Vector vect = new Vector(city2, Integer.parseInt(params[2]), Integer.parseInt(params[3]), Integer.parseInt(params[4]), Integer.parseInt(params[5]));

                Node city1  = new Node(params[0], vect);
                nodes.add(city1);
            }

            reader.close();

            return nodes;

        } catch (Exception e) {
            throw new Exception();
        }
    }

}
