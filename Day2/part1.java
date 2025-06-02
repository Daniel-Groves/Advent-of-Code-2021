package Day2;

import java.util.List;
import java.nio.file.*;
import utils.InputReader;

public class part1 {
    public static void main(String[] args){
        List<String> input = InputReader.readLines("Day2/input.txt");

        int depth = 0;
        int horizontal = 0;
        for (String line: input){
            String[] parts = line.split(" ");
            String dir = parts[0];
            int amnt = Integer.parseInt(parts[1]);
            switch (dir){
                case "forward":
                    horizontal += amnt;
                    break;
                case "down":
                    depth += amnt;
                    break;
                case "up":
                    depth -= amnt;
                    break;
            }

        }

        System.out.println(depth * horizontal);
    }
}