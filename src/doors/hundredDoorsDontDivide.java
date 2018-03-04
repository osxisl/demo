package doors;

public class hundredDoorsDontDivide {

    public static void main(String[] args) {
        boolean[] doors = new boolean[100];

        for (int b = 1; b < 101; b++) {
            for (int a = b; a < 101; a += b) {
                doors[a - 1] = !doors[a - 1];
            }
        }
        for (int i = 0; i < 100; i++) {
            if (doors[i]) System.out.print("O");
            else System.out.print("X");
        }
    }
}