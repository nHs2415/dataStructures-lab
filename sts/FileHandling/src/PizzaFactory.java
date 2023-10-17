abstract class PizzaFactory {
    public abstract void prepare();
    public abstract void pack();
}

class Ingredient{
    private String name;
    private double ingredient_price;

    public Ingredient(String name,double ingredient_price) {
        this.name = name;
        this.ingredient_price=ingredient_price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getIngredient_price() {
        return ingredient_price;
    }

    public void setIngredient_price(double ingredient_price) {
        this.ingredient_price = ingredient_price;
    }


}

class Pizza extends PizzaFactory{
    private String topping;
    private String pizzaSize;
    private double price;

    public Pizza(String topping, String pizzaSize, double price) {
        this.topping = topping;
        this.pizzaSize = pizzaSize;
        this.price = price;
    }

    public String getTopping() {
        return topping;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }

    public String getPizzaSize() {
        return pizzaSize;
    }

    public void setPizzaSize(String pizzaSize) {
        this.pizzaSize = pizzaSize;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void prepare() {
        System.out.println("preparing your order");
    }

    @Override
    public void pack() {
        System.out.println("order is ready");
    }
    public String createTopping(String ingredient1,String ingredient2){
        return this.topping=ingredient1.concat(ingredient2);
    }
    public double calculateTotalPrice(Ingredient[] ingredient,String topping,String pizzaSize){

        return 0;
    }
    public void displayOrderDetails(String name){

    }
}

class CheesePizza extends Pizza{
    public CheesePizza( String pizzaSize, double price) {
        super("Cheese", pizzaSize, price);
    }

    @Override
    public String createTopping(String ingredient1, String ingredient2) {
        return super.createTopping(ingredient1, ingredient2);
    }

    @Override
    public double calculateTotalPrice(Ingredient[] ingredient, String topping, String pizzaSize) {
        return super.calculateTotalPrice(ingredient, topping, pizzaSize);
    }

    @Override
    public void displayOrderDetails(String name) {
        super.displayOrderDetails(name);
    }
}

class VeggiePizza extends Pizza{
    public VeggiePizza(String topping, String pizzaSize, double price) {
        super("Veggie", pizzaSize, price);
    }

    @Override
    public String createTopping(String ingredient1, String ingredient2) {
        return super.createTopping(ingredient1, ingredient2);
    }

    @Override
    public double calculateTotalPrice(Ingredient[] ingredient, String topping, String pizzaSize) {
        return super.calculateTotalPrice(ingredient, topping, pizzaSize);
    }

    @Override
    public void displayOrderDetails(String name) {

        super.displayOrderDetails(name);
    }
}

class ChickenPizza extends Pizza{
    public ChickenPizza(String topping, String pizzaSize, double price) {

        super("Chicken", pizzaSize, price);
    }

    @Override
    public String createTopping(String ingredient1, String ingredient2) {
        return super.createTopping(ingredient1, ingredient2);
    }

    @Override
    public double calculateTotalPrice(Ingredient[] ingredient, String topping, String pizzaSize) {
        return super.calculateTotalPrice(ingredient, topping, pizzaSize);
    }

    @Override
    public void displayOrderDetails(String name) {

        super.displayOrderDetails(name);
    }
}

class Driver{
    public static void main(String[] args) {

    }
}


