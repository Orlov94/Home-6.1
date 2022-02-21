package ru.netology.stats;

public class StatsService {

    public int calculateSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum = sum + sale;
        }
        return sum;
    }

    public int calculateAvg(int[] sales) {
        return calculateSum(sales) / sales.length;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }

    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int minAvgSalesMonth(int[] sales) {
        int month = 0;
        int calculateAvg = calculateAvg(sales);
        for (int sale : sales) {
            if (sale < calculateAvg) {
                month = month + 1;
            }
        }
        return month;
    }

    public int maxAvgSalesMonth(int[] sales) {
        int month = 0;
        int calculateAvg = calculateAvg(sales);
        for (int sale : sales) {
            if (sale < calculateAvg) {
                month = month + 1;
            }
        }
        return month;
    }

}


