package doors;

public class hundredDoorsSquares {

        public static void main(String args[]) {
            int[] row = new int[101];
            for (int squares = 1; squares <= 10; squares++) {
                row[squares*squares]=1;
                }
            for (int i = 1; i < 101; i++) {
                if (row[i]==1)
                System.out.print("O");
                else
                    System.out.print("X");
            }
        }
}