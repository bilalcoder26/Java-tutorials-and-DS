package collection.Map.EnumMap;

import java.util.EnumMap;

public class EnumMapDemo {
    enum Day {
        MON,TUE,WED,THU,FRI,SAT,SUN
    }
    public static void main(String[] args) {
        EnumMap<Day, String> map = new EnumMap<>(Day.class);
        map.put(Day.MON, "office");
        map.put(Day.SAT, "SHOPPING");
        map.put(Day.SUN, "rest");

        System.out.println(map);
    }
}
