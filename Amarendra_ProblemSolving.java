public class Fruit{
	private String name;
	private String FId;
	private double price;
	
	//getters-setters
}

public class StockMgt{
	 List<Fruit>> totalItem = new ArrayList<Fruit>();
	
	public void addFruit(Fruit fruit){
		if(
	totalItem.add(fruit);	
	}
	
	public Fruit removeFruit(List<Fruit> fruits){
		totalItem.remove(fruits);
	}
	 public void displayStock(){
		 System.out.print("Available fruits:"+totalItem);
	 }
	 
	 public List<Fruit> availableStock(){
		 return totalItem;
	 }
}

public class FruitCart{
	
StockMgt stock =  new StckMgt();
//

List<Fruit> selectedFruits = new ArrayList<Fruit>();

List<Fruit> fruits = stock.availableStock();
public void addFruitFruitToCart(String selectname){
for(Fruit fruit:fruits){
	if(fruit.getName.equals(selectname){
		selectedFruits.add(fruit);
	}
}

stock.removeFruit(selectedFruits);
}
//show the cartitems

for(Fruit fruit:selectedFruits){
	System.out.println("Fruits are in the cart:"+fruit);
}

public void removeFromCart(List<Fruit> fruits){
selectedFruits.removeAll(fruits);
stock.addAll(fruits);
}
 public double totalAmount(List<Fruit> fruits){
	 double totalamout =0;
	 for(Fruit fruit:fruits){
		 totalamout = totalamout + fruit.getPrice();
	 }
	 return totalamout;
 }

}

Features file

Scenario: Add Fruits to Stock 
Given:
List of fruits
When: 
Add fruit method called 


Scenarion:
Adding fruits into cart
Given
Stock is availe to selectedFruits 
When
Add fruit is called
Then
Fruit get added into cart Successfully.


public class StockFeare{
	
	@Given("Stock is availe to selectedFruits")
	public void stockisAvaibletoSelectedFruit()
}


