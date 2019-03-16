package exp1;

public abstract class Drink {
	public abstract String taste();
	int Coffee=1;
	int Beer=2;
	int Milk=3;
	int DrinkType;
	Drink(){
	}
	Drink (int newDrinkType){
	DrinkType=newDrinkType;
			}
		
	static Drink getDrink(int DrinkType) {
		switch(DrinkType) {
		case 1:
			return new Coffee();
		case 2:
			return new Beer();
		case 3:
			return new Milk();
		}
		return null;
	
	}

}
