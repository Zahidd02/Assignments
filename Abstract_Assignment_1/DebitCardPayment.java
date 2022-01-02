package Abstract_Assignment_1;

public class DebitCardPayment extends Payment {
    private static int counter;
    private double discountPercentage;
    static {
        counter = 1000;
    }

    public DebitCardPayment(int customerId) {
        super(customerId);
        counter++;
        super.setPaymentId("D" + "" + DebitCardPayment.counter);
    }

    public int getCounter() {
        return DebitCardPayment.counter;
    }

    public void setCounter(int counter) {
        DebitCardPayment.counter = counter;
    }

    public double getDiscountPercentage() {
        return this.discountPercentage;
    }

    public void setDiscountPercentage(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    public double payBill(double amount) {
        double finalBillAmount = 0;
        if(amount <= 500) {
            super.setServiceTaxPercentage(2.5);
            this.setDiscountPercentage(1);
        }
        else if(amount > 500 && amount <= 1000) {
            super.setServiceTaxPercentage(4);
            this.setDiscountPercentage(2);
        }
        else if(amount > 1000) {
            super.setServiceTaxPercentage(5);
            this.setDiscountPercentage(3);
        }

        finalBillAmount = amount + (super.getServiceTaxPercentage() * amount / 100) - (this.getDiscountPercentage() * amount / 100); 
        return finalBillAmount;
    }
}
