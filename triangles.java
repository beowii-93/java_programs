import java.util.Scanner;
public class triangles{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double side1=sc.nextDouble();
        double side2=sc.nextDouble();
        double side3=sc.nextDouble();
        if((side1+side2)>side3 && (side2+side3)>side1 && (side1+side3)>side2){
            if(side1==side2 && side2==side3){
                System.out.println("Equilateral Triangle!");
            }
            else if(side1==side2 || side2==side3 || side3==side1){
                System.out.println("Isosceles Triangle!");
            }
            else{
                System.out.println("Scalene Triangle!");
            }
        } sc.close();
    }
    }
    
