//import java.util.Scanner;
//
//public class Functions {
//    public static void printMyName(String name){
//        System.out.println(name);
//        return ;
//    }
//    public static void main(String args[]) {
//        Scanner sc = new Scanner(System.in);
//        String name = sc.next();
//
//        printMyName(name); //call function
//    }
//}

//import java.util.Scanner;
//public class Functions{
//    public static int calculateSum(int a,int b){
//        int sum = a+b;
//        return sum;
//    }
//    public static void main(String args[]){
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//
//        int sum = calculateSum(a, b);
//        System.out.println("Sum of 2 numbers is:"+sum);
//    }
//}
import java.util.Scanner;
public class Functions{
    public static int calculateProduct(int a,int b){
        int product = a*b;
        return product;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int product= calculateProduct(a, b);
        System.out.println("Product of 2 numbers is:"+product);
    }
}