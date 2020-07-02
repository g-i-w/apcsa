public class SleepTracker {

  private int healthyMin;
  private int healthyMax;
  private int totalNights;
  private int nightsUnder;
  private int nightsOver;


  public SleepTracker ( int min, int max ) {
    healthyMin = min;
    healthyMax = max;
    totalNights = 0;
    nightsUnder = 0;
    nightsOver = 0;
  }

  public void addHoursSlept( double sleep ) {
    totalNights++;
    if (sleep > healthyMax) nightsOver++;
    if (sleep < healthyMin) nightsUnder++;
  }

  public int totalNights () {
    return totalNights;
  }

  public double under () {
    if (totalNights == 0) return 0.0;
    return (double)nightsUnder / (double)totalNights;
  }

  public double over () {
    if (totalNights == 0) return 0.0;
    return (double)nightsOver / (double)totalNights;
  }

  public static void main(String[] args) {
    SleepTracker st = new SleepTracker( 8, 10 );
    // sleepfoundation.org recommends 8-10 hours of sleep for teens

    System.out.println( st.totalNights()+", "+st.under()+", "+st.over() );

    st.addHoursSlept( 8.5 );
    System.out.println( st.totalNights()+", "+st.under()+", "+st.over() );

    st.addHoursSlept( 4.0 );
    st.addHoursSlept( 4.5 );
    System.out.println( st.totalNights()+", "+st.under()+", "+st.over() );

    st.addHoursSlept( 10.1 );
    System.out.println( st.totalNights()+", "+st.under()+", "+st.over() );
  }

}
