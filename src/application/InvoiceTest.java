package application;

import java.util.Locale;

import model.entities.Invoice;

public class InvoiceTest {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Invoice myInvoice = new Invoice("2076352178", "PC ULTRA-X400", 6, 1250.00);
		System.out.println("Initial invoice test:");
		System.out.println("Number: " + myInvoice.getNumber());
		System.out.println("Description: " + myInvoice.getDescription());
		System.out.println("Item quantity: " + myInvoice.getItemQuantity());
		System.out.println("Item price: " + myInvoice.getItemPrice());
		System.out.printf("Invoice amount: $%.2f%n", myInvoice.getInvoiceAmount());
		
		System.out.println();

		myInvoice.setNumber("8035275189");
		myInvoice.setDescription("Smartphone BrightStars-IV");
		myInvoice.setItemQuantity(19);
		myInvoice.setItemPrice(630.00);
		System.out.println("Invoice test after setting new values:");
		System.out.println("Number: " + myInvoice.getNumber());
		System.out.println("Description: " + myInvoice.getDescription());
		System.out.println("Item quantity: " + myInvoice.getItemQuantity());
		System.out.println("Item price: " + myInvoice.getItemPrice());
		System.out.printf("Invoice amount: $%.2f%n", myInvoice.getInvoiceAmount());
	}

}
