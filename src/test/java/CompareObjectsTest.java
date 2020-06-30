public class CompareObjectsTest {


    public static void testCompareObjects(Object object1, Object object2) {
        testCompare(object1, object2);
        testCompareToString(object1, object2);
        testCompareHashCode(object1, object2);
    }


    private static void testCompare(Object object1, Object object2) {
        boolean result = CompareObjects.compare(object1, object2);
        System.out.println(result);
    }

    private static void testCompareToString(Object object1, Object object2) {
        boolean result = CompareObjects.compareToString(object1, object2);
        System.out.println(result);
    }

    private static void testCompareHashCode(Object object1, Object object2) {
        boolean result = CompareObjects.compareHashCode(object1, object2);
        System.out.println(result);
    }

}
