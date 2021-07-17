package structuralPattern.facadePattern;

public class SortingAlgoManager {

    private SortingAlgo bubbleSort;
    private SortingAlgo quickSort;
    private SortingAlgo mergeSort;

    public SortingAlgoManager(){
        bubbleSort= new BubbleSort();
        quickSort = new QuickSort();
        mergeSort = new MergeSort();
    }

    public void doBubbleSort(){
        this.bubbleSort.sort();
    }

    public void doQuickSort(){
        this.quickSort.sort();
    }

    public void doMergeSort(){
        this.mergeSort.sort();
    }
}
