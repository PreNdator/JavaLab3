public class SpeedTester {
    @FunctionalInterface
    public interface Task {
        void execute();
    }
    public static long measureExecutionTime(Task function) {
        long startTime = System.currentTimeMillis();
        function.execute();
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }
}
