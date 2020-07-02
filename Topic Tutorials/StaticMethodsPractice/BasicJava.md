# Methods
- A method is a named section of code that can receive arguments (variables) and can return something.
- Almost every method declaration contains some of the keywords in the following list.  Don't worry if you don't understand these descriptions right now -- it will become clear soon.
  - **Visibility:**
    - `public`: can be called from outside of the class
    - `private`: can only be called from inside the class
  - **Static:**
    - `static`: can be run directly in the `main` method.
  - **Name:**
    - `methodName`: the name of the method.
  - **Arguments:**
    - zero or more variables

Examples of methods:
```java
public static void returnsNothing() {
  System.out.println("Hello!");
}
private static int returnsFive() {
  System.out.println("Returning 5!");
  return 5;
}
```

Methods can be run as a line of code all by themselves...
```java
returnsNothing();
```

...Or methods can be assigned to a variable.
```java
int becomesFive = returnsFive();
```

### Methods - Example Program
Here is an example program that uses these methods:
```java
public class MethodsPractice {

  public static void returnsNothing() {
    System.out.println("Hello!");
  }

  private static int returnsFive() {
    System.out.println("Returning 5!");
    return 5;
  }

  public static void main(String []) {
    returnsNothing();
    returnsNothing();
    returnsFive();
    int theReturnValue = returnsFive();
    System.out.println( theReturnValue );
  }

}
```

# If-Else Statements
The most basic language construct in any method (including the main method) is an `if` `else` statement.

Example of a simple if-else that will always output "true!":
```java
if( true ) {
  System.out.println("true!");
} else {
  System.out.println("false!");
}
```

Example of a simple if-else that will always output "false!":
```java
int a = 5;
if( a < 5 ) {
  System.out.println("true!");
} else {
  System.out.println("false!");
}
```

Example of an if-else statement inside a method:
```java
static String bothTrue ( boolean a, boolean b ) {
  if ( a && b )
    return "true!";
  } else {
    return "false!";
  }
}
```
If-else statements can also be added inside the `if` or `else` code blocks.  These are called "nested" if-else statements.

Example of nested if-else statements:
```java
int a = 5;
if (a < 10) {
  if (a > 0) {
    System.out.println("a is between 0 and 10.");
  } else {
    System.out.println("a is negative.");
  }
} else {
  System.out.println("a is greater than or equal to 10.");
}
```

# Loops
The other language construct that is commonly used in a method is the loop.

### while( expression )
The section of code that is inside of a `while` loop continues <i>while</i> the expression is true.

Example of a while-loop that never ends:
```java
while ( true ) {
  System.out.println( "looping forever!" );
}
```

Example of a while-loop that prints `0123456789`:
```java
int i=0;
while ( i < 10 ) {
  System.out.print( i );
  i++;
}
```

### for( expression1; expression2; expression3 )
- When a for-loop is first run, **expression1** is run, and **expression2** is evaluated (true or false).
- When the section of code inside the for-loop has been run, then **expression3** is run and **expression2** is evaluated.
- If **expression2** is false, then the loop ends.

Example of a for-loop that prints `0123456789`:
```java
for ( inti=0; i<10 i++ ) {
  System.out.print( i );
}
```

### if-else and Loops - Example Program
Here is an example program that uses if-else and loops:
```java
public class IfElseLoopsPractice {

  public static void main( String[] args ) {

    int a = 0;
    while( a < 10 ) {
      if (a < 5) {
        System.out.println( a + " is less than 5" );
      } else {
        System.out.println( a + " is great than or equal to 5" );
      }
      a++;
    }

    for ( b = 9; b >= 0; b-- ) {
      System.out.println( "b counts down from 9: " + b );
    }

  }

}
```
