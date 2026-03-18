import java.util.*;
// public class arrays {
//     public static void main(String[] args) {
//         int arr[] = new int[5];     // declaration with size
//         int arr[] = {4,8,5,2,6,9};  // initialization
//         System.out.println(arr[4]); // 6
//     }
// }

// public class arrays{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter size of an array : ");
//         int size = sc.nextInt();
//         int arr[] = new int[size];
//         int n = arr.length;             // gives lenght of an array
//         System.out.println(n);
//         for(int i=0;i<size;i++){
//             arr[i] = sc.nextInt();     // automatically initialize to 0 if not given
//         }                              // int-->0 , float-->0.0 , boolean-->false , string-->""
//         for(int j=0;j<size;j++){
//             System.out.print(arr[j]+" ");
//         }
//     }
// }

// NTHLARGST NUMBER IN ARRAY
// public class arrays{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter size of an array : ");
//         int size = sc.nextInt();
//         System.out.print("Enter which largest element u want : ");
//         int nthlargest = sc.nextInt();
//         int count =0;
//         int arr[] = new int[size];
//         for(int i=0;i<size;i++){
//             arr[i] = sc.nextInt();     
//         }  
//         int idx=-1;
//         for(int i=0;i<size;i++){
//             int max = Integer.MIN_VALUE;
//         for(int j=0;j<size;j++){
//            if(arr[j]>max){
//                 max = arr[j];
//                 idx=j;
//            }
//         }
//          count++;
//         if(count==nthlargest){
//             System.out.println(nthlargest+" largest element is : "+max);
//             break;
//         }
//         else {
//             arr[idx] = Integer.MIN_VALUE;
//         }
//     }                           
//     }
// }

// PASSING ARRAY TO METHODS
// public class arrays{
//     public static void change(int arr[]){
//         arr[1] = 54;
//     }
//     public static void main(String[] args) {
//         int arr[] = {12,23,34,45};
//         System.out.println(arr[1]);        // 23
//         change(arr);
//         System.out.println(arr[1]);        // 54
//     }
// }

// public class arrays{
//     public static void swap(int arr[]){
//         int temp = arr[0];
//         arr[0] = arr[1];
//         arr[1] = temp;
//     }
//     public static void main(String[] args) {
//         int arr[] = {10,20};
//         System.out.println(arr[0]+" "+arr[1]);     // 10 20
//         swap(arr);
//         System.out.println(arr[0]+" "+arr[1]);     // 20 10
//     }
// }

// TWO SUM
// public class arrays{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter size of an array : ");
//         int size = sc.nextInt();
//         System.out.print("Enter target sum : ");
//         int target = sc.nextInt();
//         int arr[] = new int[size];
//         int count = 0;
//         for(int i=0;i<size;i++){
//             arr[i] = sc.nextInt();     
//         } 
//         for(int i=0;i<size;i++){
//             for(int j=i+1;j<size;j++){
//                 if(arr[i] + arr[j] == target){
//                     System.out.println(arr[i]+","+arr[j]);
//                     count++;
//                 }
//             }
//         }
//         System.out.println("Total "+count+" pairs.");
//     }
// }

// TRIPLET
// public class arrays{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter size of an array : ");
//         int size = sc.nextInt();
//         System.out.print("Enter target sum : ");
//         int target = sc.nextInt();
//         int arr[] = new int[size];
//         int count = 0;
//         for(int i=0;i<size;i++){
//             arr[i] = sc.nextInt();     
//         } 
//         for(int i=0;i<size;i++){
//             for(int j=i+1;j<size;j++){
//                 for(int k=j+1;k<size;k++){
//                     if(arr[i] + arr[j] + arr[k] == target){
//                     System.out.println(arr[i]+","+arr[j]+","+arr[k]);
//                     count++;
//                 }
//                 }
//             }
//         }
//         System.out.println("Total "+count+" pairs.");
//     }
// }
// REVERSE AN ARRAY WITHOUT EXTRA ARRAY
// public class arrays{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter size of an array : ");
//         int size = sc.nextInt();
//         int arr[] = new int[size];
//         for(int i=0;i<size;i++){
//             arr[i] = sc.nextInt();     
//         } 
//         for(int j=0;j<size/2;j++){
//             int temp = arr[j];
//             arr[j] = arr[size-j-1];
//             arr[size-j-1] = temp;
//         }
//         System.out.print("Reversed array : ");
//         for(int i=0;i<size;i++){
//             System.out.print(arr[i]+" ");     
//         } 
//     }
// }

