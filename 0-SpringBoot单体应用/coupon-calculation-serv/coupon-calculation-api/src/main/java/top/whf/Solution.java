package top.whf;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName ${NAME}
 * @Description TODO
 * @Author Dr.king
 * @Date 2023/9/8 14:30
 */
public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     *
     * @param target int整型
     * @return int整型一维数组
     */
    public int[] twoSum (int[] nums, int target) {
        //定义HashMap用来存放查找的值和下标
        Map<Integer,Integer> map = new HashMap<>(nums.length,1);
        //定义返回值的目标数组为二维数组
        int[] result = new int[2];
        //遍历传入的nums[]数组
        for(int i=0;i<nums.length;i++){
            //定义 another 为目标值 - 数组中的下标为i的值
            int another = target - nums[i];
            //将得到的another值赋值为数组的key，通过map.get(key)获取到数组中key所对应的值
            Integer value = map.get(another);
            //判断该值是否存在
            if (value != null){
                result[0] = value;
                result[1] = i+1;
                break;
            }else{
                //如果该值不存在，则把{ 数组值-数组值对应下标 }放入HashMap
                map.put(nums[i],i);
            }
        }
        return result;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {3,2,4};
        int target = 6;
        int[] result = solution.twoSum(nums, target);
        System.out.println(result[0]+" "+result[1]);
    }
}