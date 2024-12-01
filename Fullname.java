import java.util.Scanner;
class Fullname{
  public static void main(String[] args){

    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the value for Firstname");
    String Fisrt = scan.next();
    System.out.println("Enter the value for Secondname");
    String Second = scan.next();
    System.out.println("Enter the value for n");
    int n =scan.nextInt();
    for (int i=0; i<n; i++){
      System.out.println(Fisrt+Second);
    }


    
  }
}