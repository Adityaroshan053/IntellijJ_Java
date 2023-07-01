package TpointcharacterPattern;

public class CharPattern1 {
    public static void main(String[] args) {
        char cha= 'A';
        for ( int i=1;i<=5;i++){
            cha='A';
            for( int j=1;j<=i;j++) {
                System.out.print(cha+" ");
                cha++;

            }
            System.out.println();

        }
    }
}
