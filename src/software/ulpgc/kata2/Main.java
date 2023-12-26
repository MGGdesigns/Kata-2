package software.ulpgc.kata2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Food> foods = CsvFoodLoader.with("generic-food.csv").load();
        HashMap<String, Integer> histogram = new SubgroupHistogramCalc(foods).calculate();
        Iterator<String> variable_3 = histogram.keySet().stream().toList().iterator();

        while (variable_3.hasNext()) {
            String key = variable_3.next();
            System.out.println(key + "->" + histogram.get(key));
        }
    }
}
