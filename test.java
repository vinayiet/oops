import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array (N): ");
        int N = input.nextInt();

        int[] ARR = new int[N];
        int index = 0;

        for (int i = 1; i <= N; i += 2) {
            ARR[index] = i;
            index++;
        }

        for (int i = N - 1; i >= 1; i -= 2) {
            ARR[index] = i;
            index++;
        }

        System.out.print("Populated array (ARR): ");
        for (int num : ARR) {
            System.out.print(num + " ");
        }
    }
}
