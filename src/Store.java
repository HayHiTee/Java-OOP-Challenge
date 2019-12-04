import java.util.ArrayList;
import java.util.List;

public class Store {
    private String name;
    private List<Part> parts;
    Store(String name){
        this.name = name;
        this.parts = new ArrayList<Part>();

    }
    public void addPart(Part part){
        this.parts.add(part);
    }
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("name=" + name);
        result.append("\n");
        result.append("Parts: ");
        for (Part part: parts) {
            result.append(part);
            result.append("\n");
        }
        return result.toString();
    }

}


