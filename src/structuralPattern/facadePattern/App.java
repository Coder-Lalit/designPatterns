package structuralPattern.facadePattern;

public class App {
    public static void main(String[] args) {
        SortingAlgoManager sortingAlgoManager = new SortingAlgoManager();
        sortingAlgoManager.doBubbleSort();
        sortingAlgoManager.doQuickSort();
        sortingAlgoManager.doMergeSort();
    }
}
