class Main {

  public static void main(String[] args) {
    System.out.println(CarFactory.buildCar(CarType.SMALL));
    System.out.println(CarFactory.buildCar(CarType.LUXURY));
    System.out.println(CarFactory.buildCar(CarType.SEDAN));

  }

}

abstract class Car {
  private CarType model;

  Car(CarType model) {
    this.model = model;
  }

  public CarType getModel() {
    return this.model;
  }

  public void setModel(CarType model) {
    this.model = model;
  }

}

class CarFactory {

  public static Car buildCar(CarType model) {
    Car car = null;
    switch (model) {
      case SMALL:
        car = new SmallCar();
        break;

      case SEDAN:
        car = new SedanCar();
        break;

      case LUXURY:
        car = new LuxuryCar();
        break;

      default:
        break;
    }
    return car;
  }
}

enum CarType {
  SMALL, SEDAN, LUXURY;
}

class SmallCar extends Car {

  public SmallCar() {
    super(CarType.SMALL);
    construct();
  }

  public void construct() {
    System.out.println("Building Small Car");
  }
}

class SedanCar extends Car {

  SedanCar() {
    super(CarType.SEDAN);
    construct();
  }

  public void construct() {
    System.out.println("Building Sedan Car");
  }

}

class LuxuryCar extends Car {

  public LuxuryCar() {
    super(CarType.LUXURY);
    construct();
  }

  public void construct() {
    System.out.println("Building Luxury Car");
  }

}
