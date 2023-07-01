package JavaByMicrosoftVlDidi;

public class BitManipulationGet {
    public static void main(String[] args) {
        int n=85;
        int pos=6;
        int BitMask=1<<pos;
        if ((BitMask&n)==0){
            System.out.println("Bit was Zero 0");
        }
        else {
            System.out.println("Bit was One 1");
        }

    }
}
