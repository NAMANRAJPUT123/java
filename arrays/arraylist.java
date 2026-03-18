import java.util.*;
//In Java, a wrapper class is a class that wraps (encapsulates) a primitive data type into an object.
//Java provides wrapper classes for each of the primitive data types:
// ArrayList is a resizable array (dynamic array) provided in Java’s Collection Framework.
// It stores elements in order, allows duplicate elements, and can grow/shrink as needed.
// Cannot store primitive types directly, but stores wrapper class objects (e.g., Integer, Double) stores in heap memory
// public class arraylist {
//     public static void main(String[] args) {
//         Integer i = Integer.valueOf(10); // Wrapper class for int now i is an object
//         Double d = Double.valueOf(20.5); // Wrapper class for double
//         int a = 10;  // primitive type
//         Integer obj = Integer.valueOf(a);  // wrapping or boxing
//         int b = obj.intValue();  // unwrapping or unboxing
//     }
// }

// public class arraylist{
//     public static void main(String[] args) {
//         ArrayList<Integer> list = new ArrayList<>(); // Create an ArrayList to store Integer objects
//         list.add(10); // Autoboxing: int 10 is converted to Integer object
//         list.add(20);
//         list.add(30);
//         System.out.println("ArrayList elements: " + list); // Print the ArrayList elements (ArrayList elements: [10, 20, 30)]
//         // Accessing elements
//         for (int i = 0; i < list.size(); i++) { // size ek method esliye () hai array.lenght mai () mai nhi array ki property hai esliye
//             System.out.println("Element at index " + i + ": " + list.get(i)); // Unboxing happens here( Element at index 0: 10)
//         }                                                                     // Element at index 1: 20 (Element at index 2: 30)
//         // Removing an element
//         list.remove(1); // Removes the element at index 1 (20)
//         System.out.println("After removal: " + list);  // automaticlly resized  After removal: [10, 30]
//         list.add(1, 25); // Add 25 at index 1
//         System.out.println("After adding 25 at index 1: " + list);  // After adding 25 at index 1: [10, 25, 30]
//         list.set(0, 15); // Set the element at index 0 to 15 (changes 10 to 15)
//         System.out.println("After setting index 0 to 15: " + list); // After setting index 0 to 15: [15, 25, 30]
//         list.remove(1); // Removes the element at index 1 (25)
//         System.out.println("After removing index 1: " + list); // After removing index 1: [15, 30]
//         list.remove(Integer.valueOf(30)); // Removes the Integer object 30 returns true if the element was present else false
//          // Integer.valueOf(30) is used to remove the object, not the index
//          // If we use list.remove(30), it will try to remove the element at index 30, which will throw an IndexOutOfBoundsException
//         System.out.println("After removing Integer 30: " + list); // After removing Integer 30: [15]
//         boolean ans = list.contains(Integer.valueOf(15)); // Check if the list contains the Integer object 15
//         System.out.println("Does the list contain 15? " + ans); // Does the list contain 15? true
//         ArrayList l = new ArrayList(); // if you don't specify class , you can put anything inside
//         l.add("naman"); // Adding a String to the ArrayList
//         l.add(28); // Adding an Integer to the ArrayList
//         l.add(true); // Adding a Boolean to the ArrayList
//         System.out.println("ArrayList with mixed types: " + l); //ArrayList with mixed types: [naman, 28, true]
//     }
// }

// REVERSE AN ARRAYLIST
    // public class arraylist {
    //     public static void main(String[] args) {
    //         ArrayList<Integer> list = new ArrayList<>();
    //         list.add(10);
    //         list.add(20);
    //         list.add(30);
    //         System.out.println("Original ArrayList: " + list);
    //         // Reverse the ArrayList
    //         ArrayList<Integer> reversedList = new ArrayList<>();
    //         for (int i = list.size() - 1; i >= 0; i--) {
    //             reversedList.add(list.get(i));
    //         }
    //         System.out.println("Reversed ArrayList: " + reversedList);
    //     }
    // }
// REVERSE AN ARRAYLIST using method with double pointer
// public class arraylist {
//     public static void main(String[] args) {
//         ArrayList<Integer> list = new ArrayList<>();
//         list.add(10);
//         list.add(20);
//         list.add(30);
//         System.out.println("Original ArrayList: " + list);
//         // Reverse the ArrayList using two pointers
//         int left = 0;
//         int right = list.size() - 1;
//         while (left < right) {
//             // Swap elements at left and right indices
//             Integer temp = list.get(left);
//             list.set(left, list.get(right));
//             list.set(right, temp);
//             left++;
//             right--;
//         }
//         System.out.println("Reversed ArrayList: " + list);
//     }
// }
// REVERSE AN ARRAYLIST using Collections.reverse() method
// public class arraylist {
//     public static void main(String[] args) {
//         ArrayList<Integer> list = new ArrayList<>();
//         list.add(10);
//         list.add(20);
//         list.add(30);
//         System.out.println("Original ArrayList: " + list);
//         // Reverse the ArrayList using Collections.reverse()
//         Collections.reverse(list);
//         System.out.println("Reversed ArrayList: " + list);
//     }
// }

// SORT AN ARRAYLIST in descending order using Collections.sort() method
// public class arraylist {
//     public static void main(String[] args) {
//         ArrayList<Integer> list = new ArrayList<>();
//         list.add(30);
//         list.add(10);
//         list.add(20);
//         System.out.println("Original ArrayList: " + list);
//         // Sort the ArrayList
//         Collections.sort(list);
//         System.out.println("Sorted ArrayList: " + list); // Sorted ArrayList: [10, 20, 30]
//         // Sort the ArrayList in descending order
//         Collections.sort(list, Collections.reverseOrder());
//         System.out.println("Sorted ArrayList in Descending Order: " + list); // Sorted ArrayList in Descending Order: [30, 20, 10]
//         // sorting an ArrayList of Strings
//         ArrayList<String> stringList = new ArrayList<>();
//         stringList.add("Banana");
//         stringList.add("Apple");
//         stringList.add("Orange");
//         System.out.println("Original String ArrayList: " + stringList);
//         // Sort the String ArrayList
//         Collections.sort(stringList);
//         System.out.println("Sorted String ArrayList: " + stringList); // Sorted String ArrayList: [Apple, Banana, Orange]
//         // Sort the String ArrayList in descending order
//         Collections.sort(stringList, Collections.reverseOrder());
//         System.out.println("Sorted String ArrayList in Descending Order: " + stringList); // Sorted String ArrayList in Descending Order: [Orange, Banana, Apple]
//     }
// }