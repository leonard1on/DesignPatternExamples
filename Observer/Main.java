import java.util.ArrayList;

class Main {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    HeadHunter mariano = new HeadHunter();
    mariano.registerObserver(new JobSeeker("Leo"));
    mariano.registerObserver(new JobSeeker("Pedro"));
    mariano.registerObserver(new JobSeeker("Josue"));
    mariano.registerObserver(new JobSeeker("El Venado"));
    mariano.registerObserver(new JobSeeker("Manolo"));
    mariano.addJob("Plomero");
    mariano.addJob("Taxista");
    mariano.addJob("CEO de Google");
  }

}

interface Observer {
  public void update(Subject s);
}

interface Subject {
  public void registerObserver(Observer ob);

  public void removeObserver(Observer ob);

  public void notifyAllObservers();
}

class HeadHunter implements Subject {
  private ArrayList<String> jobs;
  private ArrayList<Observer> userList;

  public HeadHunter() {
    jobs = new ArrayList<String>();
    userList = new ArrayList<Observer>();
  }

  @Override
  public void registerObserver(Observer ob) {
    // throw new UnsupportedOperationException("Not supported yet."); //To change
    // body of generated methods, choose Tools | Templates.
    userList.add(ob);
  }

  @Override
  public void removeObserver(Observer ob) {
    // throw new UnsupportedOperationException("Not supported yet."); //To change
    // body of generated methods, choose Tools | Templates.
    userList.remove(ob);
  }

  @Override
  public void notifyAllObservers() {
    // throw new UnsupportedOperationException("Not supported yet."); //To change
    // body of generated methods, choose Tools | Templates.
    for (Observer ob : userList) {
      ob.update(this);
    }
  }

  public void addJob(String job) {
    this.jobs.add(job);
    notifyAllObservers();
  }

  public ArrayList<String> getJobs() {
    return this.jobs;
  }

  @Override
  public String toString() {
    return jobs.toString();
  }

}

class JobSeeker implements Observer {
  private String name;

  public JobSeeker(String name) {
    this.name = name;
  }

  @Override
  public void update(Subject s) {
    // throw new UnsupportedOperationException("Not supported yet."); //To change
    // body of generated methods, choose Tools | Templates.
    System.out.println(this.name + " fue notificado");
    System.out.println(s);
  }

}
