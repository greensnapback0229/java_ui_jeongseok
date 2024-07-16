package greensnapback0229.chapter12;

import java.util.ArrayList;
import java.util.List;

class Product{}
class Tv extends Product{}
class Audio extends Product{}
public class Ex12_1 {
	public void run(){
		ArrayList<Product> productList = new ArrayList<Product>();
		ArrayList<Tv> tvList = new ArrayList<Tv>();
		//ArrayList<Product> tvList = new ArrayList<Tv>();	//error!
		//List<Tv> tvList = new ArrayList<Tv>();  			//OK 다형성


		productList.add(new Tv());
		productList.add(new Audio());

		tvList.add(new Tv());
		tvList.add(new Tv());

		printAll(productList);

 	}

	 public void printAll(ArrayList<Product> list){
		for(Product p : list)
			System.out.println(p);
	 }
}

