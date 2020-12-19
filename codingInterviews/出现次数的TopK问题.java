import java.util.*;

/**
 * 题目描述
 * 给定String类型的数组strArr，再给定整数k，请严格按照排名顺序打印 出次数前k名的字符串。
 * [要求]
 * 如果strArr长度为N，时间复杂度请达到O(N \log K)O(NlogK)
 * <p>
 * 输出K行，每行有一个字符串和一个整数（字符串表示）。
 * 你需要按照出现出现次数由大到小输出，若出现次数相同时字符串字典序较小的优先输出
 * <p>
 * 示例1
 * 输入
 * ["1","2","3","4"],2
 * 返回值
 * [["1","1"],["2","1"]]
 * 示例2
 * 输入
 * ["1","1","2","3"],2
 * 返回值
 * [["1","2"],["2","1"]]
 */
public class Solution {
    /**
     * return topK string
     *
     * @param strings string字符串一维数组 strings
     * @param k       int整型 the k
     * @return string字符串二维数组
     */
    public String[][] topKstrings(String[] strings, int k) {
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            String key = strings[i];
            map.put(strings[i], map.containsKey(key) ? map.get(key) + 1 : 1);
        }
        Set<Map.Entry<String, Integer>> set = map.entrySet();
        List<Map.Entry<String, Integer>> list = new ArrayList<>(set);
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> entryOne, Map.Entry<String, Integer> entryTwo) {
                if (entryOne.getValue() != entryTwo.getValue()) return entryTwo.getValue() - entryOne.getValue();
                return entryOne.getKey().compareTo(entryTwo.getKey());
            }
        });
        String[][] strs = new String[k][2];
        for (int i = 0; i < k; i++) {
            strs[i][0] = list.get(i).getKey();
            strs[i][1] = list.get(i).getValue().toString();
        }
        return strs;
    }
}