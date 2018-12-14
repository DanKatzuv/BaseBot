package robot;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Csv_test {
    public static void main(String[] args) {
        PrintWriter pw = null;
        StringBuilder sb = new StringBuilder();
        sb.append("Time");
        sb.append(',');
        sb.append("X");
        sb.append(',');
        sb.append("Y");
        sb.append("\n");
        try {
            pw = new PrintWriter(new File("test.csv"));

        } catch (
                FileNotFoundException e) {
            e.printStackTrace();
        }
        long start = System.currentTimeMillis();
        while (true) {

            long time = System.currentTimeMillis() - start;


            System.out.println(time);


            sb.append(time);
            sb.append(',');
            sb.append(Math.random());
            sb.append(',');
            sb.append(Math.random());
            sb.append("\n");


            try {
                Thread.sleep(20);
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
            if (time > 1000) {
                break;
            }
        }
        pw.write(sb.toString());
        pw.close();
    }
}
