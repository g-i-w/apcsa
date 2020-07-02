import java.util.*;

public class MovingAverage {

  int size;
  private ArrayList<StringContainer> points = new ArrayList<>();

  public MovingAverage (int s) {
    size = s;
  }

  public void shift (StringContainer sc) {
    points.add( sc );
    if ( points.size() > size ) points.remove(0);
  }

  public boolean shift () {
    if ( points.size() > 0 ) {
      points.remove(0);
      return true;
    }
    return false;
  }

  public double average () {
    double sum = 0;
    for ( StringContainer s : points ) {
      sum += s.getDouble();
    }
    return sum/size;
  }

}
