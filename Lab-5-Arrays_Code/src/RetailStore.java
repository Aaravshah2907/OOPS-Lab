public class RetailStore {
	
	private int []itemId = {1001, 1002, 1003, 1004, 1005};
	private double []Price = {13.50, 18, 19.5, 25.5, 12.6};
	
	private double computePrice(int Value) {
		int index = 0;
		for (; index < itemId.length; index++) {
            if (itemId[index] == Value) break;
        }
		return Price[index];
	}
	
	private double totalPrice() {
		double sum = 0.0;
		for( double itemPrice : Price) {
			sum += itemPrice;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		RetailStore retailOne = new RetailStore(); 
		System.out.println("Price of item ID 1002 is " + retailOne.computePrice(1003)); 
		System.out.println("Price of item ID 1004 is " + retailOne.computePrice(1004)); 
		System.out.println("Total price of all items is " + retailOne.totalPrice()); 
	}

}
