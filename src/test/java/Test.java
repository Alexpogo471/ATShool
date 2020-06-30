import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        Object object1 = new Object();
        Object object2 = new Object();
        /*
        Если у передаваемых объектов не переопределены методы:
        equals(), hashCode(), toString(), то их сравнения будут не корректны,
        за исключением классов стандартной библиотеки Java, например String, где уже все переопределено
        */
        CompareObjectsTest.testCompareObjects(object1, object2); // в данном случае везде false

        System.out.println("\n---------------\n");

        String lastName = "Ерохин";
        String firstName = "Сергей";
        /* в countElementsInMap не учитываются пробелы, и есть записи с одинаковыми ключами,
        которые перезаписывают друг друга */
        /* в deleteValueFromMap возникает ConcurrentModificationException,
        из-за старых версии java, лучше использовать явный итератор */
        MapTest.testMap(lastName, firstName);

        System.out.println("\n---------------\n");


        /* Возвращает некоррктный массив,согласно условиям
        (некоторые цифры пропускаются, а некоторые не сортируются вообще)
         */

        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(SortTest.testSort(arr)));






















    }
}
