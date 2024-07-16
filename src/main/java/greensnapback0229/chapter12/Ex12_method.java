package greensnapback0229.chapter12;

class FoodBox{
	Food food;
	public static <T extends Food> void printName(T food){
		System.out.println(food.getName() + " box");
	}
}

class Japanese implements Food{
	@Override
	public String getName() {	return "Japanese food"; 	}
}

class Korea implements Food{
	@Override
	public String getName() {	return "Korean food";	}
}
interface Food{
	public String getName();
}
public class Ex12_method {
	public void run(){
		Food food = new Korea();
		Japanese japaneseFood = new Japanese();
		Korea koreaFood = new Korea();

		FoodBox.printName(food);
		FoodBox.printName(japaneseFood);
		FoodBox.printName(koreaFood);
	}

}
