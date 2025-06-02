package Day1;

import java.util.List;
import java.nio.file.*;
import utils.InputReader;

public class part2 {
    public static void main(String[] args){
        List<String> input = InputReader.readLines("Day1/input.txt");

        int sum = 0;
        int last = Integer.MAX_VALUE;

        for (int i = 2; i < input.size(); i++) {
            int num = Integer.parseInt(input.get(i - 2)) + Integer.parseInt(input.get(i - 1)) + Integer.parseInt(input.get(i));
            if (num > last) {
                sum += 1;
            };
            last = num;
        }


        System.out.println(sum);
    }
}