import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IBMExam {

    public static void main(String[] args) {
        List<Integer> requests = new ArrayList<>();
        Collections.addAll(requests, 1, 3, 10, 7, 0, 8);

        int currentFloor = 6;
        String direction = "UP"; // Initial direction

        // Sort the requests based on the direction
        if (direction.equals("UP")) {
            Collections.sort(requests);
        } else {
            Collections.sort(requests, Collections.reverseOrder());
        }

        // Process requests
        for (int requestFloor : requests) {
            // Check for invalid input
            if (requestFloor < 0 || requestFloor > 10) {
                System.out.println("Invalid Input");
                return;
            }

            System.out.println("Current Floor: " + currentFloor);

            // Check if the elevator needs to change direction
            if ((direction.equals("UP") && requestFloor < currentFloor) ||
                    (direction.equals("DOWN") && requestFloor > currentFloor)) {
                direction = (direction.equals("UP")) ? "DOWN" : "UP";
                System.out.println("Changing Direction: " + direction);
            }

            // Move to the requested floor
            System.out.println("Stopping at Floor: " + requestFloor);
            currentFloor = requestFloor;
        }
    }
}