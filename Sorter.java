public class Sorter {
    Sorting sorting;

    public void setSorting(Sorting sorting) {
        this.sorting = sorting;
    }
    public void runSorting(int[]arr){
        sorting.sort(arr);
    }
}
public interface Sorting {
    void sort(int[]arr);
}

public interface AmericanSocket {
    void supply_electricity();
}
public interface EuroSocket {
    void supply_electricity();
}