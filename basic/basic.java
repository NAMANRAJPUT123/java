// public class basic {
//     public static void main(String[] args) { //psvm shortcut
//         System.out.println("Hello NAMAN"); // ln ka mtlb next line mai ajaega cursor // sout shortcut
//         System.out.println("Rajput");
//         System.out.println("Hello NAMAN\nRajput");
//         System.out.println(2);    // 2
//         System.out.println(4+3);  // 7
//         System.out.println("4+3");  // 4+3
//     }
// }

// public class basic{
//     public static void main(String[] args){
//         String name = "Naman Rajput";
//         int age = 19;
//         double weight = 68;
//         System.out.println("My name is "+name+age+weight);  // My name is Naman Rajput1968.0
//     }
// }

// public class basic{
//     public static void main(String[] args){
//        int x =5,y=8,z=10;
//        System.out.println(x+""+y+z);  //5810 left to right solve hoga x ke badh string agyi toh ab sab string mai convert hoga
//        System.out.println(x+y+""+z);  //1310 pehele x+y hogya phir string agyi ab sab string mai convert hoga
//        System.out.println(x+y+z+"naman");  // 23naman
//        System.out.println("Hello "+"Naman Rajput"); // Hello Naman Rajput
//     }
// }

import java.util.Scanner;
// public class basic {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);  // sc ki jagah kuch aur bhi likh skte the
//         System.out.print("Enter radius : ");
//         double radius = sc.nextDouble();
//         double pi = 3.14;
//         double area = pi*radius*radius;
//         System.out.println("Area : "+area);
//     }
// }
public class basic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        System.out.print("Enter dividend : ");
        int dividend = sc.nextInt();
        System.out.print("Enter divisor : ");
        int divisor = sc.nextInt();
        int quotient = dividend/divisor;
        int rem = dividend-quotient*divisor; // or rem = dividend % divisor
        System.out.println("Remainder when "+dividend+" is divided by "+divisor+" is : "+rem);  // Remainder when 8 is divided by 6 is : 2
    }
}