import java.util.Scanner;
class Strong_number{
static long factorial(long n){
if(n<=1) return 0;
else return n*factorial(n-1);
}
public static void main(String[] args){
Scanner s=new Scanner(System.in);
long num,temp,sum=0;
num=s.nextInt();
temp=num;
while(temp>0){
long digit =temp%10;
sum+=factorial(digit);
temp/=10;
}
System.out.println((sum==num)?"Strong Number" : "Not a strong Number");
}
}