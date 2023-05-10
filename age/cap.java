public class cap{

private int age; 

public cap (int age){
this.age=age; 
}

public int getAge(){
return age; 
}

public void ifdisplay(){
if(getAge()<=-1){
System.out.print("Invalid age"); 
}
else if(getAge()<=12){
System.out.print("You are a Child"); 
}
else if(getAge()<=19){
System.out.print("You are a Teenager"); 
}
else if (getAge()<=29){
System.out.print("You are a young adult"); 
}
else if(getAge()<=59){
System.out.print("You are a adult"); 
}
else if(getAge()<=100){
System.out.print("You are a senior citizen"); 
}

}

}