import java.util.ArrayList;
public class Exercise19_09 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(14);
        list.add(24);
        list.add(4);
        list.add(42);
        list.add(5);
        Exercise19_09.sort(list);
        System.out.print(list);
    }
    public static <E extends Comparable<E>> void sort(ArrayList<E> list) {
        E big;
        for (int i =0; i<5; i++){
            for (int j= i+1; j< list.size(); j++) {
                if (0<(list.get(i).compareTo(list.get(j)))) {
                    big = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, big);
                }
            }
        }
    }
}
