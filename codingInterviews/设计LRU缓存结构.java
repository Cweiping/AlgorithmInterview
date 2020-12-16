import java.util.*;

/**
 * 题目描述
 * 设计LRU缓存结构，该结构在构造时确定大小，假设大小为K，并有如下两个功能
 * set(key, value)：将记录(key, value)插入该结构
 * get(key)：返回key对应的value值
 * [要求]
 * set和get方法的时间复杂度为O(1)
 * 某个key的set或get操作一旦发生，认为这个key的记录成了最常使用的。
 * 当缓存的大小超过K时，移除最不经常使用的记录，即set或get最久远的。
 * 若opt=1，接下来两个整数x, y，表示set(x, y)
 * 若opt=2，接下来一个整数x，表示get(x)，若x未出现过或已被移除，则返回-1
 * 对于每个操作2，输出一个答案
 * 示例1
 * 输入
 * [[1,1,1],[1,2,2],[1,3,2],[2,1],[1,4,4],[2,2]],3
 * 返回值
 * [1,-1]
 * 说明
 * 第一次操作后：最常使用的记录为("1", 1)
 * 第二次操作后：最常使用的记录为("2", 2)，("1", 1)变为最不常用的
 * 第三次操作后：最常使用的记录为("3", 2)，("1", 1)还是最不常用的
 * 第四次操作后：最常用的记录为("1", 1)，("2", 2)变为最不常用的
 * 第五次操作后：大小超过了3，所以移除此时最不常使用的记录("2", 2)，加入记录("4", 4)，并且为最常使用的记录，然后("3", 2)变为最不常使用的记录
 */
public class Solution {
    /**
     * lru design
     *
     * @param operators int整型二维数组 the ops
     * @param k         int整型 the k
     * @return int整型一维数组
     */
    public int[] LRU(int[][] operators, int k) {
        ArrayList<Integer> result = new ArrayList<>();
        // 使用队列存储记录(key, value)，队列有序，便于管理最久未被使用的记录
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        for (int[] operator : operators) {
            int key = operator[1];
            switch (operator[0]) {
                // set 操作
                case 1:
                    if (map.size() >= k) {
                        // 队列满载，移除第一条数据
                        map.remove(map.keySet().iterator().next());
                    }
                    map.put(key, operator[2]);
                    break;
                // get 操作
                case 2:
                    // 若存在则获取其 value，并重新入队列，表示数据使用频率更新
                    if (map.containsKey(key)) {
                        int val = map.get(key);
                        result.add(val);
                        map.remove(key);
                        map.put(key, val);
                    } else {
//                        若x未出现过或已被移除，则返回-1
                        result.add(-1);
                    }
                    break;
                default:
            }
        }
        int[] res = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            res[i] = result.get(i);
        }
        return res;
    }
}