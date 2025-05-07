package sfm.web;

import java.time.LocalTime;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Main {

    private static final String MiscellaneousSymbolsAndPictographs = "[\\uD83C\\uDF00-\\uD83D\\uDDFF]";

    private static final String SupplementalSymbolsAndPictographs = "[\\uD83E\\uDD00-\\uD83E\\uDDFF]";

    private static final String Emoticons = "[\\uD83D\\uDE00-\\uD83D\\uDE4F]";

    private static final String TransportAndMapSymbols = "[\\uD83D\\uDE80-\\uD83D\\uDEFF]";

    private static final String MiscellaneousSymbols = "[\\u2600-\\u26FF]\\uFE0F?";

    private static final String Dingbats = "[\\u2700-\\u27BF]\\uFE0F?";

    private static final String EnclosedAlphanumerics = "\\u24C2\\uFE0F?";

    private static final String RegionalIndicatorSymbol = "[\\uD83C\\uDDE6-\\uD83C\\uDDFF]{1,2}";

    private static final String EnclosedAlphanumericSupplement = "[\\uD83C\\uDD70\\uD83C\\uDD71\\uD83C\\uDD7E\\uD83C\\uDD7F\\uD83C\\uDD8E\\uD83C\\uDD91-\\uD83C\\uDD9A]\\uFE0F?";

    private static final String BasicLatin = "[\\u0023\\u002A\\u0030-\\u0039]\\uFE0F?\\u20E3";

    private static final String Arrows = "[\\u2194-\\u2199\\u21A9-\\u21AA]\\uFE0F?";

    private static final String MiscellaneousSymbolsAndArrows = "[\\u2B05-\\u2B07\\u2B1B\\u2B1C\\u2B50\\u2B55]\\uFE0F?";

    private static final String SupplementalArrows = "[\\u2934\\u2935]\\uFE0F?";

    private static final String CJKSymbolsAndPunctuation = "[\\u3030\\u303D]\\uFE0F?";

    private static final String EnclosedCJKLettersAndMonths = "[\\u3297\\u3299]\\uFE0F?";

    private static final String EnclosedIdeographicSupplement = "[\\uD83C\\uDE01\\uD83C\\uDE02\\uD83C\\uDE1A\\uD83C\\uDE2F\\uD83C\\uDE32-\\uD83C\\uDE3A\\uD83C\\uDE50\\uD83C\\uDE51]\\uFE0F?";

    private static final String GeneralPunctuation = "[\\u203C\\u2049]\\uFE0F?";

    private static final String GeometricShapes = "[\\u25AA\\u25AB\\u25B6\\u25C0\\u25FB-\\u25FE]\\uFE0F?";

    private static final String LatinSupplement = "[\\u00A9\\u00AE]\\uFE0F?";

    private static final String LetterlikeSymbols = "[\\u2122\\u2139]\\uFE0F?";

    private static final String MahjongTiles = "\\uD83C\\uDC04\\uFE0F?";

    private static final String PlayingCards = "\\uD83C\\uDCCF\\uFE0F?";

    private static final String MiscellaneousTechnical = "[\\u231A\\u231B\\u2328\\u23CF\\u23E9-\\u23F3\\u23F8-\\u23FA]\\uFE0F?";

    public static String getFullEmojiRegex() {
        return "(?:"
                + MiscellaneousSymbolsAndPictographs + "|"
                + SupplementalSymbolsAndPictographs + "|"
                + Emoticons + "|"
                + TransportAndMapSymbols + "|"
                + MiscellaneousSymbols + "|"
                + Dingbats + "|"
                + EnclosedAlphanumerics + "|"
                + RegionalIndicatorSymbol + "|"
                + EnclosedAlphanumericSupplement + "|"
                + BasicLatin + "|"
                + Arrows + "|"
                + MiscellaneousSymbolsAndArrows + "|"
                + SupplementalArrows + "|"
                + CJKSymbolsAndPunctuation + "|"
                + EnclosedCJKLettersAndMonths + "|"
                + EnclosedIdeographicSupplement + "|"
                + GeneralPunctuation + "|"
                + GeometricShapes + "|"
                + LatinSupplement + "|"
                + LetterlikeSymbols + "|"
                + MahjongTiles + "|"
                + PlayingCards + "|"
                + MiscellaneousTechnical + ")";
    }

    private static final Pattern EMOJI_PATTERN = Pattern.compile("(?:[\uD83C\uDF00-\uD83D\uDDFF]|[\uD83E\uDD00-\uD83E\uDDFF]|[\uD83D\uDE00-\uD83D\uDE4F]|[\uD83D\uDE80-\uD83D\uDEFF]|[\u2600-\u26FF]\uFE0F?|[\u2700-\u27BF]\uFE0F?|\u24C2\uFE0F?|[\uD83C\uDDE6-\uD83C\uDDFF]{1,2}|[\uD83C\uDD70\uD83C\uDD71\uD83C\uDD7E\uD83C\uDD7F\uD83C\uDD8E\uD83C\uDD91-\uD83C\uDD9A]\uFE0F?|[\u0023\u002A\u0030-\u0039]\uFE0F?\u20E3|[\u2194-\u2199\u21A9-\u21AA]\uFE0F?|[\u2B05-\u2B07\u2B1B\u2B1C\u2B50\u2B55]\uFE0F?|[\u2934\u2935]\uFE0F?|[\u3030\u303D]\uFE0F?|[\u3297\u3299]\uFE0F?|[\uD83C\uDE01\uD83C\uDE02\uD83C\uDE1A\uD83C\uDE2F\uD83C\uDE32-\uD83C\uDE3A\uD83C\uDE50\uD83C\uDE51]\uFE0F?|[\u203C\u2049]\uFE0F?|[\u25AA\u25AB\u25B6\u25C0\u25FB-\u25FE]\uFE0F?|[\u00A9\u00AE]\uFE0F?|[\u2122\u2139]\uFE0F?|\uD83C\uDC04\uFE0F?|\uD83C\uDCCF\uFE0F?|[\u231A\u231B\u2328\u23CF\u23E9-\u23F3\u23F8-\u23FA]\uFE0F?)");

    public static boolean containsEmoji(String text) {
        Matcher matcher = EMOJI_PATTERN.matcher(text);
        return matcher.find();
    }

    public static boolean containsEmoji1(String text) {
        return text.codePoints().anyMatch(Character::isEmoji);
    }

    public static void main(String[] args) {
        var s1 = "中文sfm";
        System.out.println(containsEmoji(s1) + " " + containsEmoji1(s1));
        var s2 = "はsfm1";
        System.out.println(containsEmoji(s2) + " " + containsEmoji1(s2));
//        boolean res = true;
//        for (int i = 0; i < s2.length(); i++) {
//            int codePoint = s2.codePointAt(i);
////            System.out.println(codePoint);
//            if (Character.isEmoji(codePoint)) {
////                System.out.print(new String(Character.toChars(codePoint)) + "  ");
//                res = false;
//                break;
//            }
//        }
//        System.out.println(res);
//        System.out.println(containsEmoji(s2));
//        System.out.println(s2.codePoints().noneMatch(Character::isEmoji));
        var s3 = "😒";
        System.out.println(containsEmoji(s3) + " " + containsEmoji1(s3));
//        System.out.println(s3.codePoints().noneMatch(Character::isEmoji));
//        var str = "04:00:00";
//        var lt = LocalTime.parse(str);
//        System.out.println(lt);
//        var l = new HashMap<Integer, List<Integer>>();
//        l.put(1, Arrays.asList(2, 3));
//        for (var ll : l.get(2)) {
//            System.out.println(ll);
//        }
//        var t = EReloadType.valueOf("CFG");
//        System.out.println(t);
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

//        var q = new PriorityQueue<Person>(2, new PersonComparator());
//        q.add(new Person(1, 1));
//        q.add(new Person(2, 2));
//        q.add(new Person(3, 3));
//        System.out.println(q.poll());
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