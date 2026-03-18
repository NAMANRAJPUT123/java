import java.util.Scanner;
// public class patterns {
//     public static void main(String[] args) {
//         Scanner sc =  new Scanner(System.in);
//         System.out.print("Enter rows : ");                 // Enter rows : 4 
//         int rows = sc.nextInt();
//         System.out.print("Enter columns : ");             // Enter columns : 4
//         int columns = sc.nextInt();                       // 1 2 3 4 
//         for(int i=0;i<rows;i++){                          // 1 2 3 4 
//             for(int j =0;j<columns;j++){                  // 1 2 3 4
//                 System.out.print((j+1)+" ");              // 1 2 3 4 
//             }
//             System.out.println();
//         }
//     }
// }

// public class patterns{
//     public static void main(String[] args) {
//         Scanner sc =  new Scanner(System.in);
//         System.out.print("Enter rows : ");                  // Enter rows : 4
//         int rows = sc.nextInt();
//         System.out.print("Enter columns : ");              // Enter columns : 4
//         int columns = sc.nextInt();                        // A B C D 
//         for(int i=0;i<rows;i++){                           // A B C D 
//             for(int j=0;j<columns;j++){                    // A B C D 
//                 System.out.print((char)(j+65)+" ");        // A B C D 
//             }
//             System.out.println();
//         }
//     }
// }

// public class patterns{
//     public static void main(String[] args) {
//         Scanner sc =  new Scanner(System.in);
//         System.out.print("Enter rows : ");                               // Enter rows : 4
//         int rows = sc.nextInt();
//         System.out.print("Enter columns : ");                            // Enter columns : 5    
//         int columns = sc.nextInt();                                      // * * * * *
//         for(int i=0;i<rows;i++){                                         // *       *
//             for(int j=0;j<columns;j++){                                  // *       *
//                 if(i==0 || i==rows-1 || j==0 || j==columns-1)            // * * * * *
//                  System.out.print("* ");          
//                 else System.out.print("  ");
//             }
//             System.out.println();
//         }
//     }
// }

// public class patterns{
//     public static void main(String[] args) {
//         Scanner sc =  new Scanner(System.in);
//         System.out.print("Enter rows : ");                               // Enter rows : 4       
//         int rows = sc.nextInt();                                         // * 
//         for(int i=0;i<rows;i++){                                         // * * 
//             for(int j=0;j<i+1;j++){                                      // * * *
//                 System.out.print("* ");                                  // * * * *
//             }
//             System.out.println();
//         }
//     }
// }

// public class patterns{
//     public static void main(String[] args) {
//         Scanner sc =  new Scanner(System.in);
//         System.out.print("Enter rows : ");              // Enter rows : 4
//         int rows = sc.nextInt();                        // * * * *
//         for(int i=0;i<rows;i++){                        // * * * 
//             for(int j=rows-i;j>0;j--){                  // * * 
//                 System.out.print("* ");                 // *
//             } 
//             System.out.println();
//         }
//     }
// }

// public class patterns{
//     public static void main(String[] args) {
//         Scanner sc =  new Scanner(System.in);
//         System.out.print("Enter rows : ");              // Enter rows : 4
//         int rows = sc.nextInt();                        //       *
//         for(int i=0;i<rows;i++){                        //     * *
//             for(int j=rows-i;j>1;j--){                  //   * * *
//                 System.out.print("  ");                 // * * * *
//             } 
//             for(int k=0;k<i+1;k++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }

// public class patterns{
//     public static void main(String[] args) {
//         Scanner sc =  new Scanner(System.in);
//         System.out.print("Enter rows : ");              // Enter rows : 4
//         int rows = sc.nextInt();                        //       *
//         for(int i=0;i<rows;i++){                        //     * *
//             for(int j=0;j<rows;j++){                    //   * * *
//                if(i+j<=rows-2)  System.out.print("  "); // * * * *
//                else System.out.print("* ");
//             } 
//             System.out.println();
//         }
//     }
// }
// public class patterns{
//     public static void main(String[] args) {
//         Scanner sc =  new Scanner(System.in);
//         System.out.print("Enter rows : ");              // Enter rows : 4
//         int rows = sc.nextInt();                        // 1 
//         for(int i=0;i<rows;i++){                        // 1 2  
//             for(int j=0;j<i+1;j++){                     // 1 2 3
//             System.out.print(j+1+" ");                  // 1 2 3 4
//            } 
//             System.out.println();
//         }
//     }
// }

