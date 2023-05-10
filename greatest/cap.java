public class cap{
private int num1; 
private int num2; 
private int num3; 


public cap(int num1, int num2, int num3){
this.num1=num1; 
this.num2=num2; 
this.num3=num3; 

}

public int getNum1(){
return num1;

}

public int getNum2(){
return num2;

}

public int getNum3(){
return num3;

}

public void ifdisplay(){
 
if(getNum1()>getNum2()){
if(getNum1()>getNum3()){
System.out.print("The greatest is "+getNum1()); 
}
if (getNum2()>getNum3()){
 if (getNum2()>getNum1()){
System.out.print("The greatest is "+getNum2()); 
}
}
}
 if (getNum3()>getNum1()){
 if (getNum3()>getNum2()){
System.out.print("The greatest is "+getNum3()); 
}
}

}

}