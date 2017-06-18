package com.bvan.oop.lessons9_10.map;

import com.bvan.oop.common.Person;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author bvanchuhov
 */
public class SocialNetwork {

    public static void main(String[] args) {
        Map<Long, Person> idToUserMap = new HashMap<>();

        idToUserMap.put(10L, new Person("John", 25)); // O(1)
        idToUserMap.put(200L, new Person("Bob", 30));
        idToUserMap.put(700L, new Person("Phil", 20));
        idToUserMap.put(600L, null);

        idToUserMap.put(200L, new Person("Jesse", 20));

        Person user = idToUserMap.get(200L); // O(1)
        System.out.println("user = " + user);

        System.out.println(idToUserMap.get(500L)); // null (not found)
        System.out.println(idToUserMap.get(600L)); // null (value is null)

        System.out.println(idToUserMap.containsKey(500L)); // false
        System.out.println(idToUserMap.containsKey(600L)); // true

        Set<Long> keySet = idToUserMap.keySet();
        Collection<Person> values = idToUserMap.values();
        Set<Map.Entry<Long, Person>> entries = idToUserMap.entrySet();

        for (Map.Entry<Long, Person> entry : entries) {
            Long key = entry.getKey();
            Person value = entry.getValue();

            System.out.println("key = " + key + ", value = " + value);
        }
    }

}
