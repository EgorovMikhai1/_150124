package org.example._2024_06_12;

import lombok.Getter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.util.stream.Stream;

class ShippingCalculatorTest {


    @DisplayName("Стоимость доставки always положительная всегда для любого веса")
    @ParameterizedTest
    @ValueSource(doubles = {1.0, 2.5, 5.0})
    void calculateShippingCostWeightTest(double weight) {
        double distance = 10.0;
        double cost = ShippingCalculator.calculateShippingCost(weight, distance);

        Assertions.assertTrue(cost > 0);
    }

    @DisplayName("Проверяем точность вычислений")
    @ParameterizedTest
    @CsvSource({
            "1.0, 10.0, 11.2",
            "2.5, 20.0, 18.0",
            "5.0, 5.0, 13.5"
    })
    void calculateShippingCostParamTest(double weight, double distance, double expected) {
        double actual = ShippingCalculator.calculateShippingCost(weight, distance);
        Assertions.assertEquals(expected, actual);
    }

    @DisplayName("Проверяем точность вычислений (тоже самое что и выше только другим способом)")
    @ParameterizedTest
    @MethodSource("shippingCostProvider")
    void calculateShippingCostParamMethodSourceTest(double weight, double distance, double expected) {
        double actual = ShippingCalculator.calculateShippingCost(weight, distance);
        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> shippingCostProvider() {
        return Stream.of(
                Arguments.of(1.0, 10.0, 11.2),
                Arguments.of(2.5, 20.0, 18.0),
                Arguments.of(5.0, 5.0, 13.5)
        );
    }

    @DisplayName("Проверяем точность вычислений (тоже самое что и два метода выше только другим способом)")
    @ParameterizedTest
    @EnumSource(WeightDistancePair.class)
    void calculateShippingCostEnumSourceTest(WeightDistancePair pair) {
        double actual = ShippingCalculator.calculateShippingCost(pair.weight, pair.distance);
        Assertions.assertEquals(pair.expectedCost, actual);
    }

    @Getter
    enum WeightDistancePair {
        CASE1(1.0, 10.0, 11.2),
        CASE2(2.5, 20.0, 18.0),
        CASE3(5.0, 5.0, 13.5);

        private final double weight;
        private final double distance;
        private final double expectedCost;

        WeightDistancePair(double weight, double distance, double expectedCost) {
            this.weight = weight;
            this.distance = distance;
            this.expectedCost = expectedCost;
        }
    }

    @DisplayName("Проверяем точность вычислений (тоже самое что и три метода выше только другим способом)")
    @ParameterizedTest
    @CsvFileSource(resources = "/shippingCost.csv", numLinesToSkip = 1)
    void calculateShippingCostParamCsvFileTest(double weight, double distance, double expected) {
        double actual = ShippingCalculator.calculateShippingCost(weight, distance);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void calculateShippingCostWithExceptionTest() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> ShippingCalculator.calculateShippingCost(-1, 50));
        Assertions.assertThrows(IllegalArgumentException.class, () -> ShippingCalculator.calculateShippingCost(12, 0));
        Assertions.assertThrows(IllegalArgumentException.class, () -> ShippingCalculator.calculateShippingCost(0, 0));
        Assertions.assertThrows(IllegalArgumentException.class, () -> ShippingCalculator.calculateShippingCost(11, -9));
    }
}