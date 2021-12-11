package day04;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileReader2 {
    public static void main(String[] args) {
        String minName = new FileReader2().findSmallestDifference("football.dat");
        System.out.println(minName);
    }

    private String findSmallestDifference(String filename) {
        try {
            List<String> dataList = Files.readAllLines(Paths.get("src/main/resources/" + filename));

            int minSpread = 1000;
            String minName = "";

            for (int i = 1; i < (dataList.size()); i++) {
                if (i != 18) {
                    String name = dataList.get(i).substring(7, 22).trim();
                    int max = Integer.parseInt(dataList.get(i).substring(43, 45).trim());
                    int min = Integer.parseInt(dataList.get(i).substring(50, 52).trim());

                    int spread = Math.abs(max - min);
                    if (minSpread > spread) {
                        minSpread = spread;
                        minName = name;
                    }
                }
            }
            return minName;

        } catch (IOException ioe) {
            throw new IllegalArgumentException("Can not read file", ioe);
        }

    }
}
