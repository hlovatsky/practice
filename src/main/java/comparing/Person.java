package comparing;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Person implements Comparable<Person>{

    private String name;

    @Override
    public int compareTo(Person o) {
        return name.compareTo(o.name);
    }
}