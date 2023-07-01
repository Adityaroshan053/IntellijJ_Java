package TpointNumberProgram2;

public class ConvertNumberIntoWord {

    public static int getNum (int n){
        if(n==0) {
        return 0;
        }
        if(n==1) return 1;
        if(n==2) return 2;
        if(n%2==0) return 2;
        return n-1;



    }

    public static void main(String[] args) {
        int n = 6;
        int temp=n;
        int le,re;
        while(n!=0){
            n = getNum(n);
            System.out.println(n);
        }
        if(n%2==0){
            le=n/(n/2);
            temp=le-2;
        }
        else {
            re=(n-1)/(n-1/2);
            temp=re-2;
        }
        System.out.println(temp);


    }
}
