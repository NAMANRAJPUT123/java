import java.util.*;
// public class recursion {
//     public static void increasing(int n){
//         if (n==1) {
//             System.out.print(n+" ");
//             return;
//         }
//             increasing(n-1);;
//             System.out.print(n+" ");
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter n : ");
//         int n = sc.nextInt();
//         increasing(n);
//     }
// }

// public class recursion {
//     public static void decreasing(int n){
//         if (n==1) {
//             System.out.print(n+" ");
//             return;
//         }
//             System.out.print(n+" ");
//             decreasing(n-1);;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         decreasing(n);
//     }
// }

// FACTORIAL+
// public class recursion{
//     public static int factorial(int n){
//         if(n==1) return 1;
//         return n*factorial(n-1);
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int fac = factorial(n);
//         System.out.println(n+" factorial : "+fac);
//     }
// }

// FIBONACCI
// public class recursion{
//     public static int fibonacci(int n){
//         if(n==1 || n==0) return n;
//         return fibonacci(n-1) + fibonacci(n-2);
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         System.out.println(n+" fibonacci term : "+fibonacci(n));
//     }
// }

// SUM OF DIGITS
// public class recursion{
//     public static int sumDigit(int sum,int n){
//         if(n==0) return sum ;
//         return sumDigit(sum+n%10,n/10);
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         System.out.println("Sum of digit : "+sumDigit(0,n));
//     }
// }

// p^q
// public class recursion{
//     public static int power(int p,int q){
//         if(q==0) return 1;
//         return power(p,q-1)*p;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int p = sc.nextInt();
//         int q = sc.nextInt();
//         System.out.println(p+" raise to "+q+" is : "+power(p,q));
//     }
// }

