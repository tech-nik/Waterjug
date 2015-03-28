
package waterjugproblem;

/**
 *
 * @author Nikhil
 */
public class WaterJug 
{
    int a,b,a_max,b_max,goal;
    
    public WaterJug(int x,int y,int z)
    {
        a = 0;
        b = 0;
        a_max = x;
        b_max = y;
        goal = z;
        
    }
    
    public void checkGoal()
    {
        boolean fin = false;
        while(!fin)
        {
            System.out.println("Jug 1 : "+a+"litres,Jug 2 : "+b+"litres");
            if ((a == goal) || (b==goal))
            {
                fin = true;
                System.out.println("Goal Reached!");
                System.exit(0);
            }
            if (a == 0)
            {
                fillA();
            }
            else if ((a >0) && (b!=b_max))
            {
                transferAtoB();
            }
            else if((a>0) && (b==b_max))
            {
                emptyB();
            }
        }
    }
    
    
    public void fillA()
    {
        System.out.println("Filling Jug 1...");
        a = a_max;
    }
    
    public void emptyB()
    {
        System.out.println("Emptying Jug 2...");
        b = 0;
    }
    
    public void transferAtoB()
    {
        
        System.out.println("Pouring from Jug 1 to Jug 2...");
        
//        a = 0;     // a shouldnt always be 0...it should hold the remaining water after pouring to jug 2
//        if((b+temp)>b_max)
//        {
//            b =b_max;
//        }
//        else
//        {
//            b+=temp;
//        }
        
        
        int space = b_max - b;
        if (space > a)
        {
            b = b+a;
            a = 0;
        }
        else if (space == a)
        {
            b = b_max;
            a = 0;
        }
        else
        {
            b = b+space;
            a = a-space;
        }
    
    }
}
