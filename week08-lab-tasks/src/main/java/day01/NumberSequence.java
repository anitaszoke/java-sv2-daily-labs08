package day01;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class NumberSequence {
    private List<Integer> numberList;

    public NumberSequence(List<Integer> numberList) {
        this.numberList = numberList;
    }

    public List<Integer> getNumberList() {
        return numberList;
    }

    public NumberSequence(int howManyNumber, int minNumber, int maxNumber) {
        Random random = new Random();
        for (int i = 0; i < howManyNumber; i++) {
            numberList.add(random.nextInt(minNumber, maxNumber + 1));
        }
    }


    public List<Integer> closeToAverage(int value) {
        List<Integer> result = new ArrayList<>();
        double avg = average();

        for (int i : numberList) {
            if (Math.abs(i - avg) <= value) {
                result.add(i);
            }
        }
        return result;
    }

    private double average() {
        double sum = 0;
        for (int i : numberList) {
            sum += i;
        }
        return sum;
    }
}
