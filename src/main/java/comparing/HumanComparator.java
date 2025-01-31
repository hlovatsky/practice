package comparing;

import lombok.experimental.UtilityClass;

import java.util.Comparator;

@UtilityClass
public class HumanComparator {

    public static final Comparator<Human> BY_NAME = Comparator.comparing(Human::getName);
    public static final Comparator<Human> BY_AGE = Comparator.comparingInt(Human::getAge);
}