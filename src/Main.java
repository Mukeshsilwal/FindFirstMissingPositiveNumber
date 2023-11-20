import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FindNextPositiveNumber number=new FindNextPositiveNumber();
        System.out.println("Please enter the number!");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int[] d=new int[num];
        System.out.println("Enter the number");
        for(int i=0;i<d.length;i++){
             d[i]=sc.nextInt();
        }
        int result=number.findNextPositiveNumber(d);
        System.out.println(result);
    }
}