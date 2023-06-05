package LeetCode.DesignUndergroundSystem_1396;

import java.util.HashMap;
import java.util.Map;

class UndergroundSystem {

    private record CheckIn(String station, int startTime) {
    }

    private record Trip(String start, String end) {
    }

    private static class TimeTrip {
        public TimeTrip(int totalTime, int tripsAmount) {
            this.totalTime = totalTime;
            this.tripsAmount = tripsAmount;
        }

        private int totalTime;
        private int tripsAmount;

        void increase(int time) {
            totalTime += time;
            tripsAmount++;
        }
        double getAvg(){
            return  (double) totalTime /tripsAmount;
        }
    }

    private final Map<Integer, CheckIn> checkInMap;
    private final Map<Trip, TimeTrip> statistics;

    public UndergroundSystem() {
        checkInMap = new HashMap<>();
        statistics = new HashMap<>();
    }

    public void checkIn(int id, String stationName, int t) {
        checkInMap.put(id, new CheckIn(stationName, t));
    }

    public void checkOut(int id, String stationName, int t) {
        Trip trip = new Trip(checkInMap.get(id).station, stationName);
        if (!statistics.containsKey(trip)) {
            statistics.put(trip, new TimeTrip(0, 0));
        }
        statistics.get(trip).increase(t - checkInMap.get(id).startTime);
        checkInMap.remove(id);
    }

    public double getAverageTime(String startStation, String endStation) {
        Trip trip = new Trip(startStation, endStation);
        return statistics.get(trip).getAvg();
    }
}
