import java.io.PrintStream;

/**
 * The SpeedTester class provides methods to measure the execution time of tasks.
 */
public class SpeedTester {

    /**
     * A functional interface for tasks to be executed.
     */
    @FunctionalInterface
    public interface Task {
        void execute();
    }

    /**
     * Measures the execution time of a task.
     *
     * @param function   The task to be executed.
     * @param iterations The number of iterations to run the task.
     * @return The execution time in milliseconds.
     */
    public static long measureExecutionTime(Task function, int iterations) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < iterations; ++i) {
            function.execute();
        }
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    /**
     * Measures the execution time of a task and prints the result to the specified output stream.
     *
     * @param function    The task to be executed.
     * @param iterations  The number of iterations to run the task.
     * @param output      The output stream to print the result to.
     * @param thingToTest A description of the thing being tested.
     */
    public static void measureExecutionTime(Task function, int iterations, PrintStream output, String thingToTest) {
        long time = measureExecutionTime(function, iterations);
        output.println(thingToTest + " tested with " + iterations + " iterations in: " + time + " ms");
    }
}
