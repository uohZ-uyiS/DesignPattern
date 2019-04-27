import java.util.LinkedList;
import java.util.List;

public class TestDriver {
	public static void main(String[] args) {
		Akita akita = new Akita();
		Cat cat = new Cat();
		Dog catAdapter = new CatAdapter(cat);
		
		List<Dog> dogs = new LinkedList<Dog>();
		dogs.add(akita);
		dogs.add(catAdapter);
		
		for(Dog d : dogs) {
			System.out.println("Hello World");
			d.bark();
			d.eat();
		}
		
	}
}
