/**
 * Created by Connor on 12/4/2016.
 */
public class Day2 {

    public static void main(String... args) {
        System.out.println(getCode('9', "RURRRRURUDDRLURUDULRDUDDDUURULDRRRRURDLDRRLLDLUDLRRLRRUULLURULLRDLLRDDDDULLRLLDDLLRUDDULDUDLDURLRUULDDURURDURDLDRRULRURRRRRLRRLLUDURRURULRLRDLRLRRRLLURURDLLLDLDDULDLUDDLLLRUDDRDRLRUDRRLDDLRDLRLRLRLRRDUUURRUDRRLDLRRUULULLUDRRRUDLURDRUULDRDRRLUULULDDLURRLDULLURLDRLDULDRLLDLUUULLULRRDDRURRURLDLDRRLLLLLUDUURUULURLRDDDLRRRRLLLURUDLDDRDDRRUDURUULDRRULLLRRLRULLLRLDDLLRRLRURLRDRUDULLDDLDDDDDLDURURDLULRDDLRDLLRURLLRDLRUDDRDRRDURDURLUDRLDUDDDRRURRLUULURULLRLRDLRRLRURULLDDURLLRRRUDDRDLULURRRUUUULUULRRLLDLRUUURLLURLUURRLRL"));
    }


    public static Character getCode(Character startingPosition, String instructions) {
        Character currPos = startingPosition;
        Character nextPos = '0';
        for (int i = 0; i < instructions.length(); i++) {
            Character currInstruction = instructions.charAt(i);
            switch (currInstruction) {
                case 'U':
                    if (currPos == '3') {
                        nextPos = '1';
                    } else if (currPos == '6') {
                        nextPos = '2';
                    } else if (currPos == '7') {
                        nextPos = '3';
                    } else if (currPos == '8') {
                        nextPos = '4';
                    } else if (currPos == 'A') {
                        nextPos = '6';
                    } else if (currPos == 'B') {
                        nextPos = '7';
                    } else if (currPos == 'C') {
                        nextPos = '8';
                    } else if (currPos == 'D') {
                        nextPos = 'B';
                    }
                    break;
                case 'D':
                    if (currPos == '1') {
                        nextPos = '3';
                    } else if (currPos == '2') {
                        nextPos = '6';
                    } else if (currPos == '3') {
                        nextPos = '7';
                    } else if (currPos == '4') {
                        nextPos = '8';
                    } else if (currPos == '6') {
                        nextPos = 'A';
                    } else if (currPos == '7') {
                        nextPos = 'B';
                    } else if (currPos == '8') {
                        nextPos = 'C';
                    } else if (currPos == 'B') {
                        nextPos = 'D';
                    }
                    break;
                case 'L':
                    if (currPos == '3') {
                        nextPos = '2';
                    } else if (currPos == '4') {
                        nextPos = '3';
                    } else if (currPos == '6') {
                        nextPos = '5';
                    } else if (currPos == '7') {
                        nextPos = '6';
                    } else if (currPos == '8') {
                        nextPos = '7';
                    } else if (currPos == '9') {
                        nextPos = '8';
                    } else if (currPos == 'B') {
                        nextPos = 'A';
                    } else if (currPos == 'C') {
                        nextPos = 'B';
                    }
                    break;
                case 'R':
                    if (currPos == '2') {
                        nextPos = '3';
                    } else if (currPos == '3') {
                        nextPos = '4';
                    } else if (currPos == '5') {
                        nextPos = '6';
                    } else if (currPos == '6') {
                        nextPos = '7';
                    } else if (currPos == '7') {
                        nextPos = '8';
                    } else if (currPos == '8') {
                        nextPos = '9';
                    } else if (currPos == 'A') {
                        nextPos = 'B';
                    } else if (currPos == 'B') {
                        nextPos = 'C';
                    }
                    break;
            }
            if (nextPos != '0')
                currPos = nextPos;
            //System.out.println(currInstruction + " pos: " + currPos);
        }
        return currPos;
    }
}
