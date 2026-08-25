import java.util.*;

class all{
    public int a;
    public int b;
    public String c;
    public void add(){
        System.out.println("Addation of two number: "+ (a+b));
    }
     public void sub(){
        System.out.println("Substraction  of two number: "+ (a-b));
    }
     public void multi(){
        System.out.println("Multiply of two number: "+ (a*b));
    }

     public void div(){
        try {
            
             System.out.println("Division of two number: "+ (a/b));
        } catch (ArithmeticException e) {
        System.out.println("you does not divide by 0");
        }
    }
    void display(){
         Scanner sc = new Scanner(System.in);
        String ch;
        do{
             
        try{
        System.out.print("Enter a First Number: ");
        a=sc.nextInt();
        System.out.print("Enter a Second Number: ");
        b=sc.nextInt();
        System.out.println("Which opertion do you want(+,-,*,/)");
        }catch (InputMismatchException e){
            System.out.println("Only Number");
             
        }
        
    
        c=sc.next();
        switch (c){
            case "+":
                add();
                break;
            case "-":
                sub();
                break;
            case "*":
                multi();
                break;
            case "/":
                div();
                break;
            default:
                System.out.println("invaild operator");
        }
        System.out.println("Do you want to calclutate again(Y/N): ");
        ch = sc.next();
    }while(ch.equalsIgnoreCase("y" ));
    if(ch.equalsIgnoreCase("n")){
        System.out.println("OK" );
    }
    else{
        System.out.println("you Invaild ");
    }
}


};
public class calclutor{
    public static void main(String[] args) {
      all a = new all();
        a.display();
       
    }
}