// WITH WHILE LOOP
// public class arrays{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter size of an array : ");
//         int size = sc.nextInt();
//         int arr[] = new int[size];
//         for(int k=0;k<size;k++){
//             arr[k] = sc.nextInt();     
//         } 
//         int i = 0, j = size-1;
//         while(i<j){
//             int temp = arr[i];
//             arr[i] = arr[j];
//             arr[j] = temp;
//             i++;
//             j--;
//         }
//         System.out.print("Reversed array : ");
//         for(int l=0;l<size;l++){
//             System.out.print(arr[l]+" ");     
//         } 
//     }
// }

// ROTATE THE GIVEN ARRAY 'a' BY K STEPS, WHERE K IS NON-NEGATIVE.
// NOTE : K CAN BE GREATER THAN N AS WELL WHERE N IS THE SIZE OF ARRAY'a'.

// public class arrays{
//     public static void reverse(int arr[],int a,int b){
//         for(int i=a,j=b;i<j;i++,j--){
//             int temp = arr[i];
//             arr[i] = arr[j];
//             arr[j] = temp;
//         }
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter size of an array : ");             // Enter size of an array : 7
//         int size = sc.nextInt();
//         System.out.print("Enter steps : ");                        // Enter steps : 3
//         int k = sc.nextInt();                                      // 4 5 9 2 10 72 23
//         int arr[] = new int[size];                                 // 2 10 72 23 4 5 9
//         for(int i=0;i<size;i++){
//             arr[i] = sc.nextInt();     
//         } 
//         k = k%size;   // to remove extra reverse
//         reverse(arr,0,size-1);
//         reverse(arr,size-k,size-1);
//         reverse(arr,0,size-k-1);
//         for(int j=0;j<size;j++){
//             System.out.print(arr[j]+" ");
//         }
//     }
// }

// ALL ARRAYS INBUILD FUNCTIONS
// import java.util.Arrays;
// public class arrays{
//     public static void main(String[] args) {
//         // 1️ Original array
//         int[] arr = {5, 2, 8, 1, 3};
//         System.out.println("Original array: " + Arrays.toString(arr)); // Original array: [5, 2, 8, 1, 3]

//         // 2️ Sort
//         Arrays.sort(arr);
//         System.out.println("Sorted array: " + Arrays.toString(arr)); // Sorted array: [1, 2, 3, 5, 8]

//         // 3️ Fill
//         int[] filledArr = new int[5];
//         Arrays.fill(filledArr, 7);
//         System.out.println("Filled array: " + Arrays.toString(filledArr));  // Filled array: [7, 7, 7, 7, 7]

//         // 4️ Copy
//         int[] copyArr = Arrays.copyOf(arr, 7); // length > original
//         System.out.println("Copy with new length: " + Arrays.toString(copyArr));  // Copy with new length: [1, 2, 3, 5, 8, 0, 0]

//         // 5️ Copy range
//         int[] rangeCopy = Arrays.copyOfRange(arr, 1, 4);
//         System.out.println("Copy of range (1-3): " + Arrays.toString(rangeCopy)); // Copy of range (1-3): [2, 3, 5] last index exluded

//         // 6️ Compare arrays
//         System.out.println("Are arr and copyArr equal? " + Arrays.equals(arr, copyArr)); // Are arr and copyArr equal? false

//         // 7️ Mismatch
//         System.out.println("First mismatch between arr and copyArr at: " + Arrays.mismatch(arr, copyArr)); // First mismatch between arr and copyArr at: 5

