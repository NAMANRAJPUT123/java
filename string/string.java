import java.util.*;
// public class string {
//     public static void main(String[] args) {
//         String str = "Hello";
//         // System.out.println(str);
//         // Scanner sc = new Scanner(System.in);
//         //String str1 = sc.next();  // space ke baad nhi lega
//         // String str1 = sc.nextLine(); // pura input lega
//         // System.out.println(str1);
//         String str2 = "Hello World";
//         String str3 = "New String";
//         // int length = str2.length();
//         // System.out.println(length);
//         // char ch = str2.charAt(6); // third character
//         // System.out.println(ch);
//         // System.out.println(str2.indexOf('l')); // first occurrence of 'l' return index
//         // // comparing string lexographically means alphabetically
//         // System.out.println(str2.compareTo(str3)); // returns negative value if str2 is lexographically smaller than str3
//         // System.out.println(str2.compareTo("Hello World")); // returns 0 if both are
//         // System.out.println(str2.compareTo("Hello")); // returns positive value if str2 is lexographically greater than "Hello"
//         // System.out.println(str2.contains("Worl")); // checks if str2 contains "Worl" return true
//         // System.out.println(str2.startsWith("He")); // checks if str2 starts with "He" return true
//         // System.out.println(str2.endsWith("ld")); // checks if str2 ends with "ld" return true
//         // // UPPERCASE AND LOWERCASE
//         // System.out.println(str2.toUpperCase()); // converts str2 to uppercase
//         // str = str +" Naman" +5;
//         // System.out.println(str); // concatenates " Naman" to str Hello Naman5
//         // System.out.println(str2.replace("World", "Java")); // replaces "World" with "Java"
//         // substring
//         //System.out.println(str2.substring(1,6)); // returns substring from index 1 to 5 (6 is exclusive) ello
//         System.out.println(str2.substring(4)); // returns substring from index 6 to end o World
//     }
// }

// GIVEN A STRING S, PRINT ALL THE SUBSTRINGS OF S.
// public class string{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String s = sc.nextLine();                        // abcd
//         for(int i=0;i<s.length();i++){
//             for(int j=i+1;j<=s.length();j++){
//                 System.out.print(s.substring(i,j)+" ");   // a ab abc abcd b bc bcd c cd d 
//             }
//         }
//     }
// }

// public class string{
//     public static void main(String[] args) {
//         String s = "Hello";
//         String s1 = "Hello"; // both s and s1 are pointing to the same hello that is interning
//         //String s2 = new String("Hello"); // s2 is a new object in the heap memory forced to create a new object
//         s1 = "Naman";
//         System.out.println(s);  // s change nahi hoga kyuki s1 is pointing to a new object
//         // String is immutable, once created it cannot be changed
//         s = s.substring(0,2) + "y" + s.substring(3); // this will create a new string object in the heap memory
//         System.out.println(s);  // Heylo string mai change nhi hua new string bni hai
//         System.out.println(s==s1); // false , true aana chahiye
//     }
// }

// public class string {
//     public static void main(String[] args) {
//         String s = "Hello";
//         String s1 = "Hello"; // both s and s1 are pointing to the same hello that is interning
//         String s2 = new String("Hello"); // s2 is a new object in the heap memory forced to create a new object
//         System.out.println(s == s1); // true, both are pointing to the same object in the string pool
//         System.out.println(s == s2); // false, s2 is a new object in the heap memory , true aana chahiye but address alag hai
//         System.out.println(s.equals(s2)); // true, equals method checks the content of the string
//     }
// }

// STRING BULDER
// public class string {
//     public static void main(String[] args) {
//         StringBuilder str = new StringBuilder("Hello");
//         // StringBuilder is mutable, we can change the content of the string
//         str.append(" World"); // appending to the string
//         System.out.println(str); // Hello World
//         str.insert(5, " Java"); // inserting at index 5 5th index ka aage khisak jayega
//         System.out.println(str); // Hello Java World
//         str.delete(5, 10); // deleting from index 5 to 10
//         System.out.println(str); // Hello World
//         str.deleteCharAt(0); // deleting the first character
//         str.reverse(); // reversing the string
//         System.out.println(str); // dlroW olleH
//         str.setCharAt(0, 'h'); // changing the first character to 'h'
//         System.out.println(str); // hlroW olleH
//     }
// }

