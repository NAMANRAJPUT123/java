import java.util.Scanner;
// public class Arrays2d{
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter the number of rows and columns : ");
//         int rows = scanner.nextInt();
//         int cols = scanner.nextInt();
//         // int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};  /Initialize
//         int array1[][] = new int[rows][cols];
//         System.out.println("Enter the elements of 1st array:");
//         for (int i = 0; i < rows; i++) {
//             for (int j = 0; j < cols; j++) {
//                 array1[i][j] = scanner.nextInt();
//             }
//         }
//         int array2[][] = new int[rows][cols];
//         System.out.println("Enter the elements of 2nd array:");
//         for (int i = 0; i < rows; i++) {
//             for (int j = 0; j < cols; j++) {
//                 array2[i][j] = scanner.nextInt();
//             }
//         }
//         int arraySum[][] = new int[rows][cols];
//         for (int i = 0; i < rows; i++) {
//             for (int j = 0; j < cols; j++) {
//                   arraySum[i][j] = array1[i][j] + array2[i][j]; 
//             }
//         }
//         System.out.println("The sum of array is:");
//         for (int i = 0; i < rows; i++) {
//             for (int j = 0; j < cols; j++) {
//                 System.out.print(arraySum[i][j] + " ");
//             }
//             System.out.println();
//         }
//         scanner.close();
//     }
// }

// TRANSPOSE OF A MATRIX
// public class Arrays2d {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter the number of rows and columns : ");
//         int rows = scanner.nextInt();
//         int cols = scanner.nextInt();
//         int array[][] = new int[rows][cols];
//         System.out.println("Enter the elements of the array:");
//         for (int i = 0; i < rows; i++) {
//             for (int j = 0; j < cols; j++) {
//                 array[i][j] = scanner.nextInt();
//             }
//         }
//         int transpose[][] = new int[cols][rows];
//         for (int i = 0; i < rows; i++) {
//             for (int j = 0; j < cols; j++) {
//                 transpose[j][i] = array[i][j];
//             }
//         }
//         System.out.println("The transpose of the matrix is:");
//         for (int i = 0; i < cols; i++) {    
//             for (int j = 0; j < rows; j++) {
//                 System.out.print(transpose[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
// }
// TRANSPOSE INPLACE
// public class Arrays2d {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter the number of rows and columns : ");
//         int rows = scanner.nextInt();
//         int cols = scanner.nextInt();
//         int array[][] = new int[rows][cols];
//         System.out.println("Enter the elements of the array:");
//         for (int i = 0; i < rows; i++) {
//             for (int j = 0; j < cols; j++) {
//                 array[i][j] = scanner.nextInt();
//             }
//         }
//         for (int i = 0; i < rows; i++) {
//             for (int j = i+1; j < cols; j++) {  // to avoid swapping back
//                 int temp = array[i][j];
//                 array[i][j] = array[j][i];
//                 array[j][i] = temp;
//             }
//         }
//         System.out.println("The transpose of the matrix is:");
//         for (int i = 0; i < cols; i++) {    
//             for (int j = 0; j < rows; j++) {
//                 System.out.print(array[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
// }

// MATRIX MULTIPLICATION
// public class Arrays2d {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter the number of rows and columns for the first matrix: ");
//         int rows1 = scanner.nextInt();
//         int cols1 = scanner.nextInt();
//         int matrix1[][] = new int[rows1][cols1];
//         System.out.println("Enter the elements of the first matrix:");
//         for (int i = 0; i < rows1; i++) {
//             for (int j = 0; j < cols1; j++) {
//                 matrix1[i][j] = scanner.nextInt();
//             }
//         }
//         System.out.print("Enter the number of columns for the second matrix: ");
//         int cols2 = scanner.nextInt();
//         int matrix2[][] = new int[cols1][cols2];
//         System.out.println("Enter the elements of the second matrix:");
//         for (int i = 0; i < cols1; i++) {
//             for (int j = 0; j < cols2; j++) {
//                 matrix2[i][j] = scanner.nextInt();
//             }
//         }
//         int product[][] = new int[rows1][cols2];  // by default initialized to 0
//         for (int i = 0; i < rows1; i++) {
//             for (int j = 0; j < cols2; j++) {
//                 for (int k = 0; k < cols1; k++) {  // 4 baar multipy ho rha hai esliye cols1
//                     product[i][j] = product[i][j] + matrix1[i][k] * matrix2[k][j];
//                 }
//             }
//         }
//         System.out.println("The product of the matrices is:");
//         for (int i = 0; i < rows1; i++) {
//             for (int j = 0; j < cols2; j++) {
//                 System.out.print(product[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
// }

//Rotate a matrix by 90 degrees clockwise pehele transpose phir row wise reverse
// public class Arrays2d {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter the number of rows and columns both are same : ");
//         int rows = scanner.nextInt();
//         int cols = scanner.nextInt();
//         int array[][] = new int[rows][cols];
//         System.out.println("Enter the elements of the array:");
//         for (int i = 0; i < rows; i++) {
//             for (int j = 0; j < cols; j++) {
//                 array[i][j] = scanner.nextInt();
//             }
//         }
//         for (int i = 0; i < rows; i++) {
//             for (int j = i+1; j < cols; j++) {  // to avoid swapping back
//                 int temp = array[i][j];
//                 array[i][j] = array[j][i];
//                 array[j][i] = temp;
//             }
//         }
//         for(int i=0;i<rows;i++){
//             int left=0,right=rows-1;
//             while(left<right){
//                 int temp = array[i][left];
//                 array[i][left] = array[i][right];
//                 array[i][right] = temp;
//                 left++;
//                 right--;
//             }
//         }
//         System.out.println("90 degree rotated matrix is :");
//         for (int i = 0; i < cols; i++) {    
//             for (int j = 0; j < rows; j++) {
//                 System.out.print(array[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
// } 