//         // 8️ Binary search (search for 3)
//         int index = Arrays.binarySearch(arr, 3);
//         System.out.println("Index of 3 in sorted arr: " + index); // Index of 3 in sorted arr: 2

//         // 9️ HashCode
//         System.out.println("HashCode of arr: " + Arrays.hashCode(arr)); // HashCode of arr: 29615300

//         // 10 Parallel sort
//         int[] parr = {10, 9, 7, 8};
//         Arrays.parallelSort(parr);
//         System.out.println("Parallel sorted array: " + Arrays.toString(parr)); // Parallel sorted array: [7, 8, 9, 10]

//         // 11 setAll with lambda
//         int[] setAllArr = new int[5];
//         Arrays.setAll(setAllArr, i -> i * i);
//         System.out.println("SetAll array (i*i): " + Arrays.toString(setAllArr)); // SetAll array (i*i): [0, 1, 4, 9, 16]

//         // 12 parallelSetAll with lambda
//         int[] parSetAllArr = new int[5];
//         Arrays.parallelSetAll(parSetAllArr, i -> i + 10);
//         System.out.println("ParallelSetAll array (i+10): " + Arrays.toString(parSetAllArr)); // ParallelSetAll array (i+10): [10, 11, 12, 13, 14]

//         // 13 Stream
//         long count = Arrays.stream(arr).count();
//         System.out.println("Number of elements in arr (using stream): " + count); // Number of elements in arr (using stream): 5
//     }
// }

// public class arrays{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter size of an array : ");
//         int size = sc.nextInt();
//         int arr[] = new int[size];
//         for(int i=0;i<size;i++){
//             arr[i] = sc.nextInt();     
//         } 
//         boolean flag = true;
//             for(int j=1;j<size;j++){
//                 if(arr[j-1]>arr[j]){
//                     flag = false;
//                     break;
//                 }
//             }
//         if(flag) System.out.println("Array is sorted.");
//         else System.out.println("Array is not sorted.");
//     }
// }

// RETURNING ARRAY

// public class arrays{
//     public static int[] smallestAndLargestElement(int arr[]){
//         Arrays.sort(arr);
//         int n = arr.length;
//         int ans[] = {arr[0],arr[n-1]};
//         return ans;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter size of an array : ");
//         int size = sc.nextInt();
//         int arr[] = new int[size];
//         for(int i=0;i<size;i++){
//             arr[i] = sc.nextInt();
//         }
//         int ans[] = smallestAndLargestElement(arr);
//         System.out.println("Smallest and largest element in the array is : "+ans[0]+","+ans[1]);
//     }
// }

//FIND THE UNIQUE NUMBER IN A GIVEN ARRAY WHERE ALL THE ELEMENTS ARE BEING REPEATED TWICE WITH ONE VALUE BEING UNIQUE.
// public class arrays{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter size of array : ");
//         int size = sc.nextInt();
//         int arr[] = new int[size];
//         boolean flag = true;
//         for(int i=0;i<size;i++){
//             arr[i] = sc.nextInt();
//         }
//         for(int i=0;i<size;i++){
//             for(int j=i+1;j<size;j++){
//                 if(arr[i]==arr[j]){
//                     flag = false;
//                 }
//             }
//             if(flag){
//                 System.out.println(arr[i]+" is a unique element.");
//                 break;
//             }
//             flag = true;
//         }
//     }
// }

// CHECK IF NUMBER IS PRESENT IN ARRAY OR NOT (QUERIES)
// public class arrays{
//     public static int[] makeFrequencyArray(int arr[]){
//         int freq[] = new int[100005];
//         for(int i=0;i<arr.length;i++){
//             freq[arr[i]]++;
//         }
//         return freq;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter size of array : ");
//         int size = sc.nextInt();
//         int arr[] = new int[size];
//         boolean flag = true;
//         for(int i=0;i<size;i++){
//             arr[i] = sc.nextInt();
//         }
//         int freq[] = makeFrequencyArray(arr);
//         System.out.print("Enter number of queries : ");
//         int q = sc.nextInt();
//         while(q>0){
//             System.out.println("Enter number to be search : ");
//             int x = sc.nextInt();
//             if(freq[x]>0) System.out.println("YES");
//             else System.out.println("NO");
//             q--;
//         }
//     }
// }