// public class recursion{
//     public static int power(int p,int q){
//         if(q==0) return 1;
//         int smallPow = power(p, q/2);
//         if(q%2==0) return smallPow*smallPow;
//         return smallPow*smallPow*p;
//         }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int p = sc.nextInt();
//         int q = sc.nextInt();
//         System.out.println(p+" raise to "+q+" is : "+power(p,q));
//     }
// }
// MULTPLE
// public class recursion{
//     public static void multiple(int num,int k){
//         if(k==0) return ;
//         multiple(num, k-1);
//         System.out.print(num*k+" ");
//         }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
//         int k = sc.nextInt();
//         multiple(num,k);
//     }
// }
// SERIES SUM
// public class recursion{
//     public static int sum(int n){
//         if(n==1) return n;
//         return sum(n-1) + n;
//         }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         System.out.println(sum(n));
//     }
// }
//SERIES SUM WITH ALTERNATIVE SIGNS
// public class recursion{
//     public static int sum(int n){
//         if(n==1) return n;
//         if(n%2!=0) return sum(n-1) + n;         // 1-2+3-4+5 = 3
//         return sum(n-1) - n;
//         }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         System.out.println(sum(n));
//     }
// }
// GCD USING EUCLID'S ALGORITHM
// public class recursion{
//     public static int gcd(int x,int y){
//         if(y==0) return x;
//         return gcd(y,x%y);
// }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int x = sc.nextInt();
//         int y = sc.nextInt();
//         System.out.println(gcd(x,y));
//         sc.close();
//     }
// }
// PRINT ARRAY USING RECURSION
// public class recursion{
//     public static void print(int arr[],int n){
//         if(n==arr.length) return;
//         System.out.print(arr[n++]+" ");
//         print(arr, n);
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter size of array : ");
//         int n = sc.nextInt();
//         int arr[] = new int[n];
//         System.out.print("Enter array : ");
//         for(int i=0;i<n;i++){
//             arr[i] = sc.nextInt();
//         }
//         print(arr,0);
//         sc.close();
//     }
// }
// MAX VALUE
// public class recursion{
//     public static int maxEle(int arr[],int idx){
//         if(idx == arr.length-1)  return arr[idx];
//         int smallAns = maxEle(arr, idx+1);
//         return Math.max(arr[idx],smallAns);
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter size of array : ");
//         int n = sc.nextInt();
//         int arr[] = new int[n];
//         System.out.print("Enter array : ");
//         for(int i=0;i<n;i++){
//             arr[i] = sc.nextInt();
//         }
//         System.out.println("Max element : "+maxEle(arr,0));
//         sc.close();
//     }
// }
// SUM
// public class recursion{
//     public static int sumEle(int arr[],int idx){
//         if(idx == arr.length)  return 0;
//         return arr[idx] + sumEle(arr,idx+1);
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter size of array : ");
//         int n = sc.nextInt();
//         int arr[] = new int[n];
//         System.out.print("Enter array : ");
//         for(int i=0;i<n;i++){
//             arr[i] = sc.nextInt();
//         }
//         System.out.println("Sum of element : "+sumEle(arr,0));
//         sc.close();
//     }
// }
//TARGET VALUE
// public class recursion{
//     public static boolean findTarget(int arr[],int target,int idx){
//         if(idx==arr.length) return false;
//         if(arr[idx] == target)  return true; 
//         return findTarget(arr, target, idx+1);
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter size of array : ");
//         int n = sc.nextInt();
//         int arr[] = new int[n];
//         System.out.print("Enter array : ");
//         for(int i=0;i<n;i++){
//             arr[i] = sc.nextInt();
//         }
//         System.out.print("Enter target : ");
//         int target = sc.nextInt();
//         System.out.println(findTarget(arr,target,0));
//         sc.close();
//     }
// }
// FIND ALL INDICES OF TARGET X
// public class recursion{
//     public static void findidx(int arr[],int target,int idx){
//         if(idx==arr.length) return ;
//         if(arr[idx] == target)  System.out.print(idx+" ");; 
//         findidx(arr, target, idx+1);
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter size of array : ");
//         int n = sc.nextInt();
//         int arr[] = new int[n];
//         System.out.print("Enter array : ");
//         for(int i=0;i<n;i++){
//             arr[i] = sc.nextInt();
//         }
//         System.out.print("Enter target : ");
//         int target = sc.nextInt();
//         findidx(arr,target,0);
//         sc.close();
//     }
// }
// FIND ALL INDICES OF TARGET X USING ARRAYLIST
// public class recursion{
//     public static ArrayList<Integer> findidx(int arr[],int target,int idx){
//         ArrayList<Integer> ans = new ArrayList<>();
//         if(idx==arr.length) return ans; // return empty arraylist
//         if(arr[idx] == target) ans.add(idx);
//         ArrayList<Integer> smallans = findidx(arr, target, idx+1);
//         ans.addAll(smallans);
//         return ans;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter size of array : ");
//         int n = sc.nextInt();
//         int arr[] = new int[n];
//         System.out.print("Enter array : ");
//         for(int i=0;i<n;i++){
//             arr[i] = sc.nextInt();
//         }
//         System.out.print("Enter target : ");
//         int target = sc.nextInt();
//         ArrayList<Integer> ans = findidx(arr,target,0);
//         for(Integer i:ans){
//             System.out.print(i+" ");
//         }
//         sc.close();
//     }
// }
// REMOVE ALL THE OCCURRENCES OF 'a' from string s = "abcax".
// public class recursion{
//     public static String remove(String str,int idx){
//         if(idx==str.length()) return "";
//         String smallAns = remove(str, idx+1);
//         char currChar = str.charAt(idx);
//         if(currChar!='a'){
//             return currChar + smallAns;
//         }
//         else return smallAns;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter string : ");
//         String str = sc.nextLine();
//         System.out.print(remove(str,0));
//         sc.close();
//     }
// }
// REVERSE STRING USING RECURSION
// public class recursion{ 
//     public static String reverse(String str,int idx){
//         if(idx==str.length()) return "";
//         String smallAns = reverse(str, idx+1);
//         char currChar = str.charAt(idx);
//         return smallAns + currChar;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter string : ");
//         String str = sc.nextLine();
//         System.out.print(reverse(str,0));
//         sc.close();
//     }
// }
// PALINDROME
// public class recursion{ 
//     public static boolean palindrome(String str,int l,int r){
//         if(l>=r) return true;
//         if(str.charAt(l) == str.charAt(r)) return palindrome(str,l+1,r-1);
//         else return false;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter string : ");
//         String str = sc.nextLine();
//         System.out.print(palindrome(str,0,str.length()-1));
//         sc.close();
//     }
// }
// RETURN SUBSEQUENCES OF STRING
// public class recursion{ 
//     public static ArrayList<String> getSSQ(String s){
//         ArrayList<String> ans = new ArrayList<>();
//         if(s.length()==0){
//             ans.add("");
//             return ans;
//         } 
//         char curr = s.charAt(0);
//         ArrayList<String> smallAns = getSSQ(s.substring(1)); // ["bc","b","c",""]
//         // smallAns = ["bc","b","c",""]
//         // ans = ["bc","b","c","","abc","ab","ac","a"]
//         for(String ss: smallAns){
//         ans.add(ss);  // bc
//         ans.add(curr+ss);  // abc
//         }
//         return ans;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter string : ");
//         String str = sc.nextLine();
//         ArrayList<String> ans =  getSSQ(str);
//         for(String s:ans){
//             System.out.print(s+" ");
//         }
//         sc.close();
//     }
// }
//PRINT SUBSEQUENCES INCLUSION AND EXCLUSION
// public class recursion{ 
//     public static void printSSQ(String s,String currAns){
//         if(s.length()==0){
//             System.out.print(currAns+" ");
//             return;
//         }
//        char curr = s.charAt(0); // a
//        String remStrinng = s.substring(1); //bc
//        printSSQ(remStrinng,currAns + curr); // bc , a
//        printSSQ(remStrinng, currAns); //bc ,""
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter string : ");
//         String str = sc.nextLine();
//         printSSQ(str,"");
//         sc.close();
//     }
// }
// GIVEN ARRAY , PRINT SUM OF ALL SUBSET IN IT . OUTPUT SUMS CAN BE PRINTED IN ANY ORDER.
// public class recursion{ 
//     public static void subsetSum(int a[],int n,int idx,int sum){
//         if(idx>=n){
//             System.out.print(sum+" ");
//             return;
//         }
//         subsetSum(a,n,idx+1,sum+a[idx]); // include
//         subsetSum(a,n,idx+1,sum);       // exclude
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter size : ");
//         int n = sc.nextInt();
//         System.out.print("Enter array : ");
//         int arr[] = new int[n];
//         for(int i=0;i<n;i++){
//             arr[i] = sc.nextInt();
//         }
//         subsetSum(arr,n,0,0);
//         sc.close();
//     }
// }

// GIVVEN A STRING CONTAINING DIGITS FROM 2-9 INCLUSIVE, PRINT ALL POSSIBLE COMBINATIONS OF LETTERS THAT THE NUMBER CAN REPRESENT.
public class recursion {
    public static String[] keypad = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    
    public static void printCombinations(String str, String ans) {
        if (str.length() == 0) {
            System.out.print(ans + " ");
            return;
        }
        
        int digit = str.charAt(0) - '0'; // Convert char to int
        String letters = keypad[digit];
        
        for (int i = 0; i < letters.length(); i++) {
            printCombinations(str.substring(1), ans + letters.charAt(i));
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter digits: ");         // Enter digits: 23
        String str = sc.nextLine();                   // ad ae af bd be bf cd ce cf 
        printCombinations(str, "");
        sc.close();
    }
}