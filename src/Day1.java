/**
 * Created by Connor on 12/3/2016.
 */

import java.util.ArrayList;


public class Day1 {
    public static void main(String... args) {
        RelativeDirection north = RelativeDirection.N;
        Day1 d = new Day1();
        System.out.println(d.getDistance("R1, L4, L5, L5, R2, R2, L1, L1, R2, L3, R4, R3, R2, L4, L2, R5, L1, R5, L5, L2, L3, L1, R1, R4, R5, L3, R2, L4, L5, R1, R2, L3, R3, L3, L1, L2, R5, R4, R5, L5, R1, L190, L3, L3, R3, R4, R47, L3, R5, R79, R5, R3, R1, L4, L3, L2, R194, L2, R1, L2, L2, R4, L5, L5, R1, R1, L1, L3, L2, R5, L3, L3, R4, R1, R5, L4, R3, R1, L1, L2, R4, R1, L2, R4, R4, L5, R3, L5, L3, R1, R1, L3, L1, L1, L3, L4, L1, L2, R1, L5, L3, R2, L5, L3, R5, R3, L4, L2, R2, R4, R4, L4, R5, L1, L3, R3, R4, R4, L5, R4, R2, L3, R4, R2, R1, R2, L4, L2, R2, L5, L5, L3, R5, L5, L1, R4, L1, R1, L1, R4, L5, L3, R4, R1, L3, R4, R1, L3, L1, R1, R2, L4, L2, R1, L5, L4, L5", north));
    }

    public Day1() {}

    public enum RelativeDirection {N, S, E, W};

    public class Coordinates {
        private int x;
        private int y;

