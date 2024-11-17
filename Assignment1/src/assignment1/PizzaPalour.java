package assignment1;

public class PizzaPalour {

	public static void main(String[]args) {
		PizzaMaker C1 = new PizzaMaker();
		PizzaMaker C2 = new PizzaMaker();
		PizzaMaker C3 = new PizzaMaker();
		
		C1.createPizza(new NeapolitanStyle(), new ThickCrust(), new Tomato(), new Meat());
		C2.createPizza(new NewYorkStyle(), new ThinCrust(), new Alfredo(), new Pepperoni());
		C3.createPizza(new SicilianStyle(), new ThickCrust(), new BBQ(), new Veggie());
	}
}
