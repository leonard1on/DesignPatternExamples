/**
 * Singleton
 */
class Main {
  public static void main(String[] args) {
    EagerSingleton singleton = EagerSingleton.getInstance();
    System.out.println(5 + singleton.x);
  }

}

class EagerSingleton {
  private static final EagerSingleton instance = new EagerSingleton();
  public int x = 2;

  private EagerSingleton() {

  }

  public static EagerSingleton getInstance() {
    return instance;
  }
}