package behavioralDesignPattern.templatePattern;

public abstract class SortingAlgo {

    protected int[] nums;

    public SortingAlgo(int[] nums) {
        this.nums = nums;
    }

    protected abstract void sorting();
    protected abstract void showResult();

    //template method
    public final void sort(){
        sorting();
        showResult();
    }

}
