
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String toString() {
        if (elements.size() == 0) {
            return "The collection " + this.name + " is empty.";
        } else if (elements.size() == 1) {
            String str = "The collection " + this.name + " has 1 element:\n";
            str += elements.get(0);
            return str;
        } else {
            String str = "The collection " + this.name + " has " + this.elements.size() + " elements:\n";
            for (String s : elements) {
                str += s + "\n";
            }
            return str;
        }
    }
    
}
