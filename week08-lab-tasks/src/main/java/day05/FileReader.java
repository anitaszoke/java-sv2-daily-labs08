package day05;

import day04.FileReader2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileReader {
    public static void main(String[] args) {

        FileReader f = new FileReader();

        System.out.println(f.findSmallestTemperatureSpread("weather.dat"));

        System.out.println(f.findSmallestDifference("football.dat"));

        System.out.println(f.readFileLines("football.dat"));
    }

    private List<String> readFileLines(String filename) {
        List<String> dataList;
        try {
            dataList = Files.readAllLines(Paths.get("src/main/resources/" + filename));
        } catch (IOException ioe) {
            throw new IllegalArgumentException("Can not read file", ioe);
        }
        return dataList;
    }

    private List<String> noNeedLines(List<String> lines, int... noLines) {
        List<String> newDataList = new ArrayList<>();

        for (int i = 0; i < lines.size(); i++) {
            if (!noLines.toString().contains("i")) {
                newDataList.add(lines.get(i));
            }
        }
        return newDataList;
    }

    public int findSmallestTemperatureSpread(String filename) {
        List<String> dataList = readFileLines(filename);
        noNeedLines(dataList, 1, 2, 32);

        int minSpread = 1000;
        int minDay = 0;

        for (int i = 0; i < dataList.size(); i++) {
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
    }


    public String findSmallestDifference(String filename) {
        List<String> dataList = readFileLines(filename);
        noNeedLines(dataList, 0, 18);

        int minSpread = 1000;
        String minName = "";

        for (int i = 1; i < (dataList.size()); i++) {
            String name = dataList.get(i).substring(7, 22).trim();
            int max = Integer.parseInt(dataList.get(i).substring(43, 45).trim());
            int min = Integer.parseInt(dataList.get(i).substring(50, 52).trim());

            int spread = Math.abs(max - min);
            if (minSpread > spread) {
                minSpread = spread;
                minName = name;

            }
        }
        return minName;

    }
}

