import java.util.Scanner;

public class javacode{
    public static void main(String[]args){
        System.out.println("Hello World");
        System.out.println("Please Enter Your Name");
        // int x= 5;
        Scanner in= new Scanner(System.in);
        String s = in.nextLine();
        
        // String p = in.nextLine();
        // System.out.println(s);
        // System.out.println(x);

        if(s.equals("Collins")){
            System.out.println("Welcome collins");
            
        }
        else if (s.equals("peris")){
            System.out.println("Welcome peris");

        }
        else{
            System.out.println("Try a diffferent program");
        }
        // While loop
    int i= 0;
    while(i<10){
        System.out.println("i is:"+i);
        i++;
  
    // do while loop
    do{
        System.out.println("i is" + i);
        i++;
    }while(i < 10);

    //   for loop
    for(int i = 10; i<10; i++){
        System.out.println(i);
    
    }
    in.close();
    }
}