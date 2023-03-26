package ru.netology.services;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class RestServiceTest {

    // Тест расчета кол-ва месяцев отдыха по 1-му набору данных
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/restmonth.csv")
    void shouldCalculateRestMonth(int expected, int incomeMonth, int expensesMonth, int thresholdMonth) {
        RestService service = new RestService();

        // Подготавливаем данные:
//            int incomeMonth = 10000;
//            int expensesMonth = 3000;
//            int thresholdMonth = 20000;
//            int expected = 3;

        // Вызываем целевой метод:
        int actual = service.calculate(incomeMonth, expensesMonth, thresholdMonth);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

    // Тест расчета кол-ва месяцев отдыха по 2-му набору данных
//        @Test
//        void shouldCalculateRestMonthForTwoDataSet() {
//            RestService service = new RestService();
//
//            // подготавливаем данные:
//            int incomeMonth = 100000;
//            int expensesMonth = 60000;
//            int thresholdMonth = 150000;
//            int expected = 2;
//
//            // Вызываем целевой метод:
//            int actual = service.calculate(incomeMonth, expensesMonth, thresholdMonth);
//
//            // производим проверку (сравниваем ожидаемый и фактический):
//            Assertions.assertEquals(expected, actual);
//        }
}