// public class patterns{
//     public static void main(String[] args) {
//         Scanner sc =  new Scanner(System.in);
//         System.out.print("Enter rows : ");              // Enter rows : 4
//         int rows = sc.nextInt();                        // 1 
//         for(int i=0;i<rows;i++){                        // 1 3
//             for(int j=0;j<i+1;j++){                     // 1 3 5
//             System.out.print(2*j+1+" ");                // 1 3 5 7
//            } 
//             System.out.println();
//         }
//     }
// }

// public class patterns{
//     public static void main(String[] args) {
//         Scanner sc =  new Scanner(System.in);
//         System.out.print("Enter rows : ");              // Enter rows : 4
//         int rows = sc.nextInt();                        // 1 2 3 4 
//         for(int i=rows;i>0;i--){                        // 1 2 3
//             for(int j=0;j<i;j++){                       // 1 2 
//             System.out.print(j+1+" ");                  // 1 
//            } 
//             System.out.println();
//         }
//     }
// }

// FLOYD'S TRIANGLE
// public class patterns{
//     public static void main(String[] args) {
//         Scanner sc =  new Scanner(System.in);
//         System.out.print("Enter rows : ");              // Enter rows : 5
//         int rows = sc.nextInt(); 
//         int k = 1;                                      // 1 
//         for(int i=0;i<rows;i++){                        // 2  3 
//             for(int j=0;j<i+1;j++){                     // 4  5  6
//             System.out.print((k++)+" ");                // 7  8  9  10
//             if(k<10) System.out.print(" ");             // 11 12 13 14 15   
//            }                                           
//             System.out.println();
//         }
//     }
// }


// public class patterns{
//     public static void main(String[] args) {
//         Scanner sc =  new Scanner(System.in);
//         System.out.print("Enter rows : ");              // Enter rows : 5
//         int rows = sc.nextInt();   
//         boolean flag = true;                            // 1 
//         for(int i=0;i<rows;i++){                        // 0 1
//             for(int j=0;j<i+1;j++){                     // 1 0 1
//             if(flag) System.out.print("1 ");            // 0 1 0 1 
//             else System.out.print("0 ");                // 1 0 1 0 1
//             flag = !flag;
//            } 
//             System.out.println();
//             if(i%2!=0) flag = !flag;
//         }
//     }
// }


// public class patterns{
//     public static void main(String[] args) {
//         Scanner sc =  new Scanner(System.in);
//         System.out.print("Enter rows : ");              // Enter rows : 5
//         int rows = sc.nextInt();                        // 1
//         for(int i=0;i<rows;i++){                        // A B 
//             for(int j=0;j<i+1;j++){                     // 1 2 3
//             if(i%2==0) System.out.print(j+1+" ");       // A B C D
//             else System.out.print((char)(j+65)+" ");    // 1 2 3 4 5
//            }                                            
//             System.out.println();
//         }
//     }
// }


// public class patterns{
//     public static void main(String[] args) {
//         Scanner sc =  new Scanner(System.in);
//         System.out.print("Enter rows : ");                          // Enter rows : 5
//         int rows = sc.nextInt();                                    // A A A A A
//         for(int i=0;i<rows;i++){                                    // 2 2 2 2
//             for(int j=rows-i;j>0;j--){                              // C C C
//             if(i%2==0) System.out.print((char)(i+65)+" ");          // 4 4
//             else System.out.print((i+1)+" ");                       // E
//            }                                            
//             System.out.println();
//         }
//     }
// }

