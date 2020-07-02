public class School {

  // data structure
  private Student[] students;
  private int size;
  private int studentNumber;

  // constructor
  public School ( int schoolSize ) {
    size = schoolSize;
    students = new Student[size];
    studentNumber = 1;
  }

  public void addStudent ( String name, int grade ) {
    students[studentNumber-1] = new Student( name, grade );
  }

  public void printStudents () {
    for (int i=0; i<studentNumber; i++) {
      System.out.println( (i+1) + " " + students[i].getName() + " " + students[i].getGrade() );
    }
  }

}
