package robot;

import edu.wpi.first.networktables.NetworkTableEntry;

public class NTentries {
    private int amount;
    NetworkTableEntry[] entries = new NetworkTableEntry[amount];
    double[] data = new double[amount];

    NTentries(int amountParameters) {
        this.amount = amountParameters;
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
            entries[count].setDouble(data[count]);
            count++;
        }
    }

}
