package kata.christmas_lights;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ChristmasLightsTest {

    ChristmasLights christmasLights = new ChristmasLights();

    @Test
    void turnOnOnLight(){
        //GIVEN

        //WHEN
        christmasLights.turnOn(new Coordinate(0,0));

        //THEN
        assertThat(christmasLights.getLights()[0][0]).isTrue();
        for (int i = 1; i < 999; i++) {
            for (int j = 1; j < 999; j++) {
                assertThat(christmasLights.getLights()[i][j]).isFalse();
            }
        }
    }

}