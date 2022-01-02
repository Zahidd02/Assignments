package Abstract_Assignment_1;

public class CreditCardPayment extends Payment {
    private static int counter;
    static {
        counter = 1000;
    }

    public CreditCardPayment(int customerId) {
        super(customerId);
        counter++;
        super.setPaymentId("C" + "" + counter);

    }

    public int getCounter() {
        return CreditCardPayment.counter;
    }

    public void setCounter(int counter) {
        CreditCardPayment.counter = counter;
    }

    public double payBill(double amount) {
        double finalBillAmount = 0;
        if(amount <= 500) {
            super.setServiceTaxPercentage(3);
        }
        else if(amount > 500 && amount <= 1000) {
            super.setServiceTaxPercentage(5);
        }
        else if(amount > 1000) {
            super.setServiceTaxPercentage(6);
        }

        finalBillAmount = amount + (super.getServiceTaxPercentage() * amount / 100); 
        return finalBillAmount; 
    }
    
}
