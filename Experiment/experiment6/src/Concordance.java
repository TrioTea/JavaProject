import java.util.*;

/**
 * @author 比茗还明
 */
public class Concordance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Character, List<Integer>> map = new HashMap<>();
        int index = 0;
        for (String s : args) {
            for (char c : s.toCharArray()) {
                if (!map.containsKey(c)) {
                    map.put(c, new ArrayList<>());
                }
                map.get(c).add(index);
                index++;
            }
        }
        System.out.println(map);
    }
}