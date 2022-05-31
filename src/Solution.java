import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        ArrayDeque<Truck> bridge = new ArrayDeque<>();
        ArrayDeque<Truck> trucks = new ArrayDeque<>(Arrays.stream(truck_weights).mapToObj(Truck::new).collect(Collectors.toList()));
        int time = 0;
        int totalTruckWeight = 0;
        while (!bridge.isEmpty() || !trucks.isEmpty()) {
            ++time;
            bridge.forEach(Truck::moveLocation);
            if (!bridge.isEmpty() && bridge.size() <= bridge_length) {
                if (bridge.peek().location >= bridge_length) {
                    Truck truck = bridge.poll();
                    totalTruckWeight -= truck.weight;
                }
            }
            if (!trucks.isEmpty() && trucks.peek().weight + totalTruckWeight <= weight) {
                Truck truck = trucks.poll();
                bridge.offer(truck);
                totalTruckWeight += truck.weight;
            }

        }
        return time;
    }

    static class Truck {
        private final int weight;
        private int location;

        public Truck(int weight) {
            this.weight = weight;
        }

        public void moveLocation() {
            this.location += 1;
        }
    }
}
