
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared) {
        //int area = rooms * squares;
        if (this.squares > compared.squares) {
            return true;
        }

        return false;
    }

    public int priceDifference(Apartment compared) {
        int ownTotalPrice = this.squares * this.princePerSquare;
        int comparedTotalPrice = compared.squares * compared.princePerSquare;
        return Math.abs(ownTotalPrice - comparedTotalPrice);
    }

    public boolean moreExpensiveThan(Apartment compared) {
        int ownTotalPrice = this.squares * this.princePerSquare;
        int comparedTotalPrice = compared.squares * compared.princePerSquare;
        
        if (ownTotalPrice >comparedTotalPrice) {
            return true;
        }

        return false;
    }

}
