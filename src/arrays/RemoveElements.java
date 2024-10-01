package arrays;

public class RemoveElements {
    public static void main(String[] args) {
        RemoveElements elements = new RemoveElements();
        int[] nums = {2,5,3,2,1,2,9,2,6};
        int val = 2;
        int result = elements.removeElement(nums, val);
        System.out.println(result+ " > Resulted length");
    }
    public int removeElement(int[] nums, int val) {
        int k =0;
        for(int i=0;i<nums.length;i++) {
            if (nums[i] != val) {
                int temp = nums[k];
                nums[k] = nums[i];
                nums[i] = temp;
                k++;
            }
        }
        return k;
    }
}
