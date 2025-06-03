# ArrayLeftRotation

![image](https://github.com/user-attachments/assets/6c3232d2-8c6e-4c28-ba8a-f527953a3cfc)

![image](https://github.com/user-attachments/assets/6fca23f8-d5de-415f-baf6-c8b95148b4a9)

```java
/**** Converting a Primitive 'int' Array to List ****/
		int intArray[] = {1, 2, 3, 4, 5};
		List<Integer> integerList1 = Arrays.stream(intArray).boxed().collect(Collectors.toList());
		System.out.println("List #1: " + integerList1);

		/**** 'IntStream.of' or 'Arrays.stream' Gives The Same Output ****/
		List<Integer> integerList2 = IntStream.of(intArray).boxed().collect(Collectors.toList());
		System.out.println("List #2: " + integerList2);

		/**** Converting an 'Integer' Array to List ****/
		Integer integerArray[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		List<Integer> integerList3 = Arrays.stream(integerArray).collect(Collectors.toList());
		System.out.println("List #3: " + integerList3);

   ---------------------------------------

  int[] ints = {1,2,3};
  List<Integer> list = Arrays.stream(ints).boxed().collect(Collectors.toList());
  In Java 16 and later:
  
  List<Integer> list = Arrays.stream(ints).boxed().toList();

 OR
int[] ints = {1, 2, 3};
List<Integer> intList = new ArrayList<Integer>(ints.length);
for (int i : ints)
{
    intList.add(i);
}


Solution
  // you may get this problem in two ways
	// 1 direct array input OR 2 List input both are arrays

   public class P0001LeftRotation {
	
	// you may get this problem in two ways
	// 1 direct array input OR 2 List input both are arrays

	public static void main(String[] args) {

		int[] intArray = { 1, 2, 3, 4, 5, 6 };
		// Convert int array to List<Integer> using streams
       List<Integer> integerList = Arrays.stream(intArray).boxed().collect(Collectors.toList());
       
       // List<Integer> integerList = Arrays.asList(intArray);
        System.out.println("Left Rorate with "+ 3);
        rotLeftInteger(integerList, 3); // calling List<Integer>
        System.out.println();
        System.out.println("Left Rorate with "+ 4);
		rotLeftInt(intArray, 4); // int[]
		System.out.println();
		System.out.println("Completed");

	}
	
	public static List<Integer> rotLeftInteger(List<Integer> a, int d) {
		
		int n = a.size();
        List<Integer> rotated = new ArrayList<>(n); 
       
        for (int i = 0; i < n; i++) {
            rotated.add(a.get((i + d) % n));
        }
        
        for (Integer element : rotated) {
           
            System.out.print(element + " ");
        }
        
        return rotated;
		
	}
	
	
	public static int[] rotLeftInt(int[] original, int shift) {
		
		int[] reordered = new int[original.length];
		
		for (int i = 0; i < original.length; i++) {
			
			reordered[i] = original[(shift + i) % original.length];
		}

		for (int a : reordered) {
			System.out.print(a + " ");
		}

		return reordered;
	}
	

}



```
