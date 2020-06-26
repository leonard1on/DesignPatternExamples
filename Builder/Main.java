/**
 * Main
 */
public class Main {

  public static void main(String[] args) {
    MealDirector director = new MealDirector();
    SandwichMealBuilder builder = new SandwichMealBuilder();
    director.makeMeal(builder);
    System.out.println(builder.getMeal());
  }
}

class Meal {
  public String sandwich;
  public String sideOrder;
  public String drink;
  public String offer;
  public double price;

  public Meal() {
  };

  @Override
  public String toString() {
    return ("Meal: " + sandwich + " with " + sideOrder + " with " + drink + ". Offer: " + offer + ", price:" + price);
  }
}

class SandwichMealBuilder implements MealBuilder {
  private Meal meal = new Meal();

  public SandwichMealBuilder() {

  }

  @Override
  public void addSandwich(String pSandwich) {
    meal.sandwich = pSandwich;
  }

  @Override
  public void addSideOrder(String pSideOrder) {
    meal.sideOrder = pSideOrder;
  }

  @Override
  public void addDrink(String pDrink) {
    meal.drink = pDrink;
  }

  @Override
  public void addOffer(String pOffer) {
    meal.offer = pOffer;
  }

  @Override
  public void addPrice(double pPrice) {
    meal.price = pPrice;
  }

  @Override
  public Meal getMeal() {
    return meal;
  }
}

interface MealBuilder {
  public void addSandwich(String pSandwich);

  public void addSideOrder(String pSideOrder);

  public void addDrink(String pDrink);

  public void addOffer(String pOffer);

  public void addPrice(double pPrice);

  public Meal getMeal();
}

class MealDirector {
  MealDirector() {

  }

  public void makeMeal(MealBuilder meal) {
    meal.addSandwich("Italian BMT");

    meal.addSideOrder("French Fries");

    meal.addDrink("Coke");

    meal.addOffer("Extra Straw");

    meal.addPrice(2.45);

    meal.getMeal();
  }
}