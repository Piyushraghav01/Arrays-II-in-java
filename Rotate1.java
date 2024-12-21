import java.util.Scanner;

class Rotate1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter '1' to rotate Right and '0' to Rotate Left: ");
        int dir = sc.nextInt();
        System.out.print("Enter Number of Rotations: ");
        int x = sc.nextInt();

        int A[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int len = A.length;
        int B[] = new int[len];

        if(dir ==1){
            //Right Rotation by x
            for(int i = 0; i<len; i++){
                B[(i+x)%len]  = A[i];
            }
        }else{
            //Left Rotation by x
            for(int i = 0; i<len; i++){
                B[(i-x+len)%len] = A[i];
            }
        }

        for(int i: A){
            System.out.print(i+" ");
        }
        System.out.println();
        for(int i: B){
            System.out.print(i+" ");
        }

        
        sc.close();

    }

}
