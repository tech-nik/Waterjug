/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package waterjugproblem;

import java.util.Scanner;

/**
 *
 * @author Nikhil
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int x,y,z;
        System.out.println("Enter the capacity of 1st jug :-");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        System.out.println("Enter the capacity of 2nd jug :-");
        y = sc.nextInt();
        System.out.println("Enter the goal :-");
        z = sc.nextInt();  
//check if x and y are coprime
        if(((x % y)== 0)||((y%x)==0))
        {
            System.out.println("Impossible!");
            System.exit(0);
        }
        
        if (x > y)
        {
            System.out.println("2nd jug should be larger!");
            System.exit(0);
        }
        
        if (z > y)
        {
            System.out.println("Goal should be less than 2nd jug's capacity");
            System.exit(0);
        }
        
        WaterJug w = new WaterJug(x, y, z);
        w.checkGoal();
    }
    
}
