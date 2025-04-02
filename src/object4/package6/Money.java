package object4.package6;

public class Money implements Cloneable{
    private double amount = 1000;

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public Money clone() throws CloneNotSupportedException {
        return (Money) super.clone();
    }
}
