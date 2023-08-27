//write a program to check whether a number is a lucky no or not
// for a lucky no : 1634=1^4+6^4+3^4+4^4
/*
import java.util.Scanner;
public class luckyno {
    public static boolean checklucky(int n){
        if(n>0 && n<10){
            if(n==1){
                return true;
            }
            else {
                return false;
            }
        }
        else if (n>10 && n<100){
            int i= 2;
            int a = n/10;
            int b= n%10;
            if(Math.pow(a,i)+Math.pow(b,i)==n){
                return true;
            }
            else {
                return false;
            }
        }
        else if( n>100 && n<1000){
            int i=3;
            int a=n/100;
            int b1=n/10;
            int b=b1%10;
            int c=n%10;
            if(Math.pow(a,i)+Math.pow(b,i)+Math.pow(c,i)==n){
                return true;
            }
            else {
                return false;
            }
        }
        else if (n>1000 && n<10000){
            int i=4;
            int a= n/1000;
            int b1= n/100;
            int b= b1%10;
            int c1=n%100;
            int c=c1/10;
            int d=n%10;
            if(Math.pow(a,i)+Math.pow(b,i)+Math.pow(c,i)+Math.pow(d,i)==n){
                return true;
            }
            else {
                return false;
            }

        }
        return false;
    }

 */

import java.util.Scanner;
public class luckyno {
    public static boolean checklucky(int n) {
        int Digitsofno = String.valueOf(n).length();
        int sum = 0;
        int temp = n;

        while (temp > 0) {
            int digit = temp % 10;
            sum += (Math.pow(digit, Digitsofno));
            temp /= 10;
        }
        return sum==n;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean result = checklucky(n);
        System.out.println(result);
    }
}































