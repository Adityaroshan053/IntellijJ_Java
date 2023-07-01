package JavaTpointprogram;

public class AlphabetStarPtrn {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j<=4; j++) {
                if ((i>=2 && j<=4) || (i>=6 && i<=8)) {
                    System.out.print("*"+"  "+" "+"*");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();

            }



        }

    }


