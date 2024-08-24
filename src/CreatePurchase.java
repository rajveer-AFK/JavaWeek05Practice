import javax.swing.JOptionPane;

public class CreatePurchase {

	public static void main(String[] args) {
		
		// Gets the correct purchase invoice number (1000 - 8000) from the user 
		int purchaseInvoiceNumber = getValidInvoiceNumber();
		
		// Gets the correct purchase sale amount number (non negative) from the user
		double purchaseSaleAmount = getValidSaleAmount();
		
		// Creates a Purchase object using the users input for invoice number and sale amount
		Purchase userPurchase = createPurchaseObject(purchaseInvoiceNumber, purchaseSaleAmount);
		
		// Displays the the details of the purchase newPurchase
		userPurchase.display();
	}
	
	public static Purchase createPurchaseObject(int invoiceNumber, double saleAmount) {
		Purchase newPurchase = new Purchase();
		
		newPurchase.setInvoiceNumber(invoiceNumber);
		newPurchase.setSaleAmount(saleAmount);
		
		return newPurchase; 
	}
	
	public static int getValidInvoiceNumber() {
		int invoiceNumber = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the invoice number (1000 - 8000"));
		
		while(invoiceNumber < 1000 || invoiceNumber > 8000) {
			JOptionPane.showMessageDialog(null, "Invalid invoice number, enter again", "ERROR", 0);
			invoiceNumber = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the invoice number (1000 - 8000"));
		}
		
		return invoiceNumber;
	}
	
	public static double getValidSaleAmount() {
		double saleAmount = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the sale amount (non-negative number"));
		
		while(saleAmount < 0) {
			JOptionPane.showMessageDialog(null, "Invalid sale amount entered, enter again", "ERROR", 0);
			saleAmount = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the sale amount (non-negative number"));
		}
		
		return saleAmount;
	}
	
}
