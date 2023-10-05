package bank;

import java.util.HashMap;

public class demoMap {
    public static void main(String[] args) {
        HashMap<String, Integer> bangGia = new HashMap<>();
        bangGia.put("Tai", 20000);
        bangGia.put("Tai Nam", 25000);
        bangGia.put("Ga", 15000);
        System.out.println(bangGia.get("Tai"));
        System.out.println(bangGia.values());
        for (String pho: bangGia.keySet()
             ) {
            System.out.println(pho + "-" + bangGia.get(pho));
        }

    }
}
