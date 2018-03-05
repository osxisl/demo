import java.util.Scanner;

public class alphabetDiamond {
    public static void main(String[] args) {
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("Enter a capital letter to display: ");

        Scanner in = new Scanner(System.in);
        String letter = in.next();
        String space = " ";

        for (int i =0; i<26; i++) {
            if(letter.charAt(0) == alphabet.charAt(i)){
                int b = i;
                int c = 1;
                c = -c;
                    for (int a=0; a<i+1; a++){ // Upper part of the diamond and middle
                        String spacesBefore = new String(new char[b]).replace("\0", space);
                        b=b-1;
                        System.out.print(spacesBefore);
                        System.out.print(alphabet.charAt(a));
                        if (c>0){
                            String spacesAfter = new String(new char[c]).replace("\0", space);
                            System.out.print(spacesAfter);
                            System.out.print(alphabet.charAt(a));
                        }
                        c=c+2;
                        System.out.println();
                    }
                c=c-4;
                b= - b;

                for (int a=i; a>0; a--){ //bottom part of the diamond
                    String spacesBefore = new String(new char[b]).replace("\0", space);
                    b=b+1;
                    System.out.print(spacesBefore);
                    System.out.print(alphabet.charAt(a-1));
                    if (c>0){
                        String spacesAfter = new String(new char[c]).replace("\0", space);
                        System.out.print(spacesAfter);
                        System.out.print(alphabet.charAt(a-1));
                    }
                    c=c-2;
                    System.out.println();
                }
            }
        }
    }
}