import java.util.ArrayList;

public class BirdManager {
    private ArrayList<Bird> birds;

    public BirdManager () {
        this.birds = new ArrayList<>();
    }

    public void add (Bird bird) {
        this.birds.add(bird);
    }

    public void handleObservation (String birdName) {
        for (Bird b : this.birds) {
            if (b.getName().equals(birdName)) {
                b.increaseObservations();
                break;
            } else {
                System.out.println("Not a bird!");
            }
        }
    }

    public void printBirds() {
        for (Bird b : this.birds) {
            System.out.println(b);
        }
    } 

    public void printOneBird(String birdName) {
        for (Bird b : this.birds) {
            if (b.getName().equals(birdName)) {
                System.out.println(b);
                break;
            }
        }
    }


}
