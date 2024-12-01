import java.util.Scanner;
class Triangle {
    public static void main(String[] args) {
    System.out.println("enter 3 angles for triangle");
    Scanner scan = new Scanner(System.in);
    int a1 = scan.nextInt();
    int a2 = scan.nextInt();
    int a3 = scan.nextInt();
    int sum=a1+a2+a3;
    // System.out.println(sum);
    if(sum==180){
        System.out.println("Triangle can be formed");  
    }else{
        System.out.println("Triangle cannot be formed");
    }
}
    
}