import java.util.Scanner;

//THREE DIFFERENT WAYS TO PRINT TABLE USING LOOP
// public class loops {
//     public static void main(String[] args) {
//         for(int i=19;i<=190;i=i+19){
//             System.out.println(i);
//         }
//         for(int i=1;i<=10;i++){
//             System.out.println(19*i);
//         }
//         for(int i=19;i<=190;i++){
//             if(i%19==0) System.out.println(i);
//         }
//     }
// }

//AP
// public class loops{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter first term : ");
//         int a = sc.nextInt();
//         System.out.print("Enter common difference : ");
//         int d = sc.nextInt();
//         System.out.print("Enter number of terms : ");
//         int n = sc.nextInt();
//         for(int i=0;i<n;i++){
//             System.out.print((a+d*i));
//             if(i!=n-1) System.out.print(",");
//         }
//     }
// }

//GP
// public class loops{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter first term : ");
//         int a = sc.nextInt();
//         System.out.print("Enter common ratio : ");
//         int r = sc.nextInt();
//         System.out.print("Enter number of terms : ");
//         int n = sc.nextInt();
//         for(int i=0;i<n;i++){
//             System.out.print(a);
//             a=a*r;
//             if(i!=n-1) System.out.print(",");
//         }
//     }
// }

// HIGHEST FACTOR
// public class loops{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter number : ");
//         int num = sc.nextInt();
//         int hf=1;
//         for(int i=num-1;i>=1;i--){
//            if(num%i==0) {
//             hf = i; 
//             break;
//         }
//         }
//          System.out.println("Highest factor of "+num+" is : "+hf);
//     }
// }

//PRIME NUMBERS
// public class loops{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter number : ");
//         int num = sc.nextInt();
//         boolean flag = true;
//         for(int i=2;i<num/i;i++){        // num ke sqrt tkk koi factor nhi hoga toh aage bhi nhi hoga
//            if(num%i==0) {
//             flag = false;
//             break;
//         }
//         }
//         if(flag) System.out.println(num+" is a prime number.");
//         else System.out.println(num+" is a composite number.");
//     }
// }

// public class loops{
//     public static void main(String[] args) {
//         int i =17;
//         while(i=10){                  // java mai error aata hai
//             System.out.println(i);
//             i++;
//         }
//     }
// }

// COUNTDIGIT
// public class loops{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter number : ");
//         int num = sc.nextInt();
//         int count = 0;
//         int temp=num;
//         while(num>0){
//             count++;
//             num=num/10;
//         }
//         System.out.println("Number of digitn in "+temp+" is : "+count);
//     }
// }

// REVERSE OF A NUMBER
// public class loops{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter number : ");
//         int num = sc.nextInt();
//         int temp=num;
//         int rev = 0;
//         while(temp>0){
//             int rem = temp%10;
//             rev = rev*10 + rem;
//             temp=temp/10;
//         }
//         System.out.println("Reverse : "+rev);
//     }
// }

// S = 1-2+3-4....n
// public class loops{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter n : ");
//         int n = sc.nextInt();
//         int sum = 0;
//         for(int i =1;i<=n;i++){
//             if(i%2==0){
//                 sum = sum -i;
//             }
//             else sum = sum + i;
//         }
//         System.out.println("The sum of given series is : "+sum);
//     }
// }

// DECIMAL TO BINARY
// public class loops{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter number : ");
//         int dec = sc.nextInt();
//         int temp = dec;
//         int bin = 0,weight=1;
//         while(dec>0){
//             int rem = dec%2;
//             bin = bin + rem*weight;
//             dec = dec/2;
//             weight = weight*10;
//         }
//         System.out.println("Binary equivalent of "+temp+" is : "+bin);
//     }
// }

// BINARY TO DECIMAL
// public class loops{
//     public static void main(String[] args) {
//          Scanner sc = new Scanner(System.in);
//         System.out.print("Enter binary number : ");
//         int bin = sc.nextInt();
//         int weight = 1;
//         int dec = 0;
//         int temp = bin;
//         while(temp>0){
//             int rem = temp%10;
//             dec = dec + rem*weight;
//             temp = temp/10;
//             weight = weight*2;
//         }
//         System.out.println("Decimal equivalent of "+bin+" is : "+dec);
//     }
// }

// public class loops{
//     public static void main(String[] args) {
//          Scanner sc = new Scanner(System.in);
//          int i = 65;
//         while(i<91){
//             System.out.print((char)i+" ");  // A B C D E F G H I J K L M N O P Q R S T U V W X Y Z 
//             i++;
//         }
//     }
// }

public class loops{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cp=0,cn=0,cz=0;
        char choice;
        do{
            System.out.print("Enter number : ");
            int n = sc.nextInt();
            if(n>0) cp++;
            else if(n<0) cn++;
            else cz++;
            System.out.print("Do you want to enter another number?(y/n) : ");
            choice = sc.next().charAt(0);
        }while(choice=='Y' || choice=='y');
        System.out.println("Positive no : "+cp);
        System.out.println("Negative no : "+cn);
        System.out.println("Zeroes : "+cz);
    }
}