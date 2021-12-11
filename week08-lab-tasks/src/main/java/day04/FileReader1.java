package day04;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileReader1 {
    public static void main(String[] args) {
        int min = new FileReader1().findSmallestTemperatureSpread("weather.dat");
        System.out.println(min);
    }

    private int findSmallestTemperatureSpread(String filename) {
        try {
            List<String> dataList = Files.readAllLines(Paths.get("src/main/resources/" + filename));

            int minSpread = 1000;
            int minDay = 0;

            for (int i = 2; i < (dataList.size() - 1); i++) {
                int day = Integer.parseInt(dataList.get(i).substring(2, 4).trim());
                int max = Integer.parseInt(dataList.get(i).substring(6, 8).trim());
                int min = Integer.parseInt(dataList.get(i).substring(12, 14).trim());

                int spread = max - min;
                if (minSpread > spread) {
                    minSpread = spread;
                    minDay = day;
                }
            }
            return minDay;

        } catch (IOException ioe) {
            throw new IllegalArgumentException("Can not read file", ioe);
        }

    }
}