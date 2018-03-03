package doors;

public class hundredDoors {

    public static void main(String[] args) {
        boolean[] doors = new boolean[100];
        printDoorsState(doors); // initial doors state (false)
        for (int b=1; b<101; b++) {
            for (int a = 1; a < 101; a++) {
                if (a % b == 0)
                    doors[a-1] = !doors[a-1];
            }
            printDoorsState(doors);
        }
    }
    public static void printDoorsState (boolean[] doors) {
        for (int i = 0; i < 100; i++) {
            if (doors[i]) System.out.print("O");
            else System.out.print("X");
        }
        System.out.println("");
    }
}