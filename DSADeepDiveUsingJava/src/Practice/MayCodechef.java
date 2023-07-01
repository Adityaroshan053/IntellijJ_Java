package Practice;

import java.util.*;

public class MayCodechef {

    public static int countStep(int n, int taken,ArrayList<Map<Integer,Integer>> array_list){
        if (n <= 1) return 0;
        if (array_list.get(n).containsKey(taken)) {
            return array_list.get(n).get(taken);
        }
        if (taken == 4) {
            Integer val = 1 + Math.min(countStep(n - 1, 1, array_list), Math.min(countStep(n - 2, 2, array_list), countStep(n - 3, 3, array_list)));
            array_list.get(n).put(taken, val);
            return val;
        }
        if (taken == 1) {
            Integer val = 1 + Math.min(countStep(n - 2, 2, array_list), countStep(n - 3, 3, array_list));
            array_list.get(n).put(taken, val);
            return val;

        }
        if (taken == 2) {
            Integer val = 1 + Math.min(countStep(n - 1, 1, array_list), countStep(n - 3, 3, array_list));
            array_list.get(n).put(taken, val);
            return val;

        }
        if (taken == 3) {
            Integer val = 1 + Math.min(countStep(n - 1, 1, array_list), countStep(n - 2, 2, array_list));
            array_list.get(n).put(taken, val);
            return val;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        //ArrayList<Map<Integer,Integer>> array_list = new ArrayList<Map<Integer,Integer> >();

        while (t-- > 0) {
            ArrayList<Map<Integer,Integer>> array_list = new ArrayList<Map<Integer,Integer> >();
            int n = sc.nextInt();
            for(int i = 0; i <= n+1; i++)  {
                array_list.add(i,new HashMap<Integer,Integer>());
            }
            System.out.println(countStep(n,4,array_list));

        }
    }
}