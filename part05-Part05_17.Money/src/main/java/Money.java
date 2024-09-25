
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public Money plus(Money addition) {
        Money res = new Money(this.euros + addition.euros, this.cents + addition.cents);

        return res;
    }

    public Money minus(Money decreaser) {
        //if the result of this.cents - decreaser.cents, it also returns a new money value with the 
        //euro value decreased and the correct cents 
        if (this.cents - decreaser.cents < 0) {
            Money newMoney = new Money(this.euros - decreaser.euros - 1, 100 - decreaser.cents);
            return newMoney;
        } //otherwise it does a straightforward acalculation
        else {
            Money newMoney = new Money(this.euros - decreaser.euros, this.cents - decreaser.cents);
            //if the new euro amount is negative ,it returns a Money object with the value of 0
            if (newMoney.euros < 0) {
                newMoney = new Money(0, 0);
            }
            //otherwise it returns the first result
            return newMoney;
        }
    }

    public boolean lessThan(Money compared) {
        if (this.euros < compared.euros) {
            return true;
        }

        if (this.euros == compared.euros && this.cents < compared.cents) {
            return true;
        }

        return false;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
