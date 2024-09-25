import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> items;
    private int maxWeight;

    public Suitcase(int maxWeight) {
        this.items = new ArrayList<>();
        this.maxWeight = maxWeight;
    }

    public void addItem(Item item) {
        if (this.totalWeight() + item.getWeight() <= maxWeight) {
            this.items.add(item);
        }
    }

    public int totalWeight () {
        int total = 0;

        for (Item i : items) {
            total += i.getWeight();
        }

        return total;
    }

    public Item heaviestItem () {
        if (this.items.isEmpty()) {
            return null;
        }

        Item it = this.items.get(0);

        for (Item i : items) {
            if (i.getWeight() > it.getWeight()) {
                it = i;
            }
        }

        return it;
    }

    public void printItems () {
        for (Item i : items) {
            System.out.println(i);
        }
    }

    public String toString() {
        if (this.items.isEmpty()) {
            return "no items (0 kg)"; 
        }

        if (this.items.size() == 1) {
            return "" + this.items.size() + " item (" + this.totalWeight() + " kg)";
        }

        return "" + this.items.size() + " items (" + this.totalWeight() + " kg)";
    }
}
