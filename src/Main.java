import java.util.*;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();

        map.put("피카츄", 85);
        map.put("꼬부기", 95);
        map.put("야도란", 75);
        map.put("파이리", 65);
        map.put("피존투", 15);

        System.out.println("총 entry 수 : " + map.size());

        System.out.println("파이리 : " + map.get("파이리"));
        System.out.println("꼬부기 : " + map.get("꼬부기"));
        System.out.println("야도란 : " + map.get("야도란"));
        System.out.println("파이리 : " + map.get("파이리"));
        System.out.println("피존투 : " + map.get("피존투"));

        Set<String> keyset = map.keySet();

        Iterator<String> keyIterator = keyset.iterator();
        while(keyIterator.hasNext()){
            String key = keyIterator.next();
            Integer value = map.get(key);
            System.out.println(key + " : " + value);
        }
        map.remove("피존투");
        System.out.println("총 entry 수 : " + map.size());

        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();

        Iterator<Map.Entry<String,Integer>> entryIterator = entrySet.iterator();
        while(entryIterator.hasNext()){
            Map.Entry<String,Integer> entry = entryIterator.next();
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + " : " + value);
        }

        map.clear();






   }
}