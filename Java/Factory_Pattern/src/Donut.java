import java.util.ArrayList;
import java.util.Arrays;

public abstract class Donut {
	private String customerName;
	private String donutName;
	private String flavor;
	private ArrayList<String> dough ;
	
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getDonutName() {
		return donutName;
	}
	public void setDonutName(String doutName) {
		this.donutName = doutName;
	}
	public String getDough() {
		return Arrays.toString(dough.toArray());
	}
	public void setDough(String doughStr) {
		this.dough = new ArrayList<String>(Arrays.asList(doughStr.split(",")));
	}
	public String getFlavor() {
		return flavor;
	}
	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}
	
	public void prepare() {
		System.out.println("--------Preapring " + donutName + "--------");
	}
	public void bake() {
		System.out.println("--------Baking " + donutName + "--------");
	}
	public void pakage() {
		System.out.println("--------Packaging " + donutName + "--------");
	}
	public void showRecipe() {
		//StringBuffer guarantee thread-safety
		StringBuffer Recipe = new StringBuffer();
		//Recipe.append("-------Recipe of " + this.getDonutName() + "------- for " + this.getCustomerName()+"-------\n");
		Recipe.append("---------Recipe of " + donutName + "-------for " + customerName+"--------\n");
		for(int i = 0; i < dough.size(); i++) {
			Recipe.append("------------Dough Type: " + (String)dough.get(i) + "\n");
		}
		Recipe.append("------------Donut Flavor: " +flavor + "--------");
		System.out.println(Recipe);
	}

}
