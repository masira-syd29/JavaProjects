import java.util.*;

public class ElevatorControlSystem {

    public static void main(String[] args) {
        System.out.println(findStops("UP", 6, 1, 3, 10, 7, 0, 8));
    }

    public static List<Integer> findStops(String direction, int currentFloor, int... floors) {
        if (direction == null || (!"UP".equals(direction) && !"DN".equals(direction))) {
            throw new IllegalArgumentException("Invalid direction: " + direction);
        }

        if (floors == null || floors.length == 0) {
            throw new IllegalArgumentException("No floors provided");
        }

        for (int floor : floors) {
            if (floor < 0) {
                throw new IllegalArgumentException("Invalid floor: " + floor);
            }
        }

        List<Integer> stops = new ArrayList<>();
        if ("UP".equals(direction)) {
            int nearestUpFloor = findNearestFloor(floors, currentFloor, true);
            while (nearestUpFloor >= 0) {
                stops.add(nearestUpFloor);
                nearestUpFloor = findNearestFloor(floors, nearestUpFloor, true);
            }

            direction = "DN";
        }

        if ("DN".equals(direction)) {
            int nearestDownFloor = findNearestFloor(floors, currentFloor, false);
            while (nearestDownFloor >= 0) {
                stops.add(nearestDownFloor);
                nearestDownFloor = findNearestFloor(floors, nearestDownFloor, false);
            }
        }

        return stops;
    }

    private static int findNearestFloor(int[] floors, int currentFloor, boolean isUp) {
        int nearestFloor = -1;
        int minDistance = Integer.MAX_VALUE;

        for (int floor : floors) {
            if (floor == currentFloor) {
                continue;
            }

            int distance = isUp ? floor - currentFloor : currentFloor - floor;
            if (distance >= 0 && distance < minDistance) {
                minDistance = distance;
                nearestFloor = floor;
            }
        }

        return nearestFloor;
    }
    
}
