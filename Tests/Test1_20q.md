# 1
Consider the code segment below.
```java
int x = 10;
int y = 20;
System.out.print(y + x / y);
```
What is printed as a result of executing the code segment?
<br><br><br><br>



# 2
Consider the following code segment.
```java
int a = 1;
int b = 2;
int c = 3;
int d = 3;
double x = a + b * c % d;
```
What is the value of x when the code segment has been executed?
<br><br><br><br>



# 3
The volume of a cone is equal to the 1/3 height times the area of the circular base. The area of the circular base is equal to π (pi) times the square of the radius.

The code segment below is intended to compute and print the volume of a cylinder with radius r and height h. Assume that the double variables r, h, and pi have been properly declared and initialized.
```java
/* missing code */

System.out.print(volume);
```
Which of the following can be used to replace `/* missing code */` so that the code segment works as intended?
```java
double volume = pi * r * r;
volume *= h;
volume /= 3;
```
```java
double volume = pi * r * r * h;
```
```java
double baseArea = pi * r * r;
double volume = h / 3 * baseArea;
```

# 4
Consider the following code segment.
```java
int x;
int y;
x = 3;
y = /* missing expression */;
x = 1 + 2 * y;
System.out.print(x);
System.out.println(y);
```
Which of the following can be used as a replacement for `/* missing expression */` so that the code segment prints  **94**  ?
- `3`
- `x`
- `x - 1`
- `x + 1`
- `1 - 2 * x`

# 5
Consider the following code segment.
```java
System.out.println("Java");
System.out.print("hěn ");
System.out.print("yǒuqù!");
```
What is printed as a result of executing the code segment?
<br><br><br><br>



# 6
Consider the following code segment, which is intended to display 0.5.
```java
int num1 = 5;
int num2 = 10;
double ans = num1 / num2;
System.out.print(ans);
```
Which of the following best describes the error, if any, in the code segment?
of the following best describes the error, if any, in the code segment?
- There is no error and the code works as intended.
- The code should have cast the expression num1 / num2 to double.
- The code should have cast either num1 or num2 in the expression num1 / num2 to double.
- The code should have declared ans as an int.
- The code should have initialized num1 to 5.0 and num2 to 10.0.

# 7
Consider the following code segment.
```java
double pi = 3.14159;
double e = 2.71828;
double x = 0;
System.out.println((int) (pi / 2));
System.out.print((int) Math.pow(e,x));
```
What is printed as a result of executing the code segment?
<br><br><br><br>



# 8
Consider the following code segment.
```java
double a = 8;
int b = (int) (a / 3);
double c = (double) b / 4;
System.out.print(b);
System.out.print(" ");
System.out.print(c);
```
What is printed as a result of executing the code segment?
<br><br><br><br>



# 9
Consider the following code segment.
```java
int x = 10;
int y = 5;
int z = x;
z /= y;
z += 2;
System.out.print(z);
```
What is printed as a result of executing the code segment?
<br><br><br><br>



# 10
Consider the following code segment.
```java
int num = 5;
num *= 4;
num %= 6;
```
What is the value of num after the code segment is executed?
<br><br><br><br>



# 11
The method below is intended to return the area of an <i>**isosceles right triangle**</i>  whose sides are length **s** units. The area of the triangle is **(1/2)s<sup>2</sup>**.
```java
public double isoRightTriangleArea(double s)
{
    return /* missing code */
}
```
Which of the following can be used to replace `/* missing code */` so that the method works as intended?
- `pow(s, 2) * 0.5;`
- `s.pow(2) * 0.5;`
- `(1/2) * Math.pow(s);`
- `Math.pow(s, 2) / 2;`
- `Math.pow(2, s) / 2;`


# 12
Consider the following code segment.
```java
String s1 = "ABCDEFGHI";
String s2 = s1.substring(1, 3);
String s3 = "abcdefghi";
String s4 = s3.substring(s3.length()-1, s3.length());
String s5 = s3.substring(0, 3);
System.out.print(s2 + " " + s4 + " " + s5);
```
What is printed when the code segment is executed?
<br><br><br><br>



