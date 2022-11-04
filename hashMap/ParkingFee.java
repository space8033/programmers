import java.util.*;

public class ParkingFee {
    public int[] solution(int[] fees, String[] records) {

        Map<String, Integer> parking = new HashMap<>();
        Map<String, Integer> times = new HashMap<>();
        List<String> cars = new ArrayList<>();

        for(int i = 0; i < records.length; i++) {
            String info[] = records[i].split(" ");
            int time = getMin(info[0]);
            String car = info[1];

            if(!cars.contains(car)) {
                cars.add(car);
                times.put(car, 0);
            }

            if(parking.containsKey(car)) {
                times.put(car, times.get(car) + time - parking.get(car));
                parking.remove(car);
            }else {
                parking.put(car, time);
            }
        }
        int[] recordFee = new int[cars.size()];
        Collections.sort(cars);

        for(int i = 0; i < cars.size(); i++) {
            recordFee[i] = fees[1];
            String car = cars.get(i);
            int time = times.get(car) - fees[0];

            if(parking.containsKey(car)) {
                time += getMin("23:59") - parking.get(car);
            }
            if(time > 0) {
                recordFee[i] += (Math.ceil(time/(fees[2] * 1.0)) * fees[3]);
            }
        }

        return recordFee;
    }

    public int getMin(String time) {
        String[] t = time.split(":");
        return Integer.valueOf(t[0]) * 60 + Integer.valueOf(t[1]);
    }
}
