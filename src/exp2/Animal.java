package exp2;

public class Animal {
	public String name;
	public String food;
	public void Animalaction() {
		System.out.println("名字"+name);
		System.out.println("可以睡");
		System.out.println("可以吃"+food);
	}
	Animal(String newName,String newFood){
		this.name=newName;
		this.food=newFood;
	}
	
}
