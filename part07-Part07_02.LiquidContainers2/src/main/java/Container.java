public class Container {
    private int containedAmount;

    public Container () {
        this.containedAmount = 0;
    }

    public int contains() {
        return this.containedAmount;
    }

    public void add(int amount) {
        if (amount < 0) {
            return;
        }

        if (this.containedAmount + amount > 100) {
            this.containedAmount = 100;
        } else {
            this.containedAmount += amount;
        }
    }

    public void remove(int amount) {
        if (amount < 0) {
            return;
        }

        if (this.containedAmount - amount < 0) {
            this.containedAmount = 0;
        } else {
            this.containedAmount -= amount;
        }
    }

    public String toString() {
        return "" + this.containedAmount + "/100";
    }

}
