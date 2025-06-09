# P0002-Arrays-Move Zeros To End

```java
import java.util.Arrays;

public class MoveZerosToEnd {

	public static void main(String[] args) {
		
		 int [] arr= new int[]{23,5,0,1,0,3,5,0,1,0,1};
		 int j=0;
		 for (int i = 0; i < arr.length; i++) {
			 if (arr[i] != 0) {
				 // Swap arr[i] and arr[j];
				 int temp = arr[i];
				 arr[i] = arr[j];
				 arr[j] = temp;
				 j++;
			 }
		 }		 
		System.out.println(Arrays.toString(arr));
	}

}
```
* **Console OutPut With Explaination**
* * When I value and J value both are same swapping will nor haapens, why becuase both values are same, When I value and J value are not same, values are swaping.

```console
Original Array : [23, 5, 0, 1, 0, 3, 5, 0, 1, 0, 1]

i-Position-value: 0 i-Values 23
j-Position-value: 0 j-Values 23

Swaping I value and J values

[23, 5, 0, 1, 0, 3, 5, 0, 1, 0, 1]

i-Position-value: 1 i-Values 5
j-Position-value: 1 j-Values 5

Swaping I value and J values

[23, 5, 0, 1, 0, 3, 5, 0, 1, 0, 1]

[23, 5, 0, 1, 0, 3, 5, 0, 1, 0, 1]

i-Position-value: 3 i-Values 1
j-Position-value: 2 j-Values 0

Swaping I value and J values

[23, 5, 1, 0, 0, 3, 5, 0, 1, 0, 1]

[23, 5, 1, 0, 0, 3, 5, 0, 1, 0, 1]

i-Position-value: 5 i-Values 3
j-Position-value: 3 j-Values 0

Swaping I value and J values

[23, 5, 1, 3, 0, 0, 5, 0, 1, 0, 1]

i-Position-value: 6 i-Values 5
j-Position-value: 4 j-Values 0

Swaping I value and J values

[23, 5, 1, 3, 5, 0, 0, 0, 1, 0, 1]

[23, 5, 1, 3, 5, 0, 0, 0, 1, 0, 1]

i-Position-value: 8 i-Values 1
j-Position-value: 5 j-Values 0

Swaping I value and J values

[23, 5, 1, 3, 5, 1, 0, 0, 0, 0, 1]

[23, 5, 1, 3, 5, 1, 0, 0, 0, 0, 1]

i-Position-value: 10 i-Values 1
j-Position-value: 6 j-Values 0

Swaping I value and J values

[23, 5, 1, 3, 5, 1, 1, 0, 0, 0, 0]


```

* OR one more condition to avoide unnecessary swapping

```java
import java.util.Arrays;

public class MoveZerosToEnd {

	public static void main(String[] args) {
		
		 int [] arr= new int[]{23,5,0,1,0,3,5,0,1,0,1};
		 int j=0;
		 for (int i = 0; i < arr.length; i++) {
			 if (arr[i] != 0) {
				 // Swap arr[i] and arr[j];
				 if(i != j) {
					  int temp = arr[i];
					  arr[i] = arr[j];
					  arr[j] = temp;
				  }
				 j++;
			 }
		 }		 
		System.out.println(Arrays.toString(arr));
	}

}

Out Put with explination

Original Array : [23, 5, 0, 1, 0, 3, 5, 0, 1, 0, 1]

i-Position-value: 0 i-Values 23
j-Position-value: 0 j-Values 23

[23, 5, 0, 1, 0, 3, 5, 0, 1, 0, 1]

i-Position-value: 1 i-Values 5
j-Position-value: 1 j-Values 5

[23, 5, 0, 1, 0, 3, 5, 0, 1, 0, 1]

[23, 5, 0, 1, 0, 3, 5, 0, 1, 0, 1]

i-Position-value: 3 i-Values 1
j-Position-value: 2 j-Values 0

Swaping I value and J values

[23, 5, 1, 0, 0, 3, 5, 0, 1, 0, 1]

[23, 5, 1, 0, 0, 3, 5, 0, 1, 0, 1]

i-Position-value: 5 i-Values 3
j-Position-value: 3 j-Values 0

Swaping I value and J values

[23, 5, 1, 3, 0, 0, 5, 0, 1, 0, 1]

i-Position-value: 6 i-Values 5
j-Position-value: 4 j-Values 0

Swaping I value and J values

[23, 5, 1, 3, 5, 0, 0, 0, 1, 0, 1]

[23, 5, 1, 3, 5, 0, 0, 0, 1, 0, 1]

i-Position-value: 8 i-Values 1
j-Position-value: 5 j-Values 0

Swaping I value and J values

[23, 5, 1, 3, 5, 1, 0, 0, 0, 0, 1]

[23, 5, 1, 3, 5, 1, 0, 0, 0, 0, 1]

i-Position-value: 10 i-Values 1
j-Position-value: 6 j-Values 0

Swaping I value and J values

[23, 5, 1, 3, 5, 1, 1, 0, 0, 0, 0]



```




