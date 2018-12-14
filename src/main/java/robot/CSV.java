package robot;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class CSV {
    private PrintWriter pw;
    private StringBuilder sb;
    private int count_args = 0;

    public CSV(String filename, String... parameters) throws FileNotFoundException {
        pw = new PrintWriter(new File(filename));
        sb = new StringBuilder();

        //Add collumn names to all rows
        for (String name : parameters) {
            sb.append(name);
            sb.append(',');
            count_args++;
        }
        sb.append('\n');


    }

    public void update(long... arguments) {
        int count = count_args;
        while (count > 0) {
            for (long arguement : arguments) {
                sb.append(arguement);
                sb.append(',');
                count--;
            }
            sb.append('\n');
        }
    }

    public void close() {

    }

    public boolean isClosed() {
        return false;
    }

}

