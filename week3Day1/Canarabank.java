package week3Day1;

public abstract class Canarabank implements Payments {
	void recordPaymentDetails(String paymentType, double Amount) {
		
		
		System.out.println("paymentType : " + paymentType );
		System.out.println("Amount :" + Amount );
		System.out.println("PAYMENT SUCCESSFULLY PAID");
}
}
