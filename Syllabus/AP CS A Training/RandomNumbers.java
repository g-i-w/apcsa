import java.util.*;

public class RandomNumbers {
  public static void main (String[] args) {
    double num=0;
    Random generator = new Random();

    num = ((int)(Math.random()*6)+1);
    System.out.println("what is num? "+num);

  }
}
