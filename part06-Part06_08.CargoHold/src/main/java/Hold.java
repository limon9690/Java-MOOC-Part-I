import java.util.ArrayList;

public class Hold {
    private int maxWeight;
    private ArrayList<Suitcase> suitcases;

    public Hold (int maxWeight) {
        this.maxWeight = maxWeight;
        this.suitcases = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase) {
        if (this.totalWeight() + suitcase.totalWeight() <= maxWeight) {
            this.suitcases.add(suitcase);
        }
    }

    public void printItems() {
        for (Suitcase s : suitcases) {
            s.printItems();
        }
    }

    public String toString() {
        if (this.suitcases.isEmpty()) {
            return "no suitcases (0 kg)"; 
        }

        if (this.suitcases.size() == 1) {
            return "" + this.suitcases.size() + " suitcase (" + this.totalWeight() + " kg)";
        }

        return "" + this.suitcases.size() + " suitcases (" + this.totalWeight() + " kg)";
    }

    public int totalWeight() {
        int total = 0;

        for (Suitcase s : suitcases) {
            total += s.totalWeight();
        }

        return total;
    }
    
}
