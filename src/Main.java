import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
  public static void main(String[] args){
    Main main = new Main();
    main.run();
  }

  public void run(){
    Marsvin marsvin = new Marsvin();
    marsvin.printToFile();
    marsvin.makeMarsvin();
    marsvin.getMarsvinPrint();
    System.out.println(marsvin.gramFoderTotal());
    System.out.println("\n");
    for (int i = 0; i <= marsvin.marsvin.size() - 1; i++) {
      System.out.println(marsvin.marsvin.get(i).name + " " + marsvin.marsvin.get(i).race + " " + marsvin.marsvin.get(i).foderIGram);
    }
    Collections.sort(marsvin.marsvin);
    System.out.println("\n");
    for (int i = 0; i <= marsvin.marsvin.size() - 1; i++) {
      System.out.println(marsvin.marsvin.get(i).name + " " + marsvin.marsvin.get(i).race + " " + marsvin.marsvin.get(i).foderIGram);
    }


  }

}
