package kata.christmas_lights.part2;

import lombok.Getter;

@Getter
public class ChristmasLights {
    private final int[][] lights = new int[999][999];

    public void turnOn(Coordinate begin, Coordinate end) {
       turn(begin, end, true);
    }

    public void turnOff(Coordinate begin, Coordinate end) {
        turn(begin, end, false);
    }

    private void turn(Coordinate begin, Coordinate end, boolean on) {
        for (int i = begin.x(); i <= end.x(); i++) {
            for (int j = begin.y(); j <= end.y(); j++) {
                if (lights[i][j] == 0 && !on)
                    continue;
                lights[i][j] += on?1:-1;
            }
        }
    }

/*    public void toggle(Coordinate begin, Coordinate end) {
        for (int i = begin.x(); i <= end.x(); i++) {
            for (int j = begin.y(); j <= end.y(); j++) {
                lights[i][j] = !lights[i][j];
            }
        }
    }*/

    public int getTotalBrightness() {
        int total = 0;
        for (int i = 0; i < 999; i++) {
            for (int j = 0; j < 999; j++) {
                total += lights[i][j];
            }
        }
        return total;
    }
}
