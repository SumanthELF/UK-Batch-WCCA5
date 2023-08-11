package objectClassConcept;

public class Fruit {

	String name;
	String taste;
	double price;
	double weight;
	
	public Fruit(String name, String taste, double price, double weight) {
		this.name = name;
		this.taste = taste;
		this.price = price;
		this.weight = weight;
	}	
	
	@Override
	public String toString() {
		return "FruitName :"+ this.name +", Fruit price :"+ this.price +", Fruit taste :"+ this.taste +", Weight :"+this.weight;
	}

}
