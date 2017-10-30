package Task_07_ImmutableList;

import java.util.List;

/**
 * Created by Niki on 23.6.2016 г..
 */
public class ImmutableList {

    private List<Integer> integerList;

    public ImmutableList(List<Integer> integerList) {
        this.integerList = integerList;
    }

    public List<Integer> getIntegerList() {
        List<Integer> copy = integerList;
        return copy;
    }
}
