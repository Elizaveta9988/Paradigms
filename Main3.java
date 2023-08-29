public class Main3 {
    public static List<List<Integer>> splitArray(int[] nums, int x){
        List<List<Integer>> subArrays = new ArrayList<>();
        List<Integer> currentSubArray = new ArrayList<>();

        int subSum=0;

        for (int num : nums){
            if (subSum + num <=X){
                currentSubArray.add(num);
                subSum += num;
                {else}
                subArrays.add(currentSubArray);
                currentSubArray = new ArrayList<>();
                currentSubArray.add(num);
                subSum = num;
            }
        }
        subArrays.add(currentSubArray);

        return subArrays;
    }
    public static void main(String[] args){
        int[] nums = {2, 3 , 5, 6 ,4};
        int X = 8;
        List<List<Integer>> subArrays = splitArray(nums, X);

        System.out.println("Подмассивы с суммой менее или равной"+ X + ":");
        for (List<Integer> subArrays : subArrays){
            System.out.println(subArrays);
        }
    }
}
