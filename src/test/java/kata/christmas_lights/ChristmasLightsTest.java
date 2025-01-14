package kata.christmas_lights;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ChristmasLightsTest {

    ChristmasLights christmasLights = new ChristmasLights();

    @Test
    void turnOnOneLight() {
        //GIVEN

        //WHEN
        christmasLights.turnOn(new Coordinate(0, 0), new Coordinate(0, 0));

        //THEN
        assertThat(christmasLights.getLights()[0][0]).isTrue();
        for (int j = 1; j < 999; j++) {
            assertThat(christmasLights.getLights()[0][j]).isFalse();
        }
        for (int i = 1; i < 999; i++) {
            for (int j = 1; j < 999; j++) {
                assertThat(christmasLights.getLights()[i][j]).isFalse();
            }
        }
    }

    @Test
    void turnOnTwoLights() {
        //GIVEN

        //WHEN
        christmasLights.turnOn(new Coordinate(0, 0), new Coordinate(0, 1));

        //THEN
        assertThat(christmasLights.getLights()[0][0]).isTrue();
        assertThat(christmasLights.getLights()[0][1]).isTrue();
        for (int j = 2; j < 999; j++) {
            assertThat(christmasLights.getLights()[0][j]).isFalse();
        }
        for (int i = 1; i < 999; i++) {
            for (int j = 0; j < 999; j++) {
                assertThat(christmasLights.getLights()[i][j]).isFalse();
            }
        }
    }

    @Test
    void turnOffOneLight() {
        //GIVEN
        christmasLights.turnOn(new Coordinate(0, 0), new Coordinate(0, 0));

        //WHEN
        christmasLights.turnOff(new Coordinate(0, 0), new Coordinate(0, 0));

        //THEN
        for (int i = 0; i < 999; i++) {
            for (int j = 0; j < 999; j++) {
                assertThat(christmasLights.getLights()[i][j]).isFalse();
            }
        }
    }

    @Test
    void toggleTwoLights() {
        //GIVEN
        christmasLights.turnOn(new Coordinate(0, 0), new Coordinate(0, 0));

        //WHEN
        christmasLights.toggle(new Coordinate(0, 0), new Coordinate(0, 1));

        //THEN
        assertThat(christmasLights.getLights()[0][0]).isFalse();
        assertThat(christmasLights.getLights()[0][1]).isTrue();
        for (int j = 2; j < 999; j++) {
            assertThat(christmasLights.getLights()[0][j]).isFalse();
        }
        for (int i = 1; i < 999; i++) {
            for (int j = 0; j < 999; j++) {
                assertThat(christmasLights.getLights()[i][j]).isFalse();
            }
        }
    }

    @Test
    void computeHowManyLightsAreLit() {
        //GIVEN
        //WHEN
        christmasLights.turnOn(new Coordinate(887, 9), new Coordinate(959, 629));
        christmasLights.turnOn(new Coordinate(454, 398), new Coordinate(844, 448));
        christmasLights.turnOff(new Coordinate(539, 243), new Coordinate(559, 965));
        christmasLights.turnOff(new Coordinate(370, 819), new Coordinate(676, 868));
        christmasLights.turnOff(new Coordinate(145, 40), new Coordinate(370, 997));
        christmasLights.turnOff(new Coordinate(301, 3), new Coordinate(808, 453));
        christmasLights.turnOn(new Coordinate(351, 678), new Coordinate(951, 908));
        christmasLights.toggle(new Coordinate(720, 196), new Coordinate(897, 994));
        christmasLights.toggle(new Coordinate(831, 394), new Coordinate(904, 860));


        //THEN
        int count = 0;
        for (int i = 0; i < 999; i++) {
            for (int j = 0; j < 999; j++) {
                if (christmasLights.getLights()[i][j])
                    count += 1;
                System.out.print(christmasLights.getLights()[i][j] ? "x " : "  ");
            }
            System.out.println();
        }
        System.out.println("how many lights are lit: " + count);

    }

}