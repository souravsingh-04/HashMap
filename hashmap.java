import java.util.HashMap;

public class hashmap {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        // Insert O(1)
        hm.put("GOOGLE", 64);
        hm.put("JP morgan",28);
        hm.put("Microsoft",44);
        System.out.println(hm);

        // Get O(1)
        System.out.println(hm.get("GOOGLE"));  // 64
        System.out.println(hm.get("Uber"));    // null

        // ContainsKey O(1)
        System.out.println(hm.containsKey("JP morgan")); // True
        System.out.println(hm.containsKey("JP Morgan"));  // False

        // Remove , Clear , isEmpty , Size
        hm.remove("JP morgan");
        System.out.println(hm);
        System.out.println(hm.size());  // Tells the size of Hashmap
        System.out.println(hm.isEmpty());
        hm.clear();
        System.out.println(hm);
    }
}
