import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class Day1 {
    public static void main(String[] args) throws IOException {
        FileInputStream fileReader = new FileInputStream("files\\input.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(fileReader, StandardCharsets.UTF_8));
        ArrayList<Integer> list = new ArrayList<>();
        String row;
        int numberInRow;

        while ((row = br.readLine()) != null) {
            numberInRow = Integer.parseInt(row);
            int fuelWeight = numberInRow / 3 - 2;
            list.add(fuelWeight);
            int fuelOfFuel = fuelWeight / 3 - 2;
            while (fuelOfFuel > 0) {
                list.add(fuelOfFuel);
                fuelOfFuel = fuelOfFuel / 3 - 2;
            }

        }
        int wynik = 0;

        for (int number : list) {
            wynik = number + wynik;
            System.out.println(number);
        }
        System.out.println("Suma paliwa to: " + wynik);

        fileReader.close();
        br.close();

    }
}
