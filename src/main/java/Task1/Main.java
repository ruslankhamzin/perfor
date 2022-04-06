package Task1;


import java.io.IOException;

import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        ArrayList<Integer> list = new ArrayList<Integer>();
        List<Integer> result = new ArrayList<>();
        int num = 0;
        for (int i = 0; i < n; i++) {
            num++;
            list.add(num);

        }
        int count=0;
        result.add(1);
        while (true) {
            count++;

            if(list.get(count)==1 && count%(m-1)==0){
                break;
            }
            if(count==m-1 && list.get(count)!=1){
                result.add(list.get(count));
                count=-1;
            }
        }
        for (int i = 0; i < result.size();i++){
            System.out.print(result.get(i));
        }
    }
}