// SORT AN ARRAY CONSISTING OF ONLY 0S AND 1S
// public class arrays{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter size of array : ");
//         int size = sc.nextInt();
//         int arr[] = new int[size];
//         int cz = 0;
//         for(int i=0;i<size;i++){
//             arr[i] = sc.nextInt();
//         }
//         for(int i=0;i<size;i++){
//             if(arr[i]==0) cz++;              // zero count karega
//         }
//         for(int j=0;j<size;j++){
//             if(j<cz) arr[j] = 0;            // utne 0's daal dega
//             else arr[j] = 1;
//         }
//         System.out.print("Sorted array : "+Arrays.toString(arr));
//     }
// }
// ALTERNATE APPROACH TO REDUCE TIME COMPLEXITY
// public class arrays{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter size of array : ");                // Enter size of array : 7
//         int size = sc.nextInt();                                   // 1 0 0 0 1 1 1
//         int arr[] = new int[size];                                 // Sorted array : [0, 0, 0, 1, 1, 1, 1]
//         for(int i=0;i<size;i++){
//             arr[i] = sc.nextInt();
//         }
//         // two pointer method 
//         int left = 0,right = size -1;
//         while(left<right){
//             while(arr[left]==0 && left<right) left++;
//             while(arr[right]==1&& left<right) right--;
//             if(left<right){
//                 int temp = arr[left];
//                 arr[left] = arr[right];
//                 arr[right]= temp;
//                 left++;
//                 right--;
//             }
//         }
//         System.out.print("Sorted array : "+Arrays.toString(arr));
//     }
// }

// MOVE ALL EVEN NUMBERS AT THE BEGINNING FOLLOWED BY ODD NUMBERS RELATIVE ORDER OF EVEN AND ODD DOESN'T MATTER
// public class arrays{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter size of array : ");                // Enter size of array : 6
//         int size = sc.nextInt();                                   // 1 3 4 5 6 8
//         int arr[] = new int[size];                                 // Sorted array : [8, 6, 4, 5, 3, 1]
//         for(int i=0;i<size;i++){
//             arr[i] = sc.nextInt();
//         }
//         // two pointer method 
//         int left = 0,right = size -1;
//         while(left<right){
//             while(arr[left]%2==0 && left<right) left++;
//             while(arr[right]%2==1&& left<right) right--;
//             if(left<right){
//                 int temp = arr[left];
//                 arr[left] = arr[right];
//                 arr[right]= temp;
//                 left++;
//                 right--;
//             }
//         }
//         System.out.print("Sorted array : "+Arrays.toString(arr));
//     }
// }

// GIVEN SORTED NON-DECREASING ORDER, RETURN AN ARRAY OF THE SQUARES OF EACH NUMBER SORTED IN NON-DECREASING ORDER.
//EX. -10 -3 -2 1 4 5 --> 100 9 4 1 16 25
// public class arrays{
//     public static int[] sortsquares(int arr[]){
//         int n = arr.length;
//         int ans[] = new int[n];
//         int left=0,right=n-1;
//         int k=0;
//         while(left<=right){
//             if(Math.abs(arr[left])>Math.abs(arr[right])){
//                 ans[k++] = arr[left]*arr[left];
//                 left++;
//             }
//             else {
//                 ans[k++] = arr[right]*arr[right];
//                 right--;
//             }
//         }
//         return ans;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter size of array : ");                // Enter size of array : 6
//         int size = sc.nextInt();                                   // -10 -5 -4 1 2 9
//         int arr[] = new int[size];                                 // Sorted array : [1, 4, 16, 25, 81, 100]
//         for(int i=0;i<size;i++){
//             arr[i] = sc.nextInt();
//         }
//         int ans[] = sortsquares(arr);        
//         Arrays.sort(ans);
//         System.out.print("Sorted array : "+Arrays.toString(ans));
//     }
// }

