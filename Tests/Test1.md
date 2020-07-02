# 1
Consider the code segment below.
```java
int x = 10;
int y = 20;
System.out.print(y + x / y);
```
What is printed as a result of executing the code segment?
```

```
# 2
Which two of the following arithmetic expressions evaluate to **1** ?
```java
(50 / 5) % 3
50 / (5 % 3)
16 % 5 % 3
```
# 3
Consider the following code segment.
```java
int a = 1;
int b = 2;
int c = 3;
int d = 3;
double x = a + b * c % d;
```
What is the value of x when the code segment has been executed?
```

```

# 4
Consider the following code segment.
```java
int x = 10;
int y = 30;

/* missing code */

System.out.print(top / bottom);
```
Which of the following replacements for `/* missing code */` will cause an `ArithmeticException` to occur?

```java
int top = y - x;
int bottom = y - 3 * x;
```
```java
int top = x - y;
int bottom = y - x;
```
```java
int top = x + y;
int bottom = 3 * top;
```

# 5
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

# 6
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

# 7
Each of the following code segments is intended to print the word `Hello`.   Which of the following code segments works as intended?

- `System.out.print("Hello");`
- `System.out.print(Hello);`
- `System.out.print("He" + "" + "llo");`
- `System.out.print(He + llo);`

# 8
Consider the following code segment.
```java
System.out.println("Java" + "\n");
System.out.print("hěn ");
System.out.print("yǒuqù!");
```
What is printed as a result of executing the code segment?
```

```

# 9
Consider the following code segment.
```java
System.out.print("W");
System.out.println("X");
System.out.println("Y");
System.out.print("Z");
```
What is printed as a result of executing the code segment?
```

```

# 10
Consider the following code segment, which is intended to display 6.0.
```java
double var1 = 100 / 2;
double var2 = 2 * 2;
double product = var1 * var2;
System.out.println(product);
```
Which of the following best describes the error, if any, in the code segment?

- The variables var1 and var2 should both be declared as int.
- There are no errors and the code works as intended.
- The expression var1 * var2 should be cast as double.
- The expressions 100 / 2 and 2 * 2 should both be cast as double.
- Either the numerator or the denominator of the fraction 100 / 2 should be cast as double.

# 11
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

# 12
Consider the following code segment.
```java
double pi = 3.14159;
double e = 2.71828;
double x = 0;
System.out.println((int) (pi / 2));
System.out.print((int) Math.pow(e,x));
```
What is printed as a result of executing the code segment?
```

```

# 13
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
```

```

# 14
Consider the following code segment.
```java
double d = 0.1;
int i = 3;
double diff = d - i;
System.out.print((int)diff - 0.5);
```
What is printed as a result of executing the code segment?
```

```

# 15
Consider the following code segment.
```java
int x = /* initial value not shown */;
int y = /* initial value not shown */;
int z = x;
z /= y;
z += 2;
```

# 16
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
```

```

# 17
Consider the following code segment.
```java
int num = 5;
num *= 4;
num %= 6;
```
What is the value of num after the code segment is executed?
```

```

# 18
Consider the following code segment.
```java
int x = 0;
x++;
x += 1;
x = x + 1;
x -= -1;
System.out.println(x);
```
What is printed when the code segment has been executed?
```

```

# 19
Consider the following code segment.
```java
int j = 10;
int k = 8;
j += 2;
k += j;
System.out.println("[ j: "+j+", k: "+k+" ]");
```
What is printed when the code segment is executed?
```

```

# 20
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

# 21
Consider the following method.
```java
public double calculate(double x)

{

    return x + 1.5;

}
```
The following code segment calls the method calculate in the same class.
```java
System.out.println(calculate(-1.5));
```
What is printed when the code segment is executed?
```

```

# 22
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
```

```

# 23
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
```

```

# 24
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

# 25
Consider the following code segment.
```java
String dessert = "pie";
dessert += "straw" + dessert + "berry";
```
What is the value of **dessert** after the code segment has been executed?
```

```

# 26
Consider the following code segment.
```java
String str = "A.D.";
str += " " + 2019;
System.out.println(str);
```
What is printed as a result of executing the code segment?
```

```

# 27
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

# 28
Consider the following code segment.
```java
double regularPrice = 200;
boolean onClearance = false;
boolean hasCoupon = true;
double finalPrice = regularPrice;
if(onClearance)
{
    finalPrice -= finalPrice * 0.25;
}
if(hasCoupon)
{
    finalPrice -= 30.0;
}
System.out.println(finalPrice);
```
What is printed as a result of executing the code segment?
```

```

# 29
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
```

```

# 30
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
```

```

# 31
Consider the following code segment.
```java
int num = 1;
while (num < 5)
{
    System.out.println("A");
    num += 2;
}
```
What is printed as a result of executing the code segment?
What is printed as a result of executing the code segment?
```

```

# 32
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
```

```

# 33
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

# 34
Consider the following code segment, which is intended to print the sum of all the odd integers from 0 up to and including 1001.
```java
int anInteger = 0;
int sum = 0;
/* missing loop header */
{
    if (anInteger % 2 == 1)
    {
        sum += anInteger;
    }
    anInteger++;
}
System.out.println(sum);
```
Which of the following could replace `/* missing loop header */` to ensure that the code segment will work as intended?
- `while (anInteger <= 1000)`
- `while (sum <= 1000)`
- `while (anInteger < 1001)`
- `while (anInteger <= 1001)`
- `while (sum <= 1001)`

# 35
The following method is intended to print the number of digits in the parameter num.
```java
public int numDigits(int num)
{
    int count = 0;
    while (/* missing condition */)
    {
        count++;
        num = num / 10;
    }
    return count;
}
```
Which of the following can be used to replace `/* missing condition */` so that the method will work as intended?
- `count != 0`
- `count > 0`
- `num >= 0`
- `num > 0`
- `num == 0`

# 36
Consider the following code segment.
```java
int x = 2;
int y = -1;
if (x - 2 > y)
{
    x -= y;
}
if (y + 3 >= x)
{
    y += x;
}
System.out.print("x = " + x + " y = " + y);
```
What is printed as a result of the execution of the code segment?
```

```

# 37
Consider the following code segment.
```java
/* missing loop header */
{
    for (int k = 0; k < 4; k++)
    {
        System.out.print(k);
    }
    System.out.println();
}
```
The code segment is intended to produce the following output.
```bash
0123
0123
0123
```
Which of the following can be used to replace `/* missing loop header */` so that the code segment works as intended?

- `for (int j = 0; j < 3; j++)`
- `for (int j = 1; j < 3; j++)`
- `for (int j = 1; j <= 3; j++)`

# 38
Consider the following code segment.
```java
int count = 5;
while (count < 100)
{
    count = count * 2;
}
count = count + 1;
```
What will be the value of count as a result of executing the code segment?
```

```

# 39
Consider the following method.
```java
public String mystery(String input)
{
    String output = "";
    for (int k = 1; k < input.length(); k = k + 2)
    {
        output += input.substring(k, k + 1);
    }
    return output;
}
```
What is returned as a result of the call mystery("computer") ?
```

```

# 40
Consider the following code segment.
```java
int num = 1;
int count = 0;
while (num <= 20)
{
    if (num % 2 == 0 && num % 3 == 0)
    {
        count++;
    }
    num++;
}
```
What value is stored in the variable count as a result of executing the code segment?
```

```
