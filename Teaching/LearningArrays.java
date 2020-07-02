public class LearningArrays {
  public static void main (String[] args) {

    int a = 100;

    String[] b;
    b = new String[10];


    for(int count=0;count < b.length;count++) {
      b[count] = "hi! I am a String! " + count;
    }


    for ( int i = 0; i < b.length; i++) {
      System.out.println( b[i] );

    }

  }

}
