package org.example.dryKissYagni;

import java.util.List;

public class DA {
    // Нарушение DRY: Дублирование кода
    public void processData(List<Integer> data) {
        int sum = 0;
        for (int num : data) {
            sum += num;
        }
        System.out.println("Sum: " + sum);

        double average = (double) sum / data.size();
        System.out.println("Average: " + average);
    }

    public void processUserData(List<Object> users) {
        int totalAge = 0;
        for (Object user : users) {
            //totalAge += user.getAge();
        }
        System.out.println("Total Age: " + totalAge);

        double averageAge = (double) totalAge / users.size();
        System.out.println("Average Age: " + averageAge);
    }
}

