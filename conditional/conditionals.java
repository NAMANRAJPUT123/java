import java.util.Scanner;
// public class conditionals {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter number : ");
//         int num = sc.nextInt();
//         if(num%2==0) System.out.println(num+" is a even number.");
//         else System.out.println(num+" is an odd number.");
//     }
// }

// public class conditionals{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter year : ");
//         int year = sc.nextInt();
//         if((year%4==0 && year%100!=0)|| year%400==0)  System.out.println(year+" is a leap year.");
//         else  System.out.println(year+" is not a leap year.");
//     }
// }

// public class conditionals{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter number : ");
//         int num = sc.nextInt();
//        // int abs = (num>0)*num + (num<0)*(-1)*num;   // in java true or false returns not 0 & 1
//        int abs = num>0 ? num : -num;
//         System.out.println("Absolute value of "+num+" is : "+abs);
//     }
// }

// public class conditionals{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter cost price : ");
//         double cp = sc.nextDouble();
//         System.out.print("Enter selling price : ");
//         double sp = sc.nextDouble();
//         if(sp>cp) System.out.println("Made profit of : "+(sp-cp));
//         else if(cp>sp) System.out.println("Made loss of : "+(cp-sp));
//         else System.out.println("No loss or profit");

//     }
// }

public class conditionals{
    public static void main(String[] args) {
        int x = 9;
        boolean z = x<10;       // 0 & 1 return nhi hoga true & false return hoga esliye boolean rakha hai z ko
        System.out.println(z);  // true
        System.out.println(x=8); // 8
    }
}