package Recursion;

public class TowerOfHanoi {

    static void towerOfHanoi(int disks, char A, char B, char C){
        // Base case
        if(disks == 0){
            return;
        }
        // Recursive case
        towerOfHanoi(disks - 1, A, C, B); // Move n-1 disks from A to C using B as auxiliary
        System.out.println("Move disk " + disks + " from " + A + " to " + B); // Move the nth disk from A to B
        towerOfHanoi(disks - 1, C, B, A); // Move n-1 disks from C to B using A as auxiliary

        // Time complexity: O(2^n) where n is the number of disks
    }

    public static void main(String[] args) {
        towerOfHanoi(3, 'A', 'B', 'C');
    }
}
