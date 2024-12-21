import java.util.Scanner;

class InsertElement {

    public static int takeInput(String str) {
        Scanner sc = new Scanner(System.in);
        System.out.print(str);

        int input = sc.nextInt();
        return input;
    }

    public static int insert(int A[], int pos, int ele, int size) {
        for (int i = size; i > pos; i--) {
            A[i] = A[i - 1];
        }
        A[pos] = ele;
        size++;
        return size;
    }

    public static void main(String[] args) {

        int cap = takeInput("Enter the Capacity of the Array: ");

        int size = takeInput("Enter the size: ");

        int A[] = new int[cap];

        for (int i = 0; i < size; i++) {
            A[i] = takeInput("Enter the Element at " + i + "index: ");
        }

        int ele = takeInput("Enter the Element to be inserted: ");

        int pos = takeInput("Enter the position: ");

        size = insert(A, pos, ele, size);

        for (int i : A) {
            System.out.print(i + " ");
        }

    }

}
