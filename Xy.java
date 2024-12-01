import java.util.Scanner;
class Xy{
  public static void main(String[] args){

    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the value for x");
    int x = scan.nextInt();
    System.out.println("Enter the value for y");
    int y = scan.nextInt();
    for (int i=0; i<y; i++){
      System.out.println(x);
    }


    
  }
}