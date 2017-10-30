package Task_07_ImmutableList;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by ivano on 2/12/2017.
 */


public class ImmutableList1 {

    public static void main(String[] args) {
        Field[] fields = ImmutableList.class.getDeclaredFields();
        if (fields.length < 1) {
        }

        java.lang.reflect.Method[] methods = ImmutableList.class.getDeclaredMethods();
        List<Method> methodsReturnTypes = Arrays.stream(methods).filter(m -> {
            if (!m.getReturnType().getName().equalsIgnoreCase("ImmutableList")) {
                return false;
            }

            return true;
        }).collect(Collectors.toList());

        if (methodsReturnTypes.size() < 1) {
        }

    }
}