// PREFIX SUMS/RUNNING SUM ek particular index pe usse pehele aur usko mila ke sum uss index pe add krdo
// public class arrays{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter size of array : ");                // Enter size of array : 6
//         int size = sc.nextInt();                                   // 2 4 3 -5 1 -7
//         int arr[] = new int[size];                                 // Array with prefix sum : [2, 6, 9, 4, 5, -2]
//         for(int i=0;i<size;i++){
//             arr[i] = sc.nextInt();
//         }
//             for(int j=1;j<size;j++){
//                 arr[j] = arr[j] + arr[j-1];
//             }
//         System.out.print("Array with prefix sum : "+Arrays.toString(arr));
//     }
// }

// ANSWER Q QUERIES WHERE YOU NEED TO PRINT THE SUM OF VALUES IN A GIVEN RANGE OF INDICES FROM 1 TO R(BOTH INCLUDED),THE VALUES OF
// 1 AND R IN QUERIES FOLLOW 1-BASED INDEXING(INDEX 1 SE START HAI)
// public class arrays{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter size of array : ");            
//         int size = sc.nextInt();                            
//         int arr[] = new int[size];                                 
//         for(int i=0;i<size;i++){
//             arr[i] = sc.nextInt();
//         }
//         System.out.print("Enter number of queries : ");
//         int q = sc.nextInt();
//         while(q>0){
//             int sum = 0;
//             System.out.print("Enter starting and end index : ");
//             int stidx = sc.nextInt();
//             int lsidx = sc.nextInt();
//             for(int i=stidx-1;i<=lsidx-1;i++){
//                 sum = sum + arr[i];
//             }
//             System.out.println("Sum of values in these range("+stidx+","+lsidx+") is : "+sum);
//             q--;
//         }
//     }
// }Enter size of array : 5
// 2 4 1 3 6
// Enter number of queries : 3
// Enter starting and end index : 1 3
// Sum of values in these range(1,3) is : 7
// Enter starting and end index : 2 5
// Sum of values in these range(2,5) is : 14
// Enter starting and end index : 3 4
// Sum of values in these range(3,4) is : 4

// CHECK IF WE CAN PARTITION THE ARRAY INTO TWO SUBARRAYS WITH EQUAL SUM.MORE FORMALLY,CHECK THAT THE PREFIX SUM OF A PART OF THE ARRAY IS
// EQUAL TO THE SUFFIX SUM OF THE REST OF THE ARRAY.
// public class arrays{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter size of array : ");            // Enter size of array : 6
//         int size = sc.nextInt();                               // 5 3 2 6 3 1
//         int arr[] = new int[size];                             // Subarray possible with equal sum of 10     
//         for(int i=0;i<size;i++){
//             arr[i] = sc.nextInt();
//         }
//         for(int i=0;i<size;i++){
//             int prefixSum=0,suffixSum=0;
//             for(int j=0;j<=i;j++){
//                 prefixSum = prefixSum + arr[j];
//         }
//             for(int k=size-1;k>i;k--){
//             suffixSum = suffixSum + arr[k];
//             }
//             if(prefixSum==suffixSum) {
//             System.out.println("Subarray possible with equal sum of "+prefixSum);
//             break;
//            }
//            else if(i==size-1) System.out.println("Subarray with equal sum not possible.");
//         }
//         sc.close();
//     }
// }

//another approach to reduce time complexity
public class arrays{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");            // Enter size of array : 6
        int size = sc.nextInt();                               // 5 3 2 6 3 1
        int arr[] = new int[size];                             // Subarray possible with equal sum of 10     
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=1;i<size;i++){
            arr[i] = arr[i] +arr[i-1];
        }
        for(int i=0;i<size;i++){
             int prefixSum = arr[i];
             int suffixSum = arr[size-1] - arr[i];
            if(prefixSum==suffixSum) {
            System.out.println("Subarray possible with equal sum of "+prefixSum);
            break;
           }
           else if(i==size-1) System.out.println("Subarray with equal sum not possible.");
        }
        sc.close();
    }
}