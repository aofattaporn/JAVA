package TEST;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x,y,result;
        char opt;
        System.out.print("Enter number : ");
        x = scan.nextInt();
        System.out.print("Enter operation : ");
        opt = scan.next().charAt(0);
        System.out.print("Enter number : ");
        y = scan.nextInt();
        result = calculate(x, y, opt);
        System.out.println("Result : " + result);
        conti(result);
        //
    }
    public static int calculate(int x, int y, char opt){
        if(opt == '+')return x + y;
        if(opt == '-')return x - y;
        if(opt == '/')return x / y;
        if(opt == '*')return x * y;
        if(opt == '%')return x % y;
        return 0;
    }
    public static int end(){
        System.out.println("End Program.");
        return 0;
    }
    public static int conti(int result){
        Scanner scan = new Scanner(System.in);
        char opt;
        int num2;
        System.out.print("Enter operation : ");
        opt = scan.next().charAt(0);
        if (opt == 'x')return end();
        if (opt != ' '){
            System.out.print("Enter number : ");
            num2 = scan.nextInt();
            result = calculate(result,num2,opt);
            System.out.println("Result : " + result);
        }
        return conti(result);
    }
}
