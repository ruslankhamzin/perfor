package Task1;


import java.io.IOException;

import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int c = m;
        ArrayList<Integer> list = new ArrayList<Integer>();
        List<Integer> result = new ArrayList<>();
        int count=0;
        int countm=0;
        result.add(1);
        while (true) {
            count++;
            int num = 0;
            for (int i = 0; i < n; i++) {
                num++;
                list.add(num);

            }
            if(list.get(c-countm)==1 && c%count==0){
                break;
            }
            if(count==m && list.get(count)!=1){
                result.add(list.get(count));
                countm++;
                c+=m;
            }





        }
        for (int i = 0; i < result.size();i++){
            System.out.print(result.get(i));
        }
    }
}
