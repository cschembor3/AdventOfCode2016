import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Created by Connor on 12/8/2016.
 */
public class Day8 {

    public static void main(String... args) {
        display(getRepresentation("rect 1x1\n" +
                "rotate row y=0 by 6\n" +
                "rect 1x1\n" +
                "rotate row y=0 by 3\n" +
                "rect 1x1\n" +
                "rotate row y=0 by 5\n" +
                "rect 1x1\n" +
                "rotate row y=0 by 4\n" +
                "rect 2x1\n" +
                "rotate row y=0 by 5\n" +
                "rect 2x1\n" +
                "rotate row y=0 by 2\n" +
                "rect 1x1\n" +
                "rotate row y=0 by 5\n" +
                "rect 4x1\n" +
                "rotate row y=0 by 2\n" +
                "rect 1x1\n" +
                "rotate row y=0 by 3\n" +
                "rect 1x1\n" +
                "rotate row y=0 by 3\n" +
                "rect 1x1\n" +
                "rotate row y=0 by 2\n" +
                "rect 1x1\n" +
                "rotate row y=0 by 6\n" +
                "rect 4x1\n" +
                "rotate row y=0 by 4\n" +
                "rotate column x=0 by 1\n" +
                "rect 3x1\n" +
                "rotate row y=0 by 6\n" +
                "rotate column x=0 by 1\n" +
                "rect 4x1\n" +
                "rotate column x=10 by 1\n" +
                "rotate row y=2 by 16\n" +
                "rotate row y=0 by 8\n" +
                "rotate column x=5 by 1\n" +
                "rotate column x=0 by 1\n" +
                "rect 7x1\n" +
                "rotate column x=37 by 1\n" +
                "rotate column x=21 by 2\n" +
                "rotate column x=15 by 1\n" +
                "rotate column x=11 by 2\n" +
                "rotate row y=2 by 39\n" +
                "rotate row y=0 by 36\n" +
                "rotate column x=33 by 2\n" +
                "rotate column x=32 by 1\n" +
                "rotate column x=28 by 2\n" +
                "rotate column x=27 by 1\n" +
                "rotate column x=25 by 1\n" +
                "rotate column x=22 by 1\n" +
                "rotate column x=21 by 2\n" +
                "rotate column x=20 by 3\n" +
                "rotate column x=18 by 1\n" +
                "rotate column x=15 by 2\n" +
                "rotate column x=12 by 1\n" +
                "rotate column x=10 by 1\n" +
                "rotate column x=6 by 2\n" +
                "rotate column x=5 by 1\n" +
                "rotate column x=2 by 1\n" +
                "rotate column x=0 by 1\n" +
                "rect 35x1\n" +
                "rotate column x=45 by 1\n" +
                "rotate row y=1 by 28\n" +
                "rotate column x=38 by 2\n" +
                "rotate column x=33 by 1\n" +
                "rotate column x=28 by 1\n" +
                "rotate column x=23 by 1\n" +
                "rotate column x=18 by 1\n" +
                "rotate column x=13 by 2\n" +
                "rotate column x=8 by 1\n" +
                "rotate column x=3 by 1\n" +
                "rotate row y=3 by 2\n" +
                "rotate row y=2 by 2\n" +
                "rotate row y=1 by 5\n" +
                "rotate row y=0 by 1\n" +
                "rect 1x5\n" +
                "rotate column x=43 by 1\n" +
                "rotate column x=31 by 1\n" +
                "rotate row y=4 by 35\n" +
                "rotate row y=3 by 20\n" +
                "rotate row y=1 by 27\n" +
                "rotate row y=0 by 20\n" +
                "rotate column x=17 by 1\n" +
                "rotate column x=15 by 1\n" +
                "rotate column x=12 by 1\n" +
                "rotate column x=11 by 2\n" +
                "rotate column x=10 by 1\n" +
                "rotate column x=8 by 1\n" +
                "rotate column x=7 by 1\n" +
                "rotate column x=5 by 1\n" +
                "rotate column x=3 by 2\n" +
                "rotate column x=2 by 1\n" +
                "rotate column x=0 by 1\n" +
                "rect 19x1\n" +
                "rotate column x=20 by 3\n" +
                "rotate column x=14 by 1\n" +
                "rotate column x=9 by 1\n" +
                "rotate row y=4 by 15\n" +
                "rotate row y=3 by 13\n" +
                "rotate row y=2 by 15\n" +
                "rotate row y=1 by 18\n" +
                "rotate row y=0 by 15\n" +
                "rotate column x=13 by 1\n" +
                "rotate column x=12 by 1\n" +
                "rotate column x=11 by 3\n" +
                "rotate column x=10 by 1\n" +
                "rotate column x=8 by 1\n" +
                "rotate column x=7 by 1\n" +
                "rotate column x=6 by 1\n" +
                "rotate column x=5 by 1\n" +
                "rotate column x=3 by 2\n" +
                "rotate column x=2 by 1\n" +
                "rotate column x=1 by 1\n" +
                "rotate column x=0 by 1\n" +
                "rect 14x1\n" +
                "rotate row y=3 by 47\n" +
                "rotate column x=19 by 3\n" +
                "rotate column x=9 by 3\n" +
                "rotate column x=4 by 3\n" +
                "rotate row y=5 by 5\n" +
                "rotate row y=4 by 5\n" +
                "rotate row y=3 by 8\n" +
                "rotate row y=1 by 5\n" +
                "rotate column x=3 by 2\n" +
                "rotate column x=2 by 3\n" +
                "rotate column x=1 by 2\n" +
                "rotate column x=0 by 2\n" +
                "rect 4x2\n" +
                "rotate column x=35 by 5\n" +
                "rotate column x=20 by 3\n" +
                "rotate column x=10 by 5\n" +
                "rotate column x=3 by 2\n" +
                "rotate row y=5 by 20\n" +
                "rotate row y=3 by 30\n" +
                "rotate row y=2 by 45\n" +
                "rotate row y=1 by 30\n" +
                "rotate column x=48 by 5\n" +
                "rotate column x=47 by 5\n" +
                "rotate column x=46 by 3\n" +
                "rotate column x=45 by 4\n" +
                "rotate column x=43 by 5\n" +
                "rotate column x=42 by 5\n" +
                "rotate column x=41 by 5\n" +
                "rotate column x=38 by 1\n" +
                "rotate column x=37 by 5\n" +
                "rotate column x=36 by 5\n" +
                "rotate column x=35 by 1\n" +
                "rotate column x=33 by 1\n" +
                "rotate column x=32 by 5\n" +
                "rotate column x=31 by 5\n" +
                "rotate column x=28 by 5\n" +
                "rotate column x=27 by 5\n" +
                "rotate column x=26 by 5\n" +
                "rotate column x=17 by 5\n" +
                "rotate column x=16 by 5\n" +
                "rotate column x=15 by 4\n" +
                "rotate column x=13 by 1\n" +
                "rotate column x=12 by 5\n" +
                "rotate column x=11 by 5\n" +
                "rotate column x=10 by 1\n" +
                "rotate column x=8 by 1\n" +
                "rotate column x=2 by 5\n" +
                "rotate column x=1 by 5"));
    }

