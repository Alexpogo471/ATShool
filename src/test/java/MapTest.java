import java.util.HashMap;

public class MapTest {

    public static void testMap(String lastName, String firstName){
        testCountElementsInMap(lastName,firstName);
        testDeleteValueFromMap();
    }

    private static void testCountElementsInMap(String lastName, String firstName){
        System.out.println(Map.countElementsInMap(lastName, firstName));
    }

    private static HashMap<String, String> testDeleteValueFromMap(){
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Дмитров", "Алексей");
        map.put("Ерохин", "Сергей ");
        map.put("Ярмолов", "Алексей");
        map.put("Карасев ", "Дмитрий");
        map.put(" Ерохин", "Сергей");
        map.put("Андреев ", "Андрей ");
        map.put("Смирнов", "Владимир");
        map.put("Ерохин ", "Сергей");
        map.put("Андреев", "Андрей");
        return Map.deleteValueFromMap(map, "Алексей");
    }
}
