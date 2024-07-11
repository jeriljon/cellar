package y.datastructures.algorithms;

import java.time.LocalTime;
import java.util.*;

public class EmployeeAccessTracker {

    public static void main(String[] args) {
        List<EmployeeTime> employeeTimes = Arrays.asList(
                new EmployeeTime("Abe", LocalTime.of(11, 0)),
                new EmployeeTime("Bob", LocalTime.of(11, 30)),
                new EmployeeTime("Charlie", LocalTime.of(11, 20)),
                new EmployeeTime("Abe", LocalTime.of(13, 45)),
                new EmployeeTime("Bob", LocalTime.of(14, 30))
        );
        int timeInterval = 80; // 80 minutes

        Map<String, Integer> result = findMaxAccessesInInterval(employeeTimes, timeInterval);
        System.out.println("Max Accesses in Time Interval: " + result);
    }

    public static Map<String, Integer> findMaxAccessesInInterval(List<EmployeeTime> employeeTimes, int intervalMinutes) {
        Map<String, List<LocalTime>> employeeAccessTimes = new HashMap<>();

        // Group access times by employee name
        for (EmployeeTime et : employeeTimes) {
            employeeAccessTimes.computeIfAbsent(et.getEmployeeName(), k -> new ArrayList<>()).add(et.getAccessTime());
        }

        Map<String, Integer> maxAccessCount = new HashMap<>();

        // Find the maximum accesses in the given interval for each employee
        for (Map.Entry<String, List<LocalTime>> entry : employeeAccessTimes.entrySet()) {
            String employee = entry.getKey();
            List<LocalTime> times = entry.getValue();
            Collections.sort(times);

            int maxAccesses = getMaxAccessesInInterval(times, intervalMinutes);
            maxAccessCount.put(employee, maxAccesses);
        }

        return maxAccessCount;
    }

    private static int getMaxAccessesInInterval(List<LocalTime> times, int intervalMinutes) {
        int maxAccesses = 0;
        for (int i = 0; i < times.size(); i++) {
            LocalTime startTime = times.get(i);
            LocalTime endTime = startTime.plusMinutes(intervalMinutes);
            int count = 0;
            for (int j = i; j < times.size(); j++) {
                if (times.get(j).isBefore(endTime) || times.get(j).equals(endTime)) {
                    count++;
                } else {
                    break;
                }
            }
            maxAccesses = Math.max(maxAccesses, count);
        }
        return maxAccesses;
    }
}
