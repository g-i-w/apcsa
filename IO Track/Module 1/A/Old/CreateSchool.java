public class CreateSchool {
  public static void main (String[] args) {

    int size = args.length / 2;

    School TIS = new School( size );

    for (int a=0; a<size; a+=2) {
      TIS.addStudent( args[a], Integer.valueOf(args[a+1]) );
    }

    TIS.printStudents();

  }
}