// reverse string without using string builder
// public class string {
//     public static void main(String[] args) {
//         String s = "Hello World";
//         String reversed = ""; // empty string to store the reversed string
//         for (int i = s.length() - 1; i >= 0; i--) { // loop from the end to the beginning
//             reversed += s.charAt(i); // append each character to the reversed string
//         }
//         System.out.println(reversed); // dlroW olleH
//     }
// }
// reverse string using two pointers
// public class string {
//     public static void main(String[] args) {
//         String s = "Hello World";
//         char[] arr = s.toCharArray(); // convert string to character array
//         int left = 0;
//         int right = arr.length - 1;
//         while (left < right) {
//             char temp = arr[left];
//             arr[left] = arr[right];
//             arr[right] = temp;
//             left++;
//             right--;
//         }
//         System.out.println(new String(arr)); // dlroW olleH
//     }
// }

// given a stringbuilder string the task is to toogle all the characters of the string i.e. to convert upper case to lower case and vice versa
// public class string{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String input = sc.nextLine();
//         StringBuilder str = new StringBuilder(input);  // NamAn RajpUT
//         for(int i=0;i<str.length();i++){               // AMaN rAJPut
//             char ch = str.charAt(i);
//             if(ch>=97 && ch<=122) {
//                 int ascii = (int)ch -32;
//                 ch = (char)ascii;
//                 str.setCharAt(i,ch);
//             }
//             else if(ch>=65 && ch<=90 ){
//                 int ascii = (int)ch + 32;
//                 ch = (char)ascii;
//                 str.setCharAt(i,ch);
//             }
//         }
//         System.out.println(str);
//     }
// }
// using string
// public class string{ // poor method time complexcity jada hai hr loop mai new string bnn rhi hai
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String str = sc.nextLine();                    // naMAn[^RajPUt
//         for(int i=0;i<str.length();i++){               // NAmaN[^rAJpuT
//             char ch = str.charAt(i);
//             if(ch>=97 && ch<=122) {
//                 int ascii = (int)ch -32;
//                 ch = (char)ascii;
//                 str = str.substring(0,i) + ch + str.substring(i+1);
//             }
//             else if(ch>=65 && ch<=90 ){
//                 int ascii = (int)ch + 32;
//                 ch = (char)ascii;
//                 str = str.substring(0,i) + ch + str.substring(i+1);
//             }
//         }
//         System.out.println(str);
//     }
// }

// GIVEN A STRING S, RETURN THE NUMBER OF PALINDROMIC SUBSTRING IN IT
// public class string{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String s = sc.nextLine(); 
//         int count = 0;                       
//         for(int i=0;i<s.length();i++){
//             for(int j=i+1;j<=s.length();j++){
//                 String reversed = ""; // empty string to store the reversed string
//                 for (int k = j-1; k >= i; k--) { // loop from the end to the beginning
//                  reversed += s.charAt(k); // append each character to the reversed string
//             }  
//             if(s.substring(i,j).equals(reversed)) count++;
//             }
//         }
//         System.out.println(count+" palindromic substring in it.");
//     }
// }
// public class string{
//     public static boolean isPalindrome(String s){
//         int i = 0;
//         int j = s.length()-1;
//         while(i<j){
//             if(s.charAt(i)!=s.charAt(j)) return false;
//             i++;
//             j--;
//         }
//         return true;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String str = sc.nextLine();
//         int count = 0;
//         for(int i=0;i<str.length();i++){
//             for(int j=i+1;j<=str.length();j++){
//                 if(isPalindrome(str.substring(i,j))==true)
//                 count++;
//             }
//         }
//         System.out.println(count+" palindromic substring in it.");
//     }
// }

// JAVA PROGRAM TO REVERSE EACH WORD IN STRING
// public class string{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String str = sc.nextLine();
//         String ans = "";
//         StringBuilder s = new StringBuilder("");       // I am an Engineering Student
//         for(int i=0;i<str.length();i++){               // I ma na gnireenignE tnedutS
//             if(str.charAt(i)!=' '){
//                 s.append(str.charAt(i));
//             }
//             else{
//                 s.reverse();
//                 ans +=s;
//                 ans +=" ";
//                 s = new StringBuilder("");
//             }
//         }
//         // s.reverse();
//         // ans += s;
//         System.out.println(ans);
//     }
// }

// public class string{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String str = sc.nextLine();
//         String ans = "";
//         int index = 0;
//         while(index<str.length()){
//             int count = 1;
//             for(int j=index+1;j<str.length();j++){
//                 if(str.charAt(index)==str.charAt(j)){
//                     count++;
//                     index++;
//                 }
//             }
//             if(count>1){ 
//                 ans = ans + str.charAt(index-1) + count;        // aaabbbbccddde
//                 index++;                                        // a3b4c2d3e
//             }
//             else {
//                 ans = ans + str.charAt(index);
//                 index++;
//             }
//         }
//         System.out.println(ans);
//     }
// }