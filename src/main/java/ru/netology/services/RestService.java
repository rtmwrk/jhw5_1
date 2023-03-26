package ru.netology.services;

public class RestService {

    // Метод подсчета кол-ва месяцев отдыха
    public int calculate(int income, int expenses, int threshold) {
        int count = 0;                                  // Кол-во месяцев отдыха
        int money = 0;                                  // Кол-во денег на счету
        for (int month = 0; month < 12; month++) {
            if (money >= threshold) {                   // Если на счету денег больше, чем требуемый остаток, то
                count++;                                // увеличиваем счётчик месяцев отдыха,
                money = (money - expenses) / 3;         // учитываем расходы на отдыхе
            } else {
                money = money + income - expenses;      // Корректируем остаток счета в рабочий месяц
            }
        }
        return count;
    }
}
