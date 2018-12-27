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
        pw.write(sb.toString());
        sb = new StringBuilder();


    }

    public void update(double... arguments) {
        if (arguments.length == count_args) {
            for (double argument : arguments) {
                sb.append(argument);
                sb.append(',');
            }
            sb.append('\n');

            pw.write(sb.toString());
            sb = new StringBuilder();
        } else
            throw new StackOverflowError("Amount of arguments not matching defined columns. " + arguments.length + " arguments were given, " + count_args + "were defined.");
    }

    public void close() {
        pw.close();
    }


}

