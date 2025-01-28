package kata.christmas_lights.part2;

import lombok.Getter;

@Getter
public class ChristmasLights {
    private final int[][] lights = new int[1000][1000];

    public void turnOn(Coordinate begin, Coordinate end) {
        turn(begin, end, true, 1);
    }

    public void turnOff(Coordinate begin, Coordinate end) {
        turn(begin, end, false, 1);
    }

    public int getTotalBrightness() {
        int total = 0;
        for (int i = 0; i < 1000; i++) {
            for (int j = 0; j < 1000; j++) {
                total += lights[i][j];
            }
        }
        return total;
    }

    public void toggle(Coordinate begin, Coordinate end) {
        turn(begin, end, true, 2);
    }

    private void turn(Coordinate begin, Coordinate end, boolean on, int increment) {
        for (int i = begin.x(); i <= end.x(); i++) {
            for (int j = begin.y(); j <= end.y(); j++) {
                if (lights[i][j] == 0 && !on)
                    continue;
                lights[i][j] += on ? increment : -increment;
            }
        }
    }
}
