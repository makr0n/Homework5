import java.util.ArrayList;
import java.util.HashMap;

public class Intersection2Arrays {
    public static void main(String[] args) {

    }

    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> al = new ArrayList<>();

        for (int i : nums1) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }

        for (int i : nums2) {
            if (map.containsKey(i) && map.get(i) > 0) {
                al.add(i);
                map.put(i, map.get(i) - 1);
            }
        }

        int[] result = new int[al.size()];
        int j = 0;

        for (int i : al) {
            result[j++] = i;
        }
        return result;
    }
}
