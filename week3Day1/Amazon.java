package week3Day1;

public class Amazon extends Canarabank {

	
	@Override
	public void upipayment() {
		// TODO Auto-generated method stub
		System.out.println("UPIpayemnts");
		recordPaymentDetails("Gpay",700.0);
	}
	
	@Override
	public void cardpayments() {
		// TODO Auto-generated method stub
		System.out.println("Card Payments");
		recordPaymentDetails("Citicard",1000.0);
	}
	@Override
	public void interbanking() {
		// TODO Auto-generated method stub
		System.out.println("Internet Banking");
		recordPaymentDetails("IOB Card",2000.0);
	}
	@Override
	public void cashondelivery() {
		// TODO Auto-generated method stub
		System.out.println("Cashon Delivery");
		recordPaymentDetails("CashOnDelivery",500.0);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Amazon Canarabank = new Amazon();
Canarabank.cardpayments();
Canarabank.cashondelivery();
Canarabank.interbanking();
Canarabank.upipayment();
	}
}
