public class Item {
    private String id;
    private String name;

    public Item (String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return "" + id + ": " + name;
    }

    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }

        if (!(compared instanceof Item)) {
            return false;
        }

        Item comparItem = (Item) compared;

        if (this.id.equals(comparItem.id)) {
            return true;
        }

        return false;
    }
}
