package kata.christmas_lights.part1;

import lombok.Getter;

@Getter
public class ChristmasLights {
    private final boolean[][] lights = new boolean[999][999];

    public void turnOn(Coordinate begin, Coordinate end) {
        turn(begin, end, true);
    }

    public void turnOff(Coordinate begin, Coordinate end) {
        turn(begin, end, false);
    }

    private void turn(Coordinate begin, Coordinate end, boolean OnOff) {
        for (int i = begin.x(); i <= end.x(); i++) {
            for (int j = begin.y(); j <= end.y(); j++) {
                lights[i][j] = OnOff;
            }
        }
    }

    public void toggle(Coordinate begin, Coordinate end) {
        for (int i = begin.x(); i <= end.x(); i++) {
            for (int j = begin.y(); j <= end.y(); j++) {
                lights[i][j] = !lights[i][j];
            }
        }
    }
}
