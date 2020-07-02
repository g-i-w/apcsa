public class WordStat {

  private String word;
  private ArrayList<Integer> points;

  public WordStat( String w ) {
    count = 0;
    word = w;
    points = new ArrayList<Integer>();
  }

  public int mark( int position ) {
    points.add( new Integer(position) );
    return points.size();
  }

  public count() {
    return count;
  }

  public ArrayList<Integer> points() {
    return points;
  }

}