        public Coordinates(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj == null) return false;
            if (obj == this) return true;
            if (!(obj instanceof Coordinates)) return false;
            Coordinates otherCoords = (Coordinates) obj;
            if (this.x == otherCoords.x && this.y == otherCoords.y) {
                return true;
            }
            return false;
        }
    }

    private int getDistance(String directions, RelativeDirection initialFacingDirection) {
        int x_coordinate = 0;
        int y_coordinate = 0;
        RelativeDirection facingDirection = initialFacingDirection;
        String[] formattedDirections = directions.replace(" ", "").split(",");
        ArrayList<Coordinates> visited = new ArrayList<Coordinates>();
        for (int i = 0; i < formattedDirections.length; i++) {
            switch (facingDirection) {
                case N:
                    if (formattedDirections[i].charAt(0) == 'L') {
                        //x_coordinate -= Integer.parseInt(formattedDirections[i].replace("L", "")
                        //        .replace("R", ""));
                        for (int j = 0; j < Integer.parseInt(formattedDirections[i].replace("L", "")
                                        .replace("R", "")); j++) {
                            Coordinates c = new Coordinates(x_coordinate, y_coordinate);
                            if (visited.contains(c)) {
                                return Math.abs(x_coordinate) + Math.abs(y_coordinate);
                            }
                            visited.add(new Coordinates(x_coordinate,y_coordinate));
                            x_coordinate -= 1;
                        }
                        facingDirection = RelativeDirection.W;
                    } else {
                        //x_coordinate += Integer.parseInt(formattedDirections[i].replace("L", "")
                        //        .replace("R", ""));
                        for (int j = 0; j < Integer.parseInt(formattedDirections[i].replace("L", "")
                                .replace("R", "")); j++) {
                            Coordinates c = new Coordinates(x_coordinate, y_coordinate);
                            if (visited.contains(c)) {
                                return Math.abs(x_coordinate) + Math.abs(y_coordinate);
                            }
                            visited.add(new Coordinates(x_coordinate,y_coordinate));
                            x_coordinate += 1;
                        }
                        facingDirection = RelativeDirection.E;
                    }
                    break;
                case E:
                    if (formattedDirections[i].charAt(0) == 'L') {
                        //y_coordinate += Integer.parseInt(formattedDirections[i].replace("L", "")
                        //        .replace("R", ""));
                        for (int j = 0; j < Integer.parseInt(formattedDirections[i].replace("L", "")
                                .replace("R", "")); j++) {
                            Coordinates c = new Coordinates(x_coordinate, y_coordinate);
                            if (visited.contains(c)) {
                                return Math.abs(x_coordinate) + Math.abs(y_coordinate);
                            }
                            visited.add(new Coordinates(x_coordinate,y_coordinate));
                            y_coordinate += 1;
                        }
                        facingDirection = RelativeDirection.N;
                    } else {
                        //y_coordinate -= Integer.parseInt(formattedDirections[i].replace("L", "")
                        //        .replace("R", ""));
                        for (int j = 0; j < Integer.parseInt(formattedDirections[i].replace("L", "")
                                .replace("R", "")); j++) {
                            Coordinates c = new Coordinates(x_coordinate, y_coordinate);
                            if (visited.contains(c)) {
                                return Math.abs(x_coordinate) + Math.abs(y_coordinate);
                            }
                            visited.add(new Coordinates(x_coordinate,y_coordinate));
                            y_coordinate -= 1;
                        }
                        facingDirection = RelativeDirection.S;
                    }
                    break;
                case S:
                    if (formattedDirections[i].charAt(0) == 'L') {
                        //x_coordinate += Integer.parseInt(formattedDirections[i].replace("L", "")
                        //        .replace("R", ""));
                        for (int j = 0; j < Integer.parseInt(formattedDirections[i].replace("L", "")
                                .replace("R", "")); j++) {
                            Coordinates c = new Coordinates(x_coordinate, y_coordinate);
                            if (visited.contains(c)) {
                                return Math.abs(x_coordinate) + Math.abs(y_coordinate);
                            }
                            visited.add(new Coordinates(x_coordinate,y_coordinate));
                            x_coordinate += 1;
                        }
                        facingDirection = RelativeDirection.E;
                    } else {
                        //x_coordinate -= Integer.parseInt(formattedDirections[i].replace("L", "")
                        //        .replace("R", ""));
                        for (int j = 0; j < Integer.parseInt(formattedDirections[i].replace("L", "")
                                .replace("R", "")); j++) {
                            Coordinates c = new Coordinates(x_coordinate, y_coordinate);
                            if (visited.contains(c)) {
                                return Math.abs(x_coordinate) + Math.abs(y_coordinate);
                            }
                            visited.add(new Coordinates(x_coordinate,y_coordinate));
                            x_coordinate -= 1;
                        }
                        facingDirection = RelativeDirection.W;
                    }
                    break;
                case W:
                    if (formattedDirections[i].charAt(0) == 'L') {
                        //y_coordinate -= Integer.parseInt(formattedDirections[i].replace("L", "")
                        //        .replace("R", ""));
                        for (int j = 0; j < Integer.parseInt(formattedDirections[i].replace("L", "")
                                .replace("R", "")); j++) {
                            Coordinates c = new Coordinates(x_coordinate, y_coordinate);
                            if (visited.contains(c)) {
                                return Math.abs(x_coordinate) + Math.abs(y_coordinate);
                            }
                            visited.add(new Coordinates(x_coordinate,y_coordinate));
                            y_coordinate -= 1;
                        }
                        facingDirection = RelativeDirection.S;
                    } else {
                        //y_coordinate += Integer.parseInt(formattedDirections[i].replace("L", "")
                        //        .replace("R", ""));
                        for (int j = 0; j < Integer.parseInt(formattedDirections[i].replace("L", "")
                                .replace("R", "")); j++) {
                            Coordinates c = new Coordinates(x_coordinate, y_coordinate);
                            if (visited.contains(c)) {
                                return Math.abs(x_coordinate) + Math.abs(y_coordinate);
                            }
                            visited.add(new Coordinates(x_coordinate,y_coordinate));
                            y_coordinate += 1;
                        }
                        facingDirection = RelativeDirection.N;
                    }
                    break;
            }
        }
        return Math.abs(x_coordinate) + Math.abs(y_coordinate);
    }
}
