package kata.christmas_lights.part2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ChristmasLightsTest {

    ChristmasLights christmasLights;

    @BeforeEach
    void setUp() {
        christmasLights = new ChristmasLights();
    }

    @Test
    void turnOnOneLightAndTotalBrightnessShouldBeOne() {
        //GIVEN

        //WHEN
        christmasLights.turnOn(new Coordinate(0, 0), new Coordinate(0, 0));

        //THEN
        assertThat(christmasLights.getTotalBrightness()).isEqualTo(1);
    }

    @Test
    void turnOnTwoLights() {
        //GIVEN

        //WHEN
        christmasLights.turnOn(new Coordinate(0, 0), new Coordinate(0, 1));

        //THEN
        assertThat(christmasLights.getTotalBrightness()).isEqualTo(2);
    }

    @Test
    void turnOffOneLight() {
        //GIVEN
        christmasLights.turnOn(new Coordinate(0, 0), new Coordinate(0, 0));

        //WHEN
        christmasLights.turnOff(new Coordinate(0, 0), new Coordinate(0, 0));

        //THEN
        assertThat(christmasLights.getTotalBrightness()).isEqualTo(0);
    }

    @Test
    void turnOffOneLightWhenAllLigthsAreOff() {
        //GIVEN

        //WHEN
        christmasLights.turnOff(new Coordinate(0, 0), new Coordinate(0, 0));

        //THEN
        assertThat(christmasLights.getTotalBrightness()).isEqualTo(0);
    }

    @Test
    void toggleOneLightShouldIncreaseTotalBrightnessByTwo() {
        //GIVEN

        //WHEN
        christmasLights.toggle(new Coordinate(0, 0), new Coordinate(0, 0));

        //THEN
        assertThat(christmasLights.getTotalBrightness()).isEqualTo(2);
    }

    @Test
    void toggleTwoLightShouldIncreaseTotalBrightnessByFour() {
        //GIVEN

        //WHEN
        christmasLights.toggle(new Coordinate(0, 0), new Coordinate(0, 1));

        //THEN
        assertThat(christmasLights.getTotalBrightness()).isEqualTo(4);
    }


    @DisplayName("toggle 0,0 through 999,999 would increase the total brightness by 2000000.")
    @Test
    void toggleExampleAllLights() {
        //GIVEN

        //WHEN
        christmasLights.toggle(new Coordinate(0, 0), new Coordinate(999, 999));

        //THEN
        assertThat(christmasLights.getTotalBrightness()).isEqualTo(2000000);
    }

}