// RETURN ALL ELEMENTS OF THE MATRIX IN SPIRAL ORDER
// public class Arrays2d {
//     public static void printSpiralOrder(int matrix[][] ,int r,int c){
//         int topRow=0,bottomRow=r-1,leftCol=0,rightcol=c-1;
//         int totalElements = 0;
//         System.out.println("Spiral Order");
//         while(totalElements<r*c){
//             // topRow -> leftcol to rightCol
//             for(int j=leftCol;j<=rightcol && totalElements<r*c;j++){
//                 System.out.print(matrix[topRow][j]+" ");
//                 totalElements++;
//             }
//             topRow++;
//             // rightCol -> topRow to bottomRow
//             for(int i=topRow;i<=bottomRow && totalElements<r*c;i++){
//                 System.out.print(matrix[i][rightcol]+" ");
//                 totalElements++;
//             }
//             rightcol--;
//             // bottomRow -> rightCol to leftCol
//             for(int k=rightcol;k>=leftCol && totalElements<r*c;k--){
//                 System.out.print(matrix[bottomRow][k]+" ");
//                 totalElements++;
//             }
//             bottomRow--;
//             // leftCol -> bottomRow to topRow
//             for(int l=bottomRow;l>=topRow && totalElements<r*c;l--){
//                 System.out.print(matrix[l][leftCol]+" ");
//                 totalElements++;
//             }
//             leftCol++;
//         }
//     }
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter the number of rows and columns both are same : ");
//         int rows = scanner.nextInt();                             // Enter the number of rows and columns both are same : 3 4
//         int cols = scanner.nextInt();
//         int array[][] = new int[rows][cols];
//         System.out.println("Enter "+rows*cols+" values.");       // Enter 12 values
//         for (int i = 0; i < rows; i++) {                         // 1 2 3 4 
//             for (int j = 0; j < cols; j++) {                     // 5 6 7 8
//                 array[i][j] = scanner.nextInt();                 // 9 10 11 12
//             }                                                    // Spiral Order
//         }                                                        // 1 2 3 4 8 12 11 10 9 5 6 7 
//         printSpiralOrder(array, rows, cols);
//     }
// } 
// GIVEN A POSITIVE INTEGER N GENERATE AN NXN MATRIX FILLED WITH ELEMENTS FROM 1 TO N^2 IN SPIRAL ORDER.
// public class Arrays2d {
//     public static void SpiralOrder(int matrix[][],int n){
//         int topRow=0,bottomRow=n-1,leftCol=0,rightcol=n-1;
//         int curr=1;
//         System.out.println("Spiral Order");
//         while(curr<=n*n){
//             // topRow -> leftcol to rightCol
//             for(int j=leftCol;j<=rightcol && curr<=n*n;j++){
//                 matrix[topRow][j] = curr++;
//             }
//             topRow++;
//             // rightCol -> topRow to bottomRow
//             for(int i=topRow;i<=bottomRow && curr<=n*n;i++){
//                 matrix[i][rightcol]=curr++;
//             }
//             rightcol--;
//             // bottomRow -> rightCol to leftCol
//             for(int k=rightcol;k>=leftCol && curr<=n*n;k--){
//                 matrix[bottomRow][k] = curr++;
//             }
//             bottomRow--;
//             // leftCol -> bottomRow to topRow
//             for(int l=bottomRow;l>=topRow && curr<=n*n;l--){
//                 matrix[l][leftCol] = curr++;
//             }
//             leftCol++;
//         }
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);                   // Enter the n : 4
//         System.out.print("Enter the n : ");                    // Spiral Orde
//         int n = sc.nextInt();                                  // 1 2 3 4
//         int arr[][] = new int[n][n];                           // 12 13 14 5
//         SpiralOrder(arr,n);                                    // 11 16 15 6
//         for(int i=0;i<n;i++){                                  // 10 9 8 7
//             for(int j=0;j<n;j++){
//                 System.out.print(arr[i][j]+" ");
//             }
//             System.out.println();
//         }
//     }
// } 

// write a program to find the sum of rectangle made by two points(r1,c1) and (r2,c2) in a matrix
// public class Arrays2d{
//     public static void recSum(int arr[][],int r1,int r2,int c1,int c2){
//         int sum =0;
//         for (int i=r1;i<=r2;i++){
//         for (int j=c1;j<=c2;j++){
//             sum+=arr[i][j];
//         }
//     }
//     System.out.println("Sum of elements formed by rectangle is : "+sum);
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number of rows and columns : ");
//         int rows = sc.nextInt();
//         int cols = sc.nextInt();
//         int array[][] = new int[rows][cols];
//         System.out.println("Enter the elements of the array:");
//         for (int i = 0; i < rows; i++) {
//             for (int j = 0; j < cols; j++) {
//                 array[i][j] = sc.nextInt();
//             }
//         }
//         System.out.print("Enter range of rows and columns : ");
//         int r1 = sc.nextInt();
//         int r2 = sc.nextInt();
//         int c1 = sc.nextInt();
//         int c2 = sc.nextInt();
//         recSum(array, r1, r2, c1, c2);
//     }
// }