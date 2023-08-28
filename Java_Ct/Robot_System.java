import java.awt.*;
import java.util.Scanner;

public class Robot_System {
    public static int x[]={0};
    int y[]={0};
     public static String location="N";
     public void setlocation(int x1,int y1)
     {
         x[0]=x1;
         y[0]=y1;
     }
     public void setDirection(String direction)
     {
         location=direction;
     }
    public void turnRight()
    {
       if(location=="N")
       {
           location="E";
       }
       else if(location=="E")
       {
           location="S";
       } else if (location=="S") {
           location="W";
       } else {
           location="N";
       }
    }
    public void turnLift()
    {
        if(location=="N")
        {
            location="W";
        }
        else if(location=="W")
        {
            location="S";
        } else if (location=="S") {
            location="E";
        } else {
            location="N";
        }
    }
    public void move()
    {
        if(location=="N")
        {
            y[0]=y[0]+1;
        }
        else if(location=="E")
        {
            x[0]=x[0]+1;
        } else if (location=="S") {
            y[0]=y[0]-1;
        } else {
            x[0]=x[0]-1;
        }
    }
    public int getlocationofx()
    {
        return x[0];
    }
    public int getlocationofy()
    {
        return y[0];
    }
    public String getDirection()
    {
        return location;
    }






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

