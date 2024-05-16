import java.util.*;

public class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the base string:");
        String baseString = sc.nextLine();
        System.out.println("Enter the number of concatenations:");
        int numConcatenations = sc.nextInt();

        System.out.println("\nUsing StringBuilder...");
        long startTimeStringBuilder = System.currentTimeMillis();
        StringBuilder strBuild = new StringBuilder(baseString);
        for (int i = 1; i < numConcatenations; i++) {
            strBuild.append(baseString);
        }
        long endTimeStringBuilder = System.currentTimeMillis();
        long elapsedTimeStringBuilder = endTimeStringBuilder - startTimeStringBuilder;

        System.out.println("Time taken: " + elapsedTimeStringBuilder + " milliseconds");
        System.out.println("Final string length: " + strBuild.length());

        System.out.println("\nUsing StringBuffer...");
        long startTimeStringBuffer = System.currentTimeMillis();
        StringBuffer stringBuffer = new StringBuffer(baseString);
        for (int i = 1; i < numConcatenations; i++) {
            stringBuffer.append(baseString);
        }
        long endTimeStringBuffer = System.currentTimeMillis();
        long elapsTimeStrBuff = endTimeStringBuffer - startTimeStringBuffer;

        System.out.println("Time taken: " + elapsTimeStrBuff + " milliseconds");
        System.out.println("Final string length: " + stringBuffer.length());

        long timeDifference = Math.abs(elapsedTimeStringBuilder - elapsTimeStrBuff);
        String faster = (elapsedTimeStringBuilder < elapsTimeStrBuff) ? "StringBuilder" : "StringBuffer";
        System.out.println("\nComparison: " + faster + " was faster than the other by " + timeDifference + " milliseconds.");

        sc.close();
    }
}
