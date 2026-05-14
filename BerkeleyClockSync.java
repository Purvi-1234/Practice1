import java.util.ArrayList;

public class BerkeleyClockSync {
    public static void main(String[] args) {

        int[] systemClocks = {10, 12, 13, 11, 14};
        int masterClock = 0;

        // Print initial clocks
        System.out.print("System clocks: ");
        for (int clock : systemClocks)
            System.out.print(clock + " ");

        // Calculate average
        int sum = 0;
        for (int clock : systemClocks)
            sum += clock;

        int averageClock = sum / systemClocks.length;

        // Calculate time differences
        ArrayList<Integer> timeDifferences = new ArrayList<>();
        for (int clock : systemClocks)
            timeDifferences.add(averageClock - clock);

        // Calculate time adjustment
        int timeAdjustment = 0;
        for (int diff : timeDifferences)
            timeAdjustment += diff;

        timeAdjustment /= timeDifferences.size();

        // Update master clock
        masterClock = averageClock - timeAdjustment;

        // Print updated clocks
        System.out.print("\nUpdated system clocks: ");
        for (int clock : systemClocks)
            System.out.print((clock - timeAdjustment) + " ");

        // Print master clock
        System.out.println("\nMaster clock: " + masterClock);
    }
}


