import java.util.Scanner;

class RotateOpt {
    public static void reverse(int A[], int l, int r){
        while(l<r){
            int temp = A[l];
            A[l] = A[r];
            A[r] = temp;
            l++;
            r--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Capacity of the Array: ");
        int len = sc.nextInt();

        System.out.print("Enter the value of " + len + " elements in the Array: ");

        int A[] = new int[len];
        for (int i = 0; i < len; i++) {
        A[i] = sc.nextInt();
        }
      
        System.out.print("Enter '1' to rotate Right and '0' to Rotate Left: ");
        int dir = sc.nextInt();
        System.out.print("Enter Number of Rotations: ");
        int x = sc.nextInt();

        if (dir == 1) {
            //Right Rotation by X
            reverse(A, 0, len-1);
            reverse(A, 0, x-1);
            reverse(A, x, len-1);

        } else {
            //Left Rotation by X  
            reverse(A, 0, len-1);
            reverse(A, 0, len-x-1);
            reverse(A, len-x, len-1);
        }

        for (int i : A) {
            System.out.print(i + " ");
        }

    }

}
