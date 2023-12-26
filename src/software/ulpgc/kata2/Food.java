package software.ulpgc.kata2;

import java.util.Objects;

public class Food {
    private final String name;
    private final String scientific_name;
    private final String group;
    private final String subgroup;

    public Food(String name, String scientificName, String group, String subgroup) {
        this.name = name;
        scientific_name = scientificName;
        this.group = group;
        this.subgroup = subgroup;
    }

    public String getName() {
        return name;
    }

    public String getScientific_name() {
        return scientific_name;
    }

    public String getGroup() {
        return group;
    }

    public String getSubgroup() {
        return subgroup;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Food food = (Food) o;
        return Objects.equals(name, food.name) && Objects.equals(scientific_name, food.scientific_name) && Objects.equals(group, food.group) && Objects.equals(subgroup, food.subgroup);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, scientific_name, group, subgroup);
    }

    @Override
    public String toString() {
        return "Food{" +
                "name='" + name + '\'' +
                ", scientific_name='" + scientific_name + '\'' +
                ", group='" + group + '\'' +
                ", subgroup='" + subgroup + '\'' +
                '}';
    }
}
