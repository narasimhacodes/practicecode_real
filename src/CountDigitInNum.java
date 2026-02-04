public class CountDigitInNum {
    public int findCount(int nums){
        int count = 0;
        nums = Math.abs(nums);
        if (nums == 0) return 1;
        while(nums > 0){
            nums = nums/10;
            count++;
        }
        return count;
    }
    public static void main(String[] args){
        int nums = 2231;
        CountDigitInNum Cn = new CountDigitInNum();
        System.out.println(Cn.findCount(nums));
    }
}
