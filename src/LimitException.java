public class LimitException extends Exception {
    public LimitException(String message, double remainingAmount) {
        super();


    }   private double remainingAmount;

    public double getRemainingAmount() {
        return remainingAmount;
    }
}