    private static Integer[][] getRepresentation(String input) {
        Integer[][] representation = new Integer[6][50];
        String[] instructions = input.split("\n");
        for (String instuction : instructions) {
            String[] words = instuction.split(" ");
            switch (words[0]) {
                case "rect":
                    String[] nums = words[1].split("x");
                    int height = Integer.parseInt(nums[0].trim());
                    int width = Integer.parseInt(nums[1].trim());
                    for (int i = 0; i < width; i++) {
                        for (int j = 0; j < height; j++) {
                            representation[i][j] = 1;
                        }
                    }
                    break;
                case "rotate":
                    if (words[1].equals("row")) {
                        String[] y = words[2].split("=");
                        int row = Integer.parseInt(y[1].trim());
                        int amount = Integer.parseInt(words[4].trim());
                        Collections.rotate(Arrays.asList(representation[row]), amount);
                    } else {
                        String[] x = words[2].split("=");
                        int column = Integer.parseInt(x[1].trim());
                        int amount = Integer.parseInt(words[4].trim());
                        ArrayList<Integer> col = new ArrayList<>();
                        for (int i = 0; i < representation.length; i++) {
                            col.add(representation[i][column]);
                        }
                        Collections.rotate(col, amount);
                        int a = 0;
                        for (int i = 0; i < representation.length; i++) {
                            representation[i][column] = col.get(a);
                            a++;
                        }
                    }
                    break;
            }
        }
        return representation;
    }

    private static void display(Integer[][] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == null || arr[i][j] == 0) {
                    System.out.print(". ");
                } else if (arr[i][j] == 1) {
                    System.out.print("# ");
                    count++;
                } else {
                    System.out.println("error");
                }
            }
            System.out.println();
        }
        System.out.println("count: " + count);
    }
}
