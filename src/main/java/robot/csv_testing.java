package robot;

import java.io.FileNotFoundException;

public class csv_testing {
    private static CSV csv;

    public static void main(String args[]) {
        try {
            csv = new CSV("random.csv", "number");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        csv.update(22);
        csv.close();
    }
}
