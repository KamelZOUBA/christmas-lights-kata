package kata.christmas_lights;

import lombok.Getter;

@Getter
public class ChristmasLights {
    private final boolean[][] lights = new boolean[999][999];

    public void turnOn(Coordinate coordinate) {
        lights[coordinate.x()][coordinate.y()] = true;
    }
}
