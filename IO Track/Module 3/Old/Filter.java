public class Filter {

  // instance variables
  private NumberList noisyNumbers;
  private NumberList smoothedNumbers;
  private ArrayList<Double> listToAverage;


  // constructor
  public Filter ( String filePath ) {
    // create new objects for noisyNumbers and smoothedNumbers
    noisyNumbers = new NumberList();
    smoothedNumbers = new NumberList();
    // read a file containing numbers into the noisyNumbers object
    noisyNumbers.read( filePath );
    // the smoothedNumbers object is still empty!
    // create a new object for listToAverage;
    listToAverage = new ArrayList<Double>();
  }


  // calculate the average value of the Doubles in listToAverage
  private Double calculateAverage () {
    double averageValue;
    if (listToAverage.size() > 0) {
      for (Double d : listToAverage) {
        averageValue += d.doubleValue();
      }
      averageValue /= listToAverage.size();
    } else {
      averageValue = 0.0;
    }
    return new Double( averageValue );
  }


  public void movingAverage ( int howManyToAverage ) {
    while (noisyNumbers.numbersAvailable()) {
      Double noisyDouble = noisyNumbers.nextNumber().toDouble();
      averageList.add( noisyDouble );
      if (averageList.size() > howManyToAverage) {
        // if the size of averageList is greater than howManyToAverage,
        // then remove the first index.
        averageList.remove(0);
      }
      // now add the average value
    }
  }

  public void movingAverage



}
