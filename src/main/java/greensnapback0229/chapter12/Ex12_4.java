package greensnapback0229.chapter12;

import java.util.ArrayList;

class Fruit2 { public String toString() {return "Fruit";} }
class Apple2 extends Fruit2 { public String toString() {return "Apple"; }}
class Grape2 extends Fruit2 { public String toString() {return "Grape"; }}

class Juice{
	String name;
	Juice(String name)		 { this.name = name + "Juice"; }
	public String toString() { return name; }
}

class Juicer{
	static Juice makeJuice(FruitBox2<? extends Fruit2> box){
		String tmp = "";

		for(Fruit2 f : box.getList())
			tmp += f + " ";
		return new Juice(tmp);

	}
}
class FruitBox2<T extends Fruit2> extends Box2<T> {}

class Box2<T> {
	ArrayList<T> list = new ArrayList<T>();
	void add(T item) { list.add(item);	}
	T get(int i){ return list.get(i);}

	ArrayList<T> getList() {return list;}
	int size() {return list.size();}
	public String toString(){
		return list.toString();
	}
}
public class Ex12_4 {
	public void run(){
		FruitBox2<Fruit2> fruitBox2 = new FruitBox2<Fruit2>();
		FruitBox2<Apple2> appleBox = new FruitBox2<Apple2>();

		fruitBox2.add(new Apple2());
		fruitBox2.add(new Grape2());
		appleBox.add(new Apple2());
		appleBox.add(new Apple2());

		System.out.println(Juicer.makeJuice(fruitBox2));
		System.out.println(Juicer.makeJuice(appleBox));
	}
}
