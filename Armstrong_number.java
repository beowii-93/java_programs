// Check wheather given number is Armstrong Number or not
// To check if a number is an Armstrong number, count its digits, then raise each digit to the power of the total digit count and sum the results. If this sum equals the original number, it is an Armstrong number. For example, \(153\) is an Armstrong number because \(1^{3}+5^{3}+3^{3}=1+125+27=153\). 
import java.util.Scanner;
public class Armstrong_number{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int originalnumber=num;
        int numberofdigits=0;
        int sum=0;
        //check for number 
        //  of digits Eg:153
        int tempnum=num;
        while(tempnum!=0){
            tempnum/=10;
            numberofdigits++;
        }
        tempnum=num;//back to our originalnumber
        while(tempnum!=0){
            int digit=tempnum%10;
            sum+=Math.pow(digit,numberofdigits);
            tempnum/=10;
        }
        if(sum==originalnumber){
            System.out.println("Yes,its an armstrong number.");
        }
        else{
            System.out.println("NO.");
        }
         sc.close();
    }
}
    