# 13
Consider the following code segment.
```java
String helloChinese = "你好";
String helloKorean = "안녕하세요";
String helloJapanese = "こんにちは";
String str1 = helloChinese.substring(0, 1);
String str2 = helloKorean.substring(0, 1);
String str3 = helloJapanese.substring(0, 1);
System.out.println(str1 + " " + str2 + " " + str3);
```
What is printed when the code segment is executed?
<br><br><br><br>



# 14
Circle one or more of the following code segments that can be used to set the value of the string **str** to "**Be quick to listen, slow to speak, and slow to get angry**".
```java
String str = "Be quick to listen, " + "slow to speak, " + " and slow to get angry";
```
```java
String str = "Be quick to listen";
str += " slow to speak, and slow to get angry!";
```
```java
String str = " slow ";
str = "Be quick to listen," + str + "to speak, and slow to get angry";
```


# 15
The cost per unit (kWh) of electric power from a certain city power company is shown the table below.

Units Used | Price per Unit
---------- | --------------
0 up to but not including 100 | 0.5
100 up to but not including 200 | 0.7
200 or greater | 1.1

The following incomplete method is intended to return the total cost of power usage based on the value of the parameter **unitsUsed**.

```java
public static double getCost(int unitsUsed)
{
    double totalCost = 0.0;

    /* missing code */

    return totalCost;
}
```

Which of the following code segments can be used to replace `/* missing code */` so that method getCost will work as intended?

```java
    if (unitsUsed >= 200) {
        totalCost = unitsUsed * 1.1;
    }
    if (unitsUsed >= 100) {
        totalCost = unitsUsed * 0.7;
    }
    if (unitsUsed > 0) {
        totalCost = unitsUsed * 0.5;
    }
```
```java
    if (unitsUsed >= 200) {
        totalCost = unitsUsed * 1.1;
    }
    else if (unitsUsed >= 100) {
        totalCost = unitsUsed * 0.7;
    }
    else if (unitsUsed > 0) {
        totalCost = unitsUsed * 0.5;
    }
```
```java
    if (unitsUsed > 0) {
        totalCost = unitsUsed * 0.5;
    }
    else if (unitsUsed >= 100) {
        totalCost = unitsUsed * 0.7;
    }
    else if (unitsUsed >= 200) {
        totalCost = unitsUsed * 1.1;
    }
```

# 16
Consider the following method.
```java
public String wordPlay(String word)
{
    String str = "";
    for (int k = 0; k < word.length(); k++)
    {
        if (k % 3 == 0)
        {
            str = word.substring(k, k + 1) + str;
        }
    }
    return str;
}
```
The following code segment appears in another method in the same class as wordPlay.
```java
System.out.println(wordPlay("AP Computer Science A"));
```
What is printed as a result of executing the code segment?
<br><br><br><br>



# 17
Consider the following code segment.
```java
int x = 7;
if (x < 7)
{
    x = 2 * x;
}
else
{
    x = x - 3;
}
if (x % 3 == 1)
{
    x = x + 2;
}
System.out.print(3 * x);
```
What is printed as a result of executing the code segment?
<br><br><br><br>



# 18
Consider the following code segment.
```java
if (false && true || true)
{
    if (false || true && false)
    {
        System.out.print("First");
    }
    else
    {
        System.out.print("Second");
    }
}
if (true || true && false)
{
    System.out.print("Third");
}
```
What is printed as a result of executing the code segment?
<br><br><br><br>



# 19
Consider the following code segment.
```java
int count = 0;
for (int x = 1; x <= 4; x++)
{
    /* missing loop header */
    {
        count++;
    }
}
System.out.println(count);
```
Which of the following should be used to replace `/* missing loop header */` so that the code segment will print **10** as the value of count ?

- `for (int y = 0; y <= 3; y++)`
- `for (int y = 0; y < 4; y++)`
- `for (int y = 3; y >= 0; y--)`
- `for (int y = 4; y > 0; y--)`
- `for (int y = 0; y < x; y++)`



# 20
Consider the following code segment.
```java
/* missing loop header */
{
    for (int k = 0; k < j; k++)
    {
        System.out.print(k);
    }
    System.out.println();
}
```
The code segment is intended to produce the following output.
```bash
0
01
012
0123
01234
```
Which of the following can be used to replace `/* missing loop header */` so that the code segment works as intended?

- `for (int j = 0; j < 5; j++)`
- `for (int j = 1; j < 5; j++)`
- `for (int j = 1; j <= 5; j++)`


