import java.util.Scanner;

class Reverse {

    public static void swap(int A[], int l, int r){
        int temp = A[l];
        A[l] = A[r];
        A[r] = temp;

    }

    public static void reverse(int A[]){
        int l = 2;
        int r = 5;

        while(l<r){
            swap(A,l,r);
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

        reverse(A);

        for (int i : A) {
            System.out.print(i + " ");
        }
        sc.close();

    }
}