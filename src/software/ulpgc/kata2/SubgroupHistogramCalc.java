package software.ulpgc.kata2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class SubgroupHistogramCalc implements HistogramCalc {

    private final List<Food> foods;

    public SubgroupHistogramCalc(List<Food> foods) {
        this.foods = foods;
    }

    @Override
    public HashMap<String, Integer> calculate() {
        HashMap<String, Integer> result = new HashMap<>();
        Iterator<Food> variable_2 = this.foods.iterator();

        while (variable_2.hasNext()) {
            Food food = variable_2.next();
            result.put(food.getSubgroup(), result.getOrDefault(food.getSubgroup(), 0)+1);
        } return result;
    }
}
