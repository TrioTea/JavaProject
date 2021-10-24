import java.util.*;

public class Concordance {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        Map<Character, List<Integer>> map = new HashMap<Character, List<Integer>>();
        int index = 0;
        for (String s : args) {
            for (char c : s.toCharArray()) {
                if (!map.containsKey(c)) {
                    map.put(c, new ArrayList<Integer>());
                }
                map.get(c).add(index);
                index++;
            }
        }
        System.out.println(map);
    }
}