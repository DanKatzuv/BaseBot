package robot;

import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableEntry;
import edu.wpi.first.networktables.NetworkTableInstance;

public class NTentries {
    private int amount;

    NetworkTableInstance inst = NetworkTableInstance.getDefault();
    NetworkTable table = inst.getTable("dataTable");
    NetworkTableEntry[] entries = new NetworkTableEntry[amount];
    String[] names = new String[amount];
    double[] data = new double[amount];

    NTentries(int amountParameters, String... names) {
        this.amount = amountParameters;
        int count = 0;
        for (String name : names) {
            this.names[count] = name;
            count++;
        }
    }

    public void insertDoubles(double... data) {
        int count = 0;
        for (double info : data) {
            this.data[count] = info;
            count++;
        }
    }

    public void insertEntries(NetworkTableEntry... entries) {
        int count = 0;
        for (NetworkTableEntry entry : entries) {
            this.entries[count] = entry;
            count++;
        }
    }

    public void zip() {
        int count = 0;
        while (count < this.amount) {
            entries[count] = table.getEntry(names[count]);
            entries[count].setDouble(data[count]);
            count++;
        }
    }

}
