import java.util.Scanner;

public class Robot_System_Runner {
    public static void main(String[] args) {
        Robot_System Robot1=new Robot_System();
        Scanner in=new Scanner(System.in);
        int a,b;
        String Direction;
        System.out.println("Enter the Robot position of X axis:");
        a= in.nextInt();
        System.out.println("Enter the Robot position of Y axis:");
        b=in.nextInt();
        System.out.println("Enter the Robot direction :");
        Direction=in.next();
        System.out.println("Direction of the Robot:"+Robot1.getDirection());
        System.out.println("Position of the Robot of x:"+Robot1.getlocationofx());
        System.out.println("position of the Robot of y:"+Robot1.getlocationofy());

    }
}
