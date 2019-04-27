
public class CatAdapter implements Dog{
	Cat newCat;
	public CatAdapter(Cat cat) {
		newCat = cat;
	}
	
	public void bark() {
		newCat.meow();
	}
	
	public void eat() {
		newCat.cateat();
	}
	
}
