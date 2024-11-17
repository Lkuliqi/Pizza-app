package assignment1;

public class PizzaMaker {
	public void createPizza (PizzaType type, Dough dough, Sauce sauce, Toppings topping) {
		System.out.println("Order taken " + type.getName() + " With " + dough.getName() + " with " + sauce.getName() + " with " + topping.getName() + ".");
	}
}
