public class Bird {
    String name;
    String latinName;
    private int observations;

    public Bird (String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
        this.observations = 0;
    }


    public String getName () {
        return this.name;
    }

    public String getLatinName () {
        return this.latinName;
    }

    public int getObservations () {
        return this.observations;
    }

    public String toString () {
        return "" + this.name + " (" + this.latinName + "): " + this.observations + " observations";
    }

    public void increaseObservations() {
        this.observations++;
    }
}
