public class Filter {

  private NumberList noisyNumbers;
  private NumberList smoothedNumbers;

  public Filter ( String filePath ) {

    noisyNumbers = new NumberList();
    smoothedNumbers = new NumberList();

    noisyNumbers.read( filePath );

  }


  public void movingAverage ( int length ) {
    
  }



}
