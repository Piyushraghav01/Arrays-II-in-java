import java.util.Scanner;

class Update {
    public static int takeInput(String str) {
        Scanner sc = new Scanner(System.in);
        System.out.print(str);

        int input = sc.nextInt();
        return input;
    }

    public static void update(int A[], int key, int newKey) {
        for (int i = 0; i < A.length; i++) {
            if (A[i] == key) {
                A[i] = newKey;
                return;
            }
        }
        System.out.println("Key is not found in the Array!");

    }

    public static void main(String[] args) {
        int cap = takeInput("Enter the capacity of the Array: ");
        int A[] = new int[cap];

        for (int i = 0; i < cap; i++) {
            A[i] = takeInput("Enter the element at " + i + " index: ");
        }

        int key = takeInput("Enter the key: ");
        int newKey = takeInput("Enter the newKey: ");
        update(A, key, newKey);

        System.out.println("Updated Array is: ");
        for (int i : A) {
            System.out.print(i + " ");
        }
    }

}
