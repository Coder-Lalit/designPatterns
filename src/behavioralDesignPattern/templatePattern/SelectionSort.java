package behavioralDesignPattern.templatePattern;

public class SelectionSort extends SortingAlgo {

    public SelectionSort(int[] nums) {
        super(nums);
    }

    @Override
    public void sorting() {
        for (int i = 0; i < nums.length-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < nums.length; j++)
                if (nums[j] < nums[min_idx])
                    min_idx = j;

            if(min_idx!=i){
                int temp = nums[min_idx];
                nums[min_idx] = nums[i];
                nums[i] = temp;
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
