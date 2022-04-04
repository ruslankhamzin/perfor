package Task4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Integer> values = new ArrayList<>(ReadFile.readFile());
        Collections.sort(values);
        int mid = values.size()/2;
        int res=0;
        for (int i=0;i<values.size();i++){
            res+=Math.abs(values.get(i)-values.get(mid));
        }
        System.out.println(res);


    }
}
