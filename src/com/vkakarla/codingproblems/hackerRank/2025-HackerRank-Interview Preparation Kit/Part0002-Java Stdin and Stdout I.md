# Java Stdin and Stdout I

```text
Most HackerRank challenges require you to read input from stdin (standard input) and write output to stdout (standard output).

One popular way to read input from stdin is by using the Scanner class and specifying the Input Stream as System.in. For example:

Scanner scanner = new Scanner(System.in);
String myString = scanner.next();
int myInt = scanner.nextInt();
scanner.close();

System.out.println("myString is: " + myString);
System.out.println("myInt is: " + myInt);
The code above creates a Scanner object named  and uses it to read a String and an int. It then closes the Scanner object because there is no more input to read, and prints to stdout using System.out.println(String). So, if our input is:

Hi 5
Our code will print:

myString is: Hi
myInt is: 5
Alternatively, you can use the BufferedReader class.

Task
In this challenge, you must read  integers from stdin and then print them to stdout. Each integer must be printed on a new line. To make the problem a little easier, a portion of the code is provided for you in the editor below.

Input Format

There are  lines of input, and each line contains a single integer.

Sample Input

42
100
125
Sample Output

42
100
125
```

#### Solution

```java
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        
    Scanner scanner = new Scanner(System.in);
    //String myString = scanner.next();
    int myInt = scanner.nextInt();
    int myInt1 = scanner.nextInt();
    int myInt2 = scanner.nextInt();
    
    
    //System.out.println("myString is: " + myString);
    System.out.println(myInt);
    System.out.println(myInt1);
    System.out.println(myInt2);
    
    scanner.close();
        
    }
    
   
}

Input (stdin)
42
100
125
Your Output (stdout)
42
100
125
Expected Output
42
100
125

```
