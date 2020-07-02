public class PracticeArrays2D {

  private int[] intArray1D;
  private int[][] intArray2D;

  private SimpleClass[] objectArray1D;
  private SimpleClass[][] objectArray2D;


  // Example of full initialization.
  // Always done on AP Exam!
  public PracticeArrays2D ( int a, int b ) {

    // Each index will be 0
    intArray1D = new int[a];

    // Each index will be null
    objectArray1D = new SimpleClass[a];

    // Each first-level index contains int[]
    // Each second-level index will be 0
    intArray2D = new int[a][b];

    // Each first-level index contains SimpleClass[]
    // Each second-level index will be null
    objectArray2D = new SimpleClass[a][b];

  }


  // Example of delayed initialization
  public PracticeArrays2D ( int a ) {

    // Each index will be 0
    intArray1D = new int[a];

    // Each index will be null
    objectArray1D = new SimpleClass[a];


    // Second-level index initialization can be delayed

    // Each first-level index will be null
    // Second-level indices cannot exist yet!
    intArray2D = new int[a][];

    // Each first-level index will be null
    // Second-level indices cannot exist yet!
    objectArray2D = new SimpleClass[a][];

  }


  // The first level of the array always exists.
  public void fillArray1D () {
    for (int a=0; a<objectArray1D.length; a++) {
      objectArray1D[a] = new SimpleClass(a);
    }
  }

  // This is OK if you are SURE the array was fully initialized!
  // This is normal for the AP Exam.
  public void fillArray2D () {
    for (int a=0; a<objectArray2D.length; a++) {
      for (int b=0; b<objectArray2D[a].length; b++) {
        objectArray2D[a][b] = new SimpleClass(a,b);
      }
    }
  }

  // This is way to fill arrays if the second-level has not been initialized.
  // Delaying initialization allows the second-level arrays to have variable length.
  public void fillArray2DnullCheck () {
    for (int a=0; a<objectArray2D.length; a++) {
      // check to see if the second-level array exists.
      // if it doesn't, then we create a new SimpleClass[] array
      if (objectArray2D[a] == null) {
        objectArray2D[a] = new SimpleClass[random(10)];
      }
      for (int b=0; b<objectArray2D[a].length; b++) {
        objectArray2D[a][b] = new SimpleClass(a,b);
      }
    }
  }


  // returns random integer between 1 and max (inclusive)
  private int random ( int max ) {
    return (int)(Math.random()*max) + 1;
  }


  // return the SimpleClass arrays
  public SimpleClass[] getArray1D () {
    return objectArray1D;
  }
  public SimpleClass[][] getArray2D () {
    return objectArray2D;
  }

  // return one of the child-arrays in objectArray2D
  public SimpleClass[] getArray2Dchild ( int index ) {
    return objectArray2D[index];
  }


}
