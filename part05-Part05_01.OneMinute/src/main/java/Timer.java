

public class Timer {
    private ClockHand second;
    private ClockHand hundredthOfSecond;
    
    public Timer() {
        this.second = new ClockHand(60);
        this.hundredthOfSecond = new ClockHand(100);
    }

    public void advance () {
        this.hundredthOfSecond.advance();

        if (this.hundredthOfSecond.value() == 0) {
            this.second.advance();
        }
    }

    public String toString() {
        return "" + this.second.toString() + ":" + this.hundredthOfSecond.toString() + "";
    }
}