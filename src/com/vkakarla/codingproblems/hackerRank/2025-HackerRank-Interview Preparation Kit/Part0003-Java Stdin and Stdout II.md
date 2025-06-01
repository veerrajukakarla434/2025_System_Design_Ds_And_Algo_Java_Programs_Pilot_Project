# Java Stdin and Stdout II

![image](https://github.com/user-attachments/assets/a3837495-cf06-4172-82ae-f060769a03e5)

![image](https://github.com/user-attachments/assets/995be04f-4fff-4533-91ae-42210a113ed2)

#### Solution
```java
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scan = new Scanner(System.in);
        
        int i = scan.nextInt();
        double d = scan.nextDouble();
        String s=" ";
        s= scan.nextLine();
        s+=scan.nextLine();
        scan.close();

        System.out.println("String: "+s);
        System.out.println("Double: "+d);
        System.out.println("Int: "+i);
    }
}

```

![image](https://github.com/user-attachments/assets/f61b46a0-e471-4318-a48a-32a06929c0ff)
