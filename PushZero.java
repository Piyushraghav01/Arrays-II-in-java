import java.util.Scanner;

class PushZero {

    public static void pushZeroes(int A[]) {
        int z= 0;

        for(int nz = 0; nz<A.length; nz++){
             if(A[nz]!=0){
                int temp = A[z];
                A[z] = A[nz];
                A[nz] = temp;
                z++;
            }

        }

        // while(nz<A.length){
        //     if(A[nz]!=0){
        //         int temp = A[z];
        //         A[z] = A[nz];
        //         A[nz] = temp;
        //         nz++;
        //         z++;
        //     }else{
        //         nz++;
        //     }
        // }

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

        pushZeroes(A);

        for (int i : A) {
            System.out.print(i + " ");
        }

        sc.close();

    }

}
