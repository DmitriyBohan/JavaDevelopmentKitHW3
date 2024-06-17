package task2;

/*Напишите обобщенный метод compareArrays(),
который принимает два массива и возвращает true, если они одинаковые,
и false в противном случае. Массивы могут быть любого типа данных,
но должны иметь одинаковую длину и содержать элементы одного типа по парно по индексам.
 */

import static task2.ArrayComporator.compareArrays;

public class Main {
    public static void main(String[] args) {

        Integer[] array1 = {1, 2};
        Integer[] array2 = {1, 2};
        Integer[] array3 = {1, 3};

        System.out.println(compareArrays(array1, array2));
        System.out.println(compareArrays(array1, array3));

        String[] array4 = {"a", "b", "c"};
        String[] array5 = {"a", "b", "c"};
        String[] array6 = {"a", "b", "d"};

        System.out.println(compareArrays(array4, array5));
        System.out.println(compareArrays(array4, array6));


    }
}
