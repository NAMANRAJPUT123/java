import java.util.Scanner;
// public class method {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println(Math.pow(5, 3));  // 125.0
//         System.out.println(Math.pow(3.14, 2)); // 9.8596
//         System.out.println(Math.pow(3.14, 3.14)); // 36.33783888017471
//         System.out.println(Math.sqrt(9));  // 3.0
//         System.out.println(Math.cbrt(125)); // 5.0
//         System.out.println(Math.min(5,2)); // 2
//         System.out.println(Math.max(3.14,4.2)); // 4.2
//         System.out.println(Math.max(5,Math.max(6, 2))); // 6
//     }
// }

// arrangement of functions in java class doesn't matter at all.


// public class method{
//     public static void greet(String name){
//         System.out.println("Hello "+name);
//     }
//     public static void main(String[] args) {
//         greet("Naman");                         // Hello Naman
//     }
// }

// public class method{
//     public static int fac(int a){
//         int fact = 1;
//         for(int i=1;i<=a;i++){
//             fact*=i;
//         }
//         return fact;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter n : ");
//         int n = sc.nextInt();
//         System.out.print("Enter r : ");
//         int r = sc.nextInt();
//         int ncr = fac(n)/(fac(r)*fac(n-r));
//         System.out.println(n+"C"+r+" is : "+ncr);
//     }
// }

// PASCAL TRIANGLE
// public class method{
//     public static int fac(int a){
//         int fact = 1;
//         for(int i=1;i<=a;i++){
//             fact*=i;
//         }
//         return fact;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter n : ");
//         int n = sc.nextInt();
//         for(int i=0;i<=n;i++){
//             for(int j=0;j<=n-i-1;j++){
//                 System.out.print("     ");
//             }
//             for(int k=0;k<i+1;k++){
//                 int ncr = fac(i)/(fac(k)*fac(i-k));
//                 System.out.print(ncr+"         ");
//             }
//             System.out.println();
//         }
//     }
// }
// Enter n : 5
//                          1
//                     1         1
//                1         2         1
//           1         3         3         1
//      1         4         6         4         1
// 1         5         10         10         5         1

// public class method{
//     public static int fac(int a){
//         int fact = 1;
//         for(int i=1;i<=a;i++){
//             fact*=i;
//         }
//         return fact;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter n : ");
//         int n = sc.nextInt();
//         for(int i=0;i<=n;i++){
//             for(int k=0;k<i+1;k++){
//                 int ncr = fac(i)/(fac(k)*fac(i-k));
//                 System.out.print(ncr+"     ");
//             }
//             System.out.println();
//         }
//     }
// }
// Enter n : 6
// 1     
// 1     1     
// 1     2     1     
// 1     3     3     1     
// 1     4     6     4     1     
// 1     5     10     10     5     1     
// 1     6     15     20     15     6     1 

// without ncr using 2darray
// public class method {
//     public static int[][] pascal(int n){
//         int ans[][] = new int[n][];  // hume nhi pta hr row mai fixed column jaggered matrix
//         for(int i=0;i<n;i++){
//             ans[i] = new int[i+1]; // ith row has i+1 columns
//             ans[i][0] = ans[i][i] = 1; // 1st and last element of every row is 1
//             for(int j=1;j<i;j++){
//                 ans[i][j] = ans[i-1][j] + ans[i-1][j-1]; // directly above wala element and usse piche wala element
//             }

//         }
//         return ans;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the n : ");
//         int n = sc.nextInt();
//         int ans[][] = pascal(n);
//         for (int i = 0; i < n; i++) {    
//             for (int j = 0; j < i+1; j++) {
//                 System.out.print(ans[i][j] + " "); 
//             }
//             System.out.println();
//         }
//         sc.close();
//     }
// } 
// Enter the n : 7
// 1 
// 1 1
// 1 2 1
// 1 3 3 1 
// 1 4 6 4 1
// 1 5 10 10 5 1
// 1 6 15 20 15 6 1

