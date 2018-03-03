public class sevenSegmDisplay {
    public static void main(String[] args) {
        int number = 1982736450;

        String numberStr = String.valueOf(number);
        int[] numberArray = new int [numberStr.length()];
        for (int i=0; i<numberStr.length(); i++) {
            numberArray[i] = Integer.parseInt( String.valueOf(numberStr.charAt(i)) );
        }
        String[][] symbolsArray = {
                {"._. ", "... ", "._. ", "._. ", "... ", "._. ", "._. ", "._. ", "._. ", "._. "},
                {"|.| ", "..| ", "._| ", "._| ", "|_| ", "|_. ", "|_. ", "..| ", "|_| ", "|_| "},
                {"|_| ", "..| ", "|_. ", "._| ", "..| ", "._| ", "|_| ", "..| ", "|_| ", "..| "},
                };

        for (int i=0; i<3; i++){
            for ( int DigitsNumber = 0; DigitsNumber<numberStr.length();DigitsNumber++) {
                int num = numberArray[DigitsNumber];
                System.out.print(symbolsArray[i][num]);
            }
            System.out.println("");
        }
    }
}