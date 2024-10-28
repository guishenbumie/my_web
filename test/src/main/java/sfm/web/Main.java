package sfm.web;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        var t = EReloadType.valueOf("CFG");
        System.out.println(t);
//        var oldMap = new HashMap<Integer, Integer>();
//        oldMap.put(1, 11);
//        oldMap.put(2, 22);
//        var newMap = new HashMap<Integer, Integer>();
//        newMap.put(2, 22);
//        newMap.put(3, 33);
//        newMap.forEach((id, val) -> {
////            var oldV = oldMap.compute(id, (k, v) -> v == null ? "0" : oldMap.remove(id));
//            var oldV = 0;
//            if (oldMap.containsKey(id)) {
//                oldV = oldMap.remove(id);
//            }
//            var newV = val - oldV;
//            System.out.println(newV);
//        });
//        System.out.println();
//        oldMap.forEach((id, val) -> System.out.println(val));
//
//        Map<Integer, Person> m1 = new HashMap<>();
//        m1.put(1, new Person(1, 1));
//        m1.put(2, new Person(2, 2));
//        Map<Integer, Person> m2 = new HashMap<>();
//        m2.put(2, new Person(2, 2));
//        m2.put(3, new Person(3, 3));
//        Map<Integer, Integer> m3 = Stream.concat(
//                m1.values().stream(),
//                m2.values().stream()
//        ).collect(Collectors.groupingBy(Person::getAge, Collectors.summingInt(Person::getCount)));
//        System.out.println(m3);

        var q = new PriorityQueue<Person>(2, new PersonComparator());
        q.add(new Person(1, 1));
        q.add(new Person(2, 2));
        q.add(new Person(3, 3));
        System.out.println(q.poll());
    }

    static class Person {
        private final int age;
        private final int count;
        public Person(int age, int count) {
            this.age = age;
            this.count = count;
        }

        public int getAge() {
            return age;
        }

        public int getCount() {
            return count;
        }
    }

    static class PersonComparator implements Comparator<Person> {

        @Override
        public int compare(Person o1, Person o2) {
            return o1.getAge() - o2.getAge();
        }
    }
}