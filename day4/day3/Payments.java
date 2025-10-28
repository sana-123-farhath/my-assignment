package week3.day3;

public interface Payments {
	
	    void cashOnDelivery();
	    void upiPayments();
	    void cardPayments();
	    void internetBanking();
	}
abstract class CanaraBank implements Payments {

    void recordPaymentDetails(String paymentType) {
        System.out.println("Recording payment details for: " + paymentType);
    }
}
class Amazon extends CanaraBank {

    @Override
    public void cashOnDelivery() {
        recordPaymentDetails("Cash on Delivery");
        System.out.println("Payment will be collected at delivery.");
    }

    @Override
    public void upiPayments() {
        recordPaymentDetails("UPI Payment");
        System.out.println("Payment done via UPI.");
    }

    @Override
	void recordPaymentDetails(String paymentType) {
		// TODO Auto-generated method stub
		super.recordPaymentDetails(paymentType);
	}

	@Override
    public void cardPayments() {
        recordPaymentDetails("Card Payment");
        System.out.println("Payment processed using credit/debit card.");
    }

    @Override
    public void internetBanking() {
        recordPaymentDetails("Internet Banking");
        System.out.println("Payment completed using internet banking.");
    }



    public static void main(String[] args) {
        Amazon order = new Amazon();

        order.cashOnDelivery();
        order.upiPayments();
        order.cardPayments();
        order.internetBanking();
    }
}
