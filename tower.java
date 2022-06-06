package Lections;

// Написать программу, показывающую последовательность действий для игры “Ханойская башня”

public class tower {
    public static int f = 0;
    
    static void hanoy(int n, char from_rod, char to_rod, char aux_rod) {
        if (n==1) {
            System.out.println("Move disk 1 from rod " + from_rod + " to rod " + to_rod);
            return;
        }
        
        hanoy( n-1, from_rod,  aux_rod, to_rod);
       
        System.out.println("Move disk " + n + " from rod " + from_rod + " to rod " + to_rod);

        hanoy( n-1, aux_rod,  to_rod, from_rod);
        
    }
    // int n = 33;
    
    // n = n-- - --n;
    // System.out.println(n);
    
    public static void main(String args[]) {
        
        int n = 3;
        hanoy( n,'A', 'C', 'B');
    }
    
}
