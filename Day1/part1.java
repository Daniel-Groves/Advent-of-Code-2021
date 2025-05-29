package Day1;

import java.util.List;
import java.nio.file.*;
import utils.InputReader;

public class part1 {
    public static void main(String[] args){
        List<String> input = InputReader.readLines("Day1/input.txt");

        int sum = 0;
        int last = 999999999;
        for (String line : input) {
            int number = Integer.parseInt(line);
            if (number > last) {
                sum += 1;
            }
            last = number;
        }

        System.out.println(sum);
    }
}