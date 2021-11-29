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
        numberList = new ArrayList<>();

        Random random = new Random();
        for (int i = 0; i < howManyNumber; i++) {
           int addNumber = (random.nextInt(minNumber, maxNumber + 1));
            numberList.add(addNumber);
        }
    }


    public List<Integer> closeToAverage(int value) {
        List<Integer> result = new ArrayList<>();
        double avg = average();

        for (int i : numberList) {
            if (Math.abs(avg - i) <= value) {
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
        return sum/numberList.size();
    }

    public static void main(String[] args) {
        NumberSequence numberSequence = new NumberSequence(15,5,90);
        System.out.println(numberSequence.getNumberList());
        System.out.println(numberSequence.closeToAverage(10));

    }
}
