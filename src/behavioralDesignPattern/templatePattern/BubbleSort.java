package behavioralDesignPattern.templatePattern;

public class BubbleSort extends SortingAlgo {

    public BubbleSort(int[] nums) {
        super(nums);
    }

    @Override
    public void sorting() {
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j < nums.length; j++)
                if (nums[j] < nums[i]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
        }
    }

    @Override
    public void showResult() {
        int n = nums.length;
        for (int i=0; i<n; ++i)
            System.out.print(nums[i]+" ");
        System.out.println();
    }
}
