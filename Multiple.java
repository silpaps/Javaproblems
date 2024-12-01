import java.util.Scanner;
class Multiple{
  public static void main(String[] args){

    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the value for x");
    int x = scan.nextInt();
    int mul = 0;
    int i=1;
    do{
       mul=i*x;
       System.out.println(mul);
       i++;
    }while(mul<1000);


    
  }
}