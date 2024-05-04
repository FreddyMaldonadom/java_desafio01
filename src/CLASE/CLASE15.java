package CLASE;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CLASE15 {
    public static void main(String[] args) {
//            List<Integer> num = Arrays.asList(1,4,8,5,5,10,2);
            List<Integer>num = new ArrayList<>();
            num.add(1);
            num.add(1);
            num.add(1);
            num.add(1);
            num.add(1);
            num.add(1);
            num.stream().forEach(System.out::println);
        System.out.println("****");
        num.stream().forEach(System.out::println);


        }
    }

