import java.util.Scanner; 

public class main{
public static void main(String[]args){

Scanner input = new Scanner(System.in); 

int num1; 
int num2; 
int num3; 

System.out.print("Input the 1st number: "); 
num1 = input.nextInt(); 
System.out.print("Input the 2nd number: "); 
num2 = input.nextInt();

System.out.print("Input the 3rd number: "); 
num3 = input.nextInt(); 

cap j1 = new cap(num1, num2, num3); 
j1.ifdisplay(); 
}


}