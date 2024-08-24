
public class Purchase {
	
	private int invoiceNumber;
	private double saleAmount;
	private double salesTaxAmount;
	
	public void setInvoiceNumber(int invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}
	
	public void setSaleAmount(double saleAmount) {
		this.saleAmount = saleAmount;
		salesTaxAmount = saleAmount * 0.05;
	}
	
	public void display() {
		System.out.println("Invoice Number: " + invoiceNumber +
						   "\nSale Amount: $" + saleAmount +
						   "\nSales Tax Amount: $" + salesTaxAmount);
		
	}
	
}
