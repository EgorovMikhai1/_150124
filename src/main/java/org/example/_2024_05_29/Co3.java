package org.example._2024_05_29;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Co3 {
    public static void main(String[] args) {
        /**
         * группируем транз по типу
         * считаем сумму всех транзакций
         * соберем в Summary
         */

        List<Transaction> list = Arrays.asList(
                new Transaction(1, 123, "USD"),
                new Transaction(2, 46243, "EUR"),
                new Transaction(3, 1433, "USD"),
                new Transaction(4, 4523, "USD"),
                new Transaction(5, 41153, "BTC"),
                new Transaction(6, 173, "BTC"),
                new Transaction(7, 1453, "EUR"),
                new Transaction(8, 7523, "USD")
        );

        List<Summary> summaryList = list.stream() // t t t t t t t t t
                .collect(Collectors.groupingBy(Transaction::getType,
                                Collectors.collectingAndThen(
                                        Collectors.reducing(
                                                new Summary("", 0.0, 0),
                                                obj -> new Summary(obj.type, obj.amount, 1),
                                                (s1, s2) -> new Summary(s1.type, s1.totalAmount + s2.totalAmount, s1.count + s2.count)
                                        ), sum -> sum
                                )
                ))
                .values()
                .stream()
                .toList();

        System.out.println(summaryList);
    }

}

@AllArgsConstructor
@Getter
@ToString
class Transaction {
    int id;
    double amount;
    String type;
}

@AllArgsConstructor
@Getter
@ToString
class Summary {
    String type;
    double totalAmount;
    long count;
}