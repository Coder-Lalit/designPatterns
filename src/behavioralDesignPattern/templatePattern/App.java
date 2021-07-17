package behavioralDesignPattern.templatePattern;

public class App {
    public static void main(String[] args) {
        int arr[] = {1,2,3,-2,-1};
        SortingAlgo sortingAlgo = new BubbleSort(arr);
        sortingAlgo.sort();
    }
}