// public class patterns{
//     public static void main(String[] args) {
//         Scanner sc =  new Scanner(System.in);
//         System.out.print("Enter rows : ");                            // Enter rows : 5
//         int rows = sc.nextInt();                                      //          * 
//         for(int i=0;i<rows;i++){                                      //          *
//             for(int j=0;j<rows;j++){                                  //      * * * * *
//             if((j==rows/2) && (i!=(rows/2))) System.out.print("* ");  //          *
//             else if(i==rows/2) System.out.print("* ");                //          *
//             else System.out.print("  ");
//            } 
//             System.out.println();
//         }
//     }
// }

// public class patterns{
//     public static void main(String[] args) {
//         Scanner sc =  new Scanner(System.in);
//         System.out.print("Enter rows : ");                            // Enter rows : 5
//         int rows = sc.nextInt();                                      // *       *
//         for(int i=0;i<rows;i++){                                      //   *   *
//             for(int j=0;j<rows;j++){                                  //     *
//             if(i==j || i+j==rows-1) System.out.print("* ");           //   *   *
//             else System.out.print("  ");                              // *       *
//            } 
//             System.out.println();
//         }
//     }
// }

// public class patterns{
//     public static void main(String[] args) {
//         Scanner sc =  new Scanner(System.in);
//         System.out.print("Enter rows : ");              // Enter rows : 4
//         int rows = sc.nextInt();                        //       * * * *
//         for(int i=0;i<rows;i++){                        //     * * * *
//             for(int j=rows-i;j>1;j--){                  //   * * * *
//                 System.out.print("  ");                 // * * * *
//             } 
//             for(int k=0;k<i+1;k++){
//                 System.out.print("* ");
//             }
//             for(int k=rows-i-1;k>0;k--){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }

// public class patterns{
//     public static void main(String[] args) {
//         Scanner sc =  new Scanner(System.in);
//         System.out.print("Enter rows : ");              // Enter rows : 4
//         int rows = sc.nextInt();                        //       * 
//         for(int i=0;i<rows;i++){                        //     * * * 
//             for(int j=rows-i;j>1;j--){                  //   * * * * *
//                 System.out.print("  ");                 // * * * * * * *
//             } 
//             for(int k=0;k<i+1;k++){
//                 System.out.print("* ");
//             }
//             for(int k=0;k<i;k++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }

// public class patterns{
//     public static void main(String[] args) {
//         Scanner sc =  new Scanner(System.in);
//         System.out.print("Enter rows : ");              // Enter rows : 4
//         int rows = sc.nextInt();                        //       1 
//         for(int i=0;i<rows;i++){                        //     1 2 3 
//             for(int j=rows-i;j>1;j--){                  //   1 2 3 4 5
//                 System.out.print("  ");                 // 1 2 3 4 5 6 7
//             } 
//             for(int k=0;k<i+1;k++){
//                 System.out.print(k+1+" ");
//             }
//             for(int l=2+i;l<2*i+2;l++){
//                 System.out.print(l+" ");
//             }
//             System.out.println();
//         }
//     }
// }

// public class patterns{
//     public static void main(String[] args) {
//         Scanner sc =  new Scanner(System.in);
//         System.out.print("Enter rows : ");              // Enter rows : 4
//         int rows = sc.nextInt();                        //       * 
//         for(int i=0;i<rows;i++){                        //     * * * 
//             for(int j=rows-i;j>1;j--){                  //   * * * * *
//                 System.out.print("  ");                 // * * * * * * *
//             }                                           //   * * * * *
//             for(int k=0;k<i+1;k++){                     //     * * *
//                 System.out.print("* ");                 //       *
//             }
//             for(int k=0;k<i;k++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//         for(int i=0;i<rows;i++){
//             for(int j=0;j<i+1;j++){
//                 System.out.print("  ");
//             }
//             for(int k=rows-i-1;k>0;k--){
//                 System.out.print("* ");
//             }
//             for(int l=rows-i-2;l>0;l--){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }        