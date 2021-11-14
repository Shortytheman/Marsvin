import java.io.*;
import java.util.*;

public class Marsvin implements Comparable<Marsvin> {
  String name;
  String race;
  int foderIGram;

  final private String FILENAME = "marsvin.txt";
  ArrayList<Marsvin> marsvin = new ArrayList<>();

  public ArrayList<Marsvin> getMarsvin() {
    return marsvin;
  }

  public Marsvin(String name, String race, int foderIGram) {
    this.name = name;
    this.race = race;
    this.foderIGram = foderIGram;
  }

  public Marsvin() {

  }

  public void getMarsvinPrint() {
    for (int i = 0; i <= marsvin.size() - 1; i++) {
      System.out.println("Navn: " + marsvin.get(i).name + "  Race: "
          + marsvin.get(i).race + "  Foder i gram: " + marsvin.get(i).foderIGram);
    }
  }

  public PrintStream getPrint() throws IOException {
    PrintStream print = new PrintStream(FILENAME);
    return print;
  }

  public void printToFile() {
    try {
      getPrint().println("Pjuske Roset 30 Putte Glathåret 55 Lunte Roset 36 Tuftuf Roset 38 Bamse Angora 60");
    } catch (IOException exception) {
      System.out.println("Doesn't work brah");
    }
  }

  public int gramFoderTotal() {
    int gramFoderIAlt = 0;
    System.out.print("\nFoder i alt i gram: ");
    for (int i = 0; i <= marsvin.size() - 1; i++) {
      gramFoderIAlt += marsvin.get(i).foderIGram;
    }
    return gramFoderIAlt;
  }


  public void makeMarsvin() {
    try {
      Scanner scanner = new Scanner(new File(FILENAME));
      while (scanner.hasNext()) {
        String name = scanner.next();
        String race = scanner.next();
        int foderIGram = scanner.nextInt();
        marsvin.add(new Marsvin(name, race, foderIGram));
      }
    } catch (IOException exception) {
      System.out.println("Doesn't work brah");
    }
  }
  public String getName(){
    return this.name;
  }

  public int getFoderIGram(){
    return this.foderIGram;
  }

  @Override
  public int compareTo(Marsvin o) {
    return Integer.compare(this.getFoderIGram(),o.getFoderIGram());
  }
}