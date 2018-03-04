package doors;

public class hundredDoorsDivisors {

        public static void main(String args[]){
            for (int doors = 1; doors<101; doors++) {
                int count = 0;
                for(int i = 1; i <= doors; i++){
                    if ((doors % i) == 0){
                        count++;
                    }
                }
                if (count % 2 == 1){
                    System.out.print("O");
                }   else {
                    System.out.print("X");
                }
            }
        }
}