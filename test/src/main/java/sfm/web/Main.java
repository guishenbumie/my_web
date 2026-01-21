package sfm.web;

import com.google.common.base.Charsets;
import com.google.common.hash.Hashing;
import org.apache.commons.lang3.tuple.Pair;

import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.stream.Collectors;
import java.util.zip.CRC32C;

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

    public interface ICondParam {
        List<String> getValue();
    }

    public record UniqueCondParam(Object param) implements ICondParam {
        @Override
        public List<String> getValue() {
            return List.of(String.valueOf(param));
        }
    }

    //天赋id
    public record PvpKillNum_TalentId(int talentId) implements ICondParam {
        @Override
        public List<String> getValue() {
            return List.of(String.valueOf(talentId));
        }
    }

    public record PvpKillNum_TalentIds(List<Integer> ids) implements ICondParam {
        @Override
        public List<String> getValue() {
            return ids.stream().map(String::valueOf).toList();
        }
    }

    public static float getMutation(float score) {
        var test = "0,0;1.5,0.05;3,0.3;8,0.5";
        var arr = test.split(";");
        var mutationCurveList = new LinkedList<Pair<Float, Float>>();
        for (String s : arr) {
            var p = s.split(",");
            mutationCurveList.add(Pair.of(Float.parseFloat(p[0]), Float.parseFloat(p[1])));
        }

        if (score < 0)
            return 0.0f;
        var max = mutationCurveList.getLast();
        if (score >= max.getLeft())
            return max.getRight();

        var left = 0;
        var right = mutationCurveList.size() - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (mutationCurveList.get(mid).getLeft() <= score)
                left = mid + 1;
            else
                right = mid - 1;
        }
        int idx;
        if (left >= mutationCurveList.size())
            idx = mutationCurveList.size() - 2;
        else
            idx = right;
        System.out.println("score:" + score + "\t" + idx);

        var x1 = mutationCurveList.get(idx).getLeft();
        var y1 = mutationCurveList.get(idx).getRight();
        var x2 = mutationCurveList.get(idx + 1).getLeft();
        var y2 = mutationCurveList.get(idx + 1).getRight();
        return ((y2 - y1) * (score - x1) + (x2 - x1) * y1) / (x2 - x1);
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

    public static void main(String[] args) {
////        var mgr = new FunctionMgr();
//////        mgr.enableSwitch(EFunctionType.Wine);
//////        mgr.enableSwitch(EFunctionType.Trade);
//////        mgr.enableSwitch(EFunctionType.Urban);
////        // 检查单个开关状态
////        System.out.println("Wine开关是否开启: " + mgr.isSwitchEnabled(EFunctionType.Wine)); // true
////
////        // 获取所有开启的开关
////        List<Integer> enabled = mgr.getEnabledSwitches();
////        System.out.println("当前开启的开关: " + enabled);
////        System.out.println(mgr.getSwitchStates());
//
////        System.out.println(1 << 30);
////        var val = 0;
////        val |= 1 << 30;
////        System.out.println(val);
//        for (int i = 1; i <= 31; i++) {
//            var mgr = new FunctionMgr();
//            for (int j = 1; j <= i; j++) {
//                mgr.enableSwitch(j);
//            }
//            System.out.println(i + ": " + mgr.getSwitchStates());
//        }

//        var pod11 = new PodInfo("11", 108, 101, 1, 3);//2
//        var pod12 = new PodInfo("12", 108, 101, 10, 30);//20
//        var pod21 = new PodInfo("22", 109, 101, 1, 3);
//        var pod22 = new PodInfo("22", 109, 101, 10, 30);
//        podByVersion.put(108, List.of(pod11, pod12));
//        podByVersion.put(109, List.of(pod21, pod22));
//        var resp = calcInsCounts();
//        System.out.println(resp);

        var msg = "your_data_to_hash爱上帝就发哦手机导购i啊就是大概i骄傲靠靠靠靠靠靠靠靠靠靠靠靠靠靠靠靠靠靠靠行程开关骄傲练到访v阿基拉阿斯达克法律框架是的罚款了就速度快v扩大宣传v四道口附近啊";
        byte[] data = msg.getBytes();
        CRC32C crc32c = new CRC32C();
        crc32c.update(data);

        long crcValue = crc32c.getValue();
        System.out.println("result::::::::::" + crcValue);

        var murmurHash = Hashing.murmur3_128()
                .hashString(msg, StandardCharsets.UTF_8)
                .asLong();
        System.out.println("result::::::::::" + murmurHash);
    }


    private static Map<Integer, Map<Integer, InstanceCount>> clientVer2InsCountMap = new HashMap<>();
    private static Map<Integer, List<PodInfo>> podByVersion = new ConcurrentHashMap<>();

    public record InstanceCount(long used, long total) {
    }

    public static Map<Integer, Map<Integer, InstanceCount>> calcInsCounts() {
        var newVerMap = new HashMap<Integer, Set<Integer>>();//key=clientVer, value=interVer集合
        var newClientVer2InsCountMap = new HashMap<Integer, Map<Integer, InstanceCount>>();//key=clientVer, value={key=interVer, value=实例总数和使用数量}
        try {
            for (var entry : podByVersion.entrySet()) {
                var clientVer = entry.getKey();
                var podList = entry.getValue();
                if (podList == null || podList.isEmpty())
                    continue;
                var newInsCountMap = podList.stream().collect(Collectors.toMap(
                        p -> p.interVer,
                        p -> new InstanceCount(p.total - p.leftNum, p.total),
                        (oldIns, newIns) -> new InstanceCount(oldIns.used() + newIns.used(), oldIns.total() + newIns.total())));
                newClientVer2InsCountMap.put(clientVer, newInsCountMap);
            }
            for (var entry : newClientVer2InsCountMap.entrySet()) {
                var clientVer = entry.getKey();
                var newInterVerSet = entry.getValue().keySet();
                var insCountMap = clientVer2InsCountMap.get(clientVer);
                if (insCountMap == null) {
                    newVerMap.put(clientVer, newInterVerSet);
                } else {
                    var interVerSet = insCountMap.keySet();
                    var diffNewInterVerSet = newInterVerSet.stream().filter(interVer -> !interVerSet.contains(interVer)).collect(Collectors.toSet());
                    newVerMap.put(clientVer, diffNewInterVerSet);
                }
            }
            clientVer2InsCountMap = newClientVer2InsCountMap;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return clientVer2InsCountMap;
    }

    public static class PodInfo {
        private String host;
        private int clientVer;
        private int interVer;
        private int leftNum;
        private int total;

        public PodInfo(String host, int clientVer, int interVer, int leftNum, int total) {
            this.host = host;
            this.clientVer = clientVer;
            this.interVer = interVer;
            this.leftNum = leftNum;
            this.total = total;
        }

        public String getHost() {
            return host;
        }

        public int getLeftNum() {
            return leftNum;
        }

        public int getTotal() {
            return total;
        }
    }